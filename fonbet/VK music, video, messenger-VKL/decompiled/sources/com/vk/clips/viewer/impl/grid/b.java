package com.vk.clips.viewer.impl.grid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.clip.ClipSearchFragment;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a0a;
import xsna.a590;
import xsna.aqf;
import xsna.asu0;
import xsna.au2;
import xsna.bee;
import xsna.bwt0;
import xsna.c1e;
import xsna.ckg;
import xsna.cpu;
import xsna.cvk;
import xsna.d9f;
import xsna.da;
import xsna.ea;
import xsna.eee;
import xsna.ehd;
import xsna.epx;
import xsna.es;
import xsna.esm0;
import xsna.fee;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g620;
import xsna.g7s0;
import xsna.gee;
import xsna.gkg;
import xsna.gxe;
import xsna.gzs;
import xsna.hg1;
import xsna.hld;
import xsna.ibr0;
import xsna.iee;
import xsna.izs;
import xsna.j8;
import xsna.jce;
import xsna.jof;
import xsna.kof;
import xsna.kwr0;
import xsna.l7s;
import xsna.maz;
import xsna.mce;
import xsna.mwr0;
import xsna.n1d;
import xsna.n9b;
import xsna.ngj0;
import xsna.o25;
import xsna.op1;
import xsna.pde;
import xsna.pgn;
import xsna.pkd;
import xsna.qcy;
import xsna.r4k;
import xsna.r6;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sde;
import xsna.sdq0;
import xsna.ty4;
import xsna.u2b0;
import xsna.ufu;
import xsna.urf;
import xsna.v2u0;
import xsna.vfu;
import xsna.wfu;
import xsna.wjs0;
import xsna.wrp;
import xsna.xwk;
import xsna.y40;
import xsna.yfb;
import xsna.zof;

/* compiled from: ClipsGridPresenter.kt */
/* loaded from: classes17.dex */
public final class b implements fee {
    public boolean A;
    public mce B;
    public eee C;
    public boolean a;
    public final boolean b;
    public final boolean c;
    public ClipGridParams d;
    public final gee e;
    public final jce f;
    public final ibr0 g;
    public final d9f h;
    public final urf i;
    public final String j;
    public final r4k k;
    public final pde l;
    public final kof m;
    public final jof n;
    public final zof o;
    public final Lazy<cpu> p;
    public final sdq0 q;
    public final gxe r;
    public final hld s;
    public boolean t;
    public c u;
    public c v;
    public c w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: ClipsGridPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((b) this.receiver).x = bool.booleanValue();
            return s3q0.a;
        }
    }

    public b(boolean z, boolean z2, boolean z3, ClipGridParams clipGridParams, gee geeVar, iee ieeVar, ibr0 ibr0Var, d9f d9fVar, urf urfVar, String str, r4k r4kVar, pde pdeVar, kof kofVar, kof kofVar2, zof zofVar, Lazy lazy, sdq0 sdq0Var, gxe gxeVar, hld hldVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = clipGridParams;
        this.e = geeVar;
        this.f = ieeVar;
        this.g = ibr0Var;
        this.h = d9fVar;
        this.i = urfVar;
        this.j = str;
        this.k = r4kVar;
        this.l = pdeVar;
        this.m = kofVar;
        this.n = kofVar2;
        this.o = zofVar;
        this.p = lazy;
        this.q = sdq0Var;
        this.r = gxeVar;
        this.s = hldVar;
        this.C = e(clipGridParams, new n9b(1, this, b.class, "initClipsDelegateAndGet", "initClipsDelegateAndGet(Lcom/vk/dto/shortvideo/ClipGridParams;)Lcom/vk/clips/viewer/impl/grid/repository/delegates/ClipsGridCommonClipsDelegate;", 0, 2));
    }

    @Override // xsna.fee
    public final void E0(boolean z) {
        if (this.z) {
            return;
        }
        this.z = true;
        gee geeVar = this.e;
        geeVar.E0(z);
        geeVar.mf(false);
    }

    @Override // xsna.fee
    public final boolean F0() {
        return this.a;
    }

    @Override // xsna.fee
    public final void G0() {
        this.C.b.G0();
    }

    @Override // xsna.fee
    public final void T1() {
        ClipGridParams clipGridParams = this.d;
        this.a = false;
        this.C.c(true);
        this.C = e(clipGridParams, new bee(1, this, b.class, "initClipsDelegateAndGet", "initClipsDelegateAndGet(Lcom/vk/dto/shortvideo/ClipGridParams;)Lcom/vk/clips/viewer/impl/grid/repository/delegates/ClipsGridCommonClipsDelegate;", 0, 0));
        e2(true);
    }

    @Override // xsna.fee
    public final boolean U1() {
        return this.b;
    }

    @Override // xsna.fee
    public final void V1(String str) {
        FragmentActivity We = this.e.We();
        if (We == null) {
            return;
        }
        if (str != null) {
            maz.c(xwk.d().e(), We, str, new LaunchContext(false, false, false, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
            return;
        }
        l7s u = bwt0.u(We);
        ClipSearchFragment.a aVar = new ClipSearchFragment.a();
        int color = u.getColor(R.color.vk_black);
        Bundle bundle = aVar.j;
        bundle.putInt("background_color", color);
        bundle.putBoolean("ClipSearchFragment.FORCE_DISCOVER_IN_SEARCH_KEY", true);
        bundle.putString("ref", t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_CHALLENGE));
        aVar.k(u);
    }

    @Override // xsna.fee
    public final boolean W1() {
        return this.A;
    }

    @Override // xsna.fee
    public final boolean X1() {
        return this.c;
    }

    @Override // xsna.fee
    public final void Y1() {
        this.i.s(this.j, new aqf.a(false));
        E0(true);
        this.e.mf(false);
    }

    @Override // xsna.fee
    public final void Z1(ClipGridParams.Data data) {
        jce jceVar = this.f;
        if (jceVar != null) {
            jceVar.b();
        }
        this.e.Z2(this.l.a(data));
    }

    @Override // xsna.fee
    public final UserId a() {
        return ((ClipGridParams.OnlyId.Profile) this.d.zb()).b;
    }

    @Override // xsna.fee
    public final void a2() {
        mce mceVar = this.B;
        if (mceVar != null) {
            EmptyList emptyList = EmptyList.b;
            mceVar.g = emptyList;
            AbstractClipsGridListFragment abstractClipsGridListFragment = mceVar.f;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.po(emptyList, true);
            }
        }
    }

    @Override // xsna.fee
    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b() {
        ClipGridParams clipGridParams = this.d;
        return ((clipGridParams instanceof ClipGridParams.Data.Profile) || (clipGridParams instanceof ClipGridParams.OnlyId.Profile)) ? this.a ? fkq0.d(((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b) ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.MY_CLIPS_GRID : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.PUBLIC_CLIPS_GRID : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER : clipGridParams instanceof ClipGridParams.Data.Music ? this.x ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_CHALLENGE : ((ClipGridParams.Data.Music) clipGridParams).b.K != null ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_SOUND : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_MUSIC : clipGridParams instanceof ClipGridParams.OnlyId.Audio ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_MUSIC : ((clipGridParams instanceof ClipGridParams.Data.Hashtag) || (clipGridParams instanceof ClipGridParams.OnlyId.Hashtag)) ? this.x ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_CHALLENGE : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_HASHTAG : clipGridParams instanceof ClipGridParams.Data.CameraMask ? this.x ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_CHALLENGE : ((ClipGridParams.Data.CameraMask) clipGridParams).b.u ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_EFFECT : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_MASK : clipGridParams instanceof ClipGridParams.OnlyId.CameraMask ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_EFFECT : MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
    }

    @Override // xsna.fee
    public final void b2(Context context, ClipGridParams.Data data) {
        if (data instanceof ClipGridParams.Data.Profile) {
            g7s0 B = fxc0.B();
            UserId userId = ((ClipGridParams.Data.Profile) data).b.b.b;
            B.q(context, userId, fkq0.b(userId));
        } else if (data instanceof ClipGridParams.Data.Music) {
            pkd f = g620.f();
            int i = ((ClipGridParams.Data.Music) data).b.b;
            f.B(context);
        }
    }

    @Override // xsna.fee
    public final boolean c() {
        return this.t;
    }

    @Override // xsna.fee
    public final void c2(View view, Rect rect, ClipGridParams.Data data, gzs<s3q0> gzsVar) {
        this.e.J7(view, rect, data, gzsVar);
    }

    @Override // xsna.fee
    public final void d() {
        eee eeeVar = this.C;
        qcy<Object>[] qcyVarArr = eee.h;
        eeeVar.b(true, false);
        c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.w = this.a ? new m(new c1e(this, 1)).q(asu0.a.c()).subscribe() : null;
    }

    @Override // xsna.fee
    public final void d2(ClipGridParams.Data data) {
        ((u2b0) this.k.b).stop(32);
        f();
        this.e.ga(new SdkClipAudioTemplate(((ClipGridParams.Data.Music) data).f));
    }

    public final eee e(ClipGridParams clipGridParams, izs<? super ClipGridParams, mce> izsVar) {
        ufu ckgVar;
        boolean z = ((clipGridParams instanceof ClipGridParams.Data.Profile) || (clipGridParams instanceof ClipGridParams.OnlyId.Profile)) && this.a;
        ClipGridParams.OnlyId zb = clipGridParams.zb();
        ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
        gee geeVar = this.e;
        if (!z) {
            ckgVar = new ckg(geeVar, clipGridParams, new a(1, this, b.class, "presenterOnBindListener", "presenterOnBindListener(Z)V", 0), izsVar.invoke(clipGridParams), this.r, this.s);
        } else {
            if (profile == null) {
                throw new IllegalStateException();
            }
            ckgVar = o25.a().b() ? new a590(profile, this.n, geeVar, this.d, this.g, this.p, this.q, this.o) : new vfu(new esm0(new au2(geeVar)), new n1d(this, 4));
        }
        return new eee(geeVar, ckgVar, new ngj0());
    }

    @Override // xsna.fee
    public final void e2(boolean z) {
        if (!this.z || this.A) {
            this.A = false;
            this.C.b(z, true);
        }
    }

    public final void f() {
        d9f d9fVar = this.h;
        d9fVar.e("clipsGridPresenter");
        hg1.f(this.u);
        this.u = hg1.h(d9fVar.d(TemplatesFlowScreen.MUSIC_GRID).a0(asu0.a.d()), new op1(this, 23));
    }

    @Override // xsna.fee
    public final void f2(Context context, ClipGridParams.Data data) {
        if ((data instanceof ClipGridParams.Data.Profile) && !j8.d(context)) {
            eee eeeVar = this.C;
            ClipsAuthor clipsAuthor = ((ClipGridParams.Data.Profile) data).b;
            eeeVar.getClass();
            c subscribe = new v(rsg0.Z(yfb.x(new es().l(clipsAuthor.b.b))), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
            pgn pgnVar = eeeVar.e;
            qcy<Object> qcyVar = eee.h[2];
            pgnVar.b(subscribe);
            wjs0.a(new mwr0(clipsAuthor.b.b));
            cvk.u(R.string.clips_grid_author_unblocked, true);
        }
    }

    @Override // xsna.fee
    public final void g2(ClipGridParams.Data data) {
        jce jceVar = this.f;
        if (jceVar != null) {
            jceVar.b();
        }
        this.e.Z2(this.l.a(data));
    }

    @Override // xsna.fee
    public final String getRef() {
        ClipGridParams clipGridParams = this.d;
        return ((clipGridParams instanceof ClipGridParams.Data.Profile) || (clipGridParams instanceof ClipGridParams.OnlyId.Profile)) ? this.a ? fkq0.d(((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b) ? "MY_CLIPS_GRID".toLowerCase(Locale.ROOT) : "PUBLIC_CLIPS_GRID".toLowerCase(Locale.ROOT) : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID) : clipGridParams instanceof ClipGridParams.Data.Music ? this.x ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_CHALLENGE) : ((ClipGridParams.Data.Music) clipGridParams).b.K != null ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_SOUND) : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_MUSIC) : clipGridParams instanceof ClipGridParams.OnlyId.Audio ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_MUSIC) : ((clipGridParams instanceof ClipGridParams.Data.Hashtag) || (clipGridParams instanceof ClipGridParams.OnlyId.Hashtag)) ? this.x ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_CHALLENGE) : "CLIPS_GRID_HASHTAG".toLowerCase(Locale.ROOT) : clipGridParams instanceof ClipGridParams.Data.CameraMask ? this.x ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_CHALLENGE) : ((ClipGridParams.Data.CameraMask) clipGridParams).b.u ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_EFFECT) : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_MASK) : clipGridParams instanceof ClipGridParams.OnlyId.CameraMask ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_EFFECT) : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID);
    }

    @Override // xsna.fee
    public final void h2(ClipGridParams.Data data, ClipCameraParams clipCameraParams) {
        ((u2b0) this.k.b).pause(6);
        UserId d = g620.f().e().d();
        this.A = true;
        this.e.K1(data, clipCameraParams, getRef(), b(), d);
    }

    @Override // xsna.fee
    public final void i2(ClipGridParams.Data.Profile profile) {
        ClipsAuthor clipsAuthor;
        gee geeVar = this.e;
        geeVar.mf(true);
        if (!this.z) {
            ClipGridParams clipGridParams = this.d;
            UserId userId = null;
            ClipGridParams.Data.Profile profile2 = clipGridParams instanceof ClipGridParams.Data.Profile ? (ClipGridParams.Data.Profile) clipGridParams : null;
            if (profile2 != null && (clipsAuthor = profile2.b) != null) {
                userId = clipsAuthor.b.b;
            }
            if (epx.f(userId, profile.b.b.b)) {
                return;
            }
        }
        this.i.s(this.j, new aqf.a(true));
        this.z = false;
        if (this.a && this.b) {
            geeVar.q3();
        }
        this.d = profile;
        if (this.a) {
            this.C.b.d(profile);
            e2(true);
            return;
        }
        geeVar.W5();
        this.a = true;
        this.C.c(true);
        this.C = e(profile, new bee(1, this, b.class, "initClipsDelegateAndGet", "initClipsDelegateAndGet(Lcom/vk/dto/shortvideo/ClipGridParams;)Lcom/vk/clips/viewer/impl/grid/repository/delegates/ClipsGridCommonClipsDelegate;", 0, 0));
        e2(true);
    }

    @Override // xsna.fee
    public final void j2(ClipGridParams.Data data) {
        this.d = data;
        boolean z = false;
        this.t = false;
        if (this.a) {
            return;
        }
        ClipGridParams.Data.Profile profile = data instanceof ClipGridParams.Data.Profile ? (ClipGridParams.Data.Profile) data : null;
        if (profile != null) {
            ClipsAuthor clipsAuthor = profile.b;
            if (clipsAuthor.b.p || ((clipsAuthor.g != 0 && ehd.b(clipsAuthor) && clipsAuthor.f != 3) || ((ehd.c(clipsAuthor) || ehd.e(clipsAuthor)) && !ehd.d(clipsAuthor)))) {
                z = true;
            }
            this.t = z;
        }
    }

    @Override // xsna.fee
    public final void k2(SdkClipAudioTemplate sdkClipAudioTemplate) {
        ((u2b0) this.k.b).stop(32);
        f();
        this.e.ga(sdkClipAudioTemplate);
    }

    @Override // xsna.fee
    public final void l2() {
        this.e.M1();
    }

    @Override // xsna.fee
    public final void m2(ClipGridParams.Data.Music music) {
        gkg gkgVar;
        ClipGridParams.Data.Music.b bVar = music.d;
        boolean z = bVar.a;
        boolean z2 = bVar.b;
        boolean z3 = bVar.a;
        if (z) {
            eee eeeVar = this.C;
            ty4 ty4Var = eeeVar.g;
            ty4Var.getClass();
            if (z3) {
                ty4Var.d.onNext(new ty4.a(false, music));
                wfu f = eeeVar.b.f();
                gkgVar = f instanceof gkg ? (gkg) f : null;
                if (gkgVar != null) {
                    gkgVar.a.l6(ClipGridParams.Data.Music.Ab(music, new ClipGridParams.Data.Music.b(false, z2)));
                    return;
                }
                return;
            }
            return;
        }
        eee eeeVar2 = this.C;
        ty4 ty4Var2 = eeeVar2.g;
        ty4Var2.getClass();
        if (z3) {
            return;
        }
        ty4Var2.d.onNext(new ty4.a(true, music));
        wfu f2 = eeeVar2.b.f();
        gkgVar = f2 instanceof gkg ? (gkg) f2 : null;
        if (gkgVar != null) {
            gkgVar.a.l6(ClipGridParams.Data.Music.Ab(music, new ClipGridParams.Data.Music.b(true, z2)));
        }
    }

    @Override // xsna.fee
    public final void n2(Context context) {
        g620.f().h().getClass();
    }

    @Override // xsna.fee
    public final void o2(Context context, ClipGridParams.Data data) {
        if ((data instanceof ClipGridParams.Data.Profile) && !j8.d(context)) {
            ClipsAuthor clipsAuthor = ((ClipGridParams.Data.Profile) data).b;
            Owner owner = clipsAuthor.b;
            Owner owner2 = clipsAuthor.b;
            if (fkq0.d(owner.b)) {
                eee eeeVar = this.C;
                eeeVar.getClass();
                c subscribe = new v(rsg0.Z(yfb.x(new es().j(owner2.b, null))), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
                pgn pgnVar = eeeVar.d;
                qcy<Object> qcyVar = eee.h[1];
                pgnVar.b(subscribe);
            }
            wjs0.a(new kwr0(owner2.b));
            cvk.u(R.string.clips_grid_author_blocked, true);
        }
    }

    @Override // xsna.fee
    public final void onDestroyView() {
        if (this.y) {
            this.y = false;
            return;
        }
        hg1.f(this.v);
        hg1.f(this.u);
        hg1.f(this.w);
        this.C.c(true);
        this.h.a(TemplatesFlowScreen.MUSIC_GRID);
    }

    @Override // xsna.fee
    public final void onPause() {
        hg1.f(this.v);
    }

    @Override // xsna.fee
    public final void onResume() {
        hg1.f(this.v);
        this.v = this.m.a().b0(v2u0.class).subscribe(new da(new r6(this, 23), 15), new ea(new y40(16), 18));
    }

    @Override // xsna.fee
    public final void p2(ClipGridParams.Data data) {
        FragmentActivity We = this.e.We();
        if (We == null) {
            return;
        }
        if ((data instanceof ClipGridParams.Data.Hashtag) || (data instanceof ClipGridParams.Data.Music)) {
            maz.c(xwk.d().e(), We, a0a.d.concat("/trending"), new LaunchContext(false, false, false, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
        }
    }

    @Override // xsna.fee
    public final void q2() {
        this.A = true;
    }

    @Override // xsna.fee
    public final void r2() {
        ((u2b0) this.k.b).stop(32);
        this.e.Dc(getRef(), wrp.b(b()));
    }

    @Override // xsna.fee
    public final void s2() {
        this.y = true;
    }

    @Override // xsna.fee
    public final boolean t2() {
        return this.z;
    }

    @Override // xsna.fee
    public final sde w1(ClipsGridTabData clipsGridTabData) {
        return this.C.b.a(clipsGridTabData);
    }
}
