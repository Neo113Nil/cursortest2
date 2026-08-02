package k5;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;

/* renamed from: k5.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7533k1 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70768e;

    C7533k1(@NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.OSFontsNumber);
        this.f70768e = abstractC7520h0;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        File[] listFiles = new File(C7563s0.a(new byte[]{108, 52, -8, Byte.MIN_VALUE, 111, -18, 100, 29, -19, -84, -71, -18, 55, 65, 35, -126})).listFiles();
        if (listFiles == null) {
            return String.valueOf(0);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (File file : listFiles) {
            arrayList.add(String.valueOf(file).replace(C7563s0.a(new byte[]{44, 21, 2, -93, 70, -21, 13, 67, 12, 6, 95, -89, 33, 23, 35, 12}), C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73})));
            i11++;
            C7563s0.a(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34});
        }
        this.f70768e.c(Mm0.e.OSFontsHash, Integer.valueOf(arrayList.hashCode()));
        return String.valueOf(i11);
    }
}
