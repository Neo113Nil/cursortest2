package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {49}, m = "sendRateOperatorAction$messenger_release")
/* loaded from: classes10.dex */
final class s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87749d;

    /* renamed from: e, reason: collision with root package name */
    String f87750e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87751f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87752g;

    /* renamed from: h, reason: collision with root package name */
    int f87753h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87752g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87751f = obj;
        this.f87753h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87752g.v(null, this);
    }
}
