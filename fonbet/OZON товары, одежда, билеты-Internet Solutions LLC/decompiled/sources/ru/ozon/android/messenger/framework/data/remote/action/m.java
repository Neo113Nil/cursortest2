package ru.ozon.android.messenger.framework.data.remote.action;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.action.ActionDataSource", f = "ActionDataSource.kt", l = {204}, m = "saveFastAnswerAction$messenger_release")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    y f87719d;

    /* renamed from: e, reason: collision with root package name */
    String f87720e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87721f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y f87722g;

    /* renamed from: h, reason: collision with root package name */
    int f87723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(y yVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87722g = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87721f = obj;
        this.f87723h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87722g.p(null, this);
    }
}
