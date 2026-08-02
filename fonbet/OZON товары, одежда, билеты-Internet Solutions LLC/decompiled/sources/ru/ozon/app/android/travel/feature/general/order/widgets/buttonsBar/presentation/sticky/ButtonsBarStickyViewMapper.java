package ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.sticky;

import SQ.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.data.ButtonsBarDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.data.ButtonsBarMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.di.ButtonsBarComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.ButtonsBarVO;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/sticky/ButtonsBarStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/di/ButtonsBarComponent;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/data/ButtonsBarDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/ButtonsBarVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/sticky/ButtonsBarStickyWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/presentation/sticky/ButtonsBarStickyWidgetViewHolder;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/data/ButtonsBarDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/data/ButtonsBarMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/data/ButtonsBarMapper;", "mapper", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonsBarStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<ButtonsBarComponent, ButtonsBarDTO, ButtonsBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonsRowView buttonsRowView = new ButtonsRowView(context, null, 0, 0, 14, null);
        buttonsRowView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return buttonsRowView;
    }

    private final ButtonsBarMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ButtonsBarDTO) && !((ButtonsBarDTO) state).getDisableSticky();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ButtonsBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ButtonsBarComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public ButtonsBarStickyWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ButtonsBarStickyWidgetViewHolder(container, component().getCustomActionHandlersStoreFactory(), new a(0));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonsBarVO> map(@NotNull ButtonsBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
