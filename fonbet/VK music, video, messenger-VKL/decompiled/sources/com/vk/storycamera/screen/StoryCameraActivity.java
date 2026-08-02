package com.vk.storycamera.screen;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.Transition;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.shape.a;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.afl0;
import xsna.asl0;
import xsna.b0u0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cm9;
import xsna.cn70;
import xsna.cqm0;
import xsna.d0m0;
import xsna.dhr0;
import xsna.e0m0;
import xsna.em10;
import xsna.epx;
import xsna.fkq0;
import xsna.g0m0;
import xsna.g0t;
import xsna.iah0;
import xsna.im10;
import xsna.iut0;
import xsna.kd7;
import xsna.m3t;
import xsna.mhy;
import xsna.mzp0;
import xsna.nf9;
import xsna.nht;
import xsna.nxi0;
import xsna.oen;
import xsna.orj0;
import xsna.p1d0;
import xsna.p90;
import xsna.pf40;
import xsna.pt20;
import xsna.qj80;
import xsna.rok;
import xsna.rzp0;
import xsna.sd;
import xsna.tok;
import xsna.too;
import xsna.tvo;
import xsna.wog0;
import xsna.xa4;
import xsna.xzs;
import xsna.ysg0;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: StoryCameraActivity.kt */
/* loaded from: classes6.dex */
public class StoryCameraActivity extends VKActivity implements g0m0, tvo.a, nht, rok {
    public static final /* synthetic */ int G = 0;
    public ViewGroup A;
    public final mzp0 B;
    public boolean C;
    public final yw90 D;
    public final bpn0 E;
    public final bpn0 F;
    public final a v = new a();
    public Intent w;
    public Integer x;
    public d0m0 y;
    public StoryCameraParams z;

    /* compiled from: StoryCameraActivity.kt */
    public static final /* synthetic */ class a implements tok, g0t {
        public a() {
        }

        @Override // xsna.tok
        public final void a() {
            StoryCameraActivity.this.Ng();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof tok) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, StoryCameraActivity.this, StoryCameraActivity.class, "changeTheme", "changeTheme()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ StoryCameraActivity b;

        public b(ViewGroup viewGroup, ViewGroup viewGroup2, StoryCameraActivity storyCameraActivity) {
            this.b = storyCameraActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.startPostponedEnterTransition();
        }
    }

    /* compiled from: StoryCameraActivity.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ FrameLayout b;

        public c(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bwt0.p0(this.b, false);
        }
    }

    public StoryCameraActivity() {
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.STORY_CAMERA).j();
        yw90Var.init();
        this.D = yw90Var;
        this.E = new bpn0(new afl0(this, 1));
        this.F = new bpn0(new orj0(this, 4));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.STORY_CAMERA, null, false, 62).j();
        mzp0Var.b();
        mzp0Var.init();
        this.B = mzp0Var;
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.K0(i, strArr);
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, xsna.too0
    public final void Ng() {
        super.Ng();
        ViewGroup viewGroup = this.A;
        if (viewGroup != null) {
            viewGroup.post(new sd(this, 14));
        }
    }

    @Override // xsna.rok
    public final tok R() {
        return this.v;
    }

    public final em10 T1(com.google.android.material.shape.a aVar) {
        em10 em10Var = new em10();
        Object obj = this.y;
        if (obj == null) {
            obj = null;
        }
        em10Var.addTarget(((ViewGroup) obj).getChildAt(0).getId());
        em10Var.setDuration(250L);
        em10Var.h = aVar;
        em10Var.i = aVar;
        em10Var.setInterpolator(new AccelerateDecelerateInterpolator());
        return em10Var;
    }

    public int U1() {
        return (iah0.n(this) || oen.a()) ? R.style.StoryViewActivityThemeDark : R.style.StoryFullscreenActivityThemeDark;
    }

    public final void V1() {
        if (iah0.n(this) || oen.a()) {
            return;
        }
        View decorView = getWindow().getDecorView();
        if (decorView.getSystemUiVisibility() != 5380) {
            decorView.setSystemUiVisibility(dhr0.c0(5380, getWindow().getNavigationBarColor(), true));
        }
    }

    @Override // androidx.core.app.ComponentActivity, xsna.g0m0
    public final void ad(int i, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        StoryCameraParams storyCameraParams = this.z;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        intent.putExtra("FROM_COLLAGE", storyCameraParams.B0);
        StoryCameraParams storyCameraParams2 = this.z;
        intent.putExtra("COLLAGE_PARAMS", (storyCameraParams2 != null ? storyCameraParams2 : null).C0);
        this.w = intent;
        this.x = Integer.valueOf(i);
        setResult(i, this.w);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        return d0m0Var.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.C) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // xsna.g0m0
    public void o5(boolean z) {
        Integer num;
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.Hj();
        StoryCameraParams storyCameraParams = this.z;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (storyCameraParams.p0 && z) {
            super.finishAfterTransition();
            return;
        }
        ViewGroup viewGroup = this.A;
        View rootView = viewGroup != null ? viewGroup.getRootView() : null;
        if (rootView == null || rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            rootView = null;
        }
        StoryCameraParams storyCameraParams2 = this.z;
        if (storyCameraParams2 == null) {
            storyCameraParams2 = null;
        }
        if (storyCameraParams2.d != StoryCameraMode.STORY || z || rootView == null || (num = this.x) == null || num.intValue() != -1) {
            overridePendingTransition(0, z ? R.anim.stories_slide_out : 0);
            finish();
            return;
        }
        this.C = true;
        pf40 pf40Var = new pf40(this, 26);
        Window window = getWindow();
        if (window != null) {
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            int[] iArr = new int[2];
            rootView.getLocationInWindow(iArr);
            try {
                int i = iArr[0];
                PixelCopy.request(window, new Rect(i, iArr[1], rootView.getWidth() + i, iArr[1] + rootView.getHeight()), createBitmap, new too(pf40Var, createBitmap, rootView, 1), new Handler(Looper.getMainLooper()));
            } catch (IllegalArgumentException unused) {
                pf40Var.invoke(kd7.i(rootView, null));
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        if (d0m0Var.a0()) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        FrameLayout frameLayout;
        StoryCameraParams storyCameraParams = bundle != null ? (StoryCameraParams) bundle.getParcelable("camera_params") : null;
        if (storyCameraParams == null && (storyCameraParams = (StoryCameraParams) getIntent().getParcelableExtra("camera_params")) == null) {
            String stringExtra = getIntent().getStringExtra("ref");
            String stringExtra2 = getIntent().getStringExtra("entry_point");
            String str = stringExtra == null ? "" : stringExtra;
            String str2 = stringExtra2 == null ? "" : stringExtra2;
            StoryCameraMode storyCameraMode = StoryCameraMode.STORY;
            ArrayList q = xa4.q();
            EmptyList emptyList = EmptyList.b;
            UserId userId = UserId.d;
            StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
            ArrayList arrayList = new ArrayList();
            Iterator it = q.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                emptyList.getClass();
                arrayList.add(next);
            }
            storyCameraParams = new StoryCameraParams(str, str2, storyCameraMode, arrayList, null, userId, null, null, null, null, false, false, null, storyCameraTarget, null, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, false, null, null, null, null, null, null, null, null, null, null, false, true, true, true, true, true, true, false, null, null, null, Boolean.valueOf(!fkq0.b(userId)), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, true, true, true, true, true, null, emptyList, false, null, null);
        }
        this.z = storyCameraParams;
        Long valueOf = getIntent().hasExtra("session_id") ? Long.valueOf(getIntent().getLongExtra("session_id", 0L)) : null;
        nf9 nf9Var = nf9.b;
        nxi0 e2 = nf9.e();
        m3t m3tVar = (m3t) this.E.getValue();
        ThemableActivity themableActivity = this.i;
        x<JSONObject> a2 = m3tVar.a(themableActivity);
        StoryCameraParams storyCameraParams2 = this.z;
        if (storyCameraParams2 == null) {
            storyCameraParams2 = null;
        }
        String m = cqm0.m(storyCameraParams2.c);
        StoryCameraParams storyCameraParams3 = this.z;
        if (storyCameraParams3 == null) {
            storyCameraParams3 = null;
        }
        e2.a(themableActivity, valueOf, a2, m, storyCameraParams3.b);
        setTheme(U1());
        StoryCameraParams storyCameraParams4 = this.z;
        if (storyCameraParams4 == null) {
            storyCameraParams4 = null;
        }
        if (storyCameraParams4.p0) {
            postponeEnterTransition();
            getWindow().requestFeature(13);
            getWindow().clearFlags(1024);
            setEnterSharedElementCallback(new im10());
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("__source_from_shortcut", false)) {
            UiTracker.e.b(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_STORY));
        }
        super.onCreate(bundle);
        mzp0 mzp0Var = this.B;
        if (mzp0Var != null) {
            mzp0Var.start();
        }
        e0m0 b2 = pt20.b();
        StoryCameraParams storyCameraParams5 = this.z;
        if (storyCameraParams5 == null) {
            storyCameraParams5 = null;
        }
        cm9 a3 = b2.a(this, storyCameraParams5, this, null);
        a3.setOnFirstFrameCallback(new p1d0(this, 16));
        this.y = a3;
        ViewGroup viewGroup = (ViewGroup) a3;
        qj80.a(viewGroup, new b(viewGroup, viewGroup, this));
        StoryCameraParams storyCameraParams6 = this.z;
        if (storyCameraParams6 == null) {
            storyCameraParams6 = null;
        }
        if (storyCameraParams6.p0) {
            frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(0);
            frameLayout.addView(viewGroup);
            setContentView(frameLayout);
        } else {
            setContentView(viewGroup);
            frameLayout = null;
        }
        if (mzp0Var != null) {
            mzp0Var.e(viewGroup);
        }
        this.D.d3(viewGroup);
        this.A = viewGroup;
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        StoryCameraParams storyCameraParams7 = this.z;
        String str3 = (storyCameraParams7 == null ? null : storyCameraParams7).c;
        if (storyCameraParams7 == null) {
            storyCameraParams7 = null;
        }
        d0m0Var.v1(str3, storyCameraParams7.b);
        d0m0 d0m0Var2 = this.y;
        if (d0m0Var2 == null) {
            d0m0Var2 = null;
        }
        d0m0Var2.h3(bundle);
        StoryCameraParams storyCameraParams8 = this.z;
        if (storyCameraParams8 == null) {
            storyCameraParams8 = null;
        }
        if (storyCameraParams8.p0) {
            d0m0 d0m0Var3 = this.y;
            View childAt = ((ViewGroup) (d0m0Var3 != null ? d0m0Var3 : null)).getChildAt(0);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            childAt.setTransitionName("gridItem");
            a.C0123a c0123a = new a.C0123a();
            c0123a.c(cn70.b(12));
            wog0 wog0Var = new wog0();
            c0123a.a = wog0Var;
            float b3 = a.C0123a.b(wog0Var);
            if (b3 != -1.0f) {
                c0123a.n(b3);
            }
            c0123a.b = wog0Var;
            float b4 = a.C0123a.b(wog0Var);
            if (b4 != -1.0f) {
                c0123a.q(b4);
            }
            c0123a.j(wog0Var);
            c0123a.f(wog0Var);
            com.google.android.material.shape.a a4 = c0123a.a();
            Window window = getWindow();
            Transition T1 = T1(a4);
            T1.addListener(new f());
            window.setSharedElementEnterTransition(T1);
            Window window2 = getWindow();
            Transition T12 = T1(a4);
            T12.addListener(new e());
            T12.addListener(new d(frameLayout));
            window2.setSharedElementReturnTransition(T12);
        }
        mhy.f(getWindow());
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onDestroy();
        super.onDestroy();
        nf9 nf9Var = nf9.b;
        nf9.e().c(false);
        mzp0 mzp0Var = this.B;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        if (getIntent() == null || getIntent().getFlags() == 0 || (getIntent().getFlags() & 33554432) != 0) {
            return;
        }
        ((ysg0) this.F.getValue()).a(asl0.b.a);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onPause();
        super.onPause();
        mzp0 mzp0Var = this.B;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        this.D.deactivate();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.T8(i, strArr, iArr);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        StoryCameraParams storyCameraParams = this.z;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (!storyCameraParams.p0) {
            V1();
        }
        d0m0 d0m0Var = this.y;
        (d0m0Var != null ? d0m0Var : null).onResume();
        dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        mzp0 mzp0Var = this.B;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
        this.D.c();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        StoryCameraParams curCameraParams = d0m0Var.getCurCameraParams();
        if (curCameraParams != null) {
            bundle.putParcelable("camera_params", curCameraParams);
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        StoryCameraParams storyCameraParams = this.z;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (storyCameraParams.p0) {
            return;
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.SKIP_CAMERA_ON_REPOST;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            StoryCameraParams storyCameraParams2 = this.z;
            if (storyCameraParams2 == null) {
                storyCameraParams2 = null;
            }
            if (storyCameraParams2.Vb()) {
                return;
            }
        }
        StoryCameraParams storyCameraParams3 = this.z;
        if ((storyCameraParams3 == null ? null : storyCameraParams3).s0 != null) {
            return;
        }
        if ((storyCameraParams3 == null ? null : storyCameraParams3).j0) {
            if (storyCameraParams3 == null) {
                storyCameraParams3 = null;
            }
            List<StoryCameraGalleryData> list = storyCameraParams3.C;
            if (list != null && !list.isEmpty()) {
                return;
            }
        }
        d0m0 d0m0Var = this.y;
        (d0m0Var != null ? d0m0Var : null).onStart();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onStop();
        this.D.stop();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        StoryCameraParams storyCameraParams = this.z;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (!storyCameraParams.p0) {
            V1();
        }
        if (z) {
            mhy.f(getWindow());
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.pc(i, list);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.wi(i, list);
    }

    /* compiled from: Transition.kt */
    public static final class d implements Transition.TransitionListener {
        public final /* synthetic */ FrameLayout a;

        public d(FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.post(new c(frameLayout));
            }
            View view = StoryGalleryActivity.F.get();
            if (view != null) {
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    public static final class e implements Transition.TransitionListener {
        public e() {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            StoryCameraActivity.this.getWindow().addFlags(56);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    public static final class f implements Transition.TransitionListener {
        public f() {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            p90.b(StoryCameraActivity.this, -16777216, false);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
