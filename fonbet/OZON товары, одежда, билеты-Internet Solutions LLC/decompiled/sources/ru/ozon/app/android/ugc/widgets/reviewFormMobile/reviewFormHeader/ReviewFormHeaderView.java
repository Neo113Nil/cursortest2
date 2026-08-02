package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "setCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "setBackButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "backButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/cell/CellView;", "cell", "Lru/ozon/uni/android/cell/CellView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormHeaderView extends LinearLayout {
    public static final int $stable = CellView.$stable | IconButtonV3View.$stable;

    @NotNull
    private final IconButtonV3View backButton;

    @NotNull
    private final CellView cell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        iconButtonV3View.setLayoutParams(layoutParams);
        this.backButton = iconButtonV3View;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.reviewFormMobileHeaderProductCell);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        cellView.setLayoutParams(layoutParams2);
        this.cell = cellView;
        setId(R$id.reviewFormMobileHeaderLl);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_6(), 0, dimens.getDP_6(), dimens.getDP_6());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(iconButtonV3View);
        addView(cellView);
        setOrientation(0);
    }

    public final void setBackButton(@NotNull IconButtonV3DTO dto, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        IconButtonV3HolderKt.bindOrGone(this.backButton, dto, onAction);
    }

    public final void setCell(@NotNull CellDTO dto, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        CellHolderKt.bindOrGone(this.cell, dto, onAction);
    }
}
