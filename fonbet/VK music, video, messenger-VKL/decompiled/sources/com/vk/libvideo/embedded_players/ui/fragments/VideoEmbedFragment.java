package com.vk.libvideo.embedded_players.ui.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.B5;
import com.ironsource.O6;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ui.c;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.share.api.b;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.a0a;
import xsna.b0u0;
import xsna.b25;
import xsna.bpn0;
import xsna.brm0;
import xsna.byt;
import xsna.d3m;
import xsna.d8s0;
import xsna.dbs0;
import xsna.dhr0;
import xsna.dss0;
import xsna.dz20;
import xsna.e43;
import xsna.ebs0;
import xsna.emb;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.g7s0;
import xsna.gkc0;
import xsna.gns0;
import xsna.gz80;
import xsna.hfs0;
import xsna.hl10;
import xsna.i5s;
import xsna.ies;
import xsna.irc0;
import xsna.iut0;
import xsna.j5g;
import xsna.jes;
import xsna.k5j0;
import xsna.k6s0;
import xsna.kbj0;
import xsna.kes;
import xsna.kgt0;
import xsna.ksg0;
import xsna.kst0;
import xsna.ku70;
import xsna.kz20;
import xsna.l6s0;
import xsna.l7s;
import xsna.lpj;
import xsna.lyd;
import xsna.m5o0;
import xsna.mcj0;
import xsna.msy;
import xsna.n6j;
import xsna.nr2;
import xsna.nr4;
import xsna.o25;
import xsna.o5y0;
import xsna.onm0;
import xsna.pk;
import xsna.qah0;
import xsna.qbc0;
import xsna.qws0;
import xsna.r0t0;
import xsna.r5y0;
import xsna.ro;
import xsna.rsg0;
import xsna.s3q0;
import xsna.ss9;
import xsna.t6t0;
import xsna.tbe0;
import xsna.u080;
import xsna.u0t0;
import xsna.u9t0;
import xsna.uds;
import xsna.uis0;
import xsna.uv80;
import xsna.vds;
import xsna.vis0;
import xsna.vit0;
import xsna.w1s0;
import xsna.wis0;
import xsna.wou;
import xsna.wz5;
import xsna.xa2;
import xsna.xds;
import xsna.xnt0;
import xsna.xy80;
import xsna.ydt0;
import xsna.yks0;
import xsna.yzr0;

/* compiled from: VideoEmbedFragment.kt */
/* loaded from: classes14.dex */
public final class VideoEmbedFragment extends BaseFragment implements kes, vds, xds, ies, jes, uds, ebs0, dz20, l6s0 {
    public static final /* synthetic */ int q0 = 0;
    public WebView S;
    public VkSpinnerContent T;
    public VideoBottomPanelView U;
    public VideoToolbarView V;
    public ConstraintLayout W;
    public FrameLayout X;
    public yks0 Y;
    public kz20 Z;
    public xy80 a0;
    public RatioFrameLayout b0;
    public VideoFile c0;
    public String d0;
    public o5y0 e0;
    public boolean f0;
    public int g0;
    public xnt0 h0;
    public boolean i0 = true;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final bpn0 p0;

    public VideoEmbedFragment() {
        gkc0 gkc0Var = new gkc0(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, gkc0Var);
        this.k0 = msy.a(lazyThreadSafetyMode, new tbe0(this, 23));
        this.l0 = msy.a(lazyThreadSafetyMode, new irc0(this, 27));
        this.m0 = msy.a(lazyThreadSafetyMode, new m5o0(this, 8));
        this.n0 = msy.a(lazyThreadSafetyMode, new qah0(this, 15));
        this.o0 = msy.a(lazyThreadSafetyMode, new qbc0(this, 27));
        this.p0 = new bpn0(new ku70(14));
    }

    @Override // xsna.dz20
    public final void Ff(String str) {
        io(true);
    }

    @Override // xsna.vds
    public final int Q0() {
        return -1;
    }

    @Override // xsna.dz20
    public final void Qc(String str) {
        io(false);
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return true;
    }

    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return this.h0;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        VideoFile videoFile;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        VideoFile videoFile2;
        String r;
        kz20 kz20Var;
        kz20 kz20Var2;
        if (dbs0Var.equals(dss0.a)) {
            yks0 yks0Var = this.Y;
            if (yks0Var != null) {
                yks0.g(yks0Var, kn(), null, 6);
                return;
            }
            return;
        }
        if (dbs0Var.equals(kgt0.a)) {
            VideoFile videoFile3 = this.c0;
            if (videoFile3 != null) {
                Context requireContext = requireContext();
                w1s0 w1s0Var = w1s0.b;
                kbj0.u(nr4.b(), requireContext, videoFile3, true, false, null, null, 24);
                return;
            }
            return;
        }
        if (dbs0Var.equals(r0t0.a)) {
            io(true);
            yks0 yks0Var2 = this.Y;
            if (yks0Var2 == null || (kz20Var2 = this.Z) == null) {
                return;
            }
            kz20Var2.g(kn(), yks0Var2, this, null, null);
            return;
        }
        if (dbs0Var.equals(yzr0.a)) {
            b25 a2 = o25.a();
            kn();
            a2.getClass();
            VideoFile videoFile4 = this.c0;
            if (videoFile4 == null) {
                return;
            }
            int i = 12;
            if (!videoFile4.j0() && !o25.a().a(videoFile4.I0())) {
                FragmentActivity kn = kn();
                yks0 yks0Var3 = this.Y;
                w1s0.b(kn, videoFile4, yks0Var3 != null ? yks0Var3.a : null, yks0Var3 != null ? yks0Var3.b : null, new xa2(this, i));
                return;
            } else {
                kz20 kz20Var3 = this.Z;
                if (kz20Var3 != null) {
                    FragmentActivity kn2 = kn();
                    kz20.a aVar = kz20.m;
                    kz20Var3.i(kn2, new pk(i, kz20Var3, kn2));
                    return;
                }
                return;
            }
        }
        boolean z = dbs0Var instanceof qws0;
        ?? r4 = this.n0;
        ?? r5 = this.o0;
        if (z) {
            kz20 kz20Var4 = this.Z;
            if (kz20Var4 != null) {
                FragmentActivity kn3 = kn();
                yks0 yks0Var4 = this.Y;
                String str = yks0Var4 != null ? yks0Var4.a : null;
                VideoScreenMode videoScreenMode = VideoScreenMode.DISCOVERY;
                ((com.vk.video.kidsprofile.restricteduseractions.a) this.l0.getValue()).getClass();
                hfs0 hfs0Var = (hfs0) r4.getValue();
                b S = ((VideoShareComponent) r5.getValue()).S();
                kz20.a aVar2 = kz20.m;
                kz20Var4.f(kn3, str, null, null, false, false, true, o25.a().c(), null, false, MobileOfficialAppsCoreNavStat$EventScreen.OTHER, videoScreenMode, hfs0Var, S, null);
                return;
            }
            return;
        }
        if (dbs0Var.equals(d8s0.a)) {
            finish();
            return;
        }
        if (dbs0Var.equals(u0t0.a)) {
            yks0 yks0Var5 = this.Y;
            if (yks0Var5 == null || (kz20Var = this.Z) == null) {
                return;
            }
            FragmentActivity kn4 = kn();
            VideoFile videoFile5 = yks0Var5.e;
            yks0 yks0Var6 = this.Y;
            kz20.c(kz20Var, kn4, videoFile5, yks0Var6 != null ? yks0Var6.b : null, (NotificationsPermission) this.j0.getValue(), (vit0) this.k0.getValue(), (u9t0) this.m0.getValue(), new uv80(13), (hfs0) r4.getValue(), ((VideoShareComponent) r5.getValue()).p0(), ((VideoShareComponent) r5.getValue()).S(), null, new wou(this.e0), null, null, 13312);
            return;
        }
        if (dbs0Var.equals(t6t0.a)) {
            VideoFile videoFile6 = this.c0;
            if (videoFile6 != null) {
                yks0 yks0Var7 = this.Y;
                if (yks0Var7 == null || (videoFile2 = yks0Var7.e) == null || (r = videoFile2.r()) == null) {
                    searchStatsLoggingInfo = null;
                } else {
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
                    UiTracker uiTracker = UiTracker.a;
                    searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, type, 0L, r, UiTracker.c(), null, false, false, 459, null);
                }
                ydt0 Y = fxc0.B().Y();
                Context requireContext2 = requireContext();
                yks0 yks0Var8 = this.Y;
                ydt0.f(Y, requireContext2, videoFile6, yks0Var8 != null ? yks0Var8.a : null, searchStatsLoggingInfo, null, 16);
                return;
            }
            return;
        }
        if (!dbs0Var.equals(kst0.a) || (videoFile = this.c0) == null) {
            return;
        }
        Context requireContext3 = requireContext();
        lpj lpjVar = requireContext3 instanceof lpj ? (lpj) requireContext3 : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        Context l7sVar = (valueOf != null && valueOf.intValue() == dhr0.u().c) ? requireContext3 : new l7s(requireContext3, dhr0.u().c);
        if (((Boolean) this.p0.getValue()).booleanValue()) {
            b25 a3 = o25.a();
            requireContext();
            a3.getClass();
        } else {
            b25 a4 = o25.a();
            requireContext();
            a4.getClass();
        }
        g7s0 B = fxc0.B();
        yks0 yks0Var9 = this.Y;
        String str2 = yks0Var9 != null ? yks0Var9.a : null;
        String str3 = this.d0;
        if (str3 == null) {
            str3 = videoFile.r();
        }
        g7s0.X(B, l7sVar, videoFile, str2, str3, null, null, 48);
        s3q0 s3q0Var = s3q0.a;
    }

    public final void io(boolean z) {
        if (z) {
            int i = this.g0 + 1;
            this.g0 = i;
            if (i > 0) {
                VideoToolbarView videoToolbarView = this.V;
                if (videoToolbarView != null) {
                    f4m.j(videoToolbarView);
                }
                xy80 xy80Var = this.a0;
                if (xy80Var != null) {
                    xy80Var.f();
                    return;
                }
                return;
            }
            return;
        }
        int i2 = this.g0 - 1;
        this.g0 = i2;
        if (i2 == 0) {
            VideoToolbarView videoToolbarView2 = this.V;
            if (videoToolbarView2 != null) {
                videoToolbarView2.setVisibility(0);
            }
            xy80 xy80Var2 = this.a0;
            if (xy80Var2 != null) {
                xy80Var2.i();
            }
        }
    }

    public final void jo(boolean z) {
        this.f0 = z;
        if (z) {
            RatioFrameLayout ratioFrameLayout = this.b0;
            if (ratioFrameLayout != null) {
                ratioFrameLayout.setRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            VideoBottomPanelView videoBottomPanelView = this.U;
            if (videoBottomPanelView != null) {
                f4m.j(videoBottomPanelView);
            }
            VideoToolbarView videoToolbarView = this.V;
            if (videoToolbarView != null) {
                f4m.j(videoToolbarView);
                return;
            }
            return;
        }
        RatioFrameLayout ratioFrameLayout2 = this.b0;
        if (ratioFrameLayout2 != null) {
            ratioFrameLayout2.setRatio(0.5625f);
        }
        VideoBottomPanelView videoBottomPanelView2 = this.U;
        if (videoBottomPanelView2 != null) {
            videoBottomPanelView2.setVisibility(0);
        }
        VideoToolbarView videoToolbarView2 = this.V;
        if (videoToolbarView2 != null) {
            videoToolbarView2.setVisibility(0);
        }
    }

    public final void ko() {
        VideoUrlStorage w9;
        Collection collection;
        Image image;
        ImageSize Cb;
        List<String> b;
        String str;
        o5y0 o5y0Var;
        VideoUrlStorage w92;
        VideoFile videoFile = this.c0;
        String str2 = null;
        String Ab = (videoFile == null || (w92 = videoFile.w9()) == null) ? null : w92.Ab(VideoUrl.EXTERNAL_URL);
        if (Ab == null || !brm0.v(Ab, ".mp4", false)) {
            VideoFile videoFile2 = this.c0;
            Ab = (videoFile2 == null || (w9 = videoFile2.w9()) == null) ? null : w9.Ab(VideoUrl.EMBED_URL);
        }
        if (Ab == null) {
            return;
        }
        Uri parse = Uri.parse(Ab);
        List a2 = n6j.a(0, "\\.", parse.getAuthority());
        if (!a2.isEmpty()) {
            ListIterator listIterator = a2.listIterator(a2.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = j5g.H0(a2, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.b;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        String str3 = strArr[strArr.length - 2] + JwtParser.SEPARATOR_CHAR + strArr[strArr.length - 1];
        WebView webView = this.S;
        if (webView != null) {
            nr2.n(webView, new vis0(this, str3));
        }
        WebView webView2 = this.S;
        if (webView2 != null) {
            webView2.setWebChromeClient(new wis0(this));
        }
        VideoFile videoFile3 = this.c0;
        if (videoFile3 == null || !videoFile3.w8()) {
            if (!brm0.v(Ab, ".mp4", false)) {
                WebView webView3 = this.S;
                if (webView3 != null) {
                    webView3.loadUrl(parse.toString());
                    return;
                }
                return;
            }
            VideoFile videoFile4 = this.c0;
            if (videoFile4 != null && (image = videoFile4.getImage()) != null && (Cb = image.Cb(ImageScreenSize.VERY_BIG.h(), true, false)) != null) {
                str2 = Cb.d.d;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = i5s.a(new StringBuilder("https://"), a0a.d, "/images/blank.gif");
            }
            String a3 = ss9.a("<!DOCTYPE html><html><body leftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" style='margin: 0px 0px 0px 0px; padding: 0px 0px 0px 0px;'><div style='height:100vh; margin: 0px 0px 0px 0px; padding: 0px 0px 0px 0px;'><video width='100%' height='100%' controls preload='metadata' poster='", str2, "'><source src='", Ab, "' type=\"video/mp4\" /></video></div></body></html>");
            WebView webView4 = this.S;
            if (webView4 != null) {
                webView4.loadData(a3, "text/html", B5.O);
                return;
            }
            return;
        }
        byt bytVar = new byt(1);
        bytVar.b(1, "controls");
        bytVar.b(1, O6.W0);
        bytVar.b(1, "autoplay");
        JSONObject jSONObject = (JSONObject) bytVar.b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.ayp_youtube_player), emb.b), 8192);
        try {
            String b2 = a0a.b(bufferedReader);
            bufferedReader.close();
            String y = brm0.y(b2, "<<injectedPlayerVars>>", jSONObject.toString());
            hl10 b3 = new Regex("embed/(\\S+)\\?").b(Ab);
            if (b3 != null && (b = b3.b()) != null && (str = (String) j5g.i0(b)) != null && (o5y0Var = this.e0) != null) {
                o5y0Var.c.add(new uis0(this, str));
            }
            d3m.e(this.T, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            WebView webView5 = this.S;
            if (webView5 != null) {
                webView5.loadDataWithBaseURL(jSONObject.getString("origin"), y, "text/html", B5.O, null);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(bufferedReader, th);
                throw th2;
            }
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.woo0
    public final int o7() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5552) {
            io(false);
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jo(configuration.orientation == 2);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(0, R.style.VideoPlayerTranslucentStyleWithNavBar);
        this.d0 = requireArguments().getString("track_code");
        VideoFile videoFile = (VideoFile) requireArguments().getParcelable(X3.i.b);
        if (videoFile != null) {
            yks0 yks0Var = new yks0(videoFile, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_EMBED), null);
            yks0Var.b(new a(videoFile, this));
            this.Y = yks0Var;
            this.Z = new kz20(videoFile, this, this);
        } else {
            videoFile = null;
        }
        this.c0 = videoFile;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (gz80.a(28)) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String str = context.getApplicationInfo().processName;
            if (!TextUtils.equals(str, requireContext().getPackageName())) {
                try {
                    WebView.setDataDirectorySuffix(str);
                } catch (Throwable th) {
                    L.i(th);
                }
            }
        }
        View inflate = layoutInflater.inflate(R.layout.embed_video_player, viewGroup, false);
        this.W = (ConstraintLayout) inflate;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WebView webView = this.S;
        if (webView != null) {
            webView.destroy();
        }
        this.S = null;
        xy80 xy80Var = this.a0;
        if (xy80Var != null) {
            xy80Var.disable();
        }
        this.a0 = null;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.S;
        if (webView != null) {
            webView.onPause();
        }
        lyd.g().P();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.S;
        if (webView != null) {
            webView.onResume();
        }
        lyd.g().B();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final View view2;
        xnt0 xnt0Var;
        VideoUrlStorage w9;
        VideoToolbarView videoToolbarView;
        VideoBottomPanelView videoBottomPanelView;
        ConstraintLayout constraintLayout;
        super.onViewCreated(view, bundle);
        final boolean q = BuildInfo.q();
        if (!q && (constraintLayout = this.W) != null) {
            constraintLayout.setSystemUiVisibility(5380);
        }
        this.S = (WebView) view.findViewById(R.id.webview_video_display);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) view.findViewById(R.id.video_cointainer);
        ratioFrameLayout.setOrientation(0);
        this.b0 = ratioFrameLayout;
        this.X = (FrameLayout) view.findViewById(R.id.video_display);
        this.T = (VkSpinnerContent) view.findViewById(R.id.progress);
        VideoBottomPanelView videoBottomPanelView2 = (VideoBottomPanelView) view.findViewById(R.id.bottom_panel);
        this.U = videoBottomPanelView2;
        if (videoBottomPanelView2 != null) {
            videoBottomPanelView2.setButtonsOnClickListener(new wz5(this, 12));
        }
        VideoFile videoFile = this.c0;
        if (videoFile != null && (videoBottomPanelView = this.U) != null) {
            videoBottomPanelView.P4(videoFile, true);
        }
        VideoToolbarView videoToolbarView2 = (VideoToolbarView) view.findViewById(R.id.video_toolbar);
        this.V = videoToolbarView2;
        if (videoToolbarView2 != null) {
            videoToolbarView2.setVideoActionsCallback(this);
        }
        yks0 yks0Var = this.Y;
        if (yks0Var != null && (videoToolbarView = this.V) != null) {
            VideoFile videoFile2 = yks0Var.e;
            boolean f = epx.f(yks0Var.c, Boolean.TRUE);
            int i = VideoToolbarView.M;
            videoToolbarView.d(null, videoFile2, f, false, false);
        }
        WebView webView = this.S;
        if (webView != null) {
            webView.setPadding(0, 0, 0, 0);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.setBackgroundColor(0);
            webView.setVerticalScrollBarEnabled(false);
            o5y0 o5y0Var = new o5y0(webView);
            webView.addJavascriptInterface(new r5y0(o5y0Var), "YouTubePlayerBridge");
            this.e0 = o5y0Var;
        }
        final xy80 xy80Var = new xy80(getActivity());
        xy80Var.enable();
        xy80Var.a(new xy80.c() { // from class: xsna.tis0
            @Override // xsna.xy80.c
            public final void a(int i2) {
                int i3 = VideoEmbedFragment.q0;
                if (xy80.this.c()) {
                    return;
                }
                boolean z = i2 == 0 || i2 == 8;
                VideoEmbedFragment videoEmbedFragment = this;
                if (z != videoEmbedFragment.f0) {
                    o5y0 o5y0Var2 = videoEmbedFragment.e0;
                    if (o5y0Var2 != null) {
                        o5y0Var2.c(o5y0Var2.a, "toggleFullscreen", new Object[0]);
                    } else {
                        videoEmbedFragment.jo(z);
                    }
                }
            }
        });
        this.a0 = xy80Var;
        RatioFrameLayout ratioFrameLayout2 = this.b0;
        if (ratioFrameLayout2 != null) {
            view2 = view;
            xnt0Var = new xnt0(view2, Collections.singletonList(new c(ratioFrameLayout2)), new ArrayList(), null, 96);
        } else {
            view2 = view;
            xnt0Var = null;
        }
        this.h0 = xnt0Var;
        u080 u080Var = new u080() { // from class: xsna.sis0
            @Override // xsna.u080
            public final bqx0 b(View view3, bqx0 bqx0Var) {
                int i2 = VideoEmbedFragment.q0;
                h4x j = bqx0Var.a.j(130);
                awt0.x(view2, j.a, 0, j.c, q ? j.d : 0, 2);
                xnt0 xnt0Var2 = this.h0;
                if (xnt0Var2 != null) {
                    xnt0Var2.g(bqx0Var);
                }
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view2, u080Var);
        jo(kn().getResources().getConfiguration().orientation == 2);
        VideoFile videoFile3 = this.c0;
        if (!TextUtils.isEmpty((videoFile3 == null || (w9 = videoFile3.w9()) == null) ? null : w9.Ab(VideoUrl.EMBED_URL))) {
            ko();
            return;
        }
        VkSpinnerContent vkSpinnerContent = this.T;
        if (vkSpinnerContent != null) {
            vkSpinnerContent.setVisibility(0);
        }
        VideoFile videoFile4 = this.c0;
        if (videoFile4 != null) {
            this.P.b(rsg0.y0(new gns0(videoFile4.I0(), videoFile4.o0(), videoFile4.C1()), null, null, 3).subscribe(new k5j0(new mcj0(this, 21), 16), new onm0(new ksg0(this, 19), 6)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$EventItem schemeStat$EventItem;
        VideoFile videoFile = this.c0;
        if (videoFile != null) {
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
            Long valueOf = Long.valueOf(videoFile.o0());
            Long valueOf2 = Long.valueOf(videoFile.I0().b);
            String str = this.d0;
            if (str == null) {
                str = videoFile.r();
            }
            schemeStat$EventItem = new SchemeStat$EventItem(type, valueOf, valueOf2, null, str, null, 40, null);
        } else {
            schemeStat$EventItem = null;
        }
        uiTrackingScreen.f = schemeStat$EventItem;
    }

    /* compiled from: VideoEmbedFragment.kt */
    public static final class a implements yks0.a {
        public final /* synthetic */ VideoFile b;
        public final /* synthetic */ VideoEmbedFragment c;

        public a(VideoFile videoFile, VideoEmbedFragment videoEmbedFragment) {
            this.b = videoFile;
            this.c = videoEmbedFragment;
        }

        @Override // xsna.yks0.a
        public final void He(List list, VideoFile videoFile) {
            if (epx.f(this.b.r1(), videoFile.r1())) {
                int i = VideoEmbedFragment.q0;
                VideoEmbedFragment videoEmbedFragment = this.c;
                videoEmbedFragment.c0 = videoFile;
                yks0 yks0Var = videoEmbedFragment.Y;
                if (yks0Var != null) {
                    yks0Var.j(videoFile);
                }
                kz20 kz20Var = videoEmbedFragment.Z;
                if (kz20Var != null) {
                    kz20Var.g = videoFile;
                }
                VideoBottomPanelView videoBottomPanelView = videoEmbedFragment.U;
                if (videoBottomPanelView != null) {
                    videoBottomPanelView.P4(videoFile, true);
                }
            }
        }

        @Override // xsna.yks0.a
        public final void dismiss() {
            this.c.finish();
        }

        @Override // xsna.yks0.a
        public final void uf(boolean z) {
        }

        @Override // xsna.yks0.a
        public final void vk(boolean z) {
        }

        @Override // xsna.yks0.a
        public final void L9(VideoFile videoFile, boolean z) {
        }
    }
}
