package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import com.unity3d.ads.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ns3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xdi b;
    public final /* synthetic */ WebView c;

    public ns3(xdi xdiVar, WebView webView) {
        this.b = xdiVar;
        this.c = webView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9 = this.a;
        WebView webView = this.c;
        xdi xdiVar = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                DisplayMetrics displayMetrics = webView.getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int C = iz8.C(displayMetrics, webView.getWidth());
                int C2 = iz8.C(displayMetrics, webView.getHeight());
                l2f l2fVar = new l2f(C, C2, iz8.C(displayMetrics, webView.getLeft()), iz8.C(displayMetrics, webView.getTop()));
                xdiVar.n().CurrentPosition = l2fVar;
                xdiVar.n().DefaultPosition = l2fVar;
                xdiVar.n().State = BuildConfig.FLAVOR;
                StringBuilder sb = new StringBuilder();
                t33.f(sb, xdiVar.n().CurrentPosition, true);
                t33.h(xdiVar.n().State, sb);
                t33.d(sb, new ljh(C, C2));
                t33.e(BuildConfig.FLAVOR, sb);
                webView.evaluateJavascript(sb.toString(), null);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
                displayMetrics2.getClass();
                int C3 = iz8.C(displayMetrics2, view.getWidth());
                int C4 = iz8.C(displayMetrics2, view.getHeight());
                xdiVar.n().CurrentPosition = new l2f(C3, C4, iz8.C(displayMetrics2, view.getLeft()), iz8.C(displayMetrics2, view.getTop()));
                if (Intrinsics.c(xdiVar.n().PlacementType, "inline")) {
                    z = !Intrinsics.c(xdiVar.n().State, "resized");
                    xdiVar.n().State = "resized";
                } else {
                    z = false;
                }
                StringBuilder sb2 = new StringBuilder();
                t33.f(sb2, xdiVar.n().CurrentPosition, false);
                if (z) {
                    t33.h(xdiVar.n().State, sb2);
                }
                t33.d(sb2, new ljh(C3, C4));
                if (z) {
                    t33.e("resized", sb2);
                }
                webView.evaluateJavascript(sb2.toString(), null);
                break;
        }
    }

    public ns3(WebView webView, xdi xdiVar) {
        this.c = webView;
        this.b = xdiVar;
    }
}
