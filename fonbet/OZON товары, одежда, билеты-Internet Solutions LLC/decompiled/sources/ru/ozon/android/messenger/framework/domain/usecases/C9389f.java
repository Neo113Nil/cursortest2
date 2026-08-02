package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.ChatEnterUseCase", f = "ChatEnterUseCase.kt", l = {17}, m = "invoke")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9389f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9391h f89073d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f89074e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9391h f89075f;

    /* renamed from: g, reason: collision with root package name */
    int f89076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9389f(C9391h c9391h, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89075f = c9391h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89074e = obj;
        this.f89076g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89075f.b(null, this);
    }
}
