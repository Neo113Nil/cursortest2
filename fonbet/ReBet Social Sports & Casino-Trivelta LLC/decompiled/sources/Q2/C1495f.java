package Q2;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495f extends O {

    /* renamed from: a, reason: collision with root package name */
    public static final C1495f f9280a = new C1495f();

    @Override // Q2.O
    public /* bridge */ /* synthetic */ androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        return (androidx.work.c) e(context, str, workerParameters);
    }

    public Void e(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        return null;
    }
}
