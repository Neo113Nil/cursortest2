package ru.ozon.app.android.platform.bundle.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"sliceToChunksIfNeedIt", "", "", "chunkSize", "", "getFullSize", "chunksToByteArray", "android-platform_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BundleChunkUtilsKt {
    @NotNull
    public static final byte[] chunksToByteArray(@NotNull List<byte[]> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        byte[] bArr = new byte[getFullSize(list)];
        int i11 = 0;
        for (byte[] bArr2 : list) {
            for (byte b11 : bArr2) {
                bArr[i11] = b11;
                i11++;
            }
        }
        return bArr;
    }

    public static final int getFullSize(@NotNull List<byte[]> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((byte[]) it.next()).length;
        }
        return i11;
    }

    @NotNull
    public static final List<byte[]> sliceToChunksIfNeedIt(@NotNull byte[] bArr, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i11 >= bArr.length) {
            return C7714v.a0(bArr);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = i12 + i11;
            int length = bArr.length <= i13 ? bArr.length : i13;
            arrayList.add(C7705l.v(i12, length, bArr));
            i12 = length;
        }
        return arrayList;
    }
}
