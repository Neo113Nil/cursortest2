package defpackage;

import androidx.media3.common.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vcf implements vsj {
    public final hpg a;
    public final hpg b;
    public final q35 c = new q35();
    public final AtomicReference d = new AtomicReference(ucf.a);

    public vcf(hpg hpgVar) {
        this.a = hpgVar;
        this.b = hpgVar;
    }

    @Override // defpackage.vsj
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
        h().a(j, i, i2, i3, tsjVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == ucf.b) {
            this.b.F(false);
            atomicReference.set(ucf.c);
        }
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        h().b(j9eVar, i, i2);
    }

    @Override // defpackage.vsj
    public final int c(ge4 ge4Var, int i, boolean z) {
        return h().c(ge4Var, i, z);
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        this.a.d(bVar);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        return h().e(ge4Var, i, z);
    }

    @Override // defpackage.vsj
    public final void g(int i, j9e j9eVar) {
        h().g(i, j9eVar);
    }

    public final vsj h() {
        return this.d.get() == ucf.c ? this.c : this.b;
    }

    @Override // defpackage.vsj
    public final void f(long j) {
    }
}
