package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uzf extends yzf {
    public final /* synthetic */ zdc c;
    public final /* synthetic */ gc2 d;

    public uzf(gc2 gc2Var, zdc zdcVar) {
        this.c = zdcVar;
        this.d = gc2Var;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return this.d.h();
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        k62Var.i0(this.d);
    }
}
