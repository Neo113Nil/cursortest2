package com.sofascore.results.wc26;

import android.os.Bundle;
import android.view.View;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.duf;
import defpackage.e6b;
import defpackage.ekl;
import defpackage.fuf;
import defpackage.g9i;
import defpackage.kuj;
import defpackage.lqj;
import defpackage.otk;
import defpackage.qkl;
import defpackage.qv5;
import defpackage.rel;
import defpackage.rq3;
import defpackage.t42;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.un0;
import defpackage.wca;
import defpackage.xw3;
import defpackage.zqb;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/WorldCupFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WorldCupFragment extends Hilt_WorldCupFragment {
    public final otk r;
    public final otk s;

    public WorldCupFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(qkl.class), new rel(this, 0), new rel(this, 2), new rel(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new rel(this, 3), new rel(this, 5), new rel(this, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1462567245, new lqj(this, 19), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FeaturedTournamentTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        this.i.a = 16;
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(t42.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new kuj(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        qkl qklVar = (qkl) this.r.getValue();
        g9i g9iVar = qklVar.S;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        qklVar.S = xw3.L(un0.z(qklVar), null, null, new ekl(qklVar, null), 3);
    }
}
