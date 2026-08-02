package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {663}, m = "commitNoUiItems")
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9530j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91764d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f91765e;

    /* renamed from: f, reason: collision with root package name */
    Je.d f91766f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f91767g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9527g f91768h;

    /* renamed from: i, reason: collision with root package name */
    int f91769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9530j(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91768h = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object J02;
        this.f91767g = obj;
        this.f91769i |= LinearLayoutManager.INVALID_OFFSET;
        J02 = this.f91768h.J0(null, this);
        return J02;
    }
}
