package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {524, 525}, m = "hideLoaderWithMinVisibility")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function2 f91781d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f91782e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9527g f91783f;

    /* renamed from: g, reason: collision with root package name */
    int f91784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91783f = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91782e = obj;
        this.f91784g |= LinearLayoutManager.INVALID_OFFSET;
        return C9527g.w0(this.f91783f, 0L, null, this);
    }
}
