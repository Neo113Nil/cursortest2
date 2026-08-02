package ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingViewHolder;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingViewHolder$ratingCallback$1;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingViewHolder$ratingCallback$1", "Lkotlin/Function1;", "", "", "invoke", "rating", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryRatingViewHolder$ratingCallback$1 implements Function1<Integer, Unit> {
    final /* synthetic */ DeliveryRatingViewHolder this$0;

    DeliveryRatingViewHolder$ratingCallback$1(DeliveryRatingViewHolder deliveryRatingViewHolder) {
        this.this$0 = deliveryRatingViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(DeliveryRatingViewHolder deliveryRatingViewHolder, int i11) {
        AtomAction prepareActionWithParams;
        Function1 function1;
        DeliveryRatingVO boundedData = deliveryRatingViewHolder.getBoundedData();
        prepareActionWithParams = deliveryRatingViewHolder.prepareActionWithParams(boundedData != null ? boundedData.getRating() : null, i11);
        if (prepareActionWithParams != null) {
            function1 = deliveryRatingViewHolder.actionHandler;
            function1.invoke(prepareActionWithParams);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public void invoke(final int rating) {
        Handler handler;
        handler = this.this$0.handler;
        final DeliveryRatingViewHolder deliveryRatingViewHolder = this.this$0;
        handler.post(new Runnable() { // from class: Bv.a
            @Override // java.lang.Runnable
            public final void run() {
                DeliveryRatingViewHolder$ratingCallback$1.invoke$lambda$0(DeliveryRatingViewHolder.this, rating);
            }
        });
    }
}
