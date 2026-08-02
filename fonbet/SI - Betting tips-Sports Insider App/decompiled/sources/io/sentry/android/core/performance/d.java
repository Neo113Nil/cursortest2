package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15798b;

    public /* synthetic */ d(f fVar, int i5) {
        this.f15797a = i5;
        this.f15798b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15797a) {
            case 0:
                this.f15798b.e();
                break;
            case 1:
                this.f15798b.e();
                break;
            case 2:
                new Handler(Looper.getMainLooper()).post(new d(this.f15798b, 3));
                break;
            default:
                f fVar = this.f15798b;
                if (fVar.j.get() == 0) {
                    fVar.f15803b = false;
                    break;
                }
                break;
        }
    }
}
