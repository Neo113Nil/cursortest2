package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {134}, m = "executeChatWithSuccessAction$messenger_release")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.action.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9329b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87664d;

    /* renamed from: e, reason: collision with root package name */
    String f87665e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87666f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87667g;

    /* renamed from: h, reason: collision with root package name */
    int f87668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9329b(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87667g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87666f = obj;
        this.f87668h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87667g.d(null, this);
    }
}
