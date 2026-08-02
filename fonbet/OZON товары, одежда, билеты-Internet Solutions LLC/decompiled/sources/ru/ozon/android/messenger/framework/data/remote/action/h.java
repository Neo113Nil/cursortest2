package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {59}, m = "handleActionWithParams")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87694d;

    /* renamed from: e, reason: collision with root package name */
    String f87695e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87696f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87697g;

    /* renamed from: h, reason: collision with root package name */
    int f87698h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87697g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87696f = obj;
        this.f87698h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87697g.k(null, this);
    }
}
