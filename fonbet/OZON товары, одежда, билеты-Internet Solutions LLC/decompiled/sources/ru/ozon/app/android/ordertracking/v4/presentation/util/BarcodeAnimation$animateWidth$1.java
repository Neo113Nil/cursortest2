package ru.ozon.app.android.ordertracking.v4.presentation.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ordertracking.v4.presentation.util.BarcodeAnimation", f = "BarcodeAnimation.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "animateWidth-gwCluXo")
/* loaded from: classes13.dex */
final class BarcodeAnimation$animateWidth$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BarcodeAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeAnimation$animateWidth$1(BarcodeAnimation barcodeAnimation, d<? super BarcodeAnimation$animateWidth$1> dVar) {
        super(dVar);
        this.this$0 = barcodeAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m872animateWidthgwCluXo;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        m872animateWidthgwCluXo = this.this$0.m872animateWidthgwCluXo(null, 0, 0, 0L, null, this);
        return m872animateWidthgwCluXo;
    }
}
