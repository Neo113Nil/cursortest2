package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4331g8 extends FrameLayout implements H8 {
    private static final String b = "IronSourceAdContainer";
    private C4420l8 a;

    /* renamed from: com.ironsource.g8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4331g8 c4331g8 = C4331g8.this;
            c4331g8.removeView(c4331g8.a.getPresentingView());
            C4331g8.this.a.a(this.a, this.b);
            C4331g8.this.a = null;
        }
    }

    public C4331g8(Context context) {
        super(context);
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C4295e8 getSize() {
        C4420l8 c4420l8 = this.a;
        return c4420l8 != null ? c4420l8.c() : new C4295e8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C4420l8 c4420l8 = this.a;
        if (c4420l8 == null) {
            return;
        }
        try {
            c4420l8.b().a(C4313f8.k, i, isShown());
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C4420l8 c4420l8 = this.a;
        if (c4420l8 == null) {
            return;
        }
        try {
            c4420l8.b().a(C4313f8.l, i, isShown());
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C4331g8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.b().a().getJSONObject(C4313f8.p).getJSONObject(C4313f8.s);
        } catch (Exception e) {
            C4452n4.d().a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.a());
        this.a.b().a(X3.h.S, jSONObject);
    }

    public void a() throws Exception {
        C4420l8 c4420l8 = this.a;
        if (c4420l8 == null || c4420l8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    public C4331g8(C4420l8 c4420l8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4420l8.c().c(), c4420l8.c().a()));
        this.a = c4420l8;
        addView(c4420l8.getPresentingView());
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        C4420l8 c4420l8 = this.a;
        if (c4420l8 != null && c4420l8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            R7.a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        C4420l8 c4420l8 = this.a;
        if (c4420l8 == null) {
            return;
        }
        c4420l8.a(str, str2, str3);
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
