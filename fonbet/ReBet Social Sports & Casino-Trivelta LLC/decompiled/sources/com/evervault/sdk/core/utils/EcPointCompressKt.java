package com.evervault.sdk.core.utils;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"ecPointCompress", "", "ecdhRawPublicKey", "evervault-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EcPointCompressKt {
    @NotNull
    public static final byte[] ecPointCompress(@NotNull byte[] ecdhRawPublicKey) {
        Intrinsics.checkNotNullParameter(ecdhRawPublicKey, "ecdhRawPublicKey");
        List<Byte> list = ArraysKt.toList(ecdhRawPublicKey);
        int size = list.size();
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.take(list, (size + 1) >> 1));
        mutableList.set(0, Byte.valueOf((byte) (((byte) (list.get(size - 1).byteValue() & 1)) | 2)));
        return CollectionsKt.toByteArray(mutableList);
    }
}
