package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {159}, m = "executeGetCurtainModalAction$messenger_release")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87679d;

    /* renamed from: e, reason: collision with root package name */
    String f87680e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87681f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87682g;

    /* renamed from: h, reason: collision with root package name */
    int f87683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87682g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87681f = obj;
        this.f87683h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87682g.g(null, this);
    }
}
