package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {188}, m = "updateFastAnswersUsageAction$messenger_release")
/* loaded from: classes10.dex */
final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87774d;

    /* renamed from: e, reason: collision with root package name */
    String f87775e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87776f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87777g;

    /* renamed from: h, reason: collision with root package name */
    int f87778h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87777g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87776f = obj;
        this.f87778h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87777g.A(null, this);
    }
}
