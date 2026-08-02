package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v9 extends r9 {
    public static v9 c;

    public final boolean G(int i) {
        if (i <= 0 || p().charAt(i - 1) == '\n') {
            return false;
        }
        return i == p().length() || p().charAt(i) == '\n';
    }

    @Override // defpackage.r9
    public final int[] g(int i) {
        int length = p().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && p().charAt(i) == '\n' && (p().charAt(i) == '\n' || (i != 0 && p().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !G(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.r9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] y(int i) {
        int length = p().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && p().charAt(i - 1) == '\n' && !G(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (p().charAt(i2) == '\n' || (i2 != 0 && p().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }
}
