package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {264}, m = "handleActionWrapper")
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9532l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91771d;

    /* renamed from: e, reason: collision with root package name */
    d.f f91772e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f91773f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9527g f91774g;

    /* renamed from: h, reason: collision with root package name */
    int f91775h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9532l(C9527g c9527g, kotlin.coroutines.d<? super C9532l> dVar) {
        super(dVar);
        this.f91774g = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91773f = obj;
        this.f91775h |= LinearLayoutManager.INVALID_OFFSET;
        return C9527g.r0(this.f91774g, null, this);
    }
}
