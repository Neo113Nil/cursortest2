package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0.e f20344a = new Y0.e();

    public static final Ph.P a(Q q10) {
        Y0.a aVar;
        Intrinsics.checkNotNullParameter(q10, "<this>");
        synchronized (f20344a) {
            aVar = (Y0.a) q10.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                aVar = Y0.b.a();
                q10.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar);
            }
        }
        return aVar;
    }
}
