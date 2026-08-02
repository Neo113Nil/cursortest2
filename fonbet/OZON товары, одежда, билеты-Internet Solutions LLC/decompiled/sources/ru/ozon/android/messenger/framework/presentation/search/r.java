package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {327, 337}, m = "loadNextPage")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91788d;

    /* renamed from: e, reason: collision with root package name */
    String f91789e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f91790f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9527g f91791g;

    /* renamed from: h, reason: collision with root package name */
    int f91792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91791g = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91790f = obj;
        this.f91792h |= LinearLayoutManager.INVALID_OFFSET;
        return C9527g.y0(this.f91791g, this);
    }
}
