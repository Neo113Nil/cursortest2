package ru.ozon.android.messenger.framework.data.local;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl", f = "ChatItemsStorageImpl.kt", l = {237}, m = "updateNoUiContainer")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f87615d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f87616e;

    /* renamed from: f, reason: collision with root package name */
    Je.d f87617f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f87618g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f87619h;

    /* renamed from: i, reason: collision with root package name */
    int f87620i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f87619h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87618g = obj;
        this.f87620i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87619h.g(null, this);
    }
}
