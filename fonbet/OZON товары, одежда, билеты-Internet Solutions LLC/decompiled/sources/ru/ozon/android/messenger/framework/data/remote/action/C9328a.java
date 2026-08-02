package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {179}, m = "chatGetFastAnswersAddAction$messenger_release")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.action.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9328a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87659d;

    /* renamed from: e, reason: collision with root package name */
    String f87660e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87661f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87662g;

    /* renamed from: h, reason: collision with root package name */
    int f87663h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9328a(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87662g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87661f = obj;
        this.f87663h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87662g.c(null, this);
    }
}
