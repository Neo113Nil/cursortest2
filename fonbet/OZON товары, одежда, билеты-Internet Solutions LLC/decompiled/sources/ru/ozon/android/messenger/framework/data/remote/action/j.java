package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {116}, m = "openDisclaimerModalAction$messenger_release")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87704d;

    /* renamed from: e, reason: collision with root package name */
    String f87705e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87706f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87707g;

    /* renamed from: h, reason: collision with root package name */
    int f87708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87707g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87706f = obj;
        this.f87708h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87707g.m(null, this);
    }
}
