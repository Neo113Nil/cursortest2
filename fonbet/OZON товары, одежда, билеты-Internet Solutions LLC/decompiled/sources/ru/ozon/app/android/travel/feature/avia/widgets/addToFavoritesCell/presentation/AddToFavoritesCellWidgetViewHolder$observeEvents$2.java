package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import Sc.s;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "", "<anonymous>", "(LWZ/t;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellWidgetViewHolder$observeEvents$2", f = "AddToFavoritesCellWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AddToFavoritesCellWidgetViewHolder$observeEvents$2 extends j implements Function2<t, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToFavoritesCellWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToFavoritesCellWidgetViewHolder$observeEvents$2(AddToFavoritesCellWidgetViewHolder addToFavoritesCellWidgetViewHolder, d<? super AddToFavoritesCellWidgetViewHolder$observeEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = addToFavoritesCellWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToFavoritesCellWidgetViewHolder$observeEvents$2 addToFavoritesCellWidgetViewHolder$observeEvents$2 = new AddToFavoritesCellWidgetViewHolder$observeEvents$2(this.this$0, dVar);
        addToFavoritesCellWidgetViewHolder$observeEvents$2.L$0 = obj;
        return addToFavoritesCellWidgetViewHolder$observeEvents$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t tVar, d<? super Unit> dVar) {
        return ((AddToFavoritesCellWidgetViewHolder$observeEvents$2) create(tVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.trackAnalytics((t) this.L$0);
        return Unit.f71690a;
    }
}
