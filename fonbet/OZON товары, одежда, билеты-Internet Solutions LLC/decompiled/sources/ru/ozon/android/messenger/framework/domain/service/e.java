package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {301}, m = "removeAlertLocally")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f88865d;

    /* renamed from: e, reason: collision with root package name */
    String f88866e;

    /* renamed from: f, reason: collision with root package name */
    Iterator f88867f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88868g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ g f88869h;

    /* renamed from: i, reason: collision with root package name */
    int f88870i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88869h = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object p11;
        this.f88868g = obj;
        this.f88870i |= LinearLayoutManager.INVALID_OFFSET;
        p11 = this.f88869h.p(null, this);
        return p11;
    }
}
