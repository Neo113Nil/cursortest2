package com.vk.libvideo.screen;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.design.view.swipe.layout.SwipeLayout;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.a;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a72;
import xsna.cvk;
import xsna.dei0;
import xsna.fuj0;
import xsna.gdr0;
import xsna.hbj0;
import xsna.hfs0;
import xsna.jet0;
import xsna.k6s0;
import xsna.kyr0;
import xsna.l6s0;
import xsna.lbc0;
import xsna.ljt0;
import xsna.m0q0;
import xsna.msy;
import xsna.myd0;
import xsna.oek0;
import xsna.oqx0;
import xsna.pwh0;
import xsna.qkd0;
import xsna.srq0;
import xsna.tsk0;
import xsna.u9t0;
import xsna.v3t0;
import xsna.v5n0;
import xsna.vit0;
import xsna.wzb0;
import xsna.xnt0;
import xsna.zet0;

/* compiled from: VideoActivity.kt */
/* loaded from: classes3.dex */
public class VideoActivity extends NavigationDelegateActivity implements fuj0, a.b, m0q0, kyr0, l6s0 {
    public static final /* synthetic */ int I = 0;
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public a w;
    public a.C1246a x;
    public final Object y;
    public final Object z;

    public VideoActivity() {
        srq0 srq0Var = new srq0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, srq0Var);
        this.z = msy.a(lazyThreadSafetyMode, new lbc0(this, 27));
        this.A = msy.a(lazyThreadSafetyMode, new myd0(this, 19));
        this.B = msy.a(lazyThreadSafetyMode, new qkd0(this, 20));
        this.C = msy.a(lazyThreadSafetyMode, new hbj0(this, 18));
        this.D = msy.a(lazyThreadSafetyMode, new pwh0(this, 20));
        this.E = msy.a(lazyThreadSafetyMode, new v5n0(this, 11));
        this.F = msy.a(lazyThreadSafetyMode, new tsk0(this, 19));
        this.G = msy.a(lazyThreadSafetyMode, new wzb0(this, 28));
        this.H = msy.a(lazyThreadSafetyMode, new dei0(this, 22));
    }

    @Override // com.vk.libvideo.screen.a.b
    public final a.C1246a Bg() {
        a.C1246a c1246a = this.x;
        if (c1246a == null) {
            return null;
        }
        return c1246a;
    }

    @Override // com.vk.libvideo.screen.a.b
    public final void I3() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        super.O1(configuration);
        a aVar = this.w;
        if (aVar == null) {
            aVar = null;
        }
        VideoView videoView = aVar.w;
        if (videoView != null) {
            videoView.V(configuration);
        }
        VideoView videoView2 = aVar.w;
        if (videoView2 != null) {
            videoView2.postDelayed(new a72(aVar, 26), 100L);
        }
    }

    @Override // xsna.l6s0
    public final k6s0 Y4() {
        a aVar = this.w;
        if (aVar == null) {
            aVar = null;
        }
        xnt0 xnt0Var = aVar.C;
        if (xnt0Var != null) {
            return xnt0Var;
        }
        return null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        theme.applyStyle(R.style.VideoPlayerTranslucentStyle, true);
        return theme;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        VideoFile videoFile;
        super.onCreate(bundle);
        VideoFile videoFile2 = (VideoFile) getIntent().getParcelableExtra(X3.i.b);
        if (videoFile2 == null) {
            cvk.u(R.string.video_err_network, false);
            videoFile = null;
        } else {
            videoFile = videoFile2;
        }
        if (videoFile == null) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.x = new a.C1246a(videoFile, (AdsDataProvider) intent.getParcelableExtra(b.JSON_KEY_ADS), intent.getStringExtra("referrer"), intent.getStringExtra("track_code"), (DeprecatedStatisticInterface) intent.getParcelableExtra("statistic"), intent.getStringExtra("context"), intent.getBooleanExtra("withoutMenu", false), intent.getBooleanExtra("withoutBottom", false), intent.getBooleanExtra("withoutPreview", false), intent.getLongExtra("videoStartPosition", -1L), (SearchStatsLoggingInfo) intent.getParcelableExtra("search_stats_logging_info"), intent.getIntExtra("reply", -1), 1664);
        intent.removeExtra("videoStartPosition");
        a aVar = this.w;
        if (aVar != null) {
            if (aVar == null) {
                aVar = null;
            }
            a.e(aVar);
        }
        NotificationsPermission notificationsPermission = (NotificationsPermission) this.y.getValue();
        jet0 jet0Var = new jet0((vit0) this.z.getValue(), (v3t0) this.A.getValue(), (com.vk.video.kidsprofile.restricteduseractions.a) this.B.getValue(), (u9t0) this.C.getValue());
        ?? r0 = this.D;
        a aVar2 = new a(this, this, notificationsPermission, jet0Var, ((VideoShareComponent) r0.getValue()).p0(), (zet0) this.G.getValue(), (ljt0) this.E.getValue(), (hfs0) this.H.getValue(), ((VideoShareComponent) r0.getValue()).S(), null);
        this.w = aVar2;
        View inflate = ((gdr0) getSystemService("layout_inflater")).inflate(R.layout.video_fullscreen, (ViewGroup) null, false);
        aVar2.B = (SwipeLayout) inflate.findViewById(R.id.swipe_layout);
        a aVar3 = this.w;
        (aVar3 != null ? aVar3 : null).f(inflate);
        inflate.setId(R.id.fragment_wrapper);
        inflate.setFitsSystemWindows(false);
        Window window = getWindow();
        oek0 oek0Var = new oek0(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).e(true);
        setContentView(inflate);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.w;
        if (aVar != null) {
            if (aVar == null) {
                aVar = null;
            }
            a.e(aVar);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        a aVar = this.w;
        if (aVar == null) {
            aVar = null;
        }
        aVar.onPause();
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        a aVar = this.w;
        if (aVar == null) {
            aVar = null;
        }
        aVar.onResume();
    }

    @Override // com.vk.libvideo.screen.a.b
    public final boolean t7() {
        return this.l;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        a.C1246a c1246a = this.x;
        if (c1246a == null) {
            c1246a = null;
        }
        Long valueOf = Long.valueOf(c1246a.a.o0());
        a.C1246a c1246a2 = this.x;
        if (c1246a2 == null) {
            c1246a2 = null;
        }
        Long valueOf2 = Long.valueOf(c1246a2.a.I0().b);
        a.C1246a c1246a3 = this.x;
        String str = (c1246a3 == null ? null : c1246a3).d;
        if (str == null) {
            str = (c1246a3 != null ? c1246a3 : null).a.r();
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(type, valueOf, valueOf2, null, str, null, 32, null);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity
    public final void R1() {
    }
}
