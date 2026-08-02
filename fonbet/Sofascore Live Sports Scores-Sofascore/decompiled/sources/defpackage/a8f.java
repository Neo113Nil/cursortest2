package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a8f extends yl5 {
    final /* synthetic */ b8f this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends yl5 {
        final /* synthetic */ b8f this$0;

        public a(b8f b8fVar) {
            this.this$0 = b8fVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            b8f b8fVar = this.this$0;
            int i = b8fVar.a + 1;
            b8fVar.a = i;
            if (i == 1 && b8fVar.d) {
                b8fVar.f.g(d6b.ON_START);
                b8fVar.d = false;
            }
        }
    }

    public a8f(b8f b8fVar) {
        this.this$0 = b8fVar;
    }

    @Override // defpackage.yl5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = jzf.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((jzf) findFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // defpackage.yl5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        b8f b8fVar = this.this$0;
        int i = b8fVar.b - 1;
        b8fVar.b = i;
        if (i == 0) {
            Handler handler = b8fVar.e;
            handler.getClass();
            handler.postDelayed(b8fVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        eq3.J(activity, new a(this.this$0));
    }

    @Override // defpackage.yl5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        b8f b8fVar = this.this$0;
        int i = b8fVar.a - 1;
        b8fVar.a = i;
        if (i == 0 && b8fVar.c) {
            b8fVar.f.g(d6b.ON_STOP);
            b8fVar.d = true;
        }
    }
}
