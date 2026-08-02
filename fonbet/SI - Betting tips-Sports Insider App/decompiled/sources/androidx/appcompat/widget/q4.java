package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.button.MaterialButton;
import com.sports.insider.R;
import io.appmetrica.analytics.impl.ap;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q4 implements b3.a, g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f891a;

    /* renamed from: b, reason: collision with root package name */
    public Object f892b;

    /* renamed from: c, reason: collision with root package name */
    public Object f893c;

    /* renamed from: d, reason: collision with root package name */
    public Object f894d;

    /* renamed from: e, reason: collision with root package name */
    public Object f895e;

    /* renamed from: f, reason: collision with root package name */
    public Object f896f;

    /* renamed from: g, reason: collision with root package name */
    public Object f897g;

    /* renamed from: h, reason: collision with root package name */
    public Object f898h;

    public /* synthetic */ q4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i5) {
        this.f891a = i5;
        this.f892b = obj;
        this.f893c = obj2;
        this.f894d = obj3;
        this.f895e = obj4;
        this.f896f = obj5;
        this.f897g = obj6;
        this.f898h = obj7;
    }

    public void a(Activity activity) {
        io.sentry.r a7 = ((io.sentry.util.a) this.f897g).a();
        try {
            if (!c()) {
                a7.close();
                return;
            }
            d(new io.sentry.android.core.b(this, activity, 0), "FrameMetricsAggregator.add");
            io.sentry.android.core.c b10 = b();
            if (b10 != null) {
                ((WeakHashMap) this.f895e).put(activity, b10);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.android.core.c b() {
        int i5;
        int i10;
        SparseIntArray sparseIntArray;
        if (!c() || !((Boolean) ((io.sentry.util.f) this.f898h).a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] m6 = ((FrameMetricsAggregator) ((io.sentry.util.f) this.f892b).a()).f1255a.m();
        int i11 = 0;
        if (m6 == null || m6.length <= 0 || (sparseIntArray = m6[0]) == null) {
            i5 = 0;
            i10 = 0;
        } else {
            int i12 = 0;
            i5 = 0;
            i10 = 0;
            while (i11 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i11);
                int valueAt = sparseIntArray.valueAt(i11);
                i12 += valueAt;
                if (keyAt > 700) {
                    i10 += valueAt;
                } else if (keyAt > 16) {
                    i5 += valueAt;
                }
                i11++;
            }
            i11 = i12;
        }
        return new io.sentry.android.core.c(i11, i5, i10);
    }

    public boolean c() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f893c;
        return ((Boolean) ((io.sentry.util.f) this.f898h).a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public void d(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.e.f15712a.c()) {
                runnable.run();
                return;
            }
            io.sentry.android.core.n0 n0Var = (io.sentry.android.core.n0) this.f896f;
            ((Handler) n0Var.f15782a).post(new io.sentry.android.core.b1(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f893c).getLogger().h(b5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    @Override // ff.a
    public Object get() {
        int i5 = 1;
        return new k5.h((Context) ((ff.a) this.f892b).get(), (f5.d) ((ff.a) this.f893c).get(), (l5.d) ((ff.a) this.f894d).get(), (androidx.appcompat.app.v0) ((androidx.appcompat.app.v0) this.f895e).get(), (Executor) ((ff.a) this.f896f).get(), (m5.c) ((ff.a) this.f897g).get(), new m8.a(i5), new m7.b(i5), (l5.c) ((ff.a) this.f898h).get());
    }

    @Override // b3.a
    public View getRoot() {
        switch (this.f891a) {
            case 3:
                return (SwipeRefreshLayout) this.f892b;
            default:
                return (LinearLayout) this.f892b;
        }
    }

    public q4(int i5) {
        this.f891a = i5;
        switch (i5) {
            case 2:
                break;
            default:
                this.f892b = new AtomicBoolean();
                this.f893c = null;
                this.f894d = new HashMap(16, 1.0f);
                this.f895e = new HashMap(16, 1.0f);
                this.f896f = new HashMap(16, 1.0f);
                this.f897g = new HashMap(16, 1.0f);
                this.f898h = null;
                break;
        }
    }

    public q4(LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, ImageView imageView, TextView textView, TextView textView2) {
        this.f891a = 4;
        this.f892b = linearLayout;
        this.f893c = materialButton;
        this.f895e = linearLayout2;
        this.f896f = appCompatImageView;
        this.f897g = imageView;
        this.f894d = textView;
        this.f898h = textView2;
    }

    public q4(Context context) {
        this.f891a = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f895e = layoutParams;
        this.f896f = new Rect();
        this.f897g = new int[2];
        this.f898h = new int[2];
        this.f892b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f893c = inflate;
        this.f894d = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(q4.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public q4(io.sentry.hints.j jVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f891a = 6;
        io.sentry.android.core.n0 n0Var = new io.sentry.android.core.n0();
        this.f894d = new ConcurrentHashMap();
        this.f895e = new WeakHashMap();
        this.f897g = new io.sentry.util.a();
        this.f898h = new io.sentry.util.f(new io.sentry.android.core.internal.gestures.c(7, jVar, sentryAndroidOptions.getLogger()));
        this.f892b = new io.sentry.util.f(new ap(16));
        this.f893c = sentryAndroidOptions;
        this.f896f = n0Var;
    }

    public q4(Context context, e3.c configuration, com.google.firebase.messaging.x workTaskExecutor, l3.a foregroundProcessor, WorkDatabase workDatabase, m3.o workSpec, ArrayList tags) {
        this.f891a = 5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f893c = configuration;
        this.f894d = workTaskExecutor;
        this.f895e = foregroundProcessor;
        this.f896f = workDatabase;
        this.f897g = workSpec;
        this.f898h = tags;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f892b = applicationContext;
        new e3.l();
    }
}
