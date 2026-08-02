package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {217}, m = "removeFastAnswerAction$messenger_release")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87714d;

    /* renamed from: e, reason: collision with root package name */
    String f87715e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87716f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87717g;

    /* renamed from: h, reason: collision with root package name */
    int f87718h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87717g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87716f = obj;
        this.f87718h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87717g.o(null, null, this);
    }
}
