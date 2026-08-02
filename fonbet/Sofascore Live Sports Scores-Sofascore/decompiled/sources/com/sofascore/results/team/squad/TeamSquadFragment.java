package com.sofascore.results.team.squad;

import com.sofascore.model.Sports;
import defpackage.bte;
import defpackage.duf;
import defpackage.fwi;
import defpackage.g2j;
import defpackage.joa;
import defpackage.o1i;
import defpackage.otk;
import defpackage.q8i;
import defpackage.tc3;
import defpackage.un0;
import defpackage.w1i;
import defpackage.w9g;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/team/squad/TeamSquadFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamSquadFragment extends Hilt_TeamSquadFragment {
    public final otk r;
    public final joa s;
    public final tc3 t;

    public TeamSquadFragment() {
        o1i o1iVar = new o1i(this, 25);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(o1iVar, 26));
        this.r = new otk(duf.a.getOrCreateKotlinClass(g2j.class), new fwi(a, 11), new bte(this, a, 26), new fwi(a, 12));
        this.s = ypa.a(ysaVar, new w1i(this, 12));
        this.t = new tc3(-738873820, new q8i(this, 15), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getX() {
        return this.t;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return CollectionsKt.R(b.j(Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.ICE_HOCKEY), ((g2j) this.r.getValue()).m.getSportSlug()) ? "RosterTab" : "SquadTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        g2j g2jVar = (g2j) this.r.getValue();
        xw3.L(un0.z(g2jVar), null, null, new w9g(g2jVar, null, 25), 3);
    }
}
