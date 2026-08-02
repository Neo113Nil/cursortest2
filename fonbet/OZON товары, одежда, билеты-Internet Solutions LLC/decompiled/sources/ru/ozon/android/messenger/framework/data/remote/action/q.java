package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {140}, m = "sendOnboardingHiddenAction$messenger_release")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87739d;

    /* renamed from: e, reason: collision with root package name */
    String f87740e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87741f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87742g;

    /* renamed from: h, reason: collision with root package name */
    int f87743h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87742g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87741f = obj;
        this.f87743h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87742g.t(null, this);
    }
}
