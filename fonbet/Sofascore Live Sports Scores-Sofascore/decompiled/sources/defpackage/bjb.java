package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface bjb {
    boolean d();

    boolean g();

    boolean h();

    boolean i();

    void j(Throwable th);

    boolean k();

    void l(String str);

    default boolean m(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return i();
        }
        if (c == '\n') {
            return g();
        }
        if (c == 20) {
            return h();
        }
        if (c == 30) {
            return d();
        }
        if (c == '(') {
            return k();
        }
        sw9.t(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR", "] not recognized.", "Level [");
        return false;
    }
}
