package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetDocsTableDocumentBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final Layer clickableArea;

    @NonNull
    public final HorizontalFlexAtomsLayout controlsAtom;

    @NonNull
    public final TextAtomV2View dateInfo;

    @NonNull
    public final View divider;

    @NonNull
    public final CellView headerCell;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space space;

    @NonNull
    public final IconView statusIcon;

    @NonNull
    public final TextAtomV2View statusInfo;

    @NonNull
    public final TextAtomV2View statusTitle;

    @NonNull
    public final TextAtomV2View sum;

    private WidgetDocsTableDocumentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull Layer layer, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull CellView cellView, @NonNull Space space, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.clickableArea = layer;
        this.controlsAtom = horizontalFlexAtomsLayout;
        this.dateInfo = textAtomV2View;
        this.divider = view;
        this.headerCell = cellView;
        this.space = space;
        this.statusIcon = iconView;
        this.statusInfo = textAtomV2View2;
        this.statusTitle = textAtomV2View3;
        this.sum = textAtomV2View4;
    }

    @NonNull
    public static WidgetDocsTableDocumentBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.clickableArea;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.controlsAtom;
                HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                if (horizontalFlexAtomsLayout != null) {
                    i11 = R$id.dateInfo;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.divider), view)) != null) {
                        i11 = R$id.headerCell;
                        CellView cellView = (CellView) C2548q.d(i11, view);
                        if (cellView != null) {
                            i11 = R$id.space;
                            Space space = (Space) C2548q.d(i11, view);
                            if (space != null) {
                                i11 = R$id.statusIcon;
                                IconView iconView = (IconView) C2548q.d(i11, view);
                                if (iconView != null) {
                                    i11 = R$id.statusInfo;
                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View2 != null) {
                                        i11 = R$id.statusTitle;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View3 != null) {
                                            i11 = R$id.sum;
                                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View4 != null) {
                                                return new WidgetDocsTableDocumentBinding((ConstraintLayout) view, badgeView, layer, horizontalFlexAtomsLayout, textAtomV2View, d11, cellView, space, iconView, textAtomV2View2, textAtomV2View3, textAtomV2View4);
                                            }
                                        }
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
