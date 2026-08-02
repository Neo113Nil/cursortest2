package v4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import c4.v;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final double f24412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kh.h f24413b;

    public a(kh.h hVar, v vVar) {
        this.f24413b = hVar;
        c4.r rVar = vVar.f3628a;
        c4.k kVar = c4.q.f3598a;
        Object obj = rVar.f3603b.f21966n.f3595a.get(c4.q.f3601d);
        this.f24412a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d10 = this.f24412a;
        if (d10 == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        kh.h hVar = this.f24413b;
        v vVar = (v) ((WeakReference) hVar.f19119b).get();
        if (vVar == null) {
            hVar.e();
            return;
        }
        l4.c d11 = vVar.d();
        if (d11 != null) {
            synchronized (d11.f19355c) {
                j = d11.f19353a.f19359a;
            }
            d11.d((long) (d10 * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.f24412a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        kh.h hVar = this.f24413b;
        v vVar = (v) ((WeakReference) hVar.f19119b).get();
        if (vVar == null) {
            hVar.e();
            return;
        }
        l4.c d10 = vVar.d();
        if (d10 != null) {
            synchronized (d10.f19355c) {
                j = d10.f19353a.f19359a;
            }
            d10.d(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
