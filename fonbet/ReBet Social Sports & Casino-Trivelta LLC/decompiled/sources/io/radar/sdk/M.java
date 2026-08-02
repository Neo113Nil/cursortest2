package io.radar.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import io.radar.sdk.C4589c;
import io.radar.sdk.T;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes3.dex */
public final class M implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final a f49706d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static boolean f49707e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49708a;

    /* renamed from: b, reason: collision with root package name */
    public int f49709b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49710c = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return M.f49707e;
        }

        public a() {
        }
    }

    public static final class b implements T.InterfaceC4580d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f49711a;

        public b(Activity activity) {
            this.f49711a = activity;
        }

        @Override // io.radar.sdk.T.InterfaceC4580d
        public void a(C4589c.EnumC4607s status, Gh.e eVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (eVar == null) {
                return;
            }
            if (status == C4589c.EnumC4607s.SUCCESS) {
                C4589c.f49918a.x().O(eVar.b());
                L0 l02 = L0.f49705a;
                Context applicationContext = this.f49711a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                l02.W(applicationContext, eVar.b().b());
            }
            L0 l03 = L0.f49705a;
            Context applicationContext2 = this.f49711a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "activity.applicationContext");
            Gh.y s10 = l03.s(applicationContext2);
            if (s10.g() || s10.f()) {
                C4589c.Y0(null, 1, null);
                if (s10.f()) {
                    Context applicationContext3 = this.f49711a.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "activity.applicationContext");
                    if (l03.w(applicationContext3)) {
                        return;
                    }
                    C4589c.N0(C4589c.C());
                }
            }
        }
    }

    public static final class c extends View {

        /* renamed from: a, reason: collision with root package name */
        public Map f49712a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f49713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, Context context) {
            super(context);
            this.f49713b = activity;
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent event) {
            InputDevice device;
            Intrinsics.checkNotNullParameter(event, "event");
            try {
                device = InputDevice.getDevice(event.getDeviceId());
            } catch (Exception e10) {
                Log.e("RadarActivityLifecycle", e10.getMessage(), e10);
            }
            if (event.getToolType(0) != 0) {
                if (device != null && device.isVirtual()) {
                }
                return super.dispatchTouchEvent(event);
            }
            L0 l02 = L0.f49705a;
            Context applicationContext = this.f49713b.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            l02.X(applicationContext, true);
            return super.dispatchTouchEvent(event);
        }
    }

    public M(boolean z10) {
        this.f49708a = z10;
    }

    public final void b(Activity activity) {
        try {
            if (AbstractC5338c.checkSelfPermission(activity.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == -1 && androidx.core.app.b.i(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                L0 l02 = L0.f49705a;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                l02.R(applicationContext, true);
            }
            if (AbstractC5338c.checkSelfPermission(activity.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == -1 && androidx.core.app.b.i(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                L0 l03 = L0.f49705a;
                Context applicationContext2 = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "activity.applicationContext");
                l03.R(applicationContext2, true);
            }
        } catch (Exception e10) {
            Log.e("RadarActivityLifecycle", e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.w("RadarActivityLifecycle", "ON CREATE " + this.f49709b);
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int max = Math.max(this.f49709b - 1, 0);
        this.f49709b = max;
        f49707e = max > 0;
        b(activity);
        C4589c.a0();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f49709b == 0 && !this.f49710c) {
            try {
                L0 l02 = L0.f49705a;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                if (l02.f0(applicationContext)) {
                    C4589c.f49918a.l().e("resume", false, new b(activity));
                } else {
                    Context applicationContext2 = activity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "activity.applicationContext");
                    Gh.y s10 = l02.s(applicationContext2);
                    if (s10.g() || s10.f()) {
                        C4589c.Y0(null, 1, null);
                        if (s10.f()) {
                            Context applicationContext3 = activity.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext3, "activity.applicationContext");
                            if (!l02.w(applicationContext3)) {
                                C4589c.N0(C4589c.C());
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e("RadarActivityLifecycle", e10.getMessage(), e10);
            }
        }
        int i10 = this.f49709b + 1;
        this.f49709b = i10;
        this.f49710c = false;
        f49707e = i10 > 0;
        C4589c.f49918a.Z();
        b(activity);
        if (this.f49708a) {
            activity.addContentView(new c(activity, activity.getApplicationContext()), new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        b(activity);
        C4589c.W();
    }
}
