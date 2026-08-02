package com.sports.insider.ui.viewpage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.b;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.ui.views.ToolbarView;
import e.d0;
import eg.c0;
import eg.y;
import ge.d;
import gf.k;
import gf.t;
import i3.i;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import kh.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import me.a;
import pd.x;
import ue.e;
import ve.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/viewpage/ViewCloudFragment;", "Landroidx/fragment/app/Fragment;", "Lue/e;", "Lve/w0;", "<init>", "()V", "Lue/b;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewCloudFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewCloudFragment.kt\ncom/sports/insider/ui/viewpage/ViewCloudFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,215:1\n42#2,3:216\n*S KotlinDebug\n*F\n+ 1 ViewCloudFragment.kt\ncom/sports/insider/ui/viewpage/ViewCloudFragment\n*L\n56#1:216,3\n*E\n"})
/* loaded from: classes.dex */
public final class ViewCloudFragment extends Fragment implements e, w0 {

    /* renamed from: a, reason: collision with root package name */
    public String f7063a;

    /* renamed from: c, reason: collision with root package name */
    public long f7065c;

    /* renamed from: d, reason: collision with root package name */
    public String f7066d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f7067e;

    /* renamed from: h, reason: collision with root package name */
    public Pair f7070h;

    /* renamed from: b, reason: collision with root package name */
    public int f7064b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final g f7068f = new g(9);

    /* renamed from: g, reason: collision with root package name */
    public int f7069g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final d f7071i = new d(this, 10);
    public final t j = k.b(new a(19, this));

    @Override // ue.e
    public final void e(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
        Intrinsics.checkNotNullParameter(paramView, "paramView");
        Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
    }

    @Override // ue.e
    public final boolean h(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    @Override // ue.e
    public final boolean i(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return true;
    }

    @Override // ve.w0
    public final void k(int i5) {
        WebView webView;
        if (i5 != 6 || (webView = this.f7067e) == null) {
            return;
        }
        webView.reload();
    }

    @Override // ue.e
    public final void o(int i5) {
        f fVar = new f(17);
        if (i5 >= 100) {
            c0.t(MyApp.f6830c, new y("CloudPaymentUseCase"), null, new b(fVar, (Continuation) null, 4), 2);
        }
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
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setBackgroundColor(Color.parseColor("#20003F"));
        frameLayout.setLayoutParams(layoutParams);
        WebView webView = new WebView(context);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(Color.parseColor("#20003F"));
        webView.setId(View.generateViewId());
        webView.setTag("webView");
        webView.setClipToPadding(false);
        frameLayout.addView(webView);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        g gVar = this.f7068f;
        if (gVar != null) {
            gVar.f19115b = null;
        }
        WebView webView = this.f7067e;
        if (webView != null) {
            webView.destroy();
        }
        this.f7067e = null;
        this.f7071i.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.f7067e;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f7067e;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        p0 activity = getActivity();
        ToolbarView toolbarView = activity != null ? (ToolbarView) activity.findViewById(R.id.toolbarView) : null;
        if (toolbarView != null) {
            toolbarView.setToolbarMenuInterface(this);
        }
        x xVar = (x) this.j.getValue();
        xVar.f21807d.h((List) xVar.f21817o.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        p0 activity = getActivity();
        ToolbarView toolbarView = activity != null ? (ToolbarView) activity.findViewById(R.id.toolbarView) : null;
        if (toolbarView != null) {
            toolbarView.setToolbarMenuInterface(null);
        }
        c0.t(MyApp.f6830c, null, null, new bd.b(2, null, 24), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String f6;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g gVar = new g(Reflection.getOrCreateKotlinClass(ue.b.class), new i(16, this));
        this.f7069g = ((ue.b) gVar.getValue()).c();
        String g10 = ((ue.b) gVar.getValue()).g();
        Intrinsics.checkNotNullExpressionValue(g10, "getSku(...)");
        this.f7063a = g10;
        ((ue.b) gVar.getValue()).h();
        this.f7064b = ((ue.b) gVar.getValue()).a();
        this.f7065c = ((ue.b) gVar.getValue()).d();
        this.f7066d = ((ue.b) gVar.getValue()).b();
        String e7 = ((ue.b) gVar.getValue()).e();
        Continuation continuation = null;
        this.f7070h = (e7 == null || (f6 = ((ue.b) gVar.getValue()).f()) == null) ? null : new Pair(e7, f6);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f7071i);
        WebView webView = (WebView) view.findViewWithTag("webView");
        this.f7067e = webView;
        g gVar2 = this.f7068f;
        if (gVar2 != null) {
            gVar2.m(webView, this);
        }
        c0.t(d1.g(this), new y("ViewCloudFragment"), null, new u0(this, continuation, 15), 2);
    }

    @Override // ue.e
    public final void w(String str) {
        String str2;
        String str3;
        int i5 = this.f7064b;
        String str4 = this.f7063a;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(PurchaseSubsTable.skuColumn);
            str2 = null;
        } else {
            str2 = str4;
        }
        long j = this.f7065c;
        String str5 = this.f7066d;
        Intrinsics.checkNotNullParameter("aHR0cHM6Ly9pbnNpZ2h0cy1iZXQuY29tL3Nwb3J0LWluc2lkZXIvcHJvY2Vzcw==", AdRevenueConstants.SOURCE_KEY);
        try {
            byte[] decode = Base64.decode("aHR0cHM6Ly9pbnNpZ2h0cy1iZXQuY29tL3Nwb3J0LWluc2lkZXIvcHJvY2Vzcw==", 0);
            Intrinsics.checkNotNull(decode);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            str3 = new String(decode, forName);
        } catch (UnsupportedEncodingException unused) {
            str3 = null;
        }
        if (Intrinsics.areEqual(str, String.valueOf(str3))) {
            c0.t(MyApp.f6830c, f.k(), null, new cd.a(i5, str2, j, str5, new cd.b(6), null), 2);
            this.f7071i.b();
        }
    }

    @Override // ue.e
    public final void z(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
    }
}
