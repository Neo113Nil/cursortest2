package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", l = {367, 385}, m = "uploadContentIfNeed")
/* loaded from: classes10.dex */
final class P extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.remote.models.c f88376d;

    /* renamed from: e, reason: collision with root package name */
    y0 f88377e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88378f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ I f88379g;

    /* renamed from: h, reason: collision with root package name */
    int f88380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(I i11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88379g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88378f = obj;
        this.f88380h |= LinearLayoutManager.INVALID_OFFSET;
        return I.R(this.f88379g, null, this);
    }
}
