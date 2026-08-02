package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetUserLegalEntitiesV2LayoutBinding implements a {

    @NonNull
    public final TextAtomV2View address;

    @NonNull
    public final CellView cellButton;

    @NonNull
    public final TextAtomV2View companyId;

    @NonNull
    public final HorizontalFlexAtomsLayout controlsAtom;

    @NonNull
    public final IconButtonV3View copyCompanyIdIbv;

    @NonNull
    public final TextAtomV2View payprops;

    @NonNull
    public final IconButtonV3View remove;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetUserLegalEntitiesV2LayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull CellView cellView, @NonNull TextAtomV2View textAtomV2View2, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View3, @NonNull IconButtonV3View iconButtonV3View2, @NonNull TextAtomV2View textAtomV2View4) {
        this.rootView = constraintLayout;
        this.address = textAtomV2View;
        this.cellButton = cellView;
        this.companyId = textAtomV2View2;
        this.controlsAtom = horizontalFlexAtomsLayout;
        this.copyCompanyIdIbv = iconButtonV3View;
        this.payprops = textAtomV2View3;
        this.remove = iconButtonV3View2;
        this.title = textAtomV2View4;
    }

    @NonNull
    public static WidgetUserLegalEntitiesV2LayoutBinding bind(@NonNull View view) {
        int i11 = R$id.address;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.cellButton;
            CellView cellView = (CellView) C2548q.d(i11, view);
            if (cellView != null) {
                i11 = R$id.companyId;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.controlsAtom;
                    HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                    if (horizontalFlexAtomsLayout != null) {
                        i11 = R$id.copyCompanyIdIbv;
                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                        if (iconButtonV3View != null) {
                            i11 = R$id.payprops;
                            TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View3 != null) {
                                i11 = R$id.remove;
                                IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                                if (iconButtonV3View2 != null) {
                                    i11 = R$id.title;
                                    TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View4 != null) {
                                        return new WidgetUserLegalEntitiesV2LayoutBinding((ConstraintLayout) view, textAtomV2View, cellView, textAtomV2View2, horizontalFlexAtomsLayout, iconButtonV3View, textAtomV2View3, iconButtonV3View2, textAtomV2View4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
