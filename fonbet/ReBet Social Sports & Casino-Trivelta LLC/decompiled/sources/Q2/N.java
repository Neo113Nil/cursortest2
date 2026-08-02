package Q2;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f9252a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f9253b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f9254c;

    public N(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f9252a = workerClassName;
        this.f9253b = workerParameters;
        this.f9254c = throwable;
    }
}
