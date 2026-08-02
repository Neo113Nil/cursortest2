package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.RemoveItemUseCase", f = "RemoveItemUseCase.kt", l = {57}, m = "removeWidgetById")
/* loaded from: classes10.dex */
final class G extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.I f88978d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88979e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ F f88980f;

    /* renamed from: g, reason: collision with root package name */
    int f88981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(F f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88980f = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f88979e = obj;
        this.f88981g |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f88980f.j(null, this);
        return j11;
    }
}
