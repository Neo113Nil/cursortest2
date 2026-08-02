package ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation;

import Bi.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CmlCellListMoleculeView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001<\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0006*\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0+¢\u0006\u0004\b-\u0010.J/\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0+2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "setMargins", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "Landroid/content/res/Resources;", "layoutPadding", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "", "backgroundColor", "setBackground", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "setCornerRadius", "(Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "subtitle", "bindSubtitle", "(Ljava/util/List;)V", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "cellItems", "bindCells", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "subtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "cellListView", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "ru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupView$backgroundOutlineProvider$1", "backgroundOutlineProvider", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupView$backgroundOutlineProvider$1;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListGroupView extends ConstraintLayout {

    @NotNull
    private final CellListGroupView$backgroundOutlineProvider$1 backgroundOutlineProvider;

    @NotNull
    private final CmlCellListMoleculeView cellListView;

    @NotNull
    private final VerticalAtomsLayout subtitleLayout;

    @NotNull
    private final TextAtomV2View titleTv;

    public /* synthetic */ CellListGroupView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull CellListGroupVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setMargins(item.getTopMargin(), item.getBottomMargin());
        setBackground(item.getBackgroundColor());
        setCornerRadius(item.getCornerRadius());
        bindTitle(item.getTitle());
        bindSubtitle(item.getSubtitle());
        bindCells(item.getCellItems(), actionHandler);
    }

    public final void bindCells(@NotNull List<CellItem> cellItems, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(cellItems, "cellItems");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.cellListView.bind(cellItems, actionHandler);
    }

    public final void bindSubtitle(@NotNull List<TextDTO> subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        VerticalAtomsLayout verticalAtomsLayout = this.subtitleLayout;
        verticalAtomsLayout.setVisibility(!subtitle.isEmpty() ? 0 : 8);
        AtomsAdapter adapter = verticalAtomsLayout.getAdapter();
        if (adapter != null) {
            Context context = verticalAtomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            adapter.bind(context, subtitle);
        }
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(this.titleTv, title, null, 2, null);
    }

    public final int getPadding(@NotNull Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }

    public final void setBackground(@NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, backgroundColor, R$color.layer_floor_1));
    }

    public final void setCornerRadius(@NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        int px = cornerRadius.getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(px, context);
        if (pxF == this.backgroundOutlineProvider.getRadius()) {
            return;
        }
        this.backgroundOutlineProvider.setRadius(pxF);
        invalidateOutline();
    }

    public final void setMargins(@NotNull CommonCellSettings.LayoutPadding topMargin, @NotNull CommonCellSettings.LayoutPadding bottomMargin) {
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int left = getLeft();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int padding = getPadding(resources, topMargin);
        int right = getRight();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        marginLayoutParams.setMargins(left, padding, right, getPadding(resources2, bottomMargin));
        setLayoutParams(marginLayoutParams);
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.cellListView.setRecycledViewPool(pool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellListGroupView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.cellListGroup_title, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp16();
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTv = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.cellListGroup_subtitle);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = R$id.cellListGroup_title;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp4();
        verticalAtomsLayout.setLayoutParams(bVar);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        this.subtitleLayout = verticalAtomsLayout;
        CmlCellListMoleculeView cmlCellListMoleculeView = new CmlCellListMoleculeView(context, null, 0, 6, null);
        cmlCellListMoleculeView.setId(R$id.cellListGroup_list);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = R$id.cellListGroup_subtitle;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp4();
        bVar2.f41660x = dimens.getDp4();
        cmlCellListMoleculeView.setLayoutParams(bVar2);
        this.cellListView = cmlCellListMoleculeView;
        CellListGroupView$backgroundOutlineProvider$1 cellListGroupView$backgroundOutlineProvider$1 = new CellListGroupView$backgroundOutlineProvider$1();
        this.backgroundOutlineProvider = cellListGroupView$backgroundOutlineProvider$1;
        setClipToOutline(true);
        setOutlineProvider(cellListGroupView$backgroundOutlineProvider$1);
        addView(textAtomV2View);
        addView(verticalAtomsLayout);
        addView(cmlCellListMoleculeView);
    }
}
