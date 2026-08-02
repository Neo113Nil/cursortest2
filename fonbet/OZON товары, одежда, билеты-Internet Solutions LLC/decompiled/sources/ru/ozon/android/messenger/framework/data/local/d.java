package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {227}, m = "findNoUiByIdsOrInsert")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f87458d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f87459e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f87460f;

    /* renamed from: g, reason: collision with root package name */
    int f87461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87460f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87459e = obj;
        this.f87461g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87460f.n(null, null, this);
    }
}
