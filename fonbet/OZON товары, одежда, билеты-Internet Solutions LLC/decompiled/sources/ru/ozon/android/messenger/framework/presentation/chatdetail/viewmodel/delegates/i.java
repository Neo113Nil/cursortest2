package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl", f = "ChatLoadingDelegate.kt", l = {316, 327}, m = "loadMessages")
/* loaded from: classes10.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f90142d;

    /* renamed from: e, reason: collision with root package name */
    d.a f90143e;

    /* renamed from: f, reason: collision with root package name */
    Object f90144f;

    /* renamed from: g, reason: collision with root package name */
    i.b f90145g;

    /* renamed from: h, reason: collision with root package name */
    int f90146h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f90147i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ d f90148j;

    /* renamed from: k, reason: collision with root package name */
    int f90149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f90148j = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object L11;
        this.f90147i = obj;
        this.f90149k |= LinearLayoutManager.INVALID_OFFSET;
        L11 = this.f90148j.L(null, null, false, this);
        return L11;
    }
}
