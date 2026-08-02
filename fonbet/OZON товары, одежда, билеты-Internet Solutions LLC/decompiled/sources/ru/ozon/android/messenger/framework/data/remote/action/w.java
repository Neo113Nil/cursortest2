package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {168}, m = "unpinHeaderItem$messenger_release")
/* loaded from: classes10.dex */
final class w extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87769d;

    /* renamed from: e, reason: collision with root package name */
    String f87770e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87771f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87772g;

    /* renamed from: h, reason: collision with root package name */
    int f87773h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87772g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87771f = obj;
        this.f87773h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87772g.z(null, this);
    }
}
