package ru.ozon.uni.ozi.utils.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt$rememberIndicationTransition$1$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.uni.ozi.utils.internal.TransitionsKt$rememberIndicationTransition$1$1$3", f = "Transitions.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "emit")
/* loaded from: classes4.dex */
final class TransitionsKt$rememberIndicationTransition$1$1$3$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransitionsKt$rememberIndicationTransition$1$1.AnonymousClass3<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransitionsKt$rememberIndicationTransition$1$1$3$emit$1(TransitionsKt$rememberIndicationTransition$1$1.AnonymousClass3<? super T> anonymousClass3, d<? super TransitionsKt$rememberIndicationTransition$1$1$3$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit(false, (d<? super Unit>) this);
    }
}
