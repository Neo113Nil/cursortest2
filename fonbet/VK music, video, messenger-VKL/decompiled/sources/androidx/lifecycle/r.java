package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import xsna.oep;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes12.dex */
public final class r extends oep {
    final /* synthetic */ q this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a extends oep {
        final /* synthetic */ q this$0;

        public a(q qVar) {
            this.this$0 = qVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q qVar = this.this$0;
            int i = qVar.b + 1;
            qVar.b = i;
            if (i == 1 && qVar.e) {
                qVar.g.c(Lifecycle.Event.ON_START);
                qVar.e = false;
            }
        }
    }

    public r(q qVar) {
        this.this$0 = qVar;
    }

    @Override // xsna.oep, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = v.c;
            ((v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).b = this.this$0.i;
        }
    }

    @Override // xsna.oep, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q qVar = this.this$0;
        int i = qVar.c - 1;
        qVar.c = i;
        if (i == 0) {
            qVar.f.postDelayed(qVar.h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        q.a.a(activity, new a(this.this$0));
    }

    @Override // xsna.oep, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q qVar = this.this$0;
        int i = qVar.b - 1;
        qVar.b = i;
        if (i == 0 && qVar.d) {
            qVar.g.c(Lifecycle.Event.ON_STOP);
            qVar.e = true;
        }
    }
}
