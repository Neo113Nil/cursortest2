package ru.ozon.fintech.analytic.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.analytic.worker.GraylogSendWorker", f = "GraylogSendWorker.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "doWork")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f94917d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ GraylogSendWorker f94918e;

    /* renamed from: f, reason: collision with root package name */
    int f94919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(GraylogSendWorker graylogSendWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f94918e = graylogSendWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f94917d = obj;
        this.f94919f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f94918e.b(this);
    }
}
