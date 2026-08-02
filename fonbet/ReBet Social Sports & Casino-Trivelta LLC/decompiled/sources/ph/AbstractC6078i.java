package ph;

/* renamed from: ph.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6078i {
    public static boolean a(char c10) {
        return c10 >= ' ' && c10 <= '~';
    }

    public static boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!a(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
