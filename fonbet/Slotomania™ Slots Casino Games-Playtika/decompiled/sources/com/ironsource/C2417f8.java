package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2417f8 extends FrameLayout implements G8 {
    private static final String b = "IronSourceAdContainer";
    private C2506k8 a;

    /* renamed from: com.ironsource.f8$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2417f8 c2417f8 = C2417f8.this;
            c2417f8.removeView(c2417f8.a.getPresentingView());
            C2417f8.this.a.a(this.a, this.b);
            C2417f8.this.a = null;
        }
    }

    public C2417f8(Context context) {
        super(context);
    }

    private void b() throws Exception {
        JSONObject jsonObjectInit;
        try {
            jsonObjectInit = this.a.b().a().getJSONObject(C2399e8.p).getJSONObject(C2399e8.s);
        } catch (Exception e) {
            C2556n4.d().a(e);
            jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        }
        jsonObjectInit.put("adViewId", this.a.a());
        this.a.b().a(X3.h.S, jsonObjectInit);
    }

    public void a() throws Exception {
        C2506k8 c2506k8 = this.a;
        if (c2506k8 == null || c2506k8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.G8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.ironsource.G8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C2381d8 getSize() {
        C2506k8 c2506k8 = this.a;
        return c2506k8 != null ? c2506k8.c() : new C2381d8();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C2506k8 c2506k8 = this.a;
        if (c2506k8 == null) {
            return;
        }
        try {
            c2506k8.b().a(C2399e8.k, i, isShown());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C2506k8 c2506k8 = this.a;
        if (c2506k8 == null) {
            return;
        }
        try {
            c2506k8.b().a(C2399e8.l, i, isShown());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C2417f8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2417f8(C2506k8 c2506k8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c2506k8.c().c(), c2506k8.c().a()));
        this.a = c2506k8;
        addView(c2506k8.getPresentingView());
    }

    @Override // com.ironsource.G8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.G8
    public synchronized void a(String str, String str2) {
        C2506k8 c2506k8 = this.a;
        if (c2506k8 != null && c2506k8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            Q7.a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.G8
    public void a(String str, String str2, String str3) {
        C2506k8 c2506k8 = this.a;
        if (c2506k8 == null) {
            return;
        }
        c2506k8.a(str, str2, str3);
    }

    @Override // com.ironsource.G8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
