package com.sports.insider.ui.viewpage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.y;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.z;
import com.google.android.material.card.MaterialCardViewHelper;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.util.common.JavaScriptMainInterface;
import da.c;
import da.j;
import da.l;
import da.m;
import da.n;
import da.p;
import e.d0;
import eg.c0;
import eg.m0;
import ge.d;
import gf.k;
import gf.t;
import hg.t0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import jg.q;
import kh.g;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import le.k0;
import me.a;
import org.json.JSONObject;
import rc.x;
import td.b;
import ue.e;
import ue.f;
import ue.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sports/insider/ui/viewpage/ViewPageEventFragment;", "Landroidx/fragment/app/y;", "Lue/e;", "Lcom/sports/insider/util/common/JavaScriptMainInterface;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewPageEventFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPageEventFragment.kt\ncom/sports/insider/ui/viewpage/ViewPageEventFragment\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n27#2:284\n1#3:285\n*S KotlinDebug\n*F\n+ 1 ViewPageEventFragment.kt\ncom/sports/insider/ui/viewpage/ViewPageEventFragment\n*L\n81#1:284\n*E\n"})
/* loaded from: classes.dex */
public final class ViewPageEventFragment extends y implements e, JavaScriptMainInterface {

    /* renamed from: b, reason: collision with root package name */
    public WebView f7077b;

    /* renamed from: c, reason: collision with root package name */
    public View f7078c;

    /* renamed from: a, reason: collision with root package name */
    public final t f7076a = k.b(new a(20, this));

    /* renamed from: d, reason: collision with root package name */
    public int f7079d = -1;

    /* renamed from: f, reason: collision with root package name */
    public final g f7081f = new g(9);

    /* renamed from: g, reason: collision with root package name */
    public final pd.a f7082g = new pd.a(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public final d f7080e = new d(this, 12);

    public final h G() {
        return (h) this.f7076a.getValue();
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void changeNotification(boolean z5) {
        xe.a.a(this, z5);
        G().getClass();
        c0.t(MyApp.f6830c, new eg.y("ViewPageViewModel"), null, new f(z5, null), 2);
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void closeThis() {
        xe.a.b(this);
        this.f7080e.b();
    }

    @Override // ue.e
    public final void e(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
        Intrinsics.checkNotNullParameter(paramView, "paramView");
        Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
    }

    @Override // ue.e
    public final boolean h(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        h G = G();
        String uri = request.getUrl().toString();
        WeakReference weakReference = new WeakReference(requireContext());
        G.getClass();
        return h.f(uri, weakReference);
    }

    @Override // ue.e
    public final boolean i(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        h G = G();
        WeakReference weakReference = new WeakReference(requireContext());
        G.getClass();
        return h.f(str, weakReference);
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void loadPreview(int i5, String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        xe.a.c(this, i5, language);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i5 = newConfig.orientation;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setMinimumHeight(io.sentry.config.a.o(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION));
        frameLayout.setBackgroundColor(0);
        frameLayout.setLayoutParams(layoutParams);
        WebView webView = new WebView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        int o3 = io.sentry.config.a.o(32);
        int o4 = io.sentry.config.a.o(64);
        layoutParams2.setMargins(o3, o4, o3, o4);
        webView.setLayoutParams(layoutParams2);
        webView.setId(View.generateViewId());
        webView.setTag("webView");
        webView.setClipToPadding(false);
        int o7 = io.sentry.config.a.o(36);
        int o10 = io.sentry.config.a.o(48);
        int o11 = io.sentry.config.a.o(16);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(o7, o7);
        layoutParams3.setMargins(o11, o10, o11, o10);
        layoutParams3.gravity = 8388613;
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout2.setId(View.generateViewId());
        frameLayout2.setTag("btnClose");
        frameLayout2.setBackgroundResource(R.drawable.button_shape_white_round);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(o11, o11);
        layoutParams4.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams4);
        appCompatImageView.setImageResource(R.drawable.ic_close_white_24dp);
        frameLayout2.addView(appCompatImageView);
        frameLayout.addView(webView);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        g gVar = this.f7081f;
        if (gVar != null) {
            gVar.f19115b = null;
        }
        WebView webView = this.f7077b;
        if (webView != null) {
            if (gVar != null) {
                webView.removeJavascriptInterface(JavaScriptMainInterface.nameInterface);
                webView.removeJavascriptInterface(JavaScriptMainInterface.nameInterfaceV1);
            }
            webView.destroy();
        }
        this.f7077b = null;
        this.f7080e.e();
        this.f7078c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.f7077b;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f7077b;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = this.f7078c;
        if (view != null) {
            io.sentry.config.a.y(view, 600L, new a2.f(23, this));
        }
        G().f24258c.e(getViewLifecycleOwner(), this.f7082g);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        View view = this.f7078c;
        if (view != null) {
            view.setOnClickListener(null);
        }
        G().f24258c.i(this.f7082g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f7080e);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        this.f7077b = (WebView) view.findViewWithTag("webView");
        this.f7078c = view.findViewWithTag("btnClose");
        g gVar = this.f7081f;
        if (gVar != null) {
            gVar.m(this.f7077b, this);
        }
        if (gVar != null) {
            WebView webView = this.f7077b;
            Intrinsics.checkNotNullParameter(this, "interfaceJs");
            if (webView != null) {
                webView.addJavascriptInterface(this, JavaScriptMainInterface.nameInterface);
            }
            if (webView != null) {
                webView.addJavascriptInterface(this, JavaScriptMainInterface.nameInterfaceV1);
            }
        }
        z g10 = d1.g(this);
        lg.e eVar = m0.f9201a;
        fg.e eVar2 = q.f18523a;
        eg.y yVar = new eg.y("ViewPageEventFragment");
        eVar2.getClass();
        c0.t(g10, kotlin.coroutines.e.c(eVar2, yVar), null, new b(this, (Continuation) null, 1), 2);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openBonusInfo() {
        xe.b.a(this);
        h G = G();
        G.getClass();
        y1.a aVar = new y1.a(R.id.action_global_bonusesInfo);
        Intrinsics.checkNotNullExpressionValue(aVar, "actionGlobalBonusesInfo(...)");
        G.e(aVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openCloudPayment(String str, Integer num) {
        xe.b.b(this, str, num);
        h G = G();
        int intValue = num != null ? num.intValue() : -1;
        int i5 = this.f7079d;
        G.getClass();
        if (str == null) {
            return;
        }
        u1.a i10 = d1.i(G);
        lg.e eVar = m0.f9201a;
        c0.t(i10, q.f18523a, null, new k0(str, G, intValue, i5, null), 2);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openDiamond() {
        xe.b.c(this);
        h G = G();
        int i5 = this.f7079d;
        G.getClass();
        p pVar = new p();
        pVar.f8341a.put("announcementId", Integer.valueOf(i5));
        Intrinsics.checkNotNullExpressionValue(pVar, "setAnnouncementId(...)");
        G.e(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openFaq(String str) {
        y1.a aVar;
        xe.b.d(this, str);
        h G = G();
        G.getClass();
        if (CollectionsKt.A(u.f("Responsible", "premium_prediction", "express_prediction", "vip_access", "how_to_get_a_bonus", "how_to_pay", "subs_live_prediction", "how_place_bet", "how_register_bk", "how_logout_oauth"), str)) {
            da.d dVar = new da.d();
            dVar.c(str);
            aVar = dVar;
        } else if (Intrinsics.areEqual(str, "Academy")) {
            aVar = new y1.a(R.id.action_global_academyFragment);
        } else if (CollectionsKt.A(u.f("Sports_betting_first_steps", "Sports_betting_types", "Common_mistakes_newbies", "Flat_strategy_for_those_who_are_just_starting", "Strategy_Corridor", "Why_is_psychology_so_important", "Mathematical_rates", "Deepen_bets_on_yellow_cards_and_corner_cards", "Value_Betting", "beating_totals", "Rational_income_maximization_principle", "What_is_losing_streak_and_how_to_deal_with_it", "Both_teams_to_score"), str)) {
            da.a aVar2 = new da.a();
            aVar2.f8326a.put("destination", str);
            aVar = aVar2;
        } else {
            aVar = new y1.a(R.id.action_global_faqFragment);
        }
        Intrinsics.checkNotNull(aVar);
        G.e(aVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openLive() {
        xe.b.e(this);
        h G = G();
        int i5 = this.f7079d;
        G.getClass();
        da.f fVar = new da.f();
        fVar.f8331a.put("announcementId", Integer.valueOf(i5));
        Intrinsics.checkNotNullExpressionValue(fVar, "setAnnouncementId(...)");
        G.e(fVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openNews(Integer num) {
        y1.c0 c0Var;
        xe.b.f(this, num);
        h G = G();
        G.getClass();
        if (num == null) {
            c0Var = new y1.a(R.id.action_global_newsFragment);
        } else {
            m mVar = new m();
            mVar.f8338a.put("newsId", num);
            c0Var = mVar;
        }
        Intrinsics.checkNotNull(c0Var);
        G.e(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[ORIG_RETURN, RETURN] */
    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openPayPrediction(int i5, int i10) {
        da.h hVar;
        y1.c0 c0Var;
        xe.b.g(this, i5, i10);
        h G = G();
        int i11 = this.f7079d;
        G.getClass();
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            da.h hVar2 = new da.h();
            Integer valueOf = Integer.valueOf(i5);
            HashMap hashMap = hVar2.f8333a;
            hashMap.put("id", valueOf);
            hashMap.put("announcementId", Integer.valueOf(i11));
            hVar = hVar2;
        } else {
            if (i10 != 3) {
                c0Var = null;
                if (c0Var != null) {
                    return;
                }
                G.e(c0Var);
                return;
            }
            da.g gVar = new da.g();
            Integer valueOf2 = Integer.valueOf(i5);
            HashMap hashMap2 = gVar.f8332a;
            hashMap2.put("id", valueOf2);
            hashMap2.put("announcementId", Integer.valueOf(i11));
            hVar = gVar;
        }
        c0Var = hVar;
        if (c0Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openPrediction(int i5, int i10) {
        l lVar;
        xe.b.h(this, i5, i10);
        h G = G();
        G.getClass();
        if (i10 == 2) {
            l lVar2 = new l();
            lVar2.f8337a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(lVar2, "setId(...)");
            lVar = lVar2;
        } else if (i10 != 3) {
            j jVar = new j();
            jVar.f8335a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(jVar, "setId(...)");
            lVar = jVar;
        } else {
            c cVar = new c();
            cVar.f8328a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(cVar, "setId(...)");
            lVar = cVar;
        }
        G.e(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openSIAcademyFaq(String str) {
        y1.a aVar;
        xe.b.i(this, str);
        h G = G();
        G.getClass();
        if (CollectionsKt.A(u.f("Sports_betting_first_steps", "Sports_betting_types", "Common_mistakes_newbies", "Flat_strategy_for_those_who_are_just_starting", "Strategy_Corridor", "Why_is_psychology_so_important", "Mathematical_rates", "Deepen_bets_on_yellow_cards_and_corner_cards", "Value_Betting", "beating_totals", "Rational_income_maximization_principle", "What_is_losing_streak_and_how_to_deal_with_it", "Both_teams_to_score"), str)) {
            da.a aVar2 = new da.a();
            aVar2.f8326a.put("destination", str);
            aVar = aVar2;
        } else {
            aVar = new y1.a(R.id.action_global_academyFragment);
        }
        Intrinsics.checkNotNull(aVar);
        G.e(aVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openSetting() {
        xe.b.j(this);
        h G = G();
        G.getClass();
        y1.a aVar = new y1.a(R.id.action_global_settingFragment);
        Intrinsics.checkNotNullExpressionValue(aVar, "actionGlobalSettingFragment(...)");
        G.e(aVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openSupport() {
        xe.b.k(this);
        h G = G();
        G.getClass();
        n nVar = new n();
        nVar.c(-1);
        Intrinsics.checkNotNullExpressionValue(nVar, "setErrorCode(...)");
        G.e(nVar);
        new cd.d().i("ViewPageEvent");
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openTariff() {
        xe.b.l(this);
        h G = G();
        int i5 = this.f7079d;
        G.getClass();
        da.e eVar = new da.e();
        eVar.f8330a.put("announcementId", Integer.valueOf(i5));
        Intrinsics.checkNotNullExpressionValue(eVar, "setAnnouncementId(...)");
        G.e(eVar);
    }

    @Override // com.sports.insider.util.common.JavaScriptInterfaceNavigate
    public final void openUrlByBrowser(String str, String str2) {
        HashMap hashMap;
        xe.b.m(this, str, str2);
        h G = G();
        WeakReference contextWeek = new WeakReference(requireContext());
        G.getClass();
        Intrinsics.checkNotNullParameter(contextWeek, "contextWeek");
        Bundle bundle = null;
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            hashMap = new HashMap();
            Intrinsics.checkNotNull(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next).toString());
            }
        } else {
            hashMap = null;
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            bundle = new Bundle();
            for (String str3 : hashMap.keySet()) {
                bundle.putString(str3, (String) hashMap.get(str3));
            }
        }
        if (str == null) {
            return;
        }
        zc.e.e(str, contextWeek, bundle);
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void showToast(String msg) {
        xe.a.d(this, msg);
        G().getClass();
        if (msg == null) {
            return;
        }
        t0 t0Var = x.f22455a;
        Intrinsics.checkNotNullParameter(msg, "msg");
        x.f22455a.b(new gf.u(null, 2000, msg));
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void triggerEvent(String name, String str) {
        xe.a.e(this, name, str);
        if (name == null) {
            return;
        }
        h G = G();
        G.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        G.f24259d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        cd.b bVar = new cd.b(6);
        Intrinsics.checkNotNullParameter(name, "name");
        bVar.n(name, str);
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final void triggerIdentity() {
        xe.a.f(this);
    }

    @Override // com.sports.insider.util.common.JavaScriptActionInterface
    public final int versionCode() {
        return xe.a.g(this);
    }

    @Override // ue.e
    public final void w(String str) {
        this.f7080e.f(true);
    }

    @Override // ue.e
    public final void z(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
    }

    @Override // ue.e
    public final /* bridge */ void o(int i5) {
    }
}
