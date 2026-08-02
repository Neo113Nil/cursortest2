package ru.ozon.tracker.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker", f = "EventsSenderWorker.kt", l = {22}, m = "doWork")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f97869d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ EventsSenderWorker f97870e;

    /* renamed from: f, reason: collision with root package name */
    int f97871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(EventsSenderWorker eventsSenderWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97870e = eventsSenderWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97869d = obj;
        this.f97871f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97870e.b(this);
    }
}
