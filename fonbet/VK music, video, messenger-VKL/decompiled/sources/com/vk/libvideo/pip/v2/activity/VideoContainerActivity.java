package com.vk.libvideo.pip.v2.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ajd0;
import xsna.bmp0;
import xsna.dhr0;
import xsna.epx;
import xsna.fuj0;
import xsna.gjs0;
import xsna.hg1;
import xsna.izs;
import xsna.kds0;
import xsna.msy;
import xsna.o0q0;
import xsna.s3q0;
import xsna.sxq0;
import xsna.tk5;
import xsna.v4r0;
import xsna.vb0;
import xsna.vpn0;
import xsna.x52;
import xsna.y1r;

/* compiled from: VideoContainerActivity.kt */
/* loaded from: classes.dex */
public class VideoContainerActivity extends NavigationDelegateActivity implements fuj0, vb0, o0q0, y1r {
    public static final /* synthetic */ int B = 0;
    public final Object A;
    public VideoContainerFragmentEntry w;
    public final Object x;
    public final b y;
    public final Object z;

    /* compiled from: VideoContainerActivity.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VideoPipModeAction, s3q0> {
        public a(VideoContainerActivity videoContainerActivity) {
            super(1, videoContainerActivity, VideoContainerActivity.class, "handlePipBusAction", "handlePipBusAction(Lcom/vk/libvideo/api/pip2/VideoPipModeAction;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(VideoPipModeAction videoPipModeAction) {
            ((VideoContainerActivity) this.receiver).Z1(videoPipModeAction);
            return s3q0.a;
        }
    }

    public VideoContainerActivity() {
        sxq0 sxq0Var = new sxq0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = msy.a(lazyThreadSafetyMode, sxq0Var);
        this.y = new b();
        this.z = msy.a(lazyThreadSafetyMode, new ajd0(this, 20));
        this.A = msy.a(lazyThreadSafetyMode, new vpn0(this, 12));
    }

    @Override // xsna.y1r
    public final boolean Sc() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public void X1(Intent intent) {
        Bundle bundleExtra;
        Serializable serializableExtra = intent.getSerializableExtra("fragment_entry_type");
        VideoContainerFragmentEntry.Type type = serializableExtra instanceof VideoContainerFragmentEntry.Type ? (VideoContainerFragmentEntry.Type) serializableExtra : null;
        if (type == null || (bundleExtra = intent.getBundleExtra("fragment_args")) == null) {
            return;
        }
        VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
        if ((videoContainerFragmentEntry != null ? videoContainerFragmentEntry.getType() : null) == type) {
            VideoContainerFragmentEntry videoContainerFragmentEntry2 = this.w;
            if ((videoContainerFragmentEntry2 != null ? videoContainerFragmentEntry2.h() : null) == VideoContainerFragmentEntry.LaunchMode.SingleInstance) {
                b2(new kds0.c(bundleExtra));
                return;
            }
        }
        VideoContainerFragmentEntry b = ((com.vk.libvideo.api.pip2.a) this.z.getValue()).b(type, bundleExtra, (gjs0) this.A.getValue());
        if (b != null) {
            b2(kds0.b.a);
            this.w = b;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a b2 = tk5.b(supportFragmentManager, supportFragmentManager);
            b2.g(R.id.fragment_wrapper, b.g(), "VideoContainerActivityFragment");
            b2.h(new x52(this, 14), false);
            b2.k(false);
        }
    }

    public void Y1() {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.e()) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void Z1(VideoPipModeAction videoPipModeAction) {
        if (!(videoPipModeAction instanceof VideoPipModeAction.Minimize) && !(videoPipModeAction instanceof VideoPipModeAction.a)) {
            throw new NoWhenBranchMatchedException();
        }
        finish();
    }

    public final void b2(kds0 kds0Var) {
        try {
            VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
            if (videoContainerFragmentEntry != null) {
                videoContainerFragmentEntry.i(kds0Var);
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            finishAndRemoveTask();
        }
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
        if (videoContainerFragmentEntry != null) {
            return videoContainerFragmentEntry.g();
        }
        return null;
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
        if (videoContainerFragmentEntry == null || !videoContainerFragmentEntry.a0()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(dhr0.C().c);
        getWindow().getDecorView().setBackground(null);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.onCreate(bundle);
        bmp0.a(null);
        overridePendingTransition(0, 0);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.fragment_wrapper);
        setContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        if (bundle == null) {
            X1(getIntent());
        }
        hg1.e(this.y, ((VideoPip2Component) this.x.getValue()).Lb().subscribe(new v4r0(new a(this), 1)));
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        b2(kds0.b.a);
        this.y.e();
        super.onDestroy();
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        X1(intent);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vk.core.activity.BaseActivity, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        Object obj;
        Bundle bundle2;
        VideoContainerFragmentEntry a2;
        super.onRestoreInstanceState(bundle);
        Iterator<T> it = getSupportFragmentManager().c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Fragment) obj).getTag(), "VideoContainerActivityFragment")) {
                    break;
                }
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment == null || (bundle2 = bundle.getBundle("fragment_args")) == null || (a2 = ((com.vk.libvideo.api.pip2.a) this.z.getValue()).a(fragment, bundle2, (gjs0) this.A.getValue())) == null) {
            return;
        }
        this.w = a2;
        b2(kds0.d.a);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Y1();
        super.onResume();
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Fragment g;
        VideoContainerFragmentEntry videoContainerFragmentEntry = this.w;
        bundle.putBundle("fragment_args", (videoContainerFragmentEntry == null || (g = videoContainerFragmentEntry.g()) == null) ? null : g.getArguments());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity
    public void R1() {
    }
}
