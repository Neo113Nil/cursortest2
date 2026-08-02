package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends m {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class a extends m {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i5 = processLifecycleOwner.f2125a + 1;
            processLifecycleOwner.f2125a = i5;
            if (i5 == 1 && processLifecycleOwner.f2128d) {
                processLifecycleOwner.f2130f.e(w.ON_START);
                processLifecycleOwner.f2128d = false;
            }
        }
    }

    public t0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i5 = z0.f2262b;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((z0) findFragmentByTag).f2263a = this.this$0.f2132h;
        }
    }

    @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i5 = processLifecycleOwner.f2126b - 1;
        processLifecycleOwner.f2126b = i5;
        if (i5 == 0) {
            Handler handler = processLifecycleOwner.f2129e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(processLifecycleOwner.f2131g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        s0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i5 = processLifecycleOwner.f2125a - 1;
        processLifecycleOwner.f2125a = i5;
        if (i5 == 0 && processLifecycleOwner.f2127c) {
            processLifecycleOwner.f2130f.e(w.ON_STOP);
            processLifecycleOwner.f2128d = true;
        }
    }
}
