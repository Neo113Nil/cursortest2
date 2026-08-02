package com.sports.insider.util;

import androidx.annotation.Keep;
import cc.a;
import com.google.android.gms.tasks.Task;
import eg.c0;
import eg.r;
import io.sentry.android.core.internal.gestures.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ub.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0087@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"asDeferred", "T", "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Betting-123_googleProductionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtAsDeferredKt {
    @Keep
    @Nullable
    public static final <T> Object asDeferred(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        r a7 = c0.a();
        a7.J(new b(4));
        task.f(new c(22, new a(a7, 1)));
        task.d(new cc.b(a7, 2));
        Object m6 = a7.m(continuation);
        lf.a aVar = lf.a.f20034a;
        return m6;
    }
}
