package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u82 implements p6b {
    public d92 a;
    public k92 b;

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        d92 d92Var;
        q82 q82Var;
        if (d6bVar != d6b.ON_PAUSE || (d92Var = this.a) == null || (q82Var = d92Var.e) == null) {
            return;
        }
        q82Var.e();
    }
}
