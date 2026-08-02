package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.vkmix.models.MusicMixMood;
import com.vk.music.view.vkmix.view.MusicMixAnimationView;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.amt;
import xsna.an10;
import xsna.ao40;
import xsna.b0u0;
import xsna.bdn;
import xsna.bqx0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cnh;
import xsna.cr20;
import xsna.dh40;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fd4;
import xsna.fl40;
import xsna.fnj;
import xsna.fo40;
import xsna.gc;
import xsna.gzs;
import xsna.h1j;
import xsna.h4x;
import xsna.iah0;
import xsna.iut0;
import xsna.jl40;
import xsna.l4v0;
import xsna.lxz;
import xsna.msy;
import xsna.nwk;
import xsna.os30;
import xsna.pla;
import xsna.q3a;
import xsna.ri0;
import xsna.s3q0;
import xsna.s520;
import xsna.si1;
import xsna.too0;
import xsna.w4v0;
import xsna.w620;
import xsna.wzs;
import xsna.x7c;
import xsna.yn40;

/* compiled from: MusicHidingToolbarVh.kt */
/* loaded from: classes16.dex */
public final class MusicHidingToolbarVh extends HidingToolbarVh implements too0 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final fl40 E;
    public boolean F;
    public boolean G;
    public MusicMixAnimationView H;
    public VKImageView I;
    public View J;
    public ViewGroup K;
    public boolean L;
    public final List<CatalogViewHolder> k;
    public final boolean l;
    public final fd4 m;
    public final l4v0 n;
    public final h1j o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final Handler t;
    public boolean u;
    public final io.reactivex.rxjava3.disposables.b v;
    public io.reactivex.rxjava3.disposables.c w;
    public final a x;
    public final Object y;
    public final DevicePerformanceInfo z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public MusicHidingToolbarVh(q3a q3aVar, List list, SwitchCatalogVh switchCatalogVh, fd4 fd4Var, l4v0 l4v0Var, h1j h1jVar) {
        super(q3aVar, list, switchCatalogVh, null);
        TabLayoutViewHolder tabLayoutViewHolder;
        this.k = list;
        this.l = true;
        this.m = fd4Var;
        this.n = l4v0Var;
        this.o = h1jVar;
        this.p = 255.0f;
        this.q = true;
        this.t = new Handler(Looper.getMainLooper());
        this.u = true;
        this.v = new io.reactivex.rxjava3.disposables.b();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                tabLayoutViewHolder = 0;
                break;
            } else {
                tabLayoutViewHolder = it.next();
                if (((CatalogViewHolder) tabLayoutViewHolder) instanceof TabLayoutViewHolder) {
                    break;
                }
            }
        }
        TabLayoutViewHolder tabLayoutViewHolder2 = tabLayoutViewHolder instanceof TabLayoutViewHolder ? tabLayoutViewHolder : null;
        this.x = tabLayoutViewHolder2 != null ? new b(tabLayoutViewHolder2) : new c();
        nwk nwkVar = new nwk(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, nwkVar);
        this.z = DevicePerformanceInfo.a.a();
        this.A = msy.a(lazyThreadSafetyMode, new cnh(this, 25));
        this.B = msy.a(lazyThreadSafetyMode, new cr20(this, 7));
        this.C = msy.a(lazyThreadSafetyMode, new gc(20));
        this.D = msy.a(lazyThreadSafetyMode, new os30(this, 2));
        this.E = new fl40(this, 0);
        this.G = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.HidingToolbarVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        super.L();
        this.v.e();
        io.reactivex.rxjava3.disposables.c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.t.removeCallbacks((Runnable) this.D.getValue());
        AppBarLayout appBarLayout = this.f;
        if (appBarLayout != null) {
            appBarLayout.f((AppBarLayout.f) this.y.getValue());
        }
        this.x.d();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.E.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View e() {
        return ((Boolean) this.B.getValue()).booleanValue() ? this.H : this.I;
    }

    public final void g() {
        io.reactivex.rxjava3.disposables.c cVar = this.w;
        if (cVar == null || cVar.h()) {
            l4v0 l4v0Var = this.n;
            this.w = l4v0Var != null ? l4v0Var.c.subscribe(new s520(new w620(this, 4), 3)) : null;
        }
    }

    public final void h(float f, boolean z) {
        if (this.L) {
            fd4 fd4Var = this.m;
            if (!z) {
                fd4Var.invoke(Boolean.FALSE, null);
                AppBarLayout appBarLayout = this.f;
                if (appBarLayout != null) {
                    appBarLayout.setBackgroundColor(dhr0.t.c(R.attr.colorPrimary));
                    return;
                }
                return;
            }
            fd4Var.invoke(Boolean.TRUE, Float.valueOf(f));
            int c2 = dhr0.t.c(R.attr.colorPrimary);
            int argb = Color.argb((int) f, Color.red(c2), Color.green(c2), Color.blue(c2));
            AppBarLayout appBarLayout2 = this.f;
            if (appBarLayout2 != null) {
                appBarLayout2.setBackgroundColor(argb);
            }
        }
    }

    public final void j() {
        List<fo40> list;
        yn40 yn40Var;
        if (this.s) {
            List<fo40> list2 = fo40.f;
            List<fo40> list3 = fo40.f;
            list = new ArrayList<>(c5g.u(list3, 10));
            for (fo40 fo40Var : list3) {
                ao40 ao40Var = fo40Var.d;
                ao40 ao40Var2 = ao40.c;
                list.add(new fo40(fo40Var.a, fo40Var.b, fo40Var.c, epx.f(ao40Var, ao40.d) ? ao40.e : fo40Var.d, fo40Var.e));
            }
        } else {
            List<fo40> list4 = fo40.f;
            list = fo40.f;
        }
        MusicMixAnimationView musicMixAnimationView = this.H;
        if (musicMixAnimationView == null || (yn40Var = musicMixAnimationView.b) == null) {
            return;
        }
        yn40Var.B = list;
    }

    public final void k(int i, int i2, Context context) {
        View view = this.J;
        int i3 = R.dimen.overlap_separator_height;
        if (view != null) {
            f4m.k(e3m.a(this.s ? R.dimen.overlap_separator_height_facelifting : R.dimen.overlap_separator_height, context), view);
        }
        ViewGroup viewGroup = this.K;
        h4x h4xVar = null;
        if (viewGroup != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            bqx0 a2 = iut0.e.a(viewGroup);
            if (a2 != null) {
                h4xVar = a2.a.j(1);
            }
        }
        int i4 = h4xVar != null ? h4xVar.b : 0;
        int i5 = i2 - i;
        l4v0 l4v0Var = this.n;
        if (l4v0Var != null) {
            l4v0Var.g.onNext(0);
        }
        int a3 = e3m.a(this.s ? R.dimen.music_vk_mix_interactive_static_height : R.dimen.music_vk_mix_interactive_height, context);
        if (this.s) {
            i3 = R.dimen.overlap_separator_height_facelifting;
        }
        int a4 = e3m.a(i3, context);
        int b2 = an10.b(a3 + a4 + i5);
        MusicMixAnimationView musicMixAnimationView = this.H;
        if (musicMixAnimationView != null) {
            f4m.t(-i4, musicMixAnimationView);
            f4m.k((i4 * 2) + b2, musicMixAnimationView);
        }
        VKImageView vKImageView = this.I;
        if (vKImageView != null) {
            f4m.t(-i4, vKImageView);
            f4m.k(b2, vKImageView);
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            View view2 = this.J;
            if (view2 != null) {
                f4m.t(b2 - a4, view2);
                return;
            }
            return;
        }
        View view3 = this.J;
        if (view3 != null) {
            f4m.t((b2 - a4) - i4, view3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.HidingToolbarVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_media_music_layout, viewGroup, false);
        final ViewGroup viewGroup2 = (ViewGroup) inflate;
        b(layoutInflater, viewGroup2, bundle);
        this.f = (AppBarLayout) viewGroup2.findViewById(R.id.vk_app_bar);
        if (this.l) {
            this.H = (MusicMixAnimationView) viewGroup2.findViewById(R.id.mix_animation);
        }
        this.I = (VKImageView) viewGroup2.findViewById(R.id.mix_animation_image);
        this.J = viewGroup2.findViewById(R.id.overlap_separator);
        l4v0 l4v0Var = this.n;
        if (l4v0Var != null) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            f<w4v0> fVar = l4v0Var.f;
            fVar.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = new y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new dh40(new ri0(20, this, ref$IntRef), 1));
            io.reactivex.rxjava3.disposables.b bVar = this.v;
            bVar.b(subscribe);
            AppBarLayout appBarLayout = this.f;
            if (appBarLayout != null) {
                appBarLayout.a((AppBarLayout.f) this.y.getValue());
            }
            this.x.b();
            MusicMixAnimationView musicMixAnimationView = this.H;
            if (musicMixAnimationView != null) {
                if (((Boolean) this.B.getValue()).booleanValue()) {
                    bwt0.p0(musicMixAnimationView, true);
                    VKImageView vKImageView = this.I;
                    if (vKImageView != null) {
                        bwt0.p0(vKImageView, false);
                    }
                    if (!this.s) {
                        g();
                    }
                    j();
                    f<MusicMixMood> fVar2 = l4v0Var.b;
                    fVar2.getClass();
                    io.reactivex.rxjava3.disposables.c subscribe2 = new y(fVar2, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new amt(new lxz(musicMixAnimationView, 7), 14));
                    if (subscribe2 != null) {
                        bVar.b(subscribe2);
                    }
                    h1j h1jVar = this.o;
                    if (h1jVar != null) {
                        f5z f5zVar = (f5z) h1jVar.invoke();
                        boolean booleanValue = ((Boolean) this.C.getValue()).booleanValue();
                        if (musicMixAnimationView.b == null) {
                            yn40 yn40Var = new yn40(musicMixAnimationView.getContext());
                            musicMixAnimationView.addView(yn40Var, new ViewGroup.LayoutParams(-1, -1));
                            musicMixAnimationView.b = yn40Var;
                            yn40Var.i(f5zVar, musicMixAnimationView.c, booleanValue, bdn.b);
                        } else if (BuildInfo.h()) {
                            throw new IllegalStateException("MusicMixAnimationView has already been initialized.");
                        }
                    }
                } else {
                    Hint p = pla.e().b().p(HintId.MUSIC_VK_MIX_REDESIGN.getId());
                    String str = "";
                    if (p != null) {
                        Map<String, String> map = p.e;
                        String str2 = map != null ? map.get("image") : null;
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                    bwt0.p0(musicMixAnimationView, false);
                    VKImageView vKImageView2 = this.I;
                    if (vKImageView2 != null) {
                        bwt0.p0(vKImageView2, true);
                        this.t.postDelayed((Runnable) this.D.getValue(), 5000L);
                        vKImageView2.s0(str);
                        vKImageView2.setOnLoadCallback(new jl40(this));
                    }
                }
            }
        }
        AppBarLayout appBarLayout2 = this.f;
        if (appBarLayout2 != null) {
            appBarLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.el40
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MusicHidingToolbarVh.this.k(i2, i4, viewGroup2.getContext());
                }
            });
        }
        this.K = viewGroup2;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.HidingToolbarVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.E.c();
        super.onConfigurationChanged(configuration);
    }

    /* compiled from: MusicHidingToolbarVh.kt */
    public interface a {
        void a();

        void b();

        boolean c();

        void d();

        void e();

        default void f() {
        }
    }

    /* compiled from: MusicHidingToolbarVh.kt */
    public final class b implements a {
        public final TabLayoutViewHolder a;
        public float b;
        public final Object c;

        public b(TabLayoutViewHolder tabLayoutViewHolder) {
            this.a = tabLayoutViewHolder;
            this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.presenter.c(18, this, MusicHidingToolbarVh.this));
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void a() {
            TabLayoutViewHolder tabLayoutViewHolder = this.a;
            int rc = tabLayoutViewHolder.rc();
            MusicHidingToolbarVh musicHidingToolbarVh = MusicHidingToolbarVh.this;
            tabLayoutViewHolder.K5(new si1(rc, musicHidingToolbarVh));
            musicHidingToolbarVh.h(musicHidingToolbarVh.p, true);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void b() {
            this.a.cc((a) this.c.getValue());
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final boolean c() {
            return this.a.rc() == 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void d() {
            this.a.s8((a) this.c.getValue());
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void e() {
            this.a.K5(new x7c(8));
            MusicHidingToolbarVh musicHidingToolbarVh = MusicHidingToolbarVh.this;
            musicHidingToolbarVh.h(musicHidingToolbarVh.p, false);
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void f() {
        }

        /* compiled from: MusicHidingToolbarVh.kt */
        public static final class a implements ViewPager.j {
            public final /* synthetic */ MusicHidingToolbarVh c;

            public a(MusicHidingToolbarVh musicHidingToolbarVh) {
                this.c = musicHidingToolbarVh;
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public final void onPageScrolled(int i, float f, int i2) {
                View e;
                View e2;
                b bVar = b.this;
                boolean z = bVar.b > f;
                MusicHidingToolbarVh musicHidingToolbarVh = this.c;
                View e3 = musicHidingToolbarVh.e();
                if (e3 != null && bwt0.K(e3)) {
                    bVar.getClass();
                    if (i == 0 && musicHidingToolbarVh.q && (e2 = musicHidingToolbarVh.e()) != null) {
                        e2.setTranslationX(-i2);
                    }
                }
                if (musicHidingToolbarVh.q) {
                    bVar.getClass();
                    if (i == 0 && z && !musicHidingToolbarVh.u) {
                        View e4 = musicHidingToolbarVh.e();
                        if (e4 != null && !bwt0.K(e4) && (e = musicHidingToolbarVh.e()) != null) {
                            bwt0.p0(e, true);
                        }
                        View e5 = musicHidingToolbarVh.e();
                        if (e5 != null) {
                            e5.setTranslationX(-i2);
                        }
                    }
                }
                bVar.b = f;
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public final void onPageSelected(final int i) {
                b bVar = b.this;
                TabLayoutViewHolder tabLayoutViewHolder = bVar.a;
                MusicHidingToolbarVh musicHidingToolbarVh = this.c;
                boolean z = false;
                if (!musicHidingToolbarVh.G || i != 0 || !musicHidingToolbarVh.F) {
                    tabLayoutViewHolder.K5(new wzs() { // from class: xsna.gl40
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((TabView) obj2).setTabSelected(((Integer) obj).intValue() == i);
                            return s3q0.a;
                        }
                    });
                    musicHidingToolbarVh.h(musicHidingToolbarVh.p, false);
                    return;
                }
                MusicHidingToolbarVh musicHidingToolbarVh2 = MusicHidingToolbarVh.this;
                tabLayoutViewHolder.K5(new si1(i, musicHidingToolbarVh2));
                musicHidingToolbarVh2.h(musicHidingToolbarVh2.p, true);
                if (bVar.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    View e = musicHidingToolbarVh.e();
                    if (e != null) {
                        if (musicHidingToolbarVh.q && !musicHidingToolbarVh.u) {
                            z = true;
                        }
                        f4m.E(e, z);
                    }
                    View e2 = musicHidingToolbarVh.e();
                    if (e2 != null) {
                        e2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public final void onPageScrollStateChanged(int i) {
            }
        }
    }

    /* compiled from: MusicHidingToolbarVh.kt */
    public final class c implements a {
        public gzs<s3q0> a;

        public c() {
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void a() {
            final MusicHidingToolbarVh musicHidingToolbarVh = MusicHidingToolbarVh.this;
            final float f = musicHidingToolbarVh.p;
            this.a = new gzs() { // from class: xsna.il40
                @Override // xsna.gzs
                public final Object invoke() {
                    MusicHidingToolbarVh.this.h(f, true);
                    return s3q0.a;
                }
            };
            f();
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final boolean c() {
            return true;
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void e() {
            final MusicHidingToolbarVh musicHidingToolbarVh = MusicHidingToolbarVh.this;
            final float f = musicHidingToolbarVh.p;
            this.a = new gzs() { // from class: xsna.hl40
                @Override // xsna.gzs
                public final Object invoke() {
                    MusicHidingToolbarVh.this.h(f, false);
                    return s3q0.a;
                }
            };
            f();
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void f() {
            gzs<s3q0> gzsVar = this.a;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void b() {
        }

        @Override // com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh.a
        public final void d() {
        }
    }
}
