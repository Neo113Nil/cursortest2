package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.isn;
import defpackage.jsn;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxx extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context a;
    public View b;

    public zzcxx(Context context) {
        super(context);
        this.a = context;
    }

    public static zzcxx a(Context context, View view, zzfld zzfldVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxx zzcxxVar = new zzcxx(context);
        List list = zzfldVar.u;
        boolean isEmpty = list.isEmpty();
        Context context2 = zzcxxVar.a;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((zzfle) list.get(0)).a;
            float f2 = displayMetrics.density;
            zzcxxVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r5.b * f2)));
        }
        zzcxxVar.b = view;
        zzcxxVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        jsn jsnVar = new jsn(zzcxxVar, zzcxxVar);
        View view2 = (View) ((WeakReference) jsnVar.b).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            jsnVar.R(viewTreeObserver);
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        isn isnVar = new isn(zzcxxVar, zzcxxVar);
        View view3 = (View) ((WeakReference) isnVar.b).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            isnVar.R(viewTreeObserver3);
        }
        JSONObject jSONObject = zzfldVar.h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxxVar.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxxVar.b(optJSONObject2, relativeLayout, 12);
        }
        zzcxxVar.addView(relativeLayout);
        return zzcxxVar;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.a;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, (int) optDouble);
        textView.setPadding(0, zzE, 0, zzE);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        com.google.android.gms.ads.internal.client.zzay.zza();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.b.setY(-r0[1]);
    }
}
