package com.sofascore.results.team.media;

import com.sofascore.model.mvvm.model.Team;
import defpackage.bte;
import defpackage.duf;
import defpackage.fwi;
import defpackage.joa;
import defpackage.l6g;
import defpackage.mqi;
import defpackage.o1i;
import defpackage.otk;
import defpackage.tee;
import defpackage.txi;
import defpackage.w1i;
import defpackage.w41;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/media/TeamMediaFragment;", "Lcom/sofascore/results/media/BaseMediaFragment;", "Lcom/sofascore/model/mvvm/model/Team;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamMediaFragment extends Hilt_TeamMediaFragment<Team> {
    public final mqi r = ypa.b(new w1i(this, 10));
    public final otk s;
    public final String t;

    public TeamMediaFragment() {
        joa a = ypa.a(ysa.c, new o1i(new o1i(this, 20), 21));
        this.s = new otk(duf.a.getOrCreateKotlinClass(txi.class), new fwi(a, 3), new bte(this, a, 22), new fwi(a, 4));
        this.t = "team";
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final tee B() {
        return l6g.L(new Pair("page", "team"));
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    /* renamed from: C, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final int D() {
        return ((Team) this.r.getValue()).getId();
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final w41 E() {
        return (txi) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ((txi) this.s.getValue()).G((Team) this.r.getValue());
    }
}
