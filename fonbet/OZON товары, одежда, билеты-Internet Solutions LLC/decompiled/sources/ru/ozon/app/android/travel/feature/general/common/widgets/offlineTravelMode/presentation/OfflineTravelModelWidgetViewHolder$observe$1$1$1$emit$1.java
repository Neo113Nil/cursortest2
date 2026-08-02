package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelWidgetViewHolder$observe$1$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelWidgetViewHolder$observe$1$1$1", f = "OfflineTravelModelWidgetViewHolder.kt", l = {43, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "emit")
/* loaded from: classes4.dex */
final class OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineTravelModelWidgetViewHolder$observe$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1(OfflineTravelModelWidgetViewHolder$observe$1$1.AnonymousClass1<? super T> anonymousClass1, d<? super OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit((OfflineTravelModelViewModel.Data) null, (d<? super Unit>) this);
    }
}
