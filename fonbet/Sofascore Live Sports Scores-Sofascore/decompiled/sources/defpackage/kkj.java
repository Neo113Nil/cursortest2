package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kkj {
    public u8j a;
    public jkj b = jkj.a;

    public final void a() {
        o8j o8jVar;
        if (this.b == jkj.a) {
            u3a.c("ToolbarRequester is not initialized.");
        }
        u8j u8jVar = this.a;
        if (u8jVar == null || !u8jVar.n) {
            return;
        }
        g9i g9iVar = u8jVar.u;
        if ((g9iVar == null || !g9iVar.isActive()) && (o8jVar = (o8j) tgj.x(u8jVar, p8j.b)) != null) {
            u8jVar.u = xw3.L(u8jVar.Y0(), null, nu3.d, new h4i(u8jVar, o8jVar, (rq3) null, 16), 1);
        }
    }
}
