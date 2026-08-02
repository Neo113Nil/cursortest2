package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {237}, m = "updateBlocks")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f87597d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f87598e;

    /* renamed from: f, reason: collision with root package name */
    Je.d f87599f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f87600g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f87601h;

    /* renamed from: i, reason: collision with root package name */
    int f87602i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87601h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87600g = obj;
        this.f87602i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87601h.i(null, this);
    }
}
