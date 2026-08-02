package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.inmobi.ads.R;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.ba4;
import defpackage.da4;
import defpackage.ea4;
import defpackage.ja4;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y2 implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final U2 b;
    public final C3571lb c;
    public final String d;
    public final C3591m5 e;
    public final Context f;
    public final C3617n5 g;
    public boolean h;
    public final WeakReference i;
    public final WeakReference j;

    public Y2(String str, U2 u2, Context context, C3500ii c3500ii, Eh eh, C3571lb c3571lb, String str2) {
        str.getClass();
        context.getClass();
        eh.getClass();
        str2.getClass();
        this.a = str;
        this.b = u2;
        this.c = c3571lb;
        this.d = str2;
        C3591m5 c3591m5 = new C3591m5();
        this.e = c3591m5;
        this.g = new C3617n5(c3500ii, c3571lb);
        this.i = new WeakReference(c3500ii);
        this.j = new WeakReference(eh);
        c3591m5.c = this;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        AbstractC3424fj.a(context, this);
    }

    public final da4 a(U2 u2) {
        Bitmap bitmap;
        C3591m5 c3591m5 = this.e;
        ja4 ja4Var = c3591m5.d;
        if (ja4Var == null) {
            ba4 ba4Var = c3591m5.a;
            ja4Var = ba4Var != null ? ba4Var.c(new C3565l5(c3591m5)) : null;
            c3591m5.d = ja4Var;
        }
        da4 da4Var = new da4(ja4Var);
        Intent intent = da4Var.a;
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", 2);
        try {
            da4Var.e();
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        } catch (Error e) {
            e.getMessage();
        }
        if (u2.b) {
            Context context = this.f;
            int i = R.drawable.im_close_transparent;
            context.getClass();
            Drawable drawable = context.getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                bitmap.getClass();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas = new Canvas(createBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = createBitmap;
            }
            intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
        }
        T5 h = R5.h();
        Tf a = Uf.a(R5.g());
        if (a == Tf.LANDSCAPE || a == Tf.REVERSE_LANDSCAPE) {
            int i2 = (int) (h.a * u2.a);
            da4Var.d((int) (i2 * h.c));
            if (i2 <= 0) {
                a70.p("Invalid value for the initialWidthPx argument");
                return null;
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", i2);
        } else {
            da4Var.c((int) (((int) (h.b * u2.a)) * h.c), 2);
        }
        da4Var.f(true);
        return da4Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        C3591m5 c3591m5 = this.e;
        Context context = this.f;
        c3591m5.getClass();
        context.getClass();
        C3539k5 c3539k5 = c3591m5.b;
        if (c3539k5 != null) {
            context.unbindService(c3539k5);
            c3591m5.a = null;
        }
        c3591m5.b = null;
        c3591m5.c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    public final void a(Uri uri) {
        da4 da4Var;
        ja4 c;
        U2 u2 = this.b;
        if (u2 != null) {
            try {
                da4Var = a(u2);
            } catch (Error e) {
                e.getMessage();
                C3591m5 c3591m5 = this.e;
                ja4 ja4Var = c3591m5.d;
                if (ja4Var == null) {
                    ba4 ba4Var = c3591m5.a;
                    c = ba4Var != null ? ba4Var.c(new C3565l5(c3591m5)) : null;
                    c3591m5.d = c;
                    ja4Var = c;
                }
                da4Var = new da4(ja4Var);
                da4Var.f(true);
            }
        } else {
            C3591m5 c3591m52 = this.e;
            ja4 ja4Var2 = c3591m52.d;
            if (ja4Var2 == null) {
                ba4 ba4Var2 = c3591m52.a;
                c = ba4Var2 != null ? ba4Var2.c(new C3565l5(c3591m52)) : null;
                c3591m52.d = c;
                ja4Var2 = c;
            }
            da4Var = new da4(ja4Var2);
            da4Var.f(true);
        }
        Context context = this.f;
        ea4 a = da4Var.a();
        C3500ii c3500ii = (C3500ii) this.i.get();
        C3571lb c3571lb = this.c;
        Object obj = this.j.get();
        obj.getClass();
        AbstractC3513j5.a(context, a, uri, c3500ii, c3571lb, (Eh) obj, this.d);
    }

    public final C3321bj a() {
        return new C3321bj(new V2(this), new W2(), new X2(this));
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        C3500ii c3500ii = (C3500ii) this.i.get();
        if (c3500ii != null) {
            InterfaceC3880x9 interfaceC3880x9 = c3500ii.a.i;
            if (interfaceC3880x9 != null) {
                String str = GestureDetectorOnGestureListenerC3889xi.i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c3500ii.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", N3.a(i));
            jSONObject2.put(PlayerKt.E_SPORTS_TOP, N3.a(i2));
            jSONObject2.put("right", N3.a(i3));
            jSONObject2.put("bottom", N3.a(i4));
            jSONObject2.put("state", i5);
            Unit unit = Unit.a;
            jSONObject.put(TtmlNode.TAG_LAYOUT, jSONObject2);
            gestureDetectorOnGestureListenerC3889xi.b(jSONObject);
        }
    }
}
