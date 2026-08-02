package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c1;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.h0;
import io.sentry.k1;
import io.sentry.q6;
import io.sentry.v6;
import io.sentry.w6;
import io.sentry.y3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15647a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f15648b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f15649c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.internal.gestures.b f15650d = null;

    /* renamed from: e, reason: collision with root package name */
    public k1 f15651e = null;

    /* renamed from: f, reason: collision with root package name */
    public e f15652f;

    /* renamed from: g, reason: collision with root package name */
    public final f f15653g;

    public g(Activity activity, y3 y3Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f15652f = eVar;
        f fVar = new f();
        fVar.f15643a = eVar;
        fVar.f15645c = 0.0f;
        fVar.f15646d = 0.0f;
        this.f15653g = fVar;
        this.f15647a = new WeakReference(activity);
        this.f15648b = y3Var;
        this.f15649c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.b bVar, e eVar, Map map, MotionEvent motionEvent) {
        if (this.f15649c.isEnableUserInteractionBreadcrumbs()) {
            int i5 = d.f15642a[eVar.ordinal()];
            String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? "unknown" : "swipe" : "scroll" : "click";
            h0 h0Var = new h0();
            h0Var.d(motionEvent, "android:motionEvent");
            h0Var.d(bVar.f16519a.get(), "android:view");
            String str2 = bVar.f16521c;
            String str3 = bVar.f16520b;
            io.sentry.e eVar2 = new io.sentry.e();
            eVar2.f16334e = "user";
            eVar2.f16336g = "ui.".concat(str);
            if (str2 != null) {
                eVar2.c(str2, "view.id");
            }
            if (str3 != null) {
                eVar2.c(str3, "view.class");
            }
            for (Map.Entry entry : map.entrySet()) {
                eVar2.f16335f.put((String) entry.getKey(), entry.getValue());
            }
            eVar2.f16338i = b5.INFO;
            this.f15648b.h(eVar2, h0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.f15647a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f15649c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, c1.n("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, c1.n("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().h(b5.DEBUG, c1.n("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.b bVar, e eVar) {
        boolean z5 = eVar == e.Click || !(eVar == this.f15652f && bVar.equals(this.f15650d));
        SentryAndroidOptions sentryAndroidOptions = this.f15649c;
        boolean isTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        b1 b1Var = this.f15648b;
        if (!isTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z5) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    b1Var.y(new io.sentry.clientreport.a(4));
                }
                this.f15650d = bVar;
                this.f15652f = eVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f15647a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = bVar.f16521c;
        if (str == null) {
            y4.a.C(null, "UiElement.tag can't be null");
            str = null;
        }
        k1 k1Var = this.f15651e;
        if (k1Var != null) {
            if (!z5 && !k1Var.d()) {
                sentryAndroidOptions.getLogger().h(b5.DEBUG, c1.n("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f15651e.t();
                    return;
                }
                return;
            }
            d(q6.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        int i5 = d.f15642a[eVar.ordinal()];
        String concat = "ui.action.".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "unknown" : "swipe" : "scroll" : "click");
        w6 w6Var = new w6();
        w6Var.f17238f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        w6Var.f17240h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        w6Var.f17239g = sentryAndroidOptions.getIdleTimeout();
        w6Var.f4027a = true;
        w6Var.f4030d = "auto.ui.gesture_listener." + bVar.f16522d;
        k1 r5 = b1Var.r(new v6(str2, io.sentry.protocol.h0.COMPONENT, concat, null), w6Var);
        b1Var.y(new com.google.firebase.messaging.g(11, this, r5));
        this.f15651e = r5;
        this.f15650d = bVar;
        this.f15652f = eVar;
    }

    public final void d(q6 q6Var) {
        k1 k1Var = this.f15651e;
        if (k1Var != null) {
            if (k1Var.getStatus() == null) {
                this.f15651e.h(q6Var);
            } else {
                this.f15651e.l();
            }
        }
        this.f15648b.y(new c(0, this));
        this.f15651e = null;
        if (this.f15650d != null) {
            this.f15650d = null;
        }
        this.f15652f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.f15653g;
        fVar.f15644b = null;
        fVar.f15643a = e.Unknown;
        fVar.f15645c = 0.0f;
        fVar.f15646d = 0.0f;
        fVar.f15645c = motionEvent.getX();
        fVar.f15646d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        this.f15653g.f15643a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        View b10 = b("onScroll");
        if (b10 != null && motionEvent != null) {
            f fVar = this.f15653g;
            if (fVar.f15643a == e.Unknown) {
                float x10 = motionEvent.getX();
                float y5 = motionEvent.getY();
                io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f15649c;
                io.sentry.internal.gestures.b a7 = i.a(sentryAndroidOptions, b10, x10, y5, aVar);
                if (a7 == null) {
                    sentryAndroidOptions.getLogger().h(b5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.f15643a = e.Scroll;
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                StringBuilder sb2 = new StringBuilder("Scroll target found: ");
                String str = a7.f16521c;
                if (str == null) {
                    y4.a.C(null, "UiElement.tag can't be null");
                    str = null;
                }
                sb2.append(str);
                logger.h(b5Var, sb2.toString(), new Object[0]);
                fVar.f15644b = a7;
                fVar.f15643a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View b10 = b("onSingleTapUp");
        if (b10 != null && motionEvent != null) {
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f15649c;
            io.sentry.internal.gestures.b a7 = i.a(sentryAndroidOptions, b10, x10, y5, aVar);
            if (a7 == null) {
                sentryAndroidOptions.getLogger().h(b5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(a7, eVar, Collections.EMPTY_MAP, motionEvent);
            c(a7, eVar);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
