package ru.ozon.push.sdk.internal.token.worker;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.push.sdk.internal.token.worker.SendChannelStateWorker", f = "SendChannelStateWorker.kt", l = {33}, m = "doWork")
/* loaded from: classes3.dex */
final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f97716d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ SendChannelStateWorker f97717e;

    /* renamed from: f, reason: collision with root package name */
    int f97718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(SendChannelStateWorker sendChannelStateWorker, c cVar) {
        super(cVar);
        this.f97717e = sendChannelStateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97716d = obj;
        this.f97718f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97717e.b(this);
    }
}
