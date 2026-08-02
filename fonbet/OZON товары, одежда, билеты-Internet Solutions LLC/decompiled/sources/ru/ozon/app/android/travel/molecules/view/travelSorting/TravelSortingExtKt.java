package ru.ozon.app.android.travel.molecules.view.travelSorting;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.select.SelectAtomHolderKt;
import ru.ozon.app.android.travel.molecules.extensions.TextViewExtensionsKt;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/uikit/view/atoms/select/SelectView;Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;Lkotlin/jvm/functions/Function1;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelSortingExtKt {
    public static final void bind(@NotNull SelectView selectView, @NotNull TravelSortingVO vo, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(selectView, "<this>");
        Intrinsics.checkNotNullParameter(vo, "vo");
        SelectAtomHolderKt.bind(selectView, vo.getSortingTypes(), function1);
        selectView.setOnDialogItemClick(new TravelSortingExtKt$bind$1(vo, function1));
        selectView.setEnabled(vo.getIsEnabled());
        Context context = selectView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, vo.getIsEnabled() ? R$attr.textPrimary : R$attr.textOriginalpriceAvailable);
        selectView.setTextColor(themeColor);
        selectView.setTextSize(1, 14.0f);
        TextViewExtensionsKt.setColorForCompoundDrawables(selectView, themeColor, 2);
    }
}
