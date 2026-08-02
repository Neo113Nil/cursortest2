package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionCellWithIconViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "singleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellSingleAtom;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionCellWithIconViewHolder extends DeliveryV6SectionViewHolder {
    public static final int $stable = SingleAtom.$stable;

    @NotNull
    private final SingleAtom singleAtom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionCellWithIconViewHolder(@NotNull SingleAtom singleAtom, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(singleAtom);
        Intrinsics.checkNotNullParameter(singleAtom, "singleAtom");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.singleAtom = singleAtom;
        singleAtom.setOnAction(onAction);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull DeliveryV6SectionItem.CellSingleAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom singleAtom = this.singleAtom;
        ViewGroup.LayoutParams layoutParams = singleAtom.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            int dp_52 = item.getCell() instanceof BadgeTitleSubtitleCellDTO ? Dimens.INSTANCE.getDP_52() : 0;
            marginLayoutParams.leftMargin = dp_52;
            if (i11 == dp_52) {
                ViewGroup.LayoutParams layoutParams2 = singleAtom.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = singleAtom.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = singleAtom.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            singleAtom.setLayoutParams(marginLayoutParams);
        }
        SingleAtom.bind$default(singleAtom, item.getCell(), false, 2, null);
    }
}
