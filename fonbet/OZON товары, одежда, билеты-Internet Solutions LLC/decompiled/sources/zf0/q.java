package zf0;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes7.dex */
public final class q extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Af0.a f109054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(J.a aVar, Af0.a aVar2) {
        super(aVar);
        this.f109054a = aVar2;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        this.f109054a.c(th2);
    }
}
