package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {237}, m = "addNoUiItems")
/* loaded from: classes10.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f87440d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q[] f87441e;

    /* renamed from: f, reason: collision with root package name */
    Je.d f87442f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f87443g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f87444h;

    /* renamed from: i, reason: collision with root package name */
    int f87445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87444h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87443g = obj;
        this.f87445i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87444h.c(null, this);
    }
}
