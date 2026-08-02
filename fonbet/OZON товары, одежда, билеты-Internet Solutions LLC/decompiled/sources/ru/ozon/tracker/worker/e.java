package ru.ozon.tracker.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker", f = "EventsSenderWorker.kt", l = {82, 86, 93, 94}, m = "sendPerfEvents")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f97893d;

    /* renamed from: e, reason: collision with root package name */
    Object f97894e;

    /* renamed from: f, reason: collision with root package name */
    Object f97895f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97896g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ EventsSenderWorker f97897h;

    /* renamed from: i, reason: collision with root package name */
    int f97898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(EventsSenderWorker eventsSenderWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97897h = eventsSenderWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97896g = obj;
        this.f97898i |= LinearLayoutManager.INVALID_OFFSET;
        return EventsSenderWorker.g(this.f97897h, null, null, null, null, this);
    }
}
