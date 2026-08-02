package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import defpackage.bnl;
import defpackage.qdj;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y5 extends RelativeLayout {
    public final Activity a;
    public int b;
    public C3360d6 c;
    public InterfaceC3308b6 d;
    public InterfaceC3944zl e;
    public InterfaceC3880x9 f;
    public Wo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        this.b = -1;
    }

    public static final boolean b(Y5 y5, View view, MotionEvent motionEvent) {
        C3334c6 c3334c6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        C3360d6 c3360d6 = y5.c;
        if (c3360d6 != null && (c3334c6 = c3360d6.h) != null) {
            C3334c6.a(c3334c6, 5, true, null, 12);
        }
        InterfaceC3308b6 interfaceC3308b6 = y5.d;
        if (interfaceC3308b6 != null) {
            V8.a(((U8) interfaceC3308b6).a);
        }
        return true;
    }

    public static final boolean c(Y5 y5, View view, MotionEvent motionEvent) {
        C3360d6 c3360d6 = y5.c;
        if (c3360d6 == null) {
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        if (c3360d6.canGoForward()) {
            c3360d6.goForward();
        }
        return true;
    }

    public static final boolean d(Y5 y5, View view, MotionEvent motionEvent) {
        C3334c6 c3334c6;
        C3334c6 c3334c62;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        C3360d6 c3360d6 = y5.c;
        if (c3360d6 != null && (c3334c62 = c3360d6.h) != null) {
            C3334c6.a(c3334c62, 6, true, null, 12);
        }
        C3360d6 c3360d62 = y5.c;
        if (c3360d62 != null && (c3334c6 = c3360d62.h) != null) {
            C3334c6.a(c3334c6, 6, true, null, 12);
        }
        C3360d6 c3360d63 = y5.c;
        if (c3360d63 != null) {
            c3360d63.reload();
        }
        return true;
    }

    public final void a(String str, Z5 z5, boolean z, long j, String str2, String str3, String str4, C3571lb c3571lb) {
        str.getClass();
        z5.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        if (this.c == null) {
            Context context = getContext();
            context.getClass();
            C3360d6 c3360d6 = new C3360d6(context, j, str2, str3, str4, new qdj(this, 29), this.f);
            this.c = c3360d6;
            c3360d6.setId(65517);
        }
        C3360d6 c3360d62 = this.c;
        if (c3360d62 != null) {
            c3360d62.setLandingPageTelemetryControlInfo(c3571lb);
        }
        if (this.b != str.hashCode()) {
            Z5 z52 = Z5.URL;
            C3360d6 c3360d63 = this.c;
            if (z5 == z52) {
                if (c3360d63 != null) {
                    c3360d63.loadUrl(str);
                }
            } else if (c3360d63 != null) {
                c3360d63.loadData(str, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            C3360d6 c3360d64 = this.c;
            if (c3360d64 != null) {
                c3360d64.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.c, layoutParams);
            }
        }
        this.b = str.hashCode();
        if (!z) {
            View findViewById = findViewById(65533);
            if (findViewById != null) {
                removeView(findViewById);
                return;
            }
            return;
        }
        if (findViewById(65533) != null) {
            return;
        }
        float f = R5.d().c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (N3.a(this.a)) {
            Wo wo = this.g;
            if (wo != null) {
                wo.a();
            }
            this.g = new Wo(this.a, new X5(layoutParams2), this.f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    @Nullable
    public final InterfaceC3944zl getUserLeftApplicationListener() {
        return this.e;
    }

    public final void setEmbeddedBrowserUpdateListener(@NotNull InterfaceC3308b6 interfaceC3308b6) {
        interfaceC3308b6.getClass();
        this.d = interfaceC3308b6;
    }

    public final void setLogger(@NotNull InterfaceC3880x9 interfaceC3880x9) {
        interfaceC3880x9.getClass();
        this.f = interfaceC3880x9;
    }

    public final void setUserLeftApplicationListener(@Nullable InterfaceC3944zl interfaceC3944zl) {
        this.e = interfaceC3944zl;
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        C3720r5 c3720r5 = new C3720r5(context, (byte) 6, this.f);
        c3720r5.setId(1048283);
        c3720r5.setOnTouchListener(new bnl(this, 3));
        linearLayout.addView(c3720r5, layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        C3720r5 c3720r5 = new C3720r5(context, (byte) 2, this.f);
        c3720r5.setId(65516);
        c3720r5.setOnTouchListener(new bnl(this, 1));
        linearLayout.addView(c3720r5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        C3720r5 c3720r5 = new C3720r5(context, (byte) 3, this.f);
        c3720r5.setId(65502);
        c3720r5.setOnTouchListener(new bnl(this, 0));
        linearLayout.addView(c3720r5, layoutParams);
    }

    public static final Unit a(Y5 y5, JSONObject jSONObject) {
        jSONObject.getClass();
        InterfaceC3308b6 interfaceC3308b6 = y5.d;
        if (interfaceC3308b6 != null) {
            jSONObject.getClass();
            C c = ((U8) interfaceC3308b6).a.b;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c instanceof GestureDetectorOnGestureListenerC3889xi ? (GestureDetectorOnGestureListenerC3889xi) c : null;
            if (gestureDetectorOnGestureListenerC3889xi != null) {
                gestureDetectorOnGestureListenerC3889xi.c(jSONObject);
            }
        }
        return Unit.a;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        C3720r5 c3720r5 = new C3720r5(context, (byte) 4, this.f);
        c3720r5.setId(65503);
        c3720r5.setOnTouchListener(new bnl(this, 2));
        linearLayout.addView(c3720r5, layoutParams);
    }

    public static final boolean a(Y5 y5, View view, MotionEvent motionEvent) {
        C3360d6 c3360d6 = y5.c;
        if (c3360d6 == null) {
            InterfaceC3308b6 interfaceC3308b6 = y5.d;
            if (interfaceC3308b6 != null) {
                V8.a(((U8) interfaceC3308b6).a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c3360d6.canGoBack()) {
                c3360d6.goBack();
            } else {
                InterfaceC3308b6 interfaceC3308b62 = y5.d;
                if (interfaceC3308b62 != null) {
                    V8.a(((U8) interfaceC3308b62).a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
