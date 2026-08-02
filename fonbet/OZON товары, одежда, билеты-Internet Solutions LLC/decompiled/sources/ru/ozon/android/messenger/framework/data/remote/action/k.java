package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {123}, m = "openRateMessengerSuccessModalAction$messenger_release")
/* loaded from: classes10.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87709d;

    /* renamed from: e, reason: collision with root package name */
    String f87710e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87711f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87712g;

    /* renamed from: h, reason: collision with root package name */
    int f87713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87712g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87711f = obj;
        this.f87713h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87712g.n(null, this);
    }
}
