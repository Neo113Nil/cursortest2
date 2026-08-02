package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.SendRequestWhenChatInitializedUseCase", f = "SendRequestWhenChatInitializedUseCase.kt", l = {15, 19, 23, 24}, m = "invoke")
/* loaded from: classes10.dex */
final class X extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function1 f89034d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f89035e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ W<Object> f89036f;

    /* renamed from: g, reason: collision with root package name */
    int f89037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(W w11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89036f = w11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89035e = obj;
        this.f89037g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89036f.a(null, this);
    }
}
