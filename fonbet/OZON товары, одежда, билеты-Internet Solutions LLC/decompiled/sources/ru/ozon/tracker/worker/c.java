package ru.ozon.tracker.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker", f = "EventsSenderWorker.kt", l = {109, 114, 115}, m = "sendAnalyticsEvents")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f97886d;

    /* renamed from: e, reason: collision with root package name */
    Object f97887e;

    /* renamed from: f, reason: collision with root package name */
    List f97888f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97889g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ EventsSenderWorker f97890h;

    /* renamed from: i, reason: collision with root package name */
    int f97891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(EventsSenderWorker eventsSenderWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97890h = eventsSenderWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97889g = obj;
        this.f97891i |= LinearLayoutManager.INVALID_OFFSET;
        return EventsSenderWorker.d(this.f97890h, null, null, null, this);
    }
}
