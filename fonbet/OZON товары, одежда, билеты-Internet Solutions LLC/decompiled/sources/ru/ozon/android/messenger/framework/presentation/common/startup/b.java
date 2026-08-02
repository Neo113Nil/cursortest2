package ru.ozon.android.messenger.framework.presentation.common.startup;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.startup.StartupDelegateImpl", f = "StartupDelegate.kt", l = {79, 80}, m = "callChatEnter")
/* loaded from: classes10.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f91139d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f91140e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f91141f;

    /* renamed from: g, reason: collision with root package name */
    int f91142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91141f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f91140e = obj;
        this.f91142g |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f91141f.g(null, this);
        return g10;
    }
}
