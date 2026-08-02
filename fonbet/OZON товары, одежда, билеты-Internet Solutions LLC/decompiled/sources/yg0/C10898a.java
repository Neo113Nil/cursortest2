package yg0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.usecase.SendTestSentryEventUseCase", f = "SendTestSentryEventUseCase.kt", l = {41}, m = "execute")
/* renamed from: yg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10898a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f106620d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10900c f106621e;

    /* renamed from: f, reason: collision with root package name */
    int f106622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10898a(C10900c c10900c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f106621e = c10900c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f106620d = obj;
        this.f106622f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f106621e.b(null, this);
    }
}
