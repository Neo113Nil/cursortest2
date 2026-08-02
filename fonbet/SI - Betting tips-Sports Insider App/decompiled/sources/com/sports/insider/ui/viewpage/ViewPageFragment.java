package com.sports.insider.ui.viewpage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import e.d0;
import eg.c0;
import ge.d;
import gf.k;
import gf.t;
import java.lang.ref.WeakReference;
import kh.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.a;
import rc.b0;
import td.b;
import ue.e;
import ue.h;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/viewpage/ViewPageFragment;", "Landroidx/fragment/app/Fragment;", "Lue/e;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPageFragment.kt\ncom/sports/insider/ui/viewpage/ViewPageFragment\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n404#2:342\n404#2:344\n1#3:343\n*S KotlinDebug\n*F\n+ 1 ViewPageFragment.kt\ncom/sports/insider/ui/viewpage/ViewPageFragment\n*L\n74#1:342\n88#1:344\n*E\n"})
/* loaded from: classes.dex */
public final class ViewPageFragment extends Fragment implements e {

    /* renamed from: a, reason: collision with root package name */
    public WebView f7083a;

    /* renamed from: b, reason: collision with root package name */
    public r f7084b;

    /* renamed from: d, reason: collision with root package name */
    public final t f7086d = k.b(new a(21, this));

    /* renamed from: e, reason: collision with root package name */
    public final g f7087e = new g(9);

    /* renamed from: c, reason: collision with root package name */
    public final d f7085c = new d(this, 13);

    @Override // ue.e
    public final void e(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
        Intrinsics.checkNotNullParameter(paramView, "paramView");
        Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
    }

    @Override // ue.e
    public final boolean h(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = (h) this.f7086d.getValue();
        String uri = request.getUrl().toString();
        WeakReference weakReference = new WeakReference(requireContext());
        hVar.getClass();
        return h.f(uri, weakReference);
    }

    @Override // ue.e
    public final boolean i(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        h hVar = (h) this.f7086d.getValue();
        WeakReference weakReference = new WeakReference(requireContext());
        hVar.getClass();
        return h.f(str, weakReference);
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
        g gVar = this.f7087e;
        if (gVar != null) {
            gVar.f19115b = null;
        }
        WebView webView = this.f7083a;
        if (webView != null) {
            webView.destroy();
        }
        this.f7083a = null;
        this.f7085c.e();
        this.f7084b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.f7083a;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f7083a;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f7084b = a.a.r(this);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f7085c);
        WebView webView = (WebView) view.findViewWithTag("webView");
        this.f7083a = webView;
        g gVar = this.f7087e;
        if (gVar != null) {
            gVar.m(webView, this);
        }
        WebView webView2 = this.f7083a;
        if (webView2 != null) {
            webView2.setBackgroundColor(Color.parseColor("#20003F"));
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#20003F"));
            Unit unit = Unit.f19194a;
            webView2.setLayerType(0, paint);
            c0.t(d1.g(this), null, null, new b(this, webView2, null, 2), 3);
        }
        ((h) this.f7086d.getValue()).getClass();
        cd.b bVar = new cd.b(6);
        new b0().c("open_bookmaker", null);
        bVar.n("bookmaker", "open");
    }

    @Override // ue.e
    public final void w(String str) {
        this.f7085c.f(true);
    }

    @Override // ue.e
    public final void z(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
    }

    @Override // ue.e
    public final /* bridge */ void o(int i5) {
    }
}
