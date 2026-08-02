package com.usercentrics.tcf.core.encoder.field;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.tcf.core.StringOrNumber;
import com.usercentrics.tcf.core.errors.DecodingError;
import com.usercentrics.tcf.core.errors.EncodingError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: IntEncoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/field/IntEncoder;", "", "()V", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntEncoder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: IntEncoder.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/field/IntEncoder$Companion;", "", "()V", "decode", "", "value", "", "numBits", "", "encode", "Lcom/usercentrics/tcf/core/StringOrNumber;", "encodeLong", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String encodeLong(long value, int numBits) {
            String l = Long.toString(value, CharsKt.checkRadix(2));
            Intrinsics.checkNotNullExpressionValue(l, "toString(...)");
            if (l.length() > numBits || value < 0) {
                throw new EncodingError(value + " too large to encode into " + numBits);
            }
            if (l.length() >= numBits) {
                return l;
            }
            return StringsKt.repeat("0", numBits - l.length()) + l;
        }

        public final String encode(StringOrNumber value, int numBits) {
            Integer valueOf;
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof StringOrNumber.String) {
                try {
                    valueOf = Integer.valueOf(Integer.parseInt(((StringOrNumber.String) value).getValue()));
                } catch (NumberFormatException unused) {
                    throw new EncodingError("IntEncoder value: " + value);
                }
            } else {
                valueOf = null;
            }
            if (value instanceof StringOrNumber.Int) {
                valueOf = Integer.valueOf(((StringOrNumber.Int) value).getValue());
            }
            if (valueOf != null) {
                String num = Integer.toString(valueOf.intValue(), CharsKt.checkRadix(2));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                if (num.length() > numBits || valueOf.intValue() < 0) {
                    throw new EncodingError(value + " too large to encode into " + numBits);
                }
                if (num.length() >= numBits) {
                    return num;
                }
                return StringsKt.repeat("0", numBits - num.length()) + num;
            }
            throw new EncodingError("Invalid value: " + value);
        }

        public final long decode(String value, int numBits) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (numBits != value.length()) {
                throw new DecodingError("Invalid Bit Length");
            }
            return Long.parseLong(value, CharsKt.checkRadix(2));
        }
    }
}
