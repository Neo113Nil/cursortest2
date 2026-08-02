package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {228}, m = "executeGetActionCurtainModalAction$messenger_release")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87674d;

    /* renamed from: e, reason: collision with root package name */
    String f87675e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87676f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87677g;

    /* renamed from: h, reason: collision with root package name */
    int f87678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87677g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87676f = obj;
        this.f87678h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87677g.f(null, this);
    }
}
