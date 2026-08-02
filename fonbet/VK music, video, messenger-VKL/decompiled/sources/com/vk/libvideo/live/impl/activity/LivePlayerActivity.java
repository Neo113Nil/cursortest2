package com.vk.libvideo.live.impl.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.live.impl.activity.LivePlayerActivity;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import xsna.ays;
import xsna.c0a;
import xsna.dhr0;
import xsna.dlz;
import xsna.dm10;
import xsna.fbr0;
import xsna.gz80;
import xsna.gzs;
import xsna.iah0;
import xsna.jfy;
import xsna.jkz;
import xsna.kkz;
import xsna.kyr0;
import xsna.lkz;
import xsna.lmz;
import xsna.m0q0;
import xsna.niz;
import xsna.pmz;
import xsna.pr;
import xsna.sfg;
import xsna.sy80;
import xsna.tvj;
import xsna.xy80;
import xsna.ysg0;

/* loaded from: classes3.dex */
public class LivePlayerActivity extends VKActivity implements niz, sy80, a.e, m0q0, kyr0 {
    public static final /* synthetic */ int M = 0;
    public com.vk.libvideo.design.view.swipe.layout.a A;
    public boolean B;
    public ays C;
    public boolean D;
    public xy80 E;
    public int G;
    public String H;

    @NonNull
    public jfy J;

    @Nullable
    public c0a K;
    public VideoOwner v;
    public pmz w;
    public String x;
    public LiveSwipeView y;
    public FrameLayout z;
    public UserId F = UserId.d;
    public SearchStatsLoggingInfo I = null;
    public final jkz L = new xy80.c() { // from class: xsna.jkz
        @Override // xsna.xy80.c
        public final void a(int i) {
            pmz pmzVar = LivePlayerActivity.this.w;
            if (pmzVar != null) {
                pmzVar.J0(false);
            }
        }
    };

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            LivePlayerActivity livePlayerActivity = LivePlayerActivity.this;
            livePlayerActivity.y.release();
            livePlayerActivity.y.clearAnimation();
            livePlayerActivity.finish();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            LivePlayerActivity livePlayerActivity = LivePlayerActivity.this;
            livePlayerActivity.y.release();
            livePlayerActivity.y.clearAnimation();
            livePlayerActivity.finish();
        }
    }

    @Override // xsna.sy80
    public final void Be() {
        this.E.i();
        this.E.g();
    }

    @Override // xsna.niz
    public final void F() {
        T1();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Lg() {
        if (this.B) {
            return;
        }
        LiveView currentLiveView = this.y.getCurrentLiveView();
        this.y.e();
        currentLiveView.setVisibilityFaded(false);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        super.O1(configuration);
        this.y.dispatchConfigurationChanged(configuration);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        return this.y.d();
    }

    public final void T1() {
        if (this.B) {
            return;
        }
        this.B = true;
        LiveSwipeView liveSwipeView = this.y;
        if (liveSwipeView == null) {
            finish();
            return;
        }
        liveSwipeView.clearAnimation();
        AnimatorSet animatorSet = new AnimatorSet();
        LiveSwipeView liveSwipeView2 = this.y;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveSwipeView2, (Property<LiveSwipeView, Float>) FrameLayout.ALPHA, liveSwipeView2.getAlpha(), 0.01f);
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.A;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, com.vk.libvideo.design.view.swipe.layout.a.o, aVar.getVolume(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        com.vk.libvideo.design.view.swipe.layout.a aVar2 = this.A;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(aVar2, com.vk.libvideo.design.view.swipe.layout.a.q, aVar2.getBackgroundAlpha(), 0));
        animatorSet.addListener(new a());
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public final void U1(LivePlayerActivity livePlayerActivity) {
        if (livePlayerActivity.isFinishing() || livePlayerActivity.isDestroyed() || getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        if (!gz80.a(24)) {
            getWindow().setFlags(1024, 1024);
        } else {
            if (livePlayerActivity.isInMultiWindowMode()) {
                return;
            }
            getWindow().setFlags(1024, 1024);
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void W6() {
        T1();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Wh() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Yb() {
        this.y.release();
        this.y.clearAnimation();
        finish();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void fm() {
        if (this.B) {
            return;
        }
        LiveView currentLiveView = this.y.getCurrentLiveView();
        this.y.i();
        currentLiveView.setVisibilityFaded(true);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        theme.applyStyle(dhr0.L() ? R.style.Theme_App_Transparent : R.style.Theme_App_TransparentDark, true);
        return theme;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final float getVolume() {
        return this.y.getCurrentLiveView().getPresenter().C1().getVolume();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean h6() {
        return false;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.y.a0()) {
            return;
        }
        this.y.c();
        T1();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        VideoFile videoFile;
        fbr0 fbr0Var;
        super.onCreate(bundle);
        this.E = new xy80(this);
        this.C = new ays(this, getWindow(), (ViewGroup) getWindow().getDecorView());
        U1(this);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(CoverVideoUploadTask.y);
        }
        if (bundle != null && bundle.containsKey(X3.i.b) && bundle.containsKey("ownerId") && bundle.containsKey("videoId")) {
            videoFile = (VideoFile) bundle.getParcelable(X3.i.b);
            this.F = bundle.getParcelable("ownerId") != null ? (UserId) bundle.getParcelable("ownerId") : UserId.d;
            this.G = bundle.getInt("videoId");
        } else {
            videoFile = (VideoFile) getIntent().getParcelableExtra(X3.i.b);
            this.F = getIntent().getParcelableExtra("ownerId") != null ? (UserId) getIntent().getParcelableExtra("ownerId") : UserId.d;
            this.G = getIntent().getIntExtra("videoId", 0);
            this.x = getIntent().getStringExtra("referrer");
        }
        this.H = getIntent().getStringExtra("track_code");
        this.I = (SearchStatsLoggingInfo) getIntent().getParcelableExtra("search_stats_logging_info");
        if (videoFile != null && this.G == 0 && this.F.b == 0) {
            this.G = videoFile.o0();
            this.F = videoFile.I0();
        }
        ArrayList arrayList = new ArrayList();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
        videoFeatures.getClass();
        if (b.A.a(videoFeatures)) {
            arrayList.add(VideoUrl.DASH_LIVE_ON_DEMAND_URL);
        }
        arrayList.add(VideoUrl.HLS_LIVE);
        arrayList.add(VideoUrl.HLS_ONDEMAND_LIVE_URL);
        List<? extends VideoUrl> list = (List) arrayList.stream().filter(new kkz()).collect(Collectors.toList());
        if (videoFile != null && TextUtils.isEmpty(videoFile.w9().Db(list)) && !videoFile.z0()) {
            getIntent().removeExtra(X3.i.b);
            videoFile = null;
        }
        this.J = new jfy(this, getWindow());
        this.v = new VideoOwner(videoFile, this.G, this.F);
        com.vk.libvideo.design.view.swipe.layout.a aVar = (com.vk.libvideo.design.view.swipe.layout.a) View.inflate(this, R.layout.live_activity, null);
        this.A = aVar;
        aVar.setTouchSlop(0);
        this.A.setDragStartTouchSlop(iah0.a(22.0f));
        this.A.setMinVelocity(100000.0f);
        this.A.setNavigationCallback(this);
        setContentView(this.A);
        this.A.setBackgroundColor(getColor(R.color.vk_black));
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().getRootView();
        this.z = frameLayout;
        LiveSwipeView liveSwipeView = (LiveSwipeView) frameLayout.findViewById(R.id.drag_view);
        this.y = liveSwipeView;
        liveSwipeView.setWindow(getWindow());
        pmz pmzVar = new pmz(this.y);
        this.w = pmzVar;
        pmzVar.p = true;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.I;
        if (searchStatsLoggingInfo != null) {
            pmzVar.z = new dlz(searchStatsLoggingInfo, new sfg(this, 27));
        }
        pmzVar.J0(false);
        pmz pmzVar2 = this.w;
        pmzVar2.f = this;
        pmzVar2.g = this;
        pmzVar2.w = this.x;
        this.y.setPresenter((lmz) pmzVar2);
        pmz pmzVar3 = this.w;
        pmzVar3.y = this.v;
        pmzVar3.start();
        VideoFile videoFile2 = this.v.f;
        if (videoFile2 != null) {
            this.K = new c0a((Context) this.i, (gzs) new tvj(videoFile2, 20));
        }
        c0a c0aVar = this.K;
        if (c0aVar != null && (fbr0Var = (fbr0) c0aVar.c) != null) {
            fbr0Var.e();
        }
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.g()) {
            f<Object> fVar = ysg0.b.a;
            pr prVar = new pr(20);
            fVar.getClass();
            this.p.b(new i0(fVar, prVar).subscribe(new lkz(this, 0)));
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.y.release();
        this.y.clearAnimation();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        LiveSwipeView liveSwipeView = this.y;
        LiveView liveView = (LiveView) liveSwipeView.b.findViewWithTag(this.v.c);
        if (liveView == null) {
            return true;
        }
        MenuButtonNewView menuButtonNewView = liveView.x;
        if (menuButtonNewView != null) {
            menuButtonNewView.M0();
        }
        if (liveView.p == null || !liveView.Q.w()) {
            return true;
        }
        liveView.p.r.M0();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        fbr0 fbr0Var;
        super.onPause();
        this.z.setKeepScreenOn(false);
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        viewTreeObserver.removeOnGlobalLayoutListener(this.J);
        viewTreeObserver.removeOnGlobalLayoutListener(this.C);
        overridePendingTransition(0, 0);
        this.E.b.remove(this.L);
        this.E.disable();
        c0a c0aVar = this.K;
        if (c0aVar == null || (fbr0Var = (fbr0) c0aVar.c) == null) {
            return;
        }
        fbr0Var.c();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        fbr0 fbr0Var;
        super.onResume();
        this.z.setKeepScreenOn(true);
        this.A.setBackgroundAlpha(255);
        U1(this);
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(this.J);
        viewTreeObserver.addOnGlobalLayoutListener(this.C);
        this.E.a(this.L);
        this.E.enable();
        c0a c0aVar = this.K;
        if (c0aVar == null || (fbr0Var = (fbr0) c0aVar.c) == null) {
            return;
        }
        fbr0Var.d();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(X3.i.b, this.v.f);
        bundle.putParcelable("ownerId", this.v.e);
        bundle.putInt("videoId", this.v.d);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        dm10.e().b();
        if (this.D) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                this.y.resume();
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.y.pause();
        this.D = true;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void setVolume(float f) {
        this.y.getCurrentLiveView().getPresenter().C1().setVolume(f);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        VideoOwner videoOwner;
        if ((this.H == null || this.F.b == 0) && ((videoOwner = this.v) == null || videoOwner.f == null)) {
            return;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        Long valueOf = Long.valueOf(this.G);
        Long valueOf2 = Long.valueOf(this.F.b);
        String str = this.H;
        if (str == null) {
            str = this.v.f.r();
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(type, valueOf, valueOf2, null, str, null);
    }

    @Override // xsna.niz
    public final void delete() {
    }

    @Override // xsna.niz
    public final void t6() {
    }
}
