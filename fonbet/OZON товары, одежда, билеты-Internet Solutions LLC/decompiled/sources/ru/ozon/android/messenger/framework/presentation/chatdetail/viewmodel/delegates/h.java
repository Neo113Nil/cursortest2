package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl", f = "ChatLoadingDelegate.kt", l = {231, 234}, m = "loadLastPageAndScrollToEnd$suspendImpl")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f90138d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f90139e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f90140f;

    /* renamed from: g, reason: collision with root package name */
    int f90141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f90140f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90139e = obj;
        this.f90141g |= LinearLayoutManager.INVALID_OFFSET;
        return d.K(this.f90140f, this);
    }
}
