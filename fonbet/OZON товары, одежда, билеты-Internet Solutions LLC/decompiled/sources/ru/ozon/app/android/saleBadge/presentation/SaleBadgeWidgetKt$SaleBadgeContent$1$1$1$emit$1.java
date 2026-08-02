package ru.ozon.app.android.saleBadge.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeContent$1$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeContent$1$1$1", f = "SaleBadgeWidget.kt", l = {144, 145, 147, 155}, m = "emit")
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaleBadgeWidgetKt$SaleBadgeContent$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1(SaleBadgeWidgetKt$SaleBadgeContent$1$1.AnonymousClass1<? super T> anonymousClass1, d<? super SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit((Unit) null, (d<? super Unit>) this);
    }
}
