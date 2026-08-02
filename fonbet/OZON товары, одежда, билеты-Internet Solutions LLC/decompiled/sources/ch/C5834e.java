package ch;

/* renamed from: ch.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C5834e implements org.maplibre.android.d {
    public static int a(int i11, int i12) {
        for (int i13 = 1; i13 <= 2; i13++) {
            int i14 = (i11 + i13) % 3;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2 && (i12 & 2) != 0) {
                    }
                } else if ((i12 & 1) == 0) {
                }
            }
            return i14;
        }
        return i11;
    }
}
