package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import com.google.ads.interactivemedia.v3.impl.data.AdData;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.LiveActionWidgetProvider;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.AdUnit;
import com.sofascore.model.firebase.BaseAdUnit;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class geb extends h6b {
    public static final /* synthetic */ int q = 0;
    public final ez0 d;
    public String e;
    public sr8 f;
    public g9i g;
    public boolean h;
    public zsk i;
    public final p61 j;
    public final AdConfig.Preroll k;
    public final String l;
    public final Uri m;
    public hr9 n;
    public vg6 o;
    public final feb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geb(Context context) {
        super(context, null, 0);
        AdUnit adUnit;
        BaseAdUnit.GamAdUnit gam;
        String adUnitId;
        context.getClass();
        Uri uri = null;
        View root = getRoot();
        int i = R.id.live_action_web_view;
        WebView webView = (WebView) nq8.B(R.id.live_action_web_view, root);
        if (webView != null) {
            i = R.id.mute_button;
            ImageView imageView = (ImageView) nq8.B(R.id.mute_button, root);
            if (imageView != null) {
                i = R.id.player_view;
                PlayerView playerView = (PlayerView) nq8.B(R.id.player_view, root);
                if (playerView != null) {
                    this.d = new ez0((FrameLayout) root, webView, imageView, playerView, 22);
                    this.j = new p61(1, this);
                    y00 y00Var = new y00(this, 6);
                    o8.d(this, 0, 1);
                    View root2 = getRoot();
                    ViewGroup.LayoutParams layoutParams = root2.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        throw null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = ao2.s(4, context);
                    marginLayoutParams.bottomMargin = ao2.s(4, context);
                    marginLayoutParams.setMarginStart(ao2.s(8, context));
                    marginLayoutParams.setMarginEnd(ao2.s(8, context));
                    root2.setLayoutParams(marginLayoutParams);
                    aba.G(webView);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.setVerticalScrollBarEnabled(false);
                    webView.setHorizontalScrollBarEnabled(false);
                    addOnAttachStateChangeListener(y00Var);
                    AdConfig f = it7.h.f(AdType.Preroll.LiveActionWidget);
                    AdConfig.Preroll preroll = f instanceof AdConfig.Preroll ? (AdConfig.Preroll) f : null;
                    this.k = preroll;
                    this.l = fc6.C();
                    if (preroll != null && (adUnit = preroll.getAdUnit()) != null && (gam = adUnit.getGam()) != null && (adUnitId = gam.getAdUnitId()) != null) {
                        uri = Uri.parse(adUnitId);
                        uri.getClass();
                    }
                    this.m = uri;
                    this.p = new feb(this);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final String getAdUnitIdForAnalytics() {
        Uri uri = this.m;
        if (uri != null) {
            return uri.getQueryParameter("iu");
        }
        return null;
    }

    public static final Unit p(geb gebVar) {
        ez0 ez0Var = gebVar.d;
        Uri uri = gebVar.m;
        if (uri != null && gebVar.o == null) {
            lr9.a().getClass();
            bqn bqnVar = new bqn();
            bqnVar.c = false;
            Context context = gebVar.getContext();
            context.getClass();
            hr9 hr9Var = new hr9(context.getApplicationContext(), new wi5(Ua.s, new jr9(gebVar, 1), new ir9(gebVar, 1), bqnVar), new hjg());
            gebVar.n = hr9Var;
            vg6 a = new wf6(gebVar.getContext()).a();
            a.s(gebVar.p);
            a.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            gebVar.o = a;
            ((PlayerView) ez0Var.e).setPlayer(a);
            hr9Var.d(a);
            ((ImageView) ez0Var.d).setOnClickListener(new cd5(gebVar, 14));
            wk wkVar = new wk(new chh(10000000L, chh.k), new xe4(uri), "LiveActionWidgetPreroll", new hr4(new eo4(gebVar.getContext())), hr9Var, (PlayerView) ez0Var.e);
            a.j0();
            List singletonList = Collections.singletonList(wkVar);
            a.j0();
            a.j0();
            a.a0(singletonList, true, C.TIME_UNSET, -1);
            a.a();
            a.setPlayWhenReady(true);
            String adUnitIdForAnalytics = gebVar.getAdUnitIdForAnalytics();
            if (adUnitIdForAnalytics != null) {
                Context context2 = gebVar.getContext();
                context2.getClass();
                nv.f(context2, gebVar.l, AdType.Preroll.LiveActionWidget, ru.GOOGLE, adUnitIdForAnalytics, null, 96);
            }
        }
        return Unit.a;
    }

    public static final void q(geb gebVar, vf vfVar) {
        vfVar.getClass();
        String adUnitIdForAnalytics = gebVar.getAdUnitIdForAnalytics();
        if (adUnitIdForAnalytics != null) {
            Context context = gebVar.getContext();
            context.getClass();
            String str = gebVar.l;
            AdType.Preroll preroll = AdType.Preroll.LiveActionWidget;
            ru ruVar = ru.GOOGLE;
            tf tfVar = ((zjo) vfVar).a;
            nv.j(context, str, preroll, ruVar, adUnitIdForAnalytics, wt3.d(tfVar.a), tfVar.getMessage(), qu.SHOW, null, null, 768);
        }
        gebVar.s();
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        View view = ((PlayerView) this.d.e).d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
        t();
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        View view = ((PlayerView) this.d.e).d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
        vg6 vg6Var = this.o;
        if (vg6Var != null) {
            vg6Var.setPlayWhenReady(false);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.live_action_widget_view;
    }

    public final void l() {
        u6b w;
        if (this.h || this.f == null) {
            return;
        }
        boolean n = n();
        g9i g9iVar = this.g;
        rq3 rq3Var = null;
        if (!n) {
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.g = null;
        } else if ((g9iVar == null || !g9iVar.isActive()) && (w = qha.w(this)) != null) {
            this.g = xw3.L(wca.x(w.getLifecycle()), null, null, new yp7(w, this, rq3Var, 28), 3);
        }
    }

    public final boolean n() {
        if (isAttachedToWindow() && getVisibility() == 0 && getWidth() != 0 && getHeight() != 0) {
            if (!getGlobalVisibleRect(new Rect())) {
                return false;
            }
            if (r0.width() * r0.height() * 2 >= getWidth() * getHeight()) {
                return true;
            }
        }
        return false;
    }

    public final void o(Event event) {
        String str;
        String str2;
        Set set = ceb.a;
        Context context = getContext();
        context.getClass();
        if (ceb.b(event).equals(LiveActionWidgetProvider.OPTA)) {
            int id = event.getId();
            boolean b0 = hkg.b0(context);
            if (b0) {
                str2 = "amoled";
            } else {
                if (b0) {
                    zzl.b();
                    return;
                }
                str2 = WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY;
            }
            boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
            str = dmi.q("https://", uaa.c) + "api/v1/event/" + id + "/live-action-widget?theme=" + str2 + "&ads=false&rtl=" + z + "&language=" + dla.a();
        } else {
            String a = dla.a();
            if (!ceb.a.contains(a)) {
                a = "en";
            }
            boolean shouldReverseTeams = event.shouldReverseTeams();
            str = dmi.q("https://", uaa.c) + "api/v1/event/" + event.getId() + "/live-match-tracker/" + a + "/invert-teams/" + shouldReverseTeams;
        }
        if (str.equals(this.e)) {
            return;
        }
        this.e = str;
        WebView webView = (WebView) this.d.c;
        webView.loadUrl(str);
        webView.setBackgroundColor(0);
        if (webView.isAttachedToWindow()) {
            g6b t = qea.t(webView);
            int id2 = event.getId();
            String b = ceb.b(event);
            zsk zskVar = this.i;
            if (zskVar == null && t != null) {
                zskVar = new zsk(t, 30);
                this.i = zskVar;
            }
            if (zskVar != null) {
                zskVar.b(this, new hp5(this, id2, b), null);
            }
        } else {
            webView.addOnAttachStateChangeListener(new eeb(webView, this, webView, event));
        }
        if (this.f != null || this.h) {
            return;
        }
        ia0 ia0Var = ia0.q;
        if (!mz1.C() || this.m == null) {
            return;
        }
        this.f = new sr8(this, 26);
        addOnLayoutChangeListener(new b2(this, 7));
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        s();
        zsk zskVar = this.i;
        if (zskVar != null) {
            zskVar.a();
        }
    }

    public final void r(hoo hooVar) {
        String adId;
        String adUnitIdForAnalytics;
        int ordinal = hooVar.a.ordinal();
        if (ordinal == 0) {
            s();
            return;
        }
        if (ordinal == 16) {
            ez0 ez0Var = this.d;
            ((PlayerView) ez0Var.e).setVisibility(0);
            Long l = null;
            tgj.E((ImageView) ez0Var.d, 0L, null, 15);
            String adUnitIdForAnalytics2 = getAdUnitIdForAnalytics();
            if (adUnitIdForAnalytics2 != null) {
                hf hfVar = hooVar.b;
                if (hfVar != null && (adId = ((AdData) ((gmo) hfVar).b).adId()) != null) {
                    l = StringsKt.k0(adId);
                }
                Context context = getContext();
                context.getClass();
                nv.l(context, this.l, AdType.Preroll.LiveActionWidget, ru.GOOGLE, adUnitIdForAnalytics2, null, l, 128);
                return;
            }
            return;
        }
        if (ordinal == 21) {
            String adUnitIdForAnalytics3 = getAdUnitIdForAnalytics();
            if (adUnitIdForAnalytics3 != null) {
                Context context2 = getContext();
                context2.getClass();
                nv.e(context2, this.l, AdType.Preroll.LiveActionWidget, ru.GOOGLE, adUnitIdForAnalytics3, null, null, null, 224);
                return;
            }
            return;
        }
        if (ordinal == 2) {
            String adUnitIdForAnalytics4 = getAdUnitIdForAnalytics();
            if (adUnitIdForAnalytics4 != null) {
                Context context3 = getContext();
                context3.getClass();
                nv.i(context3, this.l, AdType.Preroll.LiveActionWidget, ru.GOOGLE, adUnitIdForAnalytics4, null, null, 96);
                return;
            }
            return;
        }
        if (ordinal == 3 && (adUnitIdForAnalytics = getAdUnitIdForAnalytics()) != null) {
            Context context4 = getContext();
            context4.getClass();
            AdType.Preroll preroll = AdType.Preroll.LiveActionWidget;
            ru ruVar = ru.GOOGLE;
            nv.b(context4, this.l, preroll, adUnitIdForAnalytics);
        }
    }

    public final void s() {
        hr9 hr9Var = this.n;
        if (hr9Var != null) {
            hr9Var.d(null);
        }
        ez0 ez0Var = this.d;
        ((PlayerView) ez0Var.e).setPlayer(null);
        vg6 vg6Var = this.o;
        if (vg6Var != null) {
            vg6Var.z(this.p);
        }
        vg6 vg6Var2 = this.o;
        if (vg6Var2 != null) {
            vg6Var2.release();
        }
        this.o = null;
        hr9 hr9Var2 = this.n;
        if (hr9Var2 != null) {
            hr9Var2.c();
        }
        this.n = null;
        ((PlayerView) ez0Var.e).setVisibility(8);
        ((ImageView) ez0Var.d).setVisibility(8);
    }

    public final void t() {
        g6b lifecycle;
        e6b b;
        vg6 vg6Var = this.o;
        if (vg6Var == null) {
            return;
        }
        u6b w = qha.w(this);
        if (w == null || (lifecycle = w.getLifecycle()) == null || (b = lifecycle.b()) == null || b.compareTo(e6b.e) < 0 || !n()) {
            vg6Var.setPlayWhenReady(false);
        } else {
            vg6Var.setPlayWhenReady(true);
        }
    }
}
