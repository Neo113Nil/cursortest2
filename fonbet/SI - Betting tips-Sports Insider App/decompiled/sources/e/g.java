package e;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f8408a = SystemClock.uptimeMillis() + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f8409b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f8411d;

    public g(j jVar) {
        this.f8411d = jVar;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f8410c) {
            return;
        }
        this.f8410c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f8409b = runnable;
        View decorView = this.f8411d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (!this.f8410c) {
            decorView.postOnAnimation(new aa.c(16, this));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f8409b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f8408a) {
                this.f8410c = false;
                this.f8411d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f8409b = null;
        t tVar = (t) this.f8411d.f8422g.getValue();
        synchronized (tVar.f8438b) {
            z5 = tVar.f8439c;
        }
        if (z5) {
            this.f8410c = false;
            this.f8411d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8411d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
