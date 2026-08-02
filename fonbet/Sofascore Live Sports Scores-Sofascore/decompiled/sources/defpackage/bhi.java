package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.PlayerView;
import com.google.ads.interactivemedia.v3.impl.data.AdData;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.AdUnit;
import com.sofascore.model.firebase.BaseAdUnit;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bhi extends h6b {
    public final mqi A;
    public final xgi B;
    public final boolean d;
    public final String e;
    public final js2 f;
    public hr9 g;
    public Dialog h;
    public String i;
    public long j;
    public final su k;
    public boolean l;
    public ibd m;
    public final otk n;
    public boolean o;
    public long p;
    public final dd q;
    public uyf r;
    public vg6 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public g9i x;
    public boolean y;
    public final joa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhi(FragmentActivity fragmentActivity, String str, boolean z, hx5 hx5Var) {
        super(fragmentActivity, null, 0);
        fragmentActivity.getClass();
        str.getClass();
        final int i = 0;
        this.d = z;
        this.e = fc6.C();
        View root = getRoot();
        int i2 = R.id.buffering_progress;
        ProgressBar progressBar = (ProgressBar) nq8.B(R.id.buffering_progress, root);
        if (progressBar != null) {
            i2 = R.id.buffering_sofascore_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.buffering_sofascore_logo, root);
            if (imageView != null) {
                i2 = R.id.close_banner_ad;
                ImageView imageView2 = (ImageView) nq8.B(R.id.close_banner_ad, root);
                if (imageView2 != null) {
                    int i3 = R.id.first_team_logo;
                    TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.first_team_logo, root);
                    if (teamLogoView != null) {
                        i3 = R.id.info_pre_match_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.info_pre_match_container, root);
                        if (linearLayout != null) {
                            i3 = R.id.media_cta_button;
                            MaterialButton materialButton = (MaterialButton) nq8.B(R.id.media_cta_button, root);
                            if (materialButton != null) {
                                i3 = R.id.media_cta_container;
                                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.media_cta_container, root);
                                if (linearLayout2 != null) {
                                    i3 = R.id.mute_button;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.mute_button, root);
                                    if (imageView3 != null) {
                                        i3 = R.id.play_button;
                                        ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.play_button, root);
                                        if (shapeableImageView != null) {
                                            i3 = R.id.playerView;
                                            PlayerView playerView = (PlayerView) nq8.B(R.id.playerView, root);
                                            if (playerView != null) {
                                                i3 = R.id.second_team_logo;
                                                TeamLogoView teamLogoView2 = (TeamLogoView) nq8.B(R.id.second_team_logo, root);
                                                if (teamLogoView2 != null) {
                                                    i3 = R.id.stream_date_time;
                                                    TextView textView = (TextView) nq8.B(R.id.stream_date_time, root);
                                                    if (textView != null) {
                                                        i3 = R.id.stream_info;
                                                        if (((TextView) nq8.B(R.id.stream_info, root)) != null) {
                                                            i3 = R.id.video_initial_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.video_initial_container, root);
                                                            if (constraintLayout != null) {
                                                                this.f = new js2((ConstraintLayout) root, progressBar, imageView, imageView2, teamLogoView, linearLayout, materialButton, linearLayout2, imageView3, shapeableImageView, playerView, teamLogoView2, textView, constraintLayout);
                                                                this.k = new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null);
                                                                this.n = new otk(duf.a.getOrCreateKotlinClass(ebd.class), new zgi(fragmentActivity, 1), new zgi(fragmentActivity, i), new zgi(fragmentActivity, 2));
                                                                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.media3_fullscreen_player, (ViewGroup) null, false);
                                                                ImageView imageView4 = (ImageView) nq8.B(R.id.close_banner_ad, inflate);
                                                                if (imageView4 != null) {
                                                                    i2 = R.id.player;
                                                                    PlayerView playerView2 = (PlayerView) nq8.B(R.id.player, inflate);
                                                                    if (playerView2 != null) {
                                                                        this.q = new dd((ConstraintLayout) inflate, imageView4, playerView2, 20);
                                                                        this.v = true;
                                                                        ia0 ia0Var = ia0.q;
                                                                        this.w = mz1.C();
                                                                        this.z = n9e.M(new Function0(this) { // from class: vgi
                                                                            public final /* synthetic */ bhi b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                SharedPreferences d;
                                                                                int i4 = i;
                                                                                bhi bhiVar = this.b;
                                                                                switch (i4) {
                                                                                    case 0:
                                                                                        return Boolean.valueOf(bhiVar.w);
                                                                                    default:
                                                                                        Context context = bhiVar.getContext();
                                                                                        context.getClass();
                                                                                        SharedPreferences sharedPreferences = uic.j;
                                                                                        if (sharedPreferences == null) {
                                                                                            Context applicationContext = context.getApplicationContext();
                                                                                            synchronized (uic.i) {
                                                                                                d = a5f.d(applicationContext);
                                                                                                uic.j = d;
                                                                                            }
                                                                                            d.getClass();
                                                                                            sharedPreferences = d;
                                                                                        }
                                                                                        wd5 wd5Var = xd5.b;
                                                                                        return Long.valueOf(sharedPreferences.getLong("ads_on_stream_interval", xd5.k(wkn.R(10, be5.MINUTES), be5.SECONDS)));
                                                                                }
                                                                            }
                                                                        }, new deh(14, this, str));
                                                                        final int i4 = 1;
                                                                        this.A = ypa.b(new Function0(this) { // from class: vgi
                                                                            public final /* synthetic */ bhi b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                SharedPreferences d;
                                                                                int i42 = i4;
                                                                                bhi bhiVar = this.b;
                                                                                switch (i42) {
                                                                                    case 0:
                                                                                        return Boolean.valueOf(bhiVar.w);
                                                                                    default:
                                                                                        Context context = bhiVar.getContext();
                                                                                        context.getClass();
                                                                                        SharedPreferences sharedPreferences = uic.j;
                                                                                        if (sharedPreferences == null) {
                                                                                            Context applicationContext = context.getApplicationContext();
                                                                                            synchronized (uic.i) {
                                                                                                d = a5f.d(applicationContext);
                                                                                                uic.j = d;
                                                                                            }
                                                                                            d.getClass();
                                                                                            sharedPreferences = d;
                                                                                        }
                                                                                        wd5 wd5Var = xd5.b;
                                                                                        return Long.valueOf(sharedPreferences.getLong("ads_on_stream_interval", xd5.k(wkn.R(10, be5.MINUTES), be5.SECONDS)));
                                                                                }
                                                                            }
                                                                        });
                                                                        playerView.setOutlineProvider(new qt2(i4, playerView));
                                                                        playerView.setClipToOutline(true);
                                                                        teamLogoView.setEnabled(false);
                                                                        teamLogoView2.setEnabled(false);
                                                                        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                                                                        if (layoutParams == null) {
                                                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                            throw null;
                                                                        }
                                                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                                        AdSize adSize = AdSize.BANNER;
                                                                        int widthInPixels = adSize.getWidthInPixels(getContext());
                                                                        Context context = getContext();
                                                                        context.getClass();
                                                                        marginLayoutParams.setMarginStart(widthInPixels - ao2.s(24, context));
                                                                        int heightInPixels = adSize.getHeightInPixels(getContext());
                                                                        Context context2 = getContext();
                                                                        context2.getClass();
                                                                        marginLayoutParams.bottomMargin = ao2.s(8, context2) + heightInPixels;
                                                                        imageView2.setLayoutParams(marginLayoutParams);
                                                                        ViewGroup.LayoutParams layoutParams2 = imageView4.getLayoutParams();
                                                                        if (layoutParams2 == null) {
                                                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                            throw null;
                                                                        }
                                                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                                                        int widthInPixels2 = adSize.getWidthInPixels(getContext());
                                                                        Context context3 = getContext();
                                                                        context3.getClass();
                                                                        marginLayoutParams2.setMarginStart(widthInPixels2 - ao2.s(24, context3));
                                                                        int heightInPixels2 = adSize.getHeightInPixels(getContext());
                                                                        Context context4 = getContext();
                                                                        context4.getClass();
                                                                        marginLayoutParams2.bottomMargin = ao2.s(8, context4) + heightInPixels2;
                                                                        imageView4.setLayoutParams(marginLayoutParams2);
                                                                        imageView2.setOnClickListener(new wgi(this, i));
                                                                        imageView4.setOnClickListener(new wgi(this, 1));
                                                                        this.B = new xgi(this, hx5Var);
                                                                        return;
                                                                    }
                                                                }
                                                                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final String getAdUnitId() {
        String str = this.i;
        if (str != null) {
            il9 il9Var = new il9(0);
            il9Var.h(null, str);
            List list = il9Var.c().g;
            if (list != null) {
                a i = llf.i(2, llf.j(0, list.size()));
                int i2 = i.a;
                int i3 = i.b;
                int i4 = i.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (!"iu".equals(list.get(i2))) {
                        if (i2 != i3) {
                            i2 += i4;
                        }
                    }
                    return (String) list.get(i2 + 1);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getBannerAdsTimeInterval() {
        return ((Number) this.A.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdBannerView getSmallAd() {
        return (AdBannerView) this.z.getValue();
    }

    private final ebd getViewModel() {
        return (ebd) this.n.getValue();
    }

    public static final void l(bhi bhiVar) {
        AdBannerView smallAd = bhiVar.getSmallAd();
        if (smallAd != null) {
            smallAd.b();
        }
        ((ImageView) bhiVar.f.c).setVisibility(4);
        ((ImageView) bhiVar.q.c).setVisibility(4);
        bhiVar.t = true;
        bhiVar.w();
    }

    public static final void n(bhi bhiVar) {
        AdBannerView smallAd = bhiVar.getSmallAd();
        if (smallAd != null) {
            smallAd.b();
        }
        ((ImageView) bhiVar.q.c).setVisibility(4);
        ((ImageView) bhiVar.f.c).setVisibility(4);
        bhiVar.t = true;
        bhiVar.w();
    }

    public static final void q(bhi bhiVar, hoo hooVar) {
        String adId;
        String adUnitId;
        int ordinal = hooVar.a.ordinal();
        if (ordinal == 0) {
            bhiVar.u = true;
            bhiVar.w();
            return;
        }
        if (ordinal == 16) {
            String adUnitId2 = bhiVar.getAdUnitId();
            if (adUnitId2 != null) {
                hf hfVar = hooVar.b;
                Long k0 = (hfVar == null || (adId = ((AdData) ((gmo) hfVar).b).adId()) == null) ? null : StringsKt.k0(adId);
                Context context = bhiVar.getContext();
                context.getClass();
                nv.l(context, bhiVar.e, AdType.Preroll.EventLiveStream, ru.GOOGLE, adUnitId2, null, k0, 128);
                return;
            }
            return;
        }
        if (ordinal == 21) {
            String adUnitId3 = bhiVar.getAdUnitId();
            if (adUnitId3 != null) {
                Context context2 = bhiVar.getContext();
                context2.getClass();
                nv.e(context2, bhiVar.e, AdType.Preroll.EventLiveStream, ru.GOOGLE, adUnitId3, null, null, null, 224);
                return;
            }
            return;
        }
        if (ordinal == 2) {
            String adUnitId4 = bhiVar.getAdUnitId();
            if (adUnitId4 != null) {
                Context context3 = bhiVar.getContext();
                context3.getClass();
                nv.i(context3, bhiVar.e, AdType.Preroll.EventLiveStream, ru.GOOGLE, adUnitId4, null, null, 96);
                return;
            }
            return;
        }
        if (ordinal == 3 && (adUnitId = bhiVar.getAdUnitId()) != null) {
            Context context4 = bhiVar.getContext();
            context4.getClass();
            String str = bhiVar.e;
            AdType.Preroll preroll = AdType.Preroll.EventLiveStream;
            ru ruVar = ru.GOOGLE;
            nv.b(context4, str, preroll, adUnitId);
        }
    }

    public static final void t(bhi bhiVar, PlayerView playerView, boolean z) {
        FrameLayout overlayFrameLayout;
        FrameLayout overlayFrameLayout2;
        if (z) {
            js2 js2Var = bhiVar.f;
            dd ddVar = bhiVar.q;
            if (bhiVar.s != null) {
                AdBannerView smallAd = bhiVar.getSmallAd();
                ViewParent parent = smallAd != null ? smallAd.getParent() : null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(bhiVar.getSmallAd());
                }
                PlayerView playerView2 = (PlayerView) ddVar.d;
                playerView2.setFullscreenButtonState(true);
                Dialog dialog = bhiVar.h;
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window != null) {
                        bka bkaVar = new bka(window.getDecorView());
                        int i = Build.VERSION.SDK_INT;
                        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
                        aalVar.D();
                        aalVar.x(519);
                    }
                    AdBannerView smallAd2 = bhiVar.getSmallAd();
                    if (smallAd2 != null) {
                        smallAd2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    }
                    AdBannerView smallAd3 = bhiVar.getSmallAd();
                    if (smallAd3 != null && (overlayFrameLayout2 = playerView2.getOverlayFrameLayout()) != null) {
                        overlayFrameLayout2.addView(smallAd3);
                    }
                    vg6 vg6Var = bhiVar.s;
                    vg6Var.getClass();
                    PlayerView playerView3 = (PlayerView) js2Var.l;
                    if (playerView3 != playerView2) {
                        playerView2.setPlayer(vg6Var);
                        playerView3.setPlayer(null);
                    }
                    dialog.show();
                } else {
                    Dialog dialog2 = new Dialog(bhiVar.getContext(), R.style.RedesignFullScreenDialog);
                    Window window2 = dialog2.getWindow();
                    if (window2 != null) {
                        bka bkaVar2 = new bka(window2.getDecorView());
                        int i2 = Build.VERSION.SDK_INT;
                        pea aalVar2 = i2 >= 35 ? new aal(window2, bkaVar2) : i2 >= 30 ? new z9l(window2, bkaVar2) : new y9l(window2, bkaVar2);
                        aalVar2.D();
                        aalVar2.x(519);
                    }
                    dialog2.setCancelable(false);
                    playerView2.setUseController(true);
                    playerView2.setControllerAutoShow(true);
                    playerView2.setResizeMode(1);
                    playerView2.setFullscreenButtonState(true);
                    playerView2.setShowNextButton(false);
                    playerView2.setShowPreviousButton(false);
                    View findViewById = playerView2.findViewById(R.id.exo_settings);
                    View findViewById2 = playerView2.findViewById(R.id.exo_position);
                    View findViewById3 = playerView2.findViewById(R.id.exo_duration);
                    View findViewById4 = playerView2.findViewById(R.id.exo_time);
                    if (findViewById == null || findViewById2 == null || findViewById3 == null || findViewById4 == null) {
                        s38.a().c(new Throwable("exo player control view IDs not found"));
                    } else {
                        findViewById.setVisibility(8);
                        findViewById2.setVisibility(8);
                        findViewById3.setVisibility(8);
                        findViewById4.setVisibility(8);
                    }
                    playerView2.setFullscreenButtonClickListener(new ugi(playerView2, bhiVar));
                    AdBannerView smallAd4 = bhiVar.getSmallAd();
                    if (smallAd4 != null) {
                        smallAd4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    }
                    AdBannerView smallAd5 = bhiVar.getSmallAd();
                    if (smallAd5 != null && (overlayFrameLayout = playerView2.getOverlayFrameLayout()) != null) {
                        overlayFrameLayout.addView(smallAd5);
                    }
                    playerView2.setShowBuffering(1);
                    vg6 vg6Var2 = bhiVar.s;
                    vg6Var2.getClass();
                    PlayerView playerView4 = (PlayerView) js2Var.l;
                    if (playerView4 != playerView2) {
                        playerView2.setPlayer(vg6Var2);
                        playerView4.setPlayer(null);
                    }
                    dialog2.setContentView((ConstraintLayout) ddVar.b);
                    dialog2.show();
                    bhiVar.h = dialog2;
                }
                bhiVar.j = System.currentTimeMillis();
            }
            Context context = playerView.getContext();
            context.getClass();
            FragmentActivity K = hkg.K(context);
            if (K != null) {
                K.setRequestedOrientation(0);
            }
        }
    }

    public static final void u(bhi bhiVar, PlayerView playerView, vf vfVar) {
        vfVar.getClass();
        bhiVar.u = true;
        bhiVar.w();
        String adUnitId = bhiVar.getAdUnitId();
        if (adUnitId != null) {
            Context context = playerView.getContext();
            context.getClass();
            String str = bhiVar.e;
            AdType.Preroll preroll = AdType.Preroll.EventLiveStream;
            ru ruVar = ru.GOOGLE;
            tf tfVar = ((zjo) vfVar).a;
            nv.j(context, str, preroll, ruVar, adUnitId, wt3.d(tfVar.a), tfVar.getMessage(), qu.SHOW, null, null, 768);
        }
    }

    public static final void v(bhi bhiVar, PlayerView playerView, boolean z) {
        FrameLayout overlayFrameLayout;
        if (z) {
            return;
        }
        Context context = playerView.getContext();
        context.getClass();
        FragmentActivity K = hkg.K(context);
        if (K != null) {
            K.setRequestedOrientation(1);
        }
        js2 js2Var = bhiVar.f;
        if (bhiVar.s == null) {
            return;
        }
        AdBannerView smallAd = bhiVar.getSmallAd();
        ViewParent parent = smallAd != null ? smallAd.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(bhiVar.getSmallAd());
        }
        PlayerView playerView2 = (PlayerView) js2Var.l;
        playerView2.setFullscreenButtonState(false);
        AdBannerView smallAd2 = bhiVar.getSmallAd();
        if (smallAd2 != null && (overlayFrameLayout = playerView2.getOverlayFrameLayout()) != null) {
            overlayFrameLayout.addView(smallAd2);
        }
        vg6 vg6Var = bhiVar.s;
        vg6Var.getClass();
        PlayerView playerView3 = (PlayerView) bhiVar.q.d;
        if (playerView3 != playerView2) {
            playerView2.setPlayer(vg6Var);
            playerView3.setPlayer(null);
        }
        Dialog dialog = bhiVar.h;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        Dialog dialog2 = bhiVar.h;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        Context context2 = bhiVar.getContext();
        context2.getClass();
        FragmentActivity K2 = hkg.K(context2);
        if (K2 != null) {
            nv.U((BaseActivity) K2, "VideoStreamModal", System.currentTimeMillis() - bhiVar.j, bhiVar.k);
        }
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        View view = ((PlayerView) this.f.l).d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        js2 js2Var = this.f;
        View view = ((PlayerView) js2Var.l).d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
        ale player = ((PlayerView) js2Var.l).getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.media3_player;
    }

    public final boolean getShowMediaTabCta() {
        return this.d;
    }

    public final boolean getStreamInitialized() {
        return this.y;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        PlayerView playerView = (PlayerView) this.f.l;
        ale player = playerView.getPlayer();
        if (player != null) {
            player.release();
        }
        ale player2 = playerView.getPlayer();
        xgi xgiVar = this.B;
        if (player2 != null) {
            player2.z(xgiVar);
        }
        playerView.setPlayer(null);
        PlayerView playerView2 = (PlayerView) this.q.d;
        ale player3 = playerView2.getPlayer();
        if (player3 != null) {
            player3.release();
        }
        ale player4 = playerView2.getPlayer();
        if (player4 != null) {
            player4.z(xgiVar);
        }
        playerView2.setPlayer(null);
        vg6 vg6Var = this.s;
        if (vg6Var != null) {
            vg6Var.release();
        }
        this.s = null;
        hr9 hr9Var = this.g;
        if (hr9Var != null) {
            hr9Var.c();
        }
        AdBannerView smallAd = getSmallAd();
        if (smallAd != null) {
            smallAd.b();
        }
        g9i g9iVar = this.x;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        uyf uyfVar = this.r;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
        this.r = null;
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        u6bVar.getClass();
        getViewModel().b.e(u6bVar, new ygi(0, new g2i(this, 12)));
    }

    public final void r(String str, Event event) {
        this.k.a = Integer.valueOf(event.getId());
        if (ok3.D(event)) {
            Context context = getContext();
            context.getClass();
            int id = event.getId();
            Context context2 = getContext();
            context2.getClass();
            boolean F = waa.F(context2);
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            firebaseBundle.putInt("id", id);
            if (F) {
                firebaseBundle.putString("type", "autostarted");
            }
            ia0 ia0Var = ia0.q;
            me4.d((f5d) me4.e(), "video_stream_impression", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "video_stream_impression", false);
        }
        getRoot().setVisibility(0);
        g6b t = qea.t(this);
        int i = 1;
        js2 js2Var = this.f;
        if (t != null) {
            Context context3 = getContext();
            context3.getClass();
            hkj hkjVar = new hkj(context3);
            hkjVar.k = true;
            hkjVar.a(t, event);
            ((ConstraintLayout) js2Var.o).setBackground(hkjVar);
        }
        TeamLogoView teamLogoView = (TeamLogoView) js2Var.k;
        LinearLayout linearLayout = (LinearLayout) js2Var.f;
        LinearLayout linearLayout2 = (LinearLayout) js2Var.h;
        ShapeableImageView shapeableImageView = (ShapeableImageView) js2Var.n;
        TeamLogoView.g(teamLogoView, Event.getHomeTeam$default(event, null, 1, null), null, 12);
        TeamLogoView.g((TeamLogoView) js2Var.m, Event.getAwayTeam$default(event, null, 1, null), null, 8);
        if (ok3.D(event)) {
            linearLayout2.setVisibility(this.d ? 0 : 8);
            linearLayout.setVisibility(8);
            shapeableImageView.setVisibility(0);
        } else {
            shapeableImageView.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            TextView textView = js2Var.d;
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMMHHSS;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            fn0.u(startTimestamp, hk4.a(bi4Var.d()), textView);
        }
        Context context4 = getContext();
        context4.getClass();
        if (waa.F(context4) && ok3.D(event) && str != null) {
            shapeableImageView.setVisibility(4);
            tgj.E((ProgressBar) js2Var.j, 0L, null, 15);
            tgj.E((ImageView) js2Var.b, 0L, null, 15);
            s(str, true);
        }
        ((ImageView) js2Var.e).setOnClickListener(new wgi(this, 2));
        shapeableImageView.setOnClickListener(new xem(i, this, event, str));
    }

    public final void s(String str, boolean z) {
        hr4 hr4Var;
        h6c h6cVar;
        AdUnit adUnit;
        BaseAdUnit.GamAdUnit gam;
        js2 js2Var = this.f;
        final PlayerView playerView = (PlayerView) js2Var.l;
        playerView.setUseController(true);
        playerView.setControllerAutoShow(true);
        playerView.setResizeMode(1);
        boolean z2 = false;
        playerView.setShowNextButton(false);
        playerView.setShowPreviousButton(false);
        playerView.setControllerHideDuringAds(true);
        playerView.setFullscreenButtonState(false);
        AdBannerView smallAd = getSmallAd();
        if (smallAd != null) {
            if (smallAd.getParent() != null) {
                ViewParent parent = smallAd.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(smallAd);
                }
            }
            smallAd.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
            FrameLayout overlayFrameLayout = playerView.getOverlayFrameLayout();
            if (overlayFrameLayout != null) {
                overlayFrameLayout.addView(smallAd);
            }
        }
        View findViewById = playerView.findViewById(R.id.exo_settings);
        View findViewById2 = playerView.findViewById(R.id.exo_position);
        View findViewById3 = playerView.findViewById(R.id.exo_duration);
        View findViewById4 = playerView.findViewById(R.id.exo_time);
        if (findViewById == null || findViewById2 == null || findViewById3 == null || findViewById4 == null) {
            s38.a().c(new Throwable("exo player control view IDs not found"));
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
            findViewById4.setVisibility(8);
        }
        playerView.setFullscreenButtonClickListener(new ugi(this, playerView));
        playerView.setShowBuffering(1);
        boolean z3 = this.w;
        if (z3) {
            lr9.a().getClass();
            bqn bqnVar = new bqn();
            bqnVar.c = false;
            Context context = playerView.getContext();
            context.getClass();
            this.g = new hr9(context.getApplicationContext(), new wi5(Ua.s, new uf() { // from class: tgi
                @Override // defpackage.uf
                public final void a(vf vfVar) {
                    bhi.u(bhi.this, playerView, vfVar);
                }
            }, new ir9(this, 2), bqnVar), new hjg());
        }
        eo4 eo4Var = new eo4(playerView.getContext());
        if (z3) {
            hr4Var = new hr4(eo4Var);
            hr4Var.d = new imf(this, 16);
            hr4Var.e = playerView;
        } else {
            hr4Var = new hr4(eo4Var);
        }
        wf6 wf6Var = new wf6(playerView.getContext());
        wf6Var.b(hr4Var);
        vg6 a = wf6Var.a();
        playerView.setPlayer(a);
        a.s(this.B);
        hr9 hr9Var = this.g;
        if (hr9Var != null) {
            hr9Var.d(a);
        }
        AdConfig f = it7.h.f(AdType.Preroll.EventLiveStream);
        AdConfig.Preroll preroll = f instanceof AdConfig.Preroll ? (AdConfig.Preroll) f : null;
        String adUnitId = (preroll == null || (adUnit = preroll.getAdUnit()) == null || (gam = adUnit.getGam()) == null) ? null : gam.getAdUnitId();
        this.i = adUnitId;
        if (!z3 || adUnitId == null) {
            b78 b78Var = new b78();
            p5c p5cVar = new p5c(0);
            List list = Collections.EMPTY_LIST;
            av9 av9Var = hv9.b;
            vvf vvfVar = vvf.e;
            s5c s5cVar = new s5c();
            z5c z5cVar = z5c.a;
            Uri parse = Uri.parse(str);
            parse.getClass();
            z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
            h6cVar = new h6c("", new m5c(b78Var), new v5c(parse, null, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list, null, vvfVar, C.TIME_UNSET), new u5c(s5cVar), q6c.D, z5cVar);
        } else {
            b78 b78Var2 = new b78();
            p5c p5cVar2 = new p5c(0);
            List list2 = Collections.EMPTY_LIST;
            av9 av9Var2 = hv9.b;
            vvf vvfVar2 = vvf.e;
            s5c s5cVar2 = new s5c();
            z5c z5cVar2 = z5c.a;
            Uri parse2 = Uri.parse(str);
            parse2.getClass();
            Uri parse3 = Uri.parse(adUnitId);
            parse3.getClass();
            by9 by9Var = new by9();
            by9Var.a = parse3;
            g5c g5cVar = new g5c(by9Var);
            z1a.E(((Uri) p5cVar2.c) == null || ((UUID) p5cVar2.b) != null);
            h6cVar = new h6c("", new m5c(b78Var2), new v5c(parse2, null, ((UUID) p5cVar2.b) != null ? new q5c(p5cVar2) : null, g5cVar, list2, null, vvfVar2, C.TIME_UNSET), new u5c(s5cVar2), q6c.D, z5cVar2);
        }
        a.l(h6cVar);
        Context context2 = playerView.getContext();
        context2.getClass();
        if (waa.F(context2) && z) {
            z2 = true;
        }
        a.setPlayWhenReady(z2);
        if (a.getPlayWhenReady() && a.k(24)) {
            a.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            tgj.E((ImageView) js2Var.e, 0L, null, 15);
        }
        this.y = true;
        a.a();
        this.s = a;
    }

    public final void setOnMediaCTAButtonListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        z8e.a0((MaterialButton) this.f.g, 1000L, new rsd(11, function0));
    }

    public final void setStreamInitialized(boolean z) {
        this.y = z;
    }

    public final void w() {
        g9i g9iVar = this.x;
        if (g9iVar == null || Intrinsics.c(Boolean.valueOf(g9iVar.isActive()), Boolean.FALSE)) {
            u6b w = qha.w(this);
            this.x = w != null ? xw3.L(wca.x(w.getLifecycle()), null, null, new ahi(this, null), 3) : null;
        }
    }
}
