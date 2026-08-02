package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w9c extends ebc {
    public final String a;
    public final v9c b;

    public w9c(String str, v9c v9cVar) {
        this.a = str;
        this.b = v9cVar;
    }

    @Override // defpackage.ebc
    public final void f(int i) {
        v9c v9cVar;
        String str = this.a;
        if (str == null || (v9cVar = this.b) == null) {
            return;
        }
        v9cVar.q(i, str);
    }

    @Override // defpackage.ebc
    public final void i(int i) {
        v9c v9cVar;
        String str = this.a;
        if (str == null || (v9cVar = this.b) == null) {
            return;
        }
        v9cVar.r(i, str);
    }
}
