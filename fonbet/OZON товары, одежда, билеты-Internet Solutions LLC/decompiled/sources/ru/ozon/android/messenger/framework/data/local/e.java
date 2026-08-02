package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {237}, m = "insertBlocksAndConfigure")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f87578d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.domain.model.c f87579e;

    /* renamed from: f, reason: collision with root package name */
    List f87580f;

    /* renamed from: g, reason: collision with root package name */
    Je.d f87581g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f87582h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ c f87583i;

    /* renamed from: j, reason: collision with root package name */
    int f87584j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87583i = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87582h = obj;
        this.f87584j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87583i.a(null, null, this);
    }
}
