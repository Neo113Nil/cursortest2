package ru.ozon.android.messenger.framework.presentation.ai.delegates;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl", f = "AiAssistantLoadingDelegate.kt", l = {231, 246}, m = "loadMessages")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f89586d;

    /* renamed from: e, reason: collision with root package name */
    d.a f89587e;

    /* renamed from: f, reason: collision with root package name */
    Object f89588f;

    /* renamed from: g, reason: collision with root package name */
    i.b f89589g;

    /* renamed from: h, reason: collision with root package name */
    int f89590h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f89591i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ c f89592j;

    /* renamed from: k, reason: collision with root package name */
    int f89593k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f89592j = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object L11;
        this.f89591i = obj;
        this.f89593k |= LinearLayoutManager.INVALID_OFFSET;
        L11 = this.f89592j.L(null, null, false, this);
        return L11;
    }
}
