package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {75}, m = "sendReadAllAction$messenger_release")
/* loaded from: classes10.dex */
final class t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87754d;

    /* renamed from: e, reason: collision with root package name */
    String f87755e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87756f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87757g;

    /* renamed from: h, reason: collision with root package name */
    int f87758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87757g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87756f = obj;
        this.f87758h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87757g.w(null, this);
    }
}
