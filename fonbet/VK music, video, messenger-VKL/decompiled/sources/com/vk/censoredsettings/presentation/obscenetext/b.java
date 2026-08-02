package com.vk.censoredsettings.presentation.obscenetext;

import com.vk.censoredsettings.presentation.obscenetext.a;
import com.vk.movika.sdk.base.model.n;
import defpackage.u;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.internal.operators.observable.b1;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.a7f0;
import xsna.dq;
import xsna.hap;
import xsna.hb40;
import xsna.ppa;
import xsna.qpa;
import xsna.rpa;
import xsna.rsg0;
import xsna.tfx;
import xsna.wk50;
import xsna.yfb;

/* compiled from: ObsceneTextFilterFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<f, e, a, c> {
    public final hap f;

    public b(hap hapVar, d dVar) {
        super(a.C0526a.b, dVar);
        this.f = hapVar;
    }

    @Override // xsna.wk50
    public final void N(e eVar, a aVar) {
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.C0526a;
        final hap hapVar = this.f;
        if (z) {
            qpa qpaVar = (qpa) hapVar.b;
            qpaVar.getClass();
            a7f0.a.f(this, new v(new ppa(qpaVar, 0)), new hb40(this, 5), null, 5);
        } else {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = (a.b) aVar2;
            final boolean z2 = bVar.b;
            ((rpa) hapVar.c).getClass();
            tfx tfxVar = new tfx("account.setObsceneFilter", new dq(0), new n(1));
            tfxVar.j("value", z2);
            b1 Z = rsg0.Z(yfb.x(tfxVar));
            final qpa qpaVar2 = (qpa) hapVar.b;
            qpaVar2.getClass();
            a7f0.a.d(this, Z.c(new m(new Callable() { // from class: xsna.opa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(qpa.this.b.e(z2).commit());
                }
            })).c(new m(new Callable() { // from class: xsna.fq70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((p870) hap.this.d).e(VersionConstants.PRODUCT_MAJOR_VERSION, Boolean.valueOf(z2));
                    return s3q0.a;
                }
            }).o(io.reactivex.rxjava3.android.schedulers.a.b())), null, null, new u(26, this, bVar), 3);
        }
    }
}
