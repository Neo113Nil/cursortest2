package ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.presentation;

import B90.C2618u;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.domain.EmployeesTableVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015J$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J\f\u0010\u001e\u001a\u00020\u0011*\u00020\u001dH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/presentation/EmployeeItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cellViewsPool", "", "Lru/ozon/uni/android/cell/CellView;", "cellsContainer", "Landroid/widget/LinearLayout;", "approveButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "rejectButton", "separator", "Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindCells", "getOrCreateCell", "index", "", "bindButtons", "buttonsVO", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "setButtonsPaddings", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmployeeItemView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View approveButton;

    @NotNull
    private final List<CellView> cellViewsPool;

    @NotNull
    private final LinearLayout cellsContainer;

    @NotNull
    private final ButtonV3View rejectButton;

    @NotNull
    private final View separator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int separatorHeight = ResourceExtKt.toPx(0.5d);
    private static final int buttonsGap = ResourceExtKt.toPx(Paddings.PADDING_300.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/presentation/EmployeeItemView$Companion;", "", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cellViewsPool = new ArrayList();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.cellsContainer);
        linearLayout.setOrientation(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        linearLayout.setLayoutParams(bVar);
        addView(linearLayout);
        this.cellsContainer = linearLayout;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.approveButton, 0, -2);
        e11.f41638j = linearLayout.getId();
        e11.f41656t = 0;
        e11.f41657u = R$id.rejectButton;
        e11.f41601H = 1.0f;
        e11.f41642l = 0;
        buttonV3View.setLayoutParams(e11);
        buttonV3View.setVisibility(8);
        addView(buttonV3View);
        this.approveButton = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e12 = C2618u.e(buttonV3View2, R$id.rejectButton, 0, -2);
        e12.f41638j = linearLayout.getId();
        e12.f41655s = R$id.approveButton;
        e12.f41658v = 0;
        e12.f41601H = 1.0f;
        e12.f41642l = 0;
        buttonV3View2.setLayoutParams(e12);
        buttonV3View2.setVisibility(8);
        addView(buttonV3View2);
        this.rejectButton = buttonV3View2;
        View view = new View(context);
        view.setId(R$id.separator);
        view.setVisibility(8);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, separatorHeight);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = 0;
        view.setLayoutParams(bVar2);
        addView(view);
        this.separator = view;
    }

    private final void bindButtons(EmployeesTableVO.ButtonsVO buttonsVO, Function1<? super AtomAction, Unit> actionHandler) {
        boolean z11 = buttonsVO != null;
        ViewExtKt.gone(this.separator);
        ViewExtKt.showOrGone(this.approveButton, Boolean.valueOf(z11));
        ViewExtKt.showOrGone(this.rejectButton, Boolean.valueOf(z11));
        if (buttonsVO != null) {
            setButtonsPaddings(buttonsVO);
            ButtonV3HolderKt.bindOrGone(this.approveButton, (ButtonV3DTO) C7714v.Q(0, buttonsVO.getButtons()), actionHandler);
            ButtonV3HolderKt.bindOrGone(this.rejectButton, (ButtonV3DTO) C7714v.Q(1, buttonsVO.getButtons()), actionHandler);
            ViewExtKt.showOrGone(this.separator, Boolean.valueOf(!buttonsVO.getSettings().getDisableSeparator()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindCells(EmployeesTableVO item, Function1<? super AtomAction, Unit> actionHandler) {
        List<CellDTO> cells = item.getCells();
        if (cells != null) {
            if (cells.isEmpty()) {
                cells = null;
            }
        }
        cells = C7714v.c0(item.getCell());
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellHolderKt.bind(getOrCreateCell(i11), (CellDTO) obj, actionHandler);
            i11 = i12;
        }
        if (cells.size() < this.cellViewsPool.size()) {
            this.cellsContainer.removeViews(cells.size(), this.cellViewsPool.size() - cells.size());
            this.cellViewsPool.subList(cells.size(), this.cellViewsPool.size()).clear();
        }
    }

    private final CellView getOrCreateCell(int index) {
        if (index < this.cellViewsPool.size()) {
            return this.cellViewsPool.get(index);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.cellsContainer.addView(cellView);
        this.cellViewsPool.add(cellView);
        return cellView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r11 != (r7 != null ? r7.bottomMargin : 0)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        if (r11 != (r0 != null ? r0.bottomMargin : 0)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setButtonsPaddings(EmployeesTableVO.ButtonsVO buttonsVO) {
        int px = ResourceExtKt.toPx(buttonsVO.getSettings().getTopPadding().getPx());
        int px2 = ResourceExtKt.toPx(buttonsVO.getSettings().getBottomPadding().getPx());
        int px3 = ResourceExtKt.toPx(buttonsVO.getSettings().getLeftPadding().getPx());
        int px4 = ResourceExtKt.toPx(buttonsVO.getSettings().getRightPadding().getPx());
        boolean z11 = buttonsVO.getButtons().size() == 1;
        ButtonV3View buttonV3View = this.approveButton;
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = px;
            marginLayoutParams.bottomMargin = px2;
            marginLayoutParams.leftMargin = px3;
            marginLayoutParams.rightMargin = z11 ? px4 : buttonsGap / 2;
            if (i11 == px3) {
                ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = buttonV3View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = buttonV3View.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            buttonV3View.setLayoutParams(marginLayoutParams);
        }
        ButtonV3View buttonV3View2 = this.rejectButton;
        ViewGroup.LayoutParams layoutParams5 = buttonV3View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 != null) {
            int i15 = marginLayoutParams5.leftMargin;
            int i16 = marginLayoutParams5.topMargin;
            int i17 = marginLayoutParams5.rightMargin;
            int i18 = marginLayoutParams5.bottomMargin;
            marginLayoutParams5.topMargin = px;
            marginLayoutParams5.bottomMargin = px2;
            int i19 = z11 ? px3 : buttonsGap / 2;
            marginLayoutParams5.leftMargin = i19;
            marginLayoutParams5.rightMargin = px4;
            if (i15 == i19) {
                ViewGroup.LayoutParams layoutParams6 = buttonV3View2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (i16 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams7 = buttonV3View2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams8 = buttonV3View2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    }
                }
            }
            buttonV3View2.setLayoutParams(marginLayoutParams5);
        }
        View view = this.separator;
        ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams9 == null) {
            return;
        }
        int i21 = marginLayoutParams9.leftMargin;
        int i22 = marginLayoutParams9.topMargin;
        int i23 = marginLayoutParams9.rightMargin;
        int i24 = marginLayoutParams9.bottomMargin;
        marginLayoutParams9.leftMargin = px3;
        marginLayoutParams9.rightMargin = 0;
        marginLayoutParams9.bottomMargin = 0;
        if (i21 == px3) {
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            if (i22 == (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams11 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                if (i23 == (marginLayoutParams11 != null ? marginLayoutParams11.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams12 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                    if (i24 == (marginLayoutParams12 != null ? marginLayoutParams12.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        view.setLayoutParams(marginLayoutParams9);
    }

    public final void bind(@NotNull EmployeesTableVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindCells(item, actionHandler);
        bindButtons(item.getButtons(), actionHandler);
    }
}
