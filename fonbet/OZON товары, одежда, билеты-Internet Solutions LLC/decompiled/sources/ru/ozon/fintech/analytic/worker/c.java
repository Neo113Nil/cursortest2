package ru.ozon.fintech.analytic.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.analytic.worker.MobileHealthSendWorker", f = "MobileHealthSendWorker.kt", l = {34}, m = "doWork")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f94928d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MobileHealthSendWorker f94929e;

    /* renamed from: f, reason: collision with root package name */
    int f94930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(MobileHealthSendWorker mobileHealthSendWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f94929e = mobileHealthSendWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f94928d = obj;
        this.f94930f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f94929e.b(this);
    }
}
