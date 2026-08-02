package oh;

import ph.C6075f;

/* loaded from: classes3.dex */
public interface e {
    static e a(String str) {
        return C6075f.e(str, f.STRING);
    }

    static e b(String str) {
        return C6075f.e(str, f.BOOLEAN);
    }

    static e c(String str) {
        return C6075f.e(str, f.LONG);
    }

    String getKey();
}
