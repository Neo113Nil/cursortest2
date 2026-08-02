package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsShowMoreButtonView$increaseClickArea$1$1", "Landroid/view/TouchDelegate;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsShowMoreButtonView$increaseClickArea$1$1 extends TouchDelegate {
    final /* synthetic */ Rect $rect;
    final /* synthetic */ AviaCheckTariffsShowMoreButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsShowMoreButtonView$increaseClickArea$1$1(Rect rect, AviaCheckTariffsShowMoreButtonView aviaCheckTariffsShowMoreButtonView) {
        super(rect, aviaCheckTariffsShowMoreButtonView);
        this.$rect = rect;
        this.this$0 = aviaCheckTariffsShowMoreButtonView;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.$rect.contains((int) event.getX(), (int) event.getY()) && this.this$0.getVisibility() == 0) {
            return this.this$0.dispatchTouchEvent(event);
        }
        return false;
    }
}
