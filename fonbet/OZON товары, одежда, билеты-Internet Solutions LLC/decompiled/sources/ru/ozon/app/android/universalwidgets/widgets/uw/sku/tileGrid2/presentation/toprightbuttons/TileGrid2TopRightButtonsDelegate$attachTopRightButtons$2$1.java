package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFavorite", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2TopRightButtonsDelegate$attachTopRightButtons$2$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ TileGrid2TopRightButtonsDelegate $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2TopRightButtonsDelegate$attachTopRightButtons$2$1(TileGrid2TopRightButtonsDelegate tileGrid2TopRightButtonsDelegate) {
        super(1);
        this.$this_run = tileGrid2TopRightButtonsDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        boolean z12;
        List list;
        z12 = this.$this_run.animationEnabled;
        if (z12) {
            TileGrid2TopRightButtonsDelegate tileGrid2TopRightButtonsDelegate = this.$this_run;
            list = tileGrid2TopRightButtonsDelegate.topRightButtons;
            if (list == null) {
                list = K.f71697a;
            }
            tileGrid2TopRightButtonsDelegate.submitTopRightButtons(list, z11 ? TileGrid2TopRightButtonsDelegate.State.EXPANDED : TileGrid2TopRightButtonsDelegate.State.COLLAPSED);
        }
    }
}
