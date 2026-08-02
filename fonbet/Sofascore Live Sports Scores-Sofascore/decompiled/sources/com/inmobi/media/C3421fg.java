package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import defpackage.a70;
import defpackage.h2d;
import defpackage.lu3;
import defpackage.o13;
import defpackage.sq3;
import defpackage.w5m;
import defpackage.xw3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3421fg implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x0046, B:13:0x004a, B:15:0x0053, B:19:0x0067, B:21:0x0076, B:22:0x007b, B:24:0x008b, B:25:0x008e, B:17:0x0070), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Activity activity, sq3 sq3Var) {
        C3370dg c3370dg;
        int i;
        h2d h2dVar;
        WeakReference weakReference;
        try {
            if (sq3Var instanceof C3370dg) {
                c3370dg = (C3370dg) sq3Var;
                int i2 = c3370dg.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3370dg.e = i2 - Integer.MIN_VALUE;
                    Object obj = c3370dg.c;
                    lu3 lu3Var = lu3.a;
                    i = c3370dg.e;
                    int i3 = 1;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = C3447gg.b;
                        c3370dg.a = activity;
                        c3370dg.b = h2dVar;
                        c3370dg.e = 1;
                        if (h2dVar.e(c3370dg) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = c3370dg.b;
                        Activity activity2 = c3370dg.a;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                        activity = activity2;
                    }
                    if (C3447gg.a != null) {
                        int size = C3447gg.c.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                weakReference = null;
                                break;
                            }
                            ArrayList arrayList = C3447gg.c;
                            if (Intrinsics.c((Context) ((WeakReference) arrayList.get(i4)).get(), activity)) {
                                weakReference = (WeakReference) arrayList.get(i4);
                                break;
                            }
                            i4++;
                        }
                        if (weakReference != null) {
                            C3447gg.c.remove(weakReference);
                        }
                        ArrayList arrayList2 = C3447gg.c;
                        o13.A(arrayList2, new w5m(i3));
                        if (arrayList2.isEmpty()) {
                            a(activity);
                        }
                        Unit unit = Unit.a;
                    }
                    h2dVar.f(null);
                    return Unit.a;
                }
            }
            if (C3447gg.a != null) {
            }
            h2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3370dg = new C3370dg(this, sq3Var);
        Object obj2 = c3370dg.c;
        lu3 lu3Var2 = lu3.a;
        i = c3370dg.e;
        int i32 = 1;
        if (i != 0) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        xw3.L(L9.c, null, null, new C3395eg(this, activity, null), 3);
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

    public static final boolean a(WeakReference weakReference) {
        weakReference.getClass();
        return weakReference.get() == null;
    }

    public final void a(Activity activity) {
        Picasso picasso = C3447gg.a;
        Objects.toString(C3447gg.a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = C3447gg.a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        C3447gg.a = null;
    }
}
