package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q35 implements vsj {
    public final byte[] a = new byte[4096];

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        j9eVar.O(i);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = ge4Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
    }

    @Override // defpackage.vsj
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
    }
}
