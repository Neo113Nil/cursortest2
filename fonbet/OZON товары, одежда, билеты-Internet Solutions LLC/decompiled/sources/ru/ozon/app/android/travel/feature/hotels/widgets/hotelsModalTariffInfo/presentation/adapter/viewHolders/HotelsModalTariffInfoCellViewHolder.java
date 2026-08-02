package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoCellViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoViewHolder;", "Lru/ozon/uni/android/cell/CellView;", "cell", "<init>", "(Lru/ozon/uni/android/cell/CellView;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$CellAtomWrapper;", "item", "", "updateBackground", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$CellAtomWrapper;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/cell/CellView;", "Landroid/graphics/drawable/GradientDrawable;", "background$delegate", "LSc/j;", "getBackground", "()Landroid/graphics/drawable/GradientDrawable;", "background", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsModalTariffInfoCellViewHolder extends HotelsModalTariffInfoViewHolder {

    /* renamed from: background$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j background;

    @NotNull
    private final CellView cell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsModalTariffInfoCellViewHolder(@NotNull CellView cell) {
        super(cell, null);
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.background = LazyUtilsKt.unsafeLazy(HotelsModalTariffInfoCellViewHolder$background$2.INSTANCE);
    }

    private final GradientDrawable getBackground() {
        return (GradientDrawable) this.background.getValue();
    }

    private final void updateBackground(HotelsModalTariffInfoVI.CellAtomWrapper item) {
        if (item.getBackgroundColor() == null) {
            this.cell.setBackground(null);
            return;
        }
        this.cell.setBackground(getBackground());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.cell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            getBackground().setColor(parseColor.intValue());
        }
        GradientDrawable background = getBackground();
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? item.getTopRadius() : item.getBottomRadius();
            i11++;
        }
        background.setCornerRadii(fArr);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoViewHolder
    public void bind(@NotNull HotelsModalTariffInfoVI.AtomWrapperVI item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof HotelsModalTariffInfoVI.CellAtomWrapper) {
            HotelsModalTariffInfoVI.CellAtomWrapper cellAtomWrapper = (HotelsModalTariffInfoVI.CellAtomWrapper) item;
            CellHolderKt.bind(this.cell, cellAtomWrapper.getAtom(), onAction);
            ViewExtensionsKt.safeUpdateMargins(this.cell, Integer.valueOf(cellAtomWrapper.getTopMargin()), Integer.valueOf(cellAtomWrapper.getBottomMargin()), Integer.valueOf(cellAtomWrapper.getStartMargin()), Integer.valueOf(cellAtomWrapper.getEndMargin()));
            updateBackground(cellAtomWrapper);
        }
    }
}
