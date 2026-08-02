package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {237}, m = "updateNoUiContainer")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f87603d;

    /* renamed from: e, reason: collision with root package name */
    List f87604e;

    /* renamed from: f, reason: collision with root package name */
    List f87605f;

    /* renamed from: g, reason: collision with root package name */
    Je.d f87606g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f87607h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ c f87608i;

    /* renamed from: j, reason: collision with root package name */
    int f87609j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87608i = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87607h = obj;
        this.f87609j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87608i.p(null, null, this);
    }
}
