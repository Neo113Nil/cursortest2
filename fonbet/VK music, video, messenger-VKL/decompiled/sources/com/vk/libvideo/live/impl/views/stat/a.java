package com.vk.libvideo.live.impl.views.stat;

import android.text.format.DateUtils;
import com.vk.dto.actionlinks.ActionButtonStat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.List;
import xsna.ahn;
import xsna.asu0;
import xsna.fxc0;
import xsna.ins0;
import xsna.ork0;
import xsna.osk0;
import xsna.pbv;
import xsna.pqz;
import xsna.prk0;
import xsna.psk0;
import xsna.qtt;
import xsna.rsg0;
import xsna.tga0;
import xsna.uf20;
import xsna.uk40;
import xsna.ulz;
import xsna.wx00;
import xsna.yjs;
import xsna.yva;
import xsna.yw4;

/* compiled from: StatPresenter.kt */
/* loaded from: classes3.dex */
public final class a implements ork0 {
    public final int b;
    public final UserId c;
    public final boolean d;
    public final int e;
    public final prk0 f;
    public int g;
    public psk0 i;
    public int k;
    public int l;
    public int m;
    public int n;
    public List<ActionButtonStat> o;
    public final StatAdapter.a p;
    public final StatAdapter h = new StatAdapter(this);
    public final ArrayList<UserProfile> j = new ArrayList<>();

    public a(int i, UserId userId, boolean z, int i2, prk0 prk0Var) {
        this.b = i;
        this.c = userId;
        this.d = z;
        this.e = i2;
        this.f = prk0Var;
        prk0Var.setPresenter(this);
        this.p = new StatAdapter.a(StatAdapter.Type.STAT, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_duration), 0, 0, null, 250);
    }

    @Override // xsna.ork0
    public final void Q1() {
        this.f.I();
        psk0 psk0Var = this.i;
        if (psk0Var != null) {
            psk0Var.dispose();
        }
        int i = this.b;
        UserId userId = this.c;
        m1 T = rsg0.T(new tga0(i, userId));
        yw4 yw4Var = new yw4("video.liveHeartbeat", 2);
        yw4Var.F(userId, "owner_id");
        yw4Var.C(i, "video_id");
        yw4Var.C(0, "spectators_count");
        yw4Var.C(0, "extended");
        ahn.D(yw4Var);
        m1 T2 = rsg0.T(yw4Var);
        m1 T3 = rsg0.T(new ins0(userId, i));
        m1 T4 = rsg0.T(new qtt(userId, i));
        q<Integer> M = fxc0.B().T().M(i, userId);
        q K0 = q.K0(g.b, new a.e(new uf20(new pbv(this, 1), 10)), T, T2, T3, T4, M);
        asu0 asu0Var = asu0.a;
        m1 a0 = K0.r0(asu0Var.c()).L(new osk0(new ulz(27), 0), false).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        psk0 psk0Var2 = new psk0(this);
        a0.subscribe(psk0Var2);
        this.i = psk0Var2;
    }

    public final void d(int i) {
        this.g = i;
        String formatElapsedTime = DateUtils.formatElapsedTime(i);
        StatAdapter.a aVar = this.p;
        aVar.e = formatElapsedTime;
        StatAdapter statAdapter = this.h;
        if (statAdapter.d.isEmpty()) {
            return;
        }
        statAdapter.notifyItemChanged(statAdapter.d.indexOf(aVar));
    }

    @Override // xsna.ork0
    public final void n1(UserProfile userProfile, int i) {
        rsg0.y0(new yjs(userProfile.c, ""), null, null, 3).subscribe(new wx00(new yva(userProfile, this, i), 17), new uk40(new pqz(26), 15));
    }

    @Override // xsna.pk6
    public final void start() {
        this.f.setupAdapter(this.h);
        Q1();
    }
}
