package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {66}, m = "handleClickActionWithParams")
/* loaded from: classes10.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87699d;

    /* renamed from: e, reason: collision with root package name */
    String f87700e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87701f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87702g;

    /* renamed from: h, reason: collision with root package name */
    int f87703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87702g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87701f = obj;
        this.f87703h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87702g.l(null, this);
    }
}
