package ru.ozon.fintech.features.camera.scanners.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.fintech.features.camera.scanners.service.SaluteQrService", f = "SaluteQrService.kt", l = {98, 106, 112}, m = "process")
/* loaded from: classes3.dex */
final class SaluteQrService$process$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaluteQrService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteQrService$process$1(SaluteQrService saluteQrService, d<? super SaluteQrService$process$1> dVar) {
        super(dVar);
        this.this$0 = saluteQrService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object process;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        process = this.this$0.process(null, this);
        return process;
    }
}
