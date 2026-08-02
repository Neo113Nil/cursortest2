package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tzf extends yzf {
    public final /* synthetic */ zdc c;
    public final /* synthetic */ s18 d;
    public final /* synthetic */ uae e;

    public tzf(uae uaeVar, s18 s18Var, zdc zdcVar) {
        this.c = zdcVar;
        this.d = s18Var;
        this.e = uaeVar;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        Long l = (Long) this.d.n(this.e).e;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        cwh M = this.d.M(this.e);
        try {
            k62Var.M0(M);
            M.close();
        } finally {
        }
    }
}
