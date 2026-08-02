package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {184, 205, 208, 210, ModuleDescriptor.MODULE_VERSION, 216, 222, 228, 232, 244, 248, 251, 260, 264}, m = "updateMessage")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f88931d;

    /* renamed from: e, reason: collision with root package name */
    Object f88932e;

    /* renamed from: f, reason: collision with root package name */
    Object f88933f;

    /* renamed from: g, reason: collision with root package name */
    Object f88934g;

    /* renamed from: h, reason: collision with root package name */
    Object f88935h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f88936i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ g f88937j;

    /* renamed from: k, reason: collision with root package name */
    int f88938k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88937j = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88936i = obj;
        this.f88938k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88937j.e(null, null, this);
    }
}
