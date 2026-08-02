package ru.ozon.app.android.monetization.widgets.skuListCopy.presentation;

import B3.D;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "roundedDrawable", "Landroid/graphics/drawable/GradientDrawable;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "skuButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "linkButton", "bind", "", "item", "Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupConstraints", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SkuListItemViewGroup extends ConstraintLayout {

    @NotNull
    private final CellView cellView;

    @NotNull
    private final ButtonV3View linkButton;

    @NotNull
    private final GradientDrawable roundedDrawable;

    @NotNull
    private final ButtonV3View skuButton;

    public /* synthetic */ SkuListItemViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.cellView);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.cellView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.cellView);
        int id2 = this.skuButton.getId();
        int i11 = R$id.skuListItemRoot;
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToStart(dVar, id2, i11, dimens.getDP_8());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom$default(dVar, this.skuButton.getId(), this.cellView.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart(dVar, this.skuButton.getId(), this.linkButton.getId(), dimens.getDP_4());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.linkButton);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToEnd(dVar, this.linkButton.getId(), R$id.skuListItemRoot, dimens.getDP_8());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom$default(dVar, this.linkButton.getId(), this.cellView.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, this.linkButton.getId(), this.skuButton.getId(), dimens.getDP_4());
        dVar.f(this);
    }

    public final void bind(@NotNull SkuListItemVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bind$default(this.cellView, item.getSkuCell(), null, 2, null);
        ButtonV3HolderKt.bind(this.skuButton, item.getSkuButton(), actionHandler);
        ButtonV3HolderKt.bind(this.linkButton, item.getLinkButton(), actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuListItemViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable b11 = D.b(0);
        Dimens dimens = Dimens.INSTANCE;
        b11.setCornerRadius(dimens.getDPF_20());
        b11.setStroke(dimens.getDP_1(), a.getColor(context, UniColors.LAYER_SURFACE.getResId()));
        this.roundedDrawable = b11;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.skuItemCell);
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.cellView = cellView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        buttonV3View.setId(R$id.skuItemSkuButton);
        bVar.setMarginStart(dimens.getDP_4());
        buttonV3View.setLayoutParams(bVar);
        this.skuButton = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        buttonV3View2.setId(R$id.skuItemLinkButton);
        bVar2.setMarginStart(dimens.getDP_4());
        buttonV3View2.setLayoutParams(bVar2);
        this.linkButton = buttonV3View2;
        setId(R$id.skuListItemRoot);
        ViewExtKt.updatePadding$default(this, 0, 0, 0, dimens.getDP_8(), 7, null);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, -2);
        bVar3.setMargins(dimens.getDP_16(), dimens.getDP_8(), dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
        setLayoutParams(bVar3);
        setBackground(b11);
        addView(cellView);
        addView(buttonV3View);
        addView(buttonV3View2);
        setupConstraints();
    }
}
