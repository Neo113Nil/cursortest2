package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wzf extends yzf {
    public final /* synthetic */ zdc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ int f;

    public wzf(zdc zdcVar, byte[] bArr, int i, int i2) {
        this.c = zdcVar;
        this.d = i;
        this.e = bArr;
        this.f = i2;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return this.d;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        k62Var.R0(this.f, this.d, this.e);
    }
}
