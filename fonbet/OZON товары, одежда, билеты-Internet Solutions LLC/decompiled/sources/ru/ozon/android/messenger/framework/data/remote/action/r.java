package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {87}, m = "sendOriginalTextAction$messenger_release")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87744d;

    /* renamed from: e, reason: collision with root package name */
    String f87745e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87746f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87747g;

    /* renamed from: h, reason: collision with root package name */
    int f87748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87747g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87746f = obj;
        this.f87748h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87747g.u(null, this);
    }
}
