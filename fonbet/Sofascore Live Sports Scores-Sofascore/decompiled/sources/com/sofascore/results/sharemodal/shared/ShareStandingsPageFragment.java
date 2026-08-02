package com.sofascore.results.sharemodal.shared;

import android.view.View;
import defpackage.bbi;
import defpackage.bte;
import defpackage.duf;
import defpackage.ebi;
import defpackage.g7;
import defpackage.jai;
import defpackage.joa;
import defpackage.mdh;
import defpackage.ndh;
import defpackage.otk;
import defpackage.vce;
import defpackage.wai;
import defpackage.wsf;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/shared/ShareStandingsPageFragment;", "Lcom/sofascore/results/sharemodal/BaseSharePageFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareStandingsPageFragment extends Hilt_ShareStandingsPageFragment {
    public final otk s;
    public final joa t;
    public final joa u;
    public final joa v;
    public final joa w;
    public final joa x;
    public final joa y;

    public ShareStandingsPageFragment() {
        ndh ndhVar = new ndh(this, 0);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new vce(ndhVar, 28));
        this.s = new otk(duf.a.getOrCreateKotlinClass(mdh.class), new wsf(a, 3), new bte(this, a, 9), new wsf(a, 4));
        this.t = ypa.a(ysaVar, new ndh(this, 1));
        this.u = ypa.a(ysaVar, new ndh(this, 2));
        this.v = ypa.a(ysaVar, new ndh(this, 3));
        this.w = ypa.a(ysaVar, new ndh(this, 4));
        ypa.a(ysaVar, new ndh(this, 5));
        this.x = ypa.a(ysaVar, new ndh(this, 6));
        this.y = ypa.a(ysaVar, new ndh(this, 7));
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final void A() {
        View view = (View) this.x.getValue();
        joa joaVar = this.w;
        if (view != null) {
            r2.p(((jai) joaVar.getValue()).g.size(), view);
        }
        jai jaiVar = (jai) joaVar.getValue();
        Object value = this.y.getValue();
        value.getClass();
        g7.o(jaiVar, (View) value, 6);
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final g7 B() {
        return (jai) this.w.getValue();
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final String C() {
        String str;
        ebi ebiVar = (ebi) this.v.getValue();
        return (ebiVar == null || (str = ebiVar.c) == null) ? "" : str;
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final void D() {
        List list = (List) this.u.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof wai) || (obj instanceof bbi)) {
                arrayList.add(obj);
            }
        }
        Object j0 = CollectionsKt.j0(arrayList);
        bbi bbiVar = j0 instanceof bbi ? (bbi) j0 : null;
        if (bbiVar != null) {
            bbiVar.k = false;
        }
        ((jai) this.w.getValue()).F(arrayList);
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "standings_table";
    }
}
