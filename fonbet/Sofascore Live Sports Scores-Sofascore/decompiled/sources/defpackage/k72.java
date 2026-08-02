package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k72 implements vsj {
    public final int a;
    public final b b;
    public final q35 c = new q35();
    public b d;
    public vsj e;
    public long f;

    public k72(int i, int i2, b bVar) {
        this.a = i2;
        this.b = bVar;
    }

    @Override // defpackage.vsj
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
        long j2 = this.f;
        if (j2 != C.TIME_UNSET && j >= j2) {
            this.e = this.c;
        }
        vsj vsjVar = this.e;
        String str = nik.a;
        vsjVar.a(j, i, i2, i3, tsjVar);
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        vsj vsjVar = this.e;
        String str = nik.a;
        vsjVar.g(i, j9eVar);
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar = bVar.d(bVar2);
        }
        this.d = bVar;
        vsj vsjVar = this.e;
        String str = nik.a;
        vsjVar.d(bVar);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        vsj vsjVar = this.e;
        String str = nik.a;
        return vsjVar.c(ge4Var, i, z);
    }
}
