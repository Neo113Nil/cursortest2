package com.evervault.sdk.core.services;

import W9.d;
import com.evervault.sdk.core.exceptions.Asn1EncodingException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0006\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0002\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/evervault/sdk/core/services/ASN1;", "", "()V", "BITSTR", "", "arguments", "", "([Ljava/lang/String;)Ljava/lang/String;", "UINT", "encode", "numToHex", d.f13160a, "", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ASN1 {

    @NotNull
    public static final ASN1 INSTANCE = new ASN1();

    private ASN1() {
    }

    @NotNull
    public final String BITSTR(@NotNull String... arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return encode("03", "00" + ArraysKt.joinToString$default(arguments, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }

    @NotNull
    public final String UINT(@NotNull String... arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        String joinToString$default = ArraysKt.joinToString$default(arguments, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.take(joinToString$default, 2), 16);
        if (((intOrNull != null ? intOrNull.intValue() : 0) & 128) != 0) {
            joinToString$default = "00" + joinToString$default;
        }
        return encode("02", joinToString$default);
    }

    @NotNull
    public final String encode(@NotNull String... arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        int i10 = 0;
        String str = arguments[0];
        String lowerCase = new Regex("\\s+").replace(ArraysKt.joinToString$default((String[]) ArraysKt.copyOfRange(arguments, 1, arguments.length), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int length = lowerCase.length() / 2;
        double d10 = length;
        if (d10 != Math.floor(d10)) {
            throw Asn1EncodingException.INSTANCE;
        }
        if (length > 127) {
            i10 = 1;
            while (length > 255) {
                i10++;
                length >>= 8;
            }
        }
        if (i10 > 0) {
            str = str + numToHex(i10 + 128);
        }
        return str + numToHex(lowerCase.length() / 2) + lowerCase;
    }

    @NotNull
    public final String numToHex(int d10) {
        String num = Integer.toString(d10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        if (num.length() % 2 == 0) {
            return num;
        }
        return "0" + num;
    }
}
