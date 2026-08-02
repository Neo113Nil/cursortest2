package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vd5 implements usj {
    public final byte[] a = new byte[4096];

    @Override // defpackage.usj
    public final int b(fe4 fe4Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = fe4Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    @Override // defpackage.usj
    public final void d(int i, nkk nkkVar) {
        nkkVar.F(i);
    }

    @Override // defpackage.usj
    public final void a(sm8 sm8Var) {
    }

    @Override // defpackage.usj
    public final void c(long j, int i, int i2, int i3, ssj ssjVar) {
    }
}
