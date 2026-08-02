package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {362}, m = "showAlert")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f88921d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f88922e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88923f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ g f88924g;

    /* renamed from: h, reason: collision with root package name */
    int f88925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88924g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object s11;
        this.f88923f = obj;
        this.f88925h |= LinearLayoutManager.INVALID_OFFSET;
        s11 = this.f88924g.s(null, this);
        return s11;
    }
}
