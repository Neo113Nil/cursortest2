package ru.ozon.android.messenger.framework.presentation.common.startup;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.startup.StartupDelegateImpl", f = "StartupDelegate.kt", l = {84, 103, 108}, m = "callStartOrGetChat")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    f f91147d;

    /* renamed from: e, reason: collision with root package name */
    Uri f91148e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f91149f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f91150g;

    /* renamed from: h, reason: collision with root package name */
    int f91151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91150g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f91149f = obj;
        this.f91151h |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f91150g.i(null, null, this);
        return i11;
    }
}
