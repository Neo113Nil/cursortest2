package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {289}, m = "onChatGroupSelected")
/* loaded from: classes10.dex */
final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91829d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f91830e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9527g f91831f;

    /* renamed from: g, reason: collision with root package name */
    int f91832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91831f = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object R02;
        this.f91830e = obj;
        this.f91832g |= LinearLayoutManager.INVALID_OFFSET;
        R02 = this.f91831f.R0(null, this);
        return R02;
    }
}
