package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.I;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {154, 161}, m = "sendMessage")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f88894d;

    /* renamed from: e, reason: collision with root package name */
    I f88895e;

    /* renamed from: f, reason: collision with root package name */
    I f88896f;

    /* renamed from: g, reason: collision with root package name */
    i.b f88897g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f88898h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ g f88899i;

    /* renamed from: j, reason: collision with root package name */
    int f88900j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88899i = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88898h = obj;
        this.f88900j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88899i.a(null, null, false, false, false, this);
    }
}
