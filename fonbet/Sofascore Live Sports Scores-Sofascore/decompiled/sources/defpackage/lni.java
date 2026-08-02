package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lni implements nlg {
    public final dni a;
    public final String b;
    public boolean c;

    public lni(dni dniVar, String str) {
        this.a = dniVar;
        this.b = str;
    }

    public final void h() {
        if (this.c) {
            b0a.R(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public void reset() {
        h();
    }

    @Override // defpackage.nlg
    public void z() {
        h();
    }
}
