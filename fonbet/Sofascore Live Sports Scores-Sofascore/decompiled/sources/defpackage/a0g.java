package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a0g extends yzf {
    public final yzf c;
    public final zdc d;

    public a0g(yzf yzfVar, zdc zdcVar) {
        this.c = yzfVar;
        this.d = zdcVar;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return this.c.contentLength();
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.d;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        this.c.writeTo(k62Var);
    }
}
