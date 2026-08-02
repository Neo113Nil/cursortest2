package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnTouchListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewHolder$contentElementsTouchListener$2 extends AbstractC7737t implements Function0<View.OnTouchListener> {
    final /* synthetic */ TileGrid2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewHolder$contentElementsTouchListener$2(TileGrid2ViewHolder tileGrid2ViewHolder) {
        super(0);
        this.this$0 = tileGrid2ViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(TileGrid2ViewHolder tileGrid2ViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        tileGrid2ViewHolder.getContainerView().performClick();
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View.OnTouchListener invoke() {
        final TileGrid2ViewHolder tileGrid2ViewHolder = this.this$0;
        return new View.OnTouchListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean invoke$lambda$0;
                invoke$lambda$0 = TileGrid2ViewHolder$contentElementsTouchListener$2.invoke$lambda$0(TileGrid2ViewHolder.this, view, motionEvent);
                return invoke$lambda$0;
            }
        };
    }
}
