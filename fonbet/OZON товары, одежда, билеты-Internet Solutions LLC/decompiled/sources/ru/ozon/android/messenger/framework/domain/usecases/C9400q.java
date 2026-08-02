package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.GetSocketEventsUseCase", f = "GetSocketEventsUseCase.kt", l = {21}, m = "invoke")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9400q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.x[] f89118d;

    /* renamed from: e, reason: collision with root package name */
    String f89119e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89120f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f89121g;

    /* renamed from: h, reason: collision with root package name */
    int f89122h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9400q(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89121g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89120f = obj;
        this.f89122h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89121g.a(null, null, this);
    }
}
