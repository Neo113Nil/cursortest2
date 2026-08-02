package io.sentry.android.core;

import android.app.Activity;
import androidx.appcompat.widget.q4;
import androidx.core.app.FrameMetricsAggregator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q4 f15542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f15543c;

    public /* synthetic */ b(q4 q4Var, Activity activity, int i5) {
        this.f15541a = i5;
        this.f15542b = q4Var;
        this.f15543c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15541a) {
            case 0:
                ((FrameMetricsAggregator) ((io.sentry.util.f) this.f15542b.f892b).a()).f1255a.e(this.f15543c);
                break;
            default:
                ((FrameMetricsAggregator) ((io.sentry.util.f) this.f15542b.f892b).a()).f1255a.o(this.f15543c);
                break;
        }
    }
}
