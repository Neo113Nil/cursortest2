package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.b0;
import io.sentry.android.replay.g;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16038a;

    /* renamed from: b, reason: collision with root package name */
    public final ReplayIntegration f16039b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16040c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f16041d;

    public b(b6 options, ReplayIntegration touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.f16038a = options;
        this.f16039b = touchRecorderCallback;
        this.f16040c = new ArrayList();
        this.f16041d = new io.sentry.util.a();
    }

    public final void a() {
        ArrayList arrayList = this.f16040c;
        r a7 = this.f16041d.a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    b(view);
                }
            }
            arrayList.clear();
            Unit unit = Unit.f19194a;
            h.g(a7, null);
        } finally {
        }
    }

    public final void b(View view) {
        Window r5 = rh.g.r(view);
        if (r5 == null) {
            this.f16038a.getLogger().h(b5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = r5.getCallback();
        if (callback instanceof a) {
            r5.setCallback(((a) callback).f16130a);
        }
    }

    @Override // io.sentry.android.replay.g
    public final void c(View root, boolean z5) {
        Intrinsics.checkNotNullParameter(root, "root");
        r a7 = this.f16041d.a();
        ArrayList arrayList = this.f16040c;
        try {
            if (z5) {
                arrayList.add(new WeakReference(root));
                b6 b6Var = this.f16038a;
                Window r5 = rh.g.r(root);
                if (r5 == null) {
                    b6Var.getLogger().h(b5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = r5.getCallback();
                    if (!(callback instanceof a)) {
                        r5.setCallback(new a(b6Var, this.f16039b, callback));
                    }
                }
                Unit unit = Unit.f19194a;
            } else {
                b(root);
                z.q(arrayList, new b0(1, root));
            }
            h.g(a7, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h.g(a7, th2);
                throw th3;
            }
        }
    }
}
