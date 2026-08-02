package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.adapter;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ay.ViewOnClickListenerC5491a;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.databinding.LayoutWholesaleItemBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleVO;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00122\u0010\t\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000e\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R@\u0010\t\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutWholesaleItemBinding;", "binding", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "addToCartAction", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/LayoutWholesaleItemBinding;Lkotlin/jvm/functions/Function2;)V", "params", "trackingInfo", "setOnClickListener", "(Ljava/util/Map;Ljava/util/Map;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/LayoutWholesaleItemBinding;", "Lkotlin/jvm/functions/Function2;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleItemViewHolder extends j {

    @NotNull
    private final Function2<Map<String, String>, Map<String, TokenizedTrackingInfo>, Unit> addToCartAction;

    @NotNull
    private final LayoutWholesaleItemBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WholeSaleItemViewHolder(@NotNull LayoutWholesaleItemBinding binding, @NotNull Function2<? super Map<String, String>, ? super Map<String, TokenizedTrackingInfo>, Unit> addToCartAction) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(addToCartAction, "addToCartAction");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.addToCartAction = addToCartAction;
    }

    private final void setOnClickListener(Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo) {
        this.binding.button.setOnClickListener(new ViewOnClickListenerC5491a(this, params, trackingInfo, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$2(WholeSaleItemViewHolder wholeSaleItemViewHolder, Map map, Map map2, View view) {
        wholeSaleItemViewHolder.addToCartAction.invoke(map, map2);
    }

    public final void bind(@NotNull WholeSaleVO.Cell item) {
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(item, "item");
        LayoutWholesaleItemBinding layoutWholesaleItemBinding = this.binding;
        TitleSubtitleCellView title = layoutWholesaleItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TitleSubtitleCellHolderKt.bind$default(title, item.getTitleSubtitleCell(), null, 2, null);
        ButtonV3View button = layoutWholesaleItemBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bindOrGone$default(button, item.getButton(), null, 2, null);
        View separator = layoutWholesaleItemBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getHasSeparator()));
        ButtonV3DTO button2 = item.getButton();
        if (button2 == null || (common = button2.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null) {
            return;
        }
        setOnClickListener(params, item.getButton().getTrackingInfo());
    }
}
