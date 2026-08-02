package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {53}, m = "sendButtonAction$messenger_release")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87724d;

    /* renamed from: e, reason: collision with root package name */
    String f87725e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87726f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87727g;

    /* renamed from: h, reason: collision with root package name */
    int f87728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87727g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87726f = obj;
        this.f87728h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87727g.q(null, this);
    }
}
