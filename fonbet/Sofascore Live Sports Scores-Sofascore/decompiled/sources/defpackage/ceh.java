package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ceh extends v7 {
    public long a;
    public lj2 b;

    @Override // defpackage.v7
    public final boolean a(u7 u7Var) {
        aeh aehVar = (aeh) u7Var;
        if (this.a >= 0) {
            return false;
        }
        long j = aehVar.i;
        if (j < aehVar.j) {
            aehVar.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.v7
    public final rq3[] b(u7 u7Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((aeh) u7Var).w(j);
    }
}
