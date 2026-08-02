package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class AdditionalReviewV2VH$onAttachViewModel$1 extends C7719a implements Function2<List<? extends Long>, d<? super Unit>, Object> {
    AdditionalReviewV2VH$onAttachViewModel$1(Object obj) {
        super(2, obj, AdditionalReviewV2VH.class, "handleItemRemovalAndUpdate", "handleItemRemovalAndUpdate(Ljava/util/List;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Long> list, d<? super Unit> dVar) {
        return invoke2((List<Long>) list, dVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Long> list, d<? super Unit> dVar) {
        Object onAttachViewModel$handleItemRemovalAndUpdate;
        onAttachViewModel$handleItemRemovalAndUpdate = AdditionalReviewV2VH.onAttachViewModel$handleItemRemovalAndUpdate((AdditionalReviewV2VH) this.receiver, list, dVar);
        return onAttachViewModel$handleItemRemovalAndUpdate;
    }
}
