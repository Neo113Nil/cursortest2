package com.sofascore.results.player.media;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.ate;
import defpackage.bte;
import defpackage.duf;
import defpackage.gte;
import defpackage.joa;
import defpackage.l6g;
import defpackage.mqi;
import defpackage.otk;
import defpackage.tee;
import defpackage.vce;
import defpackage.w41;
import defpackage.x2e;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/media/PlayerMediaFragment;", "Lcom/sofascore/results/media/BaseMediaFragment;", "Lcom/sofascore/model/mvvm/model/Player;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerMediaFragment extends Hilt_PlayerMediaFragment<Player> {
    public final mqi r;
    public final otk s;
    public final String t;

    public PlayerMediaFragment() {
        int i = 0;
        this.r = ypa.b(new ate(this, i));
        joa a = ypa.a(ysa.c, new vce(new vce(this, 8), 9));
        this.s = new otk(duf.a.getOrCreateKotlinClass(gte.class), new x2e(a, 11), new bte(this, a, i), new x2e(a, 12));
        this.t = SearchResponseKt.PLAYER_ENTITY;
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final tee B() {
        return l6g.L(new Pair("page", SearchResponseKt.PLAYER_ENTITY));
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    /* renamed from: C, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final int D() {
        return ((Player) this.r.getValue()).getId();
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final w41 E() {
        return (gte) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ((gte) this.s.getValue()).G((Player) this.r.getValue());
    }
}
