package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose;

import Ek.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.CellVO;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "", "cellComposeWidget", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellComposeWidgetKt {
    public static final void cellComposeWidget(@NotNull j<Object, CellVO> jVar) {
        SplitWidgetComponent splitWidgetComponent = (SplitWidgetComponent) a.c(jVar, "<this>", SplitWidgetComponent.class);
        jVar.i(new CellComposeWidgetKt$cellComposeWidget$1(splitWidgetComponent), CellComposeWidgetKt$cellComposeWidget$2.INSTANCE);
        jVar.G(new CellComposeWidgetKt$cellComposeWidget$3(jVar, splitWidgetComponent));
    }
}
