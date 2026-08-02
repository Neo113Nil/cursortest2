package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.UnreadMessagesControllerDelegate", f = "UnreadMessagesControllerDelegate.kt", l = {100}, m = "sendMessagesRead")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f90177d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f90178e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f90179f;

    /* renamed from: g, reason: collision with root package name */
    int f90180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar, kotlin.coroutines.d<? super p> dVar) {
        super(dVar);
        this.f90179f = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90178e = obj;
        this.f90180g |= LinearLayoutManager.INVALID_OFFSET;
        return o.g(this.f90179f, null, this);
    }
}
