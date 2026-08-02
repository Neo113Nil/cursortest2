package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.v;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.oep;

/* compiled from: LifecycleDispatcher.kt */
/* loaded from: classes12.dex */
public final class k {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    public static final class a extends oep {
        @Override // xsna.oep, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            int i = v.c;
            v.a.b(activity);
        }
    }
}
