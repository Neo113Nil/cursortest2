package ru.ozon.app.android.geo.addressBookBar.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.regular.CellRegular24IconPickerHolderKt;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.regular.CellRegular24IconPickerView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017JE\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0014¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "separatorView", "Landroid/view/View;", "regularCellView", "Lru/ozon/app/android/uikit/view/atoms/cells/regular/CellRegular24IconPickerView;", "rightLeftCellView", "Lru/ozon/app/android/geo/addressBookBar/presentation/view/RightLeftTitlesCellView;", "setSeparatorVisibility", "", "show", "", "setRegularCell", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "setRightLeftCell", "icon", "", "iconTintColor", "leftTitle", "rightTitle", "titlesColor", "showSeparator", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IZ)V", "getOrCreateRegularCellView", "createRegularCellView", "getOrCreateRightLeftTitlesCellView", "createRightLeftTitlesCellView", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarView extends ConstraintLayout {
    private CellRegular24IconPickerView regularCellView;
    private RightLeftTitlesCellView rightLeftCellView;

    @NotNull
    private final View separatorView;

    public /* synthetic */ AddressBookBarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final CellRegular24IconPickerView createRegularCellView() {
        CellRegular24IconPickerView cellRegular24IconPickerView = (CellRegular24IconPickerView) q.f64554a.i(N.b(CellRegular24IconPickerView.class), getContext());
        if (cellRegular24IconPickerView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellRegular24IconPickerView = new CellRegular24IconPickerView(context, null, 0, 6, null);
        }
        cellRegular24IconPickerView.setId(R$id.regularCell);
        cellRegular24IconPickerView.setLayoutParams(new ConstraintLayout.b(0, 0));
        cellRegular24IconPickerView.getTitleTav().setStyleOrDefault(Integer.valueOf(R$style.TextStyle_Body_M));
        TextAtomView textAtomView = (TextAtomView) cellRegular24IconPickerView.findViewById(cellRegular24IconPickerView.getActionViewId());
        if (textAtomView != null) {
            textAtomView.setStyleOrDefault(Integer.valueOf(R$style.TextStyle_Body_M));
        }
        addView(cellRegular24IconPickerView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, R$id.regularCell, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, R$id.regularCell, 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.regularCell, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, R$id.regularCell, R$id.separatorV, 0, 4, null);
        dVar.f(this);
        this.regularCellView = cellRegular24IconPickerView;
        return cellRegular24IconPickerView;
    }

    private final RightLeftTitlesCellView createRightLeftTitlesCellView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RightLeftTitlesCellView rightLeftTitlesCellView = new RightLeftTitlesCellView(context, null, 0, 0, 14, null);
        rightLeftTitlesCellView.setId(R$id.rightLeftTitlesCell);
        rightLeftTitlesCellView.setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(rightLeftTitlesCellView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, R$id.rightLeftTitlesCell, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, R$id.rightLeftTitlesCell, 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.rightLeftTitlesCell, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.rightLeftTitlesCell, 0, 0, 4, null);
        dVar.f(this);
        this.rightLeftCellView = rightLeftTitlesCellView;
        return rightLeftTitlesCellView;
    }

    private final CellRegular24IconPickerView getOrCreateRegularCellView() {
        CellRegular24IconPickerView cellRegular24IconPickerView = this.regularCellView;
        return cellRegular24IconPickerView == null ? createRegularCellView() : cellRegular24IconPickerView;
    }

    private final RightLeftTitlesCellView getOrCreateRightLeftTitlesCellView() {
        RightLeftTitlesCellView rightLeftTitlesCellView = this.rightLeftCellView;
        return rightLeftTitlesCellView == null ? createRightLeftTitlesCellView() : rightLeftTitlesCellView;
    }

    public final void setRegularCell(@NotNull CellAtom.CellRegular24IconPicker cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        RightLeftTitlesCellView rightLeftTitlesCellView = this.rightLeftCellView;
        if (rightLeftTitlesCellView != null) {
            ViewExtKt.gone(rightLeftTitlesCellView);
        }
        CellRegular24IconPickerView orCreateRegularCellView = getOrCreateRegularCellView();
        CellRegular24IconPickerHolderKt.bindOrGone$default(orCreateRegularCellView, cell, null, 2, null);
        orCreateRegularCellView.setTitleMaxLines(1);
        orCreateRegularCellView.setClickable(false);
    }

    public final void setRightLeftCell(String icon, Integer iconTintColor, String leftTitle, @NotNull String rightTitle, int titlesColor, boolean showSeparator) {
        Intrinsics.checkNotNullParameter(rightTitle, "rightTitle");
        CellRegular24IconPickerView cellRegular24IconPickerView = this.regularCellView;
        if (cellRegular24IconPickerView != null) {
            ViewExtKt.gone(cellRegular24IconPickerView);
        }
        RightLeftTitlesCellView orCreateRightLeftTitlesCellView = getOrCreateRightLeftTitlesCellView();
        ViewExtKt.show(orCreateRightLeftTitlesCellView);
        orCreateRightLeftTitlesCellView.setIcon(icon, iconTintColor);
        orCreateRightLeftTitlesCellView.setLeftTitle(leftTitle, titlesColor);
        orCreateRightLeftTitlesCellView.setRightTitle(rightTitle, titlesColor);
        orCreateRightLeftTitlesCellView.setSeparatorVisibility(showSeparator);
    }

    public final void setSeparatorVisibility(boolean show) {
        ViewExtKt.showOrGone(this.separatorView, Boolean.valueOf(show));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookBarView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.separatorV);
        view.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(0.5d, context)));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutralInverted));
        addView(view);
        this.separatorView = view;
        setId(R$id.addressBookBarLl);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, R$id.separatorV, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, R$id.separatorV, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.separatorV, 0, 0, 4, null);
        dVar.f(this);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setForeground(C7232a.a(context, R$drawable.ripple_rect_bluewave));
    }
}
