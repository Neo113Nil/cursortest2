package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: Utils.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class UtilsKt$attachToUserJob$2 implements Function1<Throwable, Unit> {
    final /* synthetic */ DisposableHandle $cleanupHandler;

    public UtilsKt$attachToUserJob$2(DisposableHandle disposableHandle) {
        this.$cleanupHandler = disposableHandle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$cleanupHandler.dispose();
    }
}
