package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CommentsListViewHolder$onAttachViewModel$4 extends C7719a implements Function2<Map<Long, ? extends Boolean>, d<? super Unit>, Object> {
    CommentsListViewHolder$onAttachViewModel$4(Object obj) {
        super(2, obj, CommentsViewModel.class, "updateSellerSubscription", "updateSellerSubscription(Ljava/util/Map;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<Long, ? extends Boolean> map, d<? super Unit> dVar) {
        return invoke2((Map<Long, Boolean>) map, dVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<Long, Boolean> map, d<? super Unit> dVar) {
        Object onAttachViewModel$updateSellerSubscription;
        onAttachViewModel$updateSellerSubscription = CommentsListViewHolder.onAttachViewModel$updateSellerSubscription((CommentsViewModel) this.receiver, map, dVar);
        return onAttachViewModel$updateSellerSubscription;
    }
}
