package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {271}, m = "executeEditChatMessageAction$messenger_release")
/* loaded from: classes10.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87669d;

    /* renamed from: e, reason: collision with root package name */
    String f87670e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87671f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87672g;

    /* renamed from: h, reason: collision with root package name */
    int f87673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87672g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87671f = obj;
        this.f87673h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87672g.e(null, this);
    }
}
