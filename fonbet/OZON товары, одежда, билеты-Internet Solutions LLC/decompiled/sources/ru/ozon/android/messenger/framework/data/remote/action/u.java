package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {261}, m = "sendReportAbuseAction$messenger_release")
/* loaded from: classes10.dex */
final class u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87759d;

    /* renamed from: e, reason: collision with root package name */
    String f87760e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87761f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87762g;

    /* renamed from: h, reason: collision with root package name */
    int f87763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87762g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87761f = obj;
        this.f87763h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87762g.x(null, this);
    }
}
