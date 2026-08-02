package com.vk.music.onboarding.impl;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Artist;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.music.onboarding.impl.behavior.DisableableAppBarLayoutBehavior;
import com.vk.music.onboarding.impl.behavior.SearchFieldToToolbarBehavior;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import com.vk.music.onboarding.impl.model.d;
import com.vk.music.onboarding.impl.model.e;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b350;
import xsna.bc;
import xsna.bn40;
import xsna.bwt0;
import xsna.by2;
import xsna.cn70;
import xsna.d810;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.f4m;
import xsna.fl30;
import xsna.fs00;
import xsna.fsv;
import xsna.gzs;
import xsna.gzw;
import xsna.h350;
import xsna.h8;
import xsna.hp4;
import xsna.iah0;
import xsna.ilq;
import xsna.iu1;
import xsna.iu9;
import xsna.j990;
import xsna.jca;
import xsna.m350;
import xsna.n240;
import xsna.nca;
import xsna.orl;
import xsna.pla;
import xsna.q700;
import xsna.q87;
import xsna.qd0;
import xsna.qno0;
import xsna.r800;
import xsna.rc4;
import xsna.rsg0;
import xsna.s0d0;
import xsna.s250;
import xsna.s3q0;
import xsna.sh6;
import xsna.svz;
import xsna.tlc;
import xsna.u750;
import xsna.uf20;
import xsna.ux40;
import xsna.v250;
import xsna.v4a;
import xsna.x2y;
import xsna.xis;
import xsna.xk;
import xsna.y730;

/* compiled from: MusicRecommendationScreenDelegate.kt */
/* loaded from: classes3.dex */
public final class b implements fsv<Artist> {
    public static final int D = iah0.a(40);
    public static final int E = iah0.a(12);
    public final AppBarLayout A;
    public final VkSearchView B;
    public final int C;
    public final Activity b;
    public final MusicRecommendationOnboardingContract$Presenter c;
    public final RecommendationOnBoardingModel d;
    public final boolean e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final Handler g;
    public final s250 h;
    public final s250 i;
    public final b350 j;
    public final RecyclerPaginatedView k;
    public final RecyclerPaginatedView l;
    public final c m;
    public final RecyclerView n;
    public final RecyclerView o;
    public final TextView p;
    public final View q;
    public final View r;
    public final ImageView s;
    public final MotionLayout t;
    public final LottieAnimationView u;
    public final LottieAnimationView v;
    public final TextView w;
    public final ImageView x;
    public final RecyclerView y;
    public boolean z;

    public b(Activity activity, View view, MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter, RecommendationOnBoardingModel recommendationOnBoardingModel, boolean z) {
        this.b = activity;
        this.c = musicRecommendationOnboardingContract$Presenter;
        this.d = recommendationOnBoardingModel;
        this.e = z;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        this.g = new Handler(Looper.getMainLooper());
        s250 s250Var = new s250(this, recommendationOnBoardingModel);
        this.h = s250Var;
        s250 s250Var2 = new s250(this, recommendationOnBoardingModel);
        this.i = s250Var2;
        b350 b350Var = new b350();
        this.j = b350Var;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) bwt0.p(view, R.id.music_recommendation_onboarding_content_recycler_view, null, null, 4);
        f(recyclerPaginatedView, s250Var);
        this.k = recyclerPaginatedView;
        RecyclerPaginatedView recyclerPaginatedView2 = (RecyclerPaginatedView) bwt0.p(view, R.id.music_recommendation_onboarding_search_recycler_view, null, null, 4);
        f(recyclerPaginatedView2, s250Var2);
        recyclerPaginatedView2.setVisibility(4);
        this.l = recyclerPaginatedView2;
        e(recyclerPaginatedView, s250Var, null, true);
        this.m = e(recyclerPaginatedView2, s250Var2, view.getContext().getString(R.string.music_recommendation_onboarding_artist_not_found), false);
        this.n = recyclerPaginatedView.getRecyclerView();
        this.o = recyclerPaginatedView2.getRecyclerView();
        TextView textView = (TextView) bwt0.p(view, R.id.music_recommendation_onboarding_save, this, null, 4);
        this.p = textView;
        this.q = bwt0.p(view, R.id.music_recommendation_onboarding_toolbar, null, null, 4);
        this.r = bwt0.p(view, R.id.music_recommendation_onboarding_header, null, null, 6);
        ImageView imageView = (ImageView) bwt0.p(view, R.id.music_recommendation_onboarding_close, this, null, 4);
        boolean z2 = !z;
        bwt0.p0(imageView, z2);
        this.s = imageView;
        this.t = (MotionLayout) bwt0.p(view, R.id.music_recommendation_onboarding_process_layout, null, null, 6);
        this.u = (LottieAnimationView) bwt0.p(view, R.id.music_recommendation_onboarding_process_image, null, null, 6);
        this.v = (LottieAnimationView) bwt0.p(view, R.id.music_recommendation_onboarding_process_image_finish, null, null, 6);
        this.w = (TextView) bwt0.p(view, R.id.music_recommendation_onboarding_process_text, null, null, 6);
        this.x = (ImageView) bwt0.p(view, R.id.music_recommendation_onboarding_wave_image, null, null, 6);
        RecyclerView recyclerView = (RecyclerView) bwt0.p(view, R.id.music_recommendation_onboarding_process_recycler, null, null, 6);
        int integer = z ? recyclerView.getResources().getInteger(R.integer.music_recommendation_finish_artist_items_count_tablet) : recyclerView.getResources().getInteger(R.integer.music_recommendation_finish_artist_items_count_phone);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(integer / 2, 1));
        recyclerView.setAdapter(b350Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.setOnTouchListener(new h350());
        this.y = recyclerView;
        this.z = true;
        AppBarLayout appBarLayout = (AppBarLayout) bwt0.p(view, R.id.music_recommendation_onboarding_appbar, null, null, 6);
        appBarLayout.a(new AppBarLayout.f() { // from class: xsna.i350
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(AppBarLayout appBarLayout2, int i) {
                com.vk.music.onboarding.impl.b bVar2 = com.vk.music.onboarding.impl.b.this;
                bVar2.q.setAlpha((-i) / (r1.getHeight() / 3));
                bVar2.z = i == 0;
            }
        });
        this.A = appBarLayout;
        VkSearchView vkSearchView = (VkSearchView) bwt0.p(view, R.id.music_recommendation_onboarding_search, this, null, 4);
        vkSearchView.X4(false);
        orl.a(vkSearchView);
        vkSearchView.setOnActionSearchQueryClick(new bc(this, 8));
        bVar.b(new gzw.a(new qno0(vkSearchView.getEditView())).U(new h8(new svz(12), 27)).y(400L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n240(new ux40(this, 1), 2), new iu1(new m350(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 26)));
        ViewGroup.LayoutParams layoutParams = vkSearchView.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        SearchFieldToToolbarBehavior searchFieldToToolbarBehavior = obj instanceof SearchFieldToToolbarBehavior ? (SearchFieldToToolbarBehavior) obj : null;
        if (searchFieldToToolbarBehavior != null) {
            searchFieldToToolbarBehavior.e = z2;
        }
        this.B = vkSearchView;
        this.C = e3m.a(R.dimen.music_recommendation_on_boarding_image_width, activity);
        textView.setEnabled(recommendationOnBoardingModel.D());
    }

    @Override // xsna.fsv
    public final void Ig(int i, Artist artist) {
        b0 E2;
        Triple triple;
        Artist artist2 = artist;
        MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter = this.c;
        RecommendationOnBoardingModel recommendationOnBoardingModel = musicRecommendationOnboardingContract$Presenter.d;
        io.reactivex.rxjava3.disposables.b bVar = musicRecommendationOnboardingContract$Presenter.e;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        if (i == R.id.music_recommendation_onboarding_save) {
            long integer = musicRecommendationOnboardingContract$Presenter.b.getResources().getInteger(R.integer.music_recommendation_processing_anim_length_sec);
            Hint p = pla.e().b().p(HintId.MUSIC_RECOMMENDATIONS_ONBOARDING.getId());
            if (p != null) {
                Map<String, String> map = p.e;
                String str = map != null ? map.get("intro") : null;
                if (str == null) {
                    str = "";
                }
                String str2 = map != null ? map.get("cycle") : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = map != null ? map.get("final") : null;
                triple = new Triple(str, str2, str3 != null ? str3 : "");
            } else {
                triple = new Triple("", "", "");
            }
            bVar.b(io.reactivex.rxjava3.kotlin.c.f(4, new c0(recommendationOnBoardingModel.P().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new y730(new v250(musicRecommendationOnboardingContract$Presenter, integer, (String) triple.d(), (String) triple.g()), 2), kVar), new xk(22, musicRecommendationOnboardingContract$Presenter, (String) triple.h()), new q87(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), null));
            return;
        }
        if (i != R.id.holder_music_recommendation_on_boarding_artist_image_container) {
            if (i == R.id.music_recommendation_onboarding_close) {
                musicRecommendationOnboardingContract$Presenter.g();
                return;
            }
            return;
        }
        if (artist2 != null) {
            u750 u750Var = recommendationOnBoardingModel.d;
            String str4 = artist2.b;
            boolean F = recommendationOnBoardingModel.F(artist2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            if (F) {
                u750Var.d0(recommendationOnBoardingModel.M().h(), str4);
                E2 = q.T(new Pair(EmptyList.b, artist2)).E(new j990(new com.vk.music.onboarding.impl.model.c(recommendationOnBoardingModel, artist2), 6), lVar, kVar, kVar);
            } else {
                u750Var.a(recommendationOnBoardingModel.M().h(), str4);
                hp4 hp4Var = new hp4("audio.getRelatedArtistsById");
                hp4Var.j("artist_id", str4);
                hp4Var.g(0, SignalingProtocol.KEY_OFFSET);
                hp4Var.g(500, "count");
                E2 = rsg0.y0(hp4Var, null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new uf20(new d(recommendationOnBoardingModel, artist2), 8)).E(new fs00(new e(recommendationOnBoardingModel), 16), lVar, kVar, kVar);
            }
            bVar.b(E2.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sh6(new x2y(musicRecommendationOnboardingContract$Presenter, 19), 24), new fl30(new jca(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 1), 6)));
        }
    }

    public final void a(boolean z) {
        int i = D;
        int i2 = E;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, i);
        ofInt.addUpdateListener(new tlc(this, 1));
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new ilq());
        ofInt.start();
    }

    public final void b(gzs<s3q0> gzsVar) {
        this.f.b(io.reactivex.rxjava3.kotlin.c.g(io.reactivex.rxjava3.core.a.r(this.b.getResources().getInteger(R.integer.music_recommendation_finish_screen_display_length_sec), TimeUnit.SECONDS).o(io.reactivex.rxjava3.android.schedulers.a.b()), null, new xis(gzsVar), 1));
    }

    public final void c(long j, String str, final String str2) {
        bwt0.p0(this.k, false);
        bwt0.p0(this.p, false);
        bwt0.p0(this.B, false);
        bwt0.p0(this.r, false);
        bwt0.p0(this.t, true);
        Activity activity = this.b;
        q700.j(activity, str).b(new r800() { // from class: xsna.l350
            @Override // xsna.r800
            public final void onResult(Object obj) {
                final i700 i700Var = (i700) obj;
                final com.vk.music.onboarding.impl.b bVar = com.vk.music.onboarding.impl.b.this;
                q700.j(bVar.b, str2).b(new r800() { // from class: xsna.g350
                    @Override // xsna.r800
                    public final void onResult(Object obj2) {
                        LottieAnimationView lottieAnimationView = com.vk.music.onboarding.impl.b.this.u;
                        lottieAnimationView.U(new n350(lottieAnimationView, (i700) obj2, lottieAnimationView));
                        lottieAnimationView.setComposition(i700Var);
                        lottieAnimationView.m0();
                    }
                });
            }
        });
        this.f.b(io.reactivex.rxjava3.kotlin.c.f(3, q.P(0L, j / r7.length, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, null, new iu9(new Ref$IntRef(), enj.j(R.array.music_recommendation_onboarding_process_array, activity), this, 5)));
    }

    public final void d(MusicRecommendationOnboardingContract$Presenter.State state) {
        DisableableAppBarLayoutBehavior disableableAppBarLayoutBehavior;
        MusicRecommendationOnboardingContract$Presenter.State state2 = MusicRecommendationOnboardingContract$Presenter.State.SEARCH;
        AppBarLayout appBarLayout = this.A;
        RecyclerPaginatedView recyclerPaginatedView = this.l;
        RecyclerPaginatedView recyclerPaginatedView2 = this.k;
        boolean z = this.e;
        ImageView imageView = this.s;
        if (state == state2) {
            appBarLayout.g(false, true, true);
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            Object obj = fVar != null ? fVar.a : null;
            disableableAppBarLayoutBehavior = obj instanceof DisableableAppBarLayoutBehavior ? (DisableableAppBarLayoutBehavior) obj : null;
            if (disableableAppBarLayoutBehavior != null) {
                disableableAppBarLayoutBehavior.q = false;
            }
            if (z) {
                a(true);
            }
            bwt0.p0(imageView, true);
            imageView.setImageResource(R.drawable.vk_icon_back_24);
            recyclerPaginatedView2.setVisibility(4);
            recyclerPaginatedView.setVisibility(0);
            return;
        }
        imageView.setImageResource(R.drawable.vk_icon_cancel_24);
        bwt0.p0(imageView, !z);
        ViewGroup.LayoutParams layoutParams2 = appBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar2 = layoutParams2 instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams2 : null;
        Object obj2 = fVar2 != null ? fVar2.a : null;
        disableableAppBarLayoutBehavior = obj2 instanceof DisableableAppBarLayoutBehavior ? (DisableableAppBarLayoutBehavior) obj2 : null;
        if (disableableAppBarLayoutBehavior != null) {
            disableableAppBarLayoutBehavior.q = true;
        }
        if (z) {
            a(false);
        }
        VkSearchView vkSearchView = this.B;
        vkSearchView.U4();
        vkSearchView.postDelayed(new qd0(vkSearchView, 1), 50L);
        vkSearchView.w.clearFocus();
        recyclerPaginatedView2.setVisibility(0);
        recyclerPaginatedView.setVisibility(4);
    }

    public final c e(RecyclerPaginatedView recyclerPaginatedView, s250 s250Var, String str, boolean z) {
        c.h hVar = new c.h(this.c);
        hVar.c = 30;
        hVar.i = 30;
        v4a.a aVar = new v4a.a();
        aVar.b = true;
        by2 by2Var = new by2(R.string.music_recommendation_onboarding_error, 12, null);
        SparseArray<by2> sparseArray = aVar.a;
        sparseArray.put(104, by2Var);
        sparseArray.put(15, new by2(R.string.music_recommendation_onboarding_error, 12, null));
        hVar.n = aVar.a();
        hVar.s = 33;
        hVar.t = new s0d0() { // from class: xsna.e350
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                Image image;
                ImageSize Cb;
                com.vk.music.onboarding.impl.b bVar = com.vk.music.onboarding.impl.b.this;
                RecyclerView.Adapter z0 = bVar.h.z0(i);
                u250 u250Var = z0 instanceof u250 ? (u250) z0 : null;
                if (u250Var != null) {
                    List<Artist> y0 = u250Var.y0();
                    if (i >= 0) {
                        ArrayList arrayList = (ArrayList) y0;
                        if (i < arrayList.size() && (image = ((Artist) arrayList.get(i)).f) != null && (Cb = image.Cb(bVar.C, true, false)) != null) {
                            io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(Cb.d.d).subscribe();
                            hg1.e(bVar.c.e, subscribe);
                            return new v0d0(subscribe);
                        }
                    }
                }
                return u0d0.a;
            }
        };
        hVar.g = z;
        hVar.f = s250Var;
        if (str != null) {
            hVar.o = new d810(str, 7);
        }
        return f.a(hVar, recyclerPaginatedView);
    }

    public final void f(RecyclerPaginatedView recyclerPaginatedView, s250 s250Var) {
        int i = (iah0.s(recyclerPaginatedView.getContext()) || this.e) ? 3 : 5;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.f = 1;
        dVar.c(i);
        dVar.a();
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerView.setItemAnimator(new nca(false));
        recyclerView.setHasFixedSize(true);
        f4m.v(cn70.b(68) + e3m.d(R.attr.actionBarSize, recyclerPaginatedView.getContext()), recyclerView);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerPaginatedView.setLoadingViewContentProvider(new k(26));
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(s250Var);
    }

    public final void g(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        if (context == null && (context = e43.a) == null) {
            context = null;
        }
        int i = (iah0.s(context) || this.e) ? 3 : 5;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(i);
        }
        this.g.post(new rc4(recyclerView, 12));
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
