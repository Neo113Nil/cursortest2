package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class RecShelfViewHolder$subscribeToWidgetUpdates$1 extends C7719a implements Function2<RecShelfState, d<? super Unit>, Object> {
    RecShelfViewHolder$subscribeToWidgetUpdates$1(Object obj) {
        super(2, obj, RecShelfViewHolder.class, "bindState", "bindState(Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecShelfState recShelfState, d<? super Unit> dVar) {
        Object subscribeToWidgetUpdates$bindState;
        subscribeToWidgetUpdates$bindState = RecShelfViewHolder.subscribeToWidgetUpdates$bindState((RecShelfViewHolder) this.receiver, recShelfState, dVar);
        return subscribeToWidgetUpdates$bindState;
    }
}
