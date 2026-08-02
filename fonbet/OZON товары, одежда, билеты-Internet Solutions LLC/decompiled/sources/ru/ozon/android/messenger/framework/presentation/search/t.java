package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {457, 479, 481, 496}, m = "loadSearchResults")
/* loaded from: classes10.dex */
final class t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91794d;

    /* renamed from: e, reason: collision with root package name */
    Object f91795e;

    /* renamed from: f, reason: collision with root package name */
    Object f91796f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f91797g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9527g f91798h;

    /* renamed from: i, reason: collision with root package name */
    int f91799i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91798h = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object Q02;
        this.f91797g = obj;
        this.f91799i |= LinearLayoutManager.INVALID_OFFSET;
        Q02 = this.f91798h.Q0(null, this);
        return Q02;
    }
}
