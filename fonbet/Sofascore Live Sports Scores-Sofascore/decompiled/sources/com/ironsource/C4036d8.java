package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import defpackage.ogj;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4036d8 extends FrameLayout implements E8 {
    private static final String b = "IronSourceAdContainer";
    private C4126i8 a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.d8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4036d8 c4036d8 = C4036d8.this;
            c4036d8.removeView(c4036d8.a.getPresentingView());
            C4036d8.this.a.a(this.a, this.b);
            C4036d8.this.a = null;
        }
    }

    public C4036d8(C4126i8 c4126i8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4126i8.c().c(), c4126i8.c().a()));
        this.a = c4126i8;
        addView(c4126i8.getPresentingView());
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.b().a().getJSONObject(C4018c8.p).getJSONObject(C4018c8.s);
        } catch (Exception e) {
            C4157k4.d().a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.a());
        this.a.b().a(U3.h.S, jSONObject);
    }

    @Override // com.ironsource.E8
    public synchronized void a(String str, String str2) {
        C4126i8 c4126i8 = this.a;
        if (c4126i8 != null && c4126i8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            O7.a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.E8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.E8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C4000b8 getSize() {
        C4126i8 c4126i8 = this.a;
        return c4126i8 != null ? c4126i8.c() : new C4000b8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C4126i8 c4126i8 = this.a;
        if (c4126i8 == null) {
            return;
        }
        try {
            c4126i8.b().a(C4018c8.k, i, isShown());
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C4126i8 c4126i8 = this.a;
        if (c4126i8 == null) {
            return;
        }
        try {
            c4126i8.b().a(C4018c8.l, i, isShown());
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C4036d8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4036d8(Context context) {
        super(context);
    }

    public void a() throws Exception {
        C4126i8 c4126i8 = this.a;
        if (c4126i8 != null && c4126i8.b() != null) {
            b();
        } else {
            ogj.k("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
    }

    @Override // com.ironsource.E8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.E8
    public void a(String str, String str2, String str3) {
        C4126i8 c4126i8 = this.a;
        if (c4126i8 == null) {
            return;
        }
        c4126i8.a(str, str2, str3);
    }

    @Override // com.ironsource.E8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
