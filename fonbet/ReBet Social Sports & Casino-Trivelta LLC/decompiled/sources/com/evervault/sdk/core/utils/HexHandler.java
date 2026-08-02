package com.evervault.sdk.core.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.i;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/evervault/sdk/core/utils/HexHandler;", "", "<init>", "()V", "", "byteArray", "", "upperCase", "Lkh/i;", "byteOrder", "", "encode", "([BZLkh/i;)Ljava/lang/String;", "s", "decode", "(Ljava/lang/String;)[B", "", "LOOKUP_TABLE_LOWER", "[C", "LOOKUP_TABLE_UPPER", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexHandler.kt\ncom/evervault/sdk/core/utils/HexHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 HexHandler.kt\ncom/evervault/sdk/core/utils/HexHandler\n*L\n65#1:72\n65#1:73,3\n*E\n"})
/* loaded from: classes2.dex */
public final class HexHandler {

    @NotNull
    public static final HexHandler INSTANCE = new HexHandler();

    @NotNull
    private static final char[] LOOKUP_TABLE_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NotNull
    private static final char[] LOOKUP_TABLE_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HexHandler() {
    }

    public static /* synthetic */ String encode$default(HexHandler hexHandler, byte[] bArr, boolean z10, i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            iVar = i.f54496d;
        }
        return hexHandler.encode(bArr, z10, iVar);
    }

    @NotNull
    public final byte[] decode(@NotNull String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        List<String> chunked = StringsKt.chunked(s10, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chunked, 10));
        Iterator<T> it = chunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    @NotNull
    public final String encode(@NotNull byte[] byteArray, boolean upperCase, @NotNull i byteOrder) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        char[] cArr = new char[byteArray.length * 2];
        char[] cArr2 = upperCase ? LOOKUP_TABLE_UPPER : LOOKUP_TABLE_LOWER;
        int length = byteArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 1;
            byte b10 = byteArray[byteOrder == i.f54496d ? i10 : (byteArray.length - i10) - 1];
            cArr[i11] = cArr2[(b10 >> 4) & 15];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return StringsKt.concatToString(cArr);
    }
}
