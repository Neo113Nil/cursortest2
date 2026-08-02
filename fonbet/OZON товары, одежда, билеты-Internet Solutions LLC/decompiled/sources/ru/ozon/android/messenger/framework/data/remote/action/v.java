package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {105}, m = "sendUpdateBlockAction$messenger_release")
/* loaded from: classes10.dex */
final class v extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87764d;

    /* renamed from: e, reason: collision with root package name */
    String f87765e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87766f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87767g;

    /* renamed from: h, reason: collision with root package name */
    int f87768h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87767g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87766f = obj;
        this.f87768h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87767g.y(null, this);
    }
}
