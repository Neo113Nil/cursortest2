package ru.ozon.android.messenger.framework.presentation.common.startup;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.startup.StartupDelegateImpl", f = "StartupDelegate.kt", l = {66}, m = "callChatStart")
/* loaded from: classes10.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    f f91143d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f91144e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f91145f;

    /* renamed from: g, reason: collision with root package name */
    int f91146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91145f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object h11;
        this.f91144e = obj;
        this.f91146g |= LinearLayoutManager.INVALID_OFFSET;
        h11 = this.f91145f.h(null, this);
        return h11;
    }
}
