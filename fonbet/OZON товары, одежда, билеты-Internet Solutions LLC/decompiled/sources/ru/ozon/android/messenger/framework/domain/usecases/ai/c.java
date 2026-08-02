package ru.ozon.android.messenger.framework.domain.usecases.ai;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.android.messenger.framework.domain.usecases.ai.GetAiMessagesUseCase", f = "GetAiMessagesUseCase.kt", l = {14}, m = "invoke")
/* loaded from: classes10.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f89050d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.b f89051e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89052f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f89053g;

    /* renamed from: h, reason: collision with root package name */
    int f89054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89053g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89052f = obj;
        this.f89054h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89053g.a(null, this);
    }
}
