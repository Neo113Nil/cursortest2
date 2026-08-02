package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class ReturnCreationSelectedItemBinding implements a {

    @NonNull
    public final CellView cellCv;

    @NonNull
    public final IconButtonV3View deleteButtonIb;

    @NonNull
    public final TextAtomV2View descriptionTav;

    @NonNull
    public final IconView imageIv;

    @NonNull
    public final TextAtomV2View nameTav;

    @NonNull
    public final Flow priceAndSealBadgeFlow;

    @NonNull
    public final PriceAtomView pricePv;

    @NonNull
    public final ButtonV3View reasonButtonBv;

    @NonNull
    public final HorizontalFlexAtomsLayout reasonImagesHfal;

    @NonNull
    public final LinearLayout reasonInfoContainer;

    @NonNull
    public final TextAtomV2View reasonSubtitleTav;

    @NonNull
    public final TextAtomV2View reasonTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeView sealBadgeView;

    @NonNull
    public final TextAtomV2View validationTav;

    private ReturnCreationSelectedItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellView cellView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View2, @NonNull Flow flow, @NonNull PriceAtomView priceAtomView, @NonNull ButtonV3View buttonV3View, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View5) {
        this.rootView = constraintLayout;
        this.cellCv = cellView;
        this.deleteButtonIb = iconButtonV3View;
        this.descriptionTav = textAtomV2View;
        this.imageIv = iconView;
        this.nameTav = textAtomV2View2;
        this.priceAndSealBadgeFlow = flow;
        this.pricePv = priceAtomView;
        this.reasonButtonBv = buttonV3View;
        this.reasonImagesHfal = horizontalFlexAtomsLayout;
        this.reasonInfoContainer = linearLayout;
        this.reasonSubtitleTav = textAtomV2View3;
        this.reasonTitleTav = textAtomV2View4;
        this.sealBadgeView = badgeView;
        this.validationTav = textAtomV2View5;
    }

    @NonNull
    public static ReturnCreationSelectedItemBinding bind(@NonNull View view) {
        int i11 = R$id.cellCv;
        CellView cellView = (CellView) C2548q.d(i11, view);
        if (cellView != null) {
            i11 = R$id.deleteButtonIb;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.descriptionTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.imageIv;
                    IconView iconView = (IconView) C2548q.d(i11, view);
                    if (iconView != null) {
                        i11 = R$id.nameTav;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.priceAndSealBadgeFlow;
                            Flow flow = (Flow) C2548q.d(i11, view);
                            if (flow != null) {
                                i11 = R$id.pricePv;
                                PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                                if (priceAtomView != null) {
                                    i11 = R$id.reasonButtonBv;
                                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                    if (buttonV3View != null) {
                                        i11 = R$id.reasonImagesHfal;
                                        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                                        if (horizontalFlexAtomsLayout != null) {
                                            i11 = R$id.reasonInfoContainer;
                                            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                            if (linearLayout != null) {
                                                i11 = R$id.reasonSubtitleTav;
                                                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View3 != null) {
                                                    i11 = R$id.reasonTitleTav;
                                                    TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                                                    if (textAtomV2View4 != null) {
                                                        i11 = R$id.sealBadgeView;
                                                        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                                        if (badgeView != null) {
                                                            i11 = R$id.validationTav;
                                                            TextAtomV2View textAtomV2View5 = (TextAtomV2View) C2548q.d(i11, view);
                                                            if (textAtomV2View5 != null) {
                                                                return new ReturnCreationSelectedItemBinding((ConstraintLayout) view, cellView, iconButtonV3View, textAtomV2View, iconView, textAtomV2View2, flow, priceAtomView, buttonV3View, horizontalFlexAtomsLayout, linearLayout, textAtomV2View3, textAtomV2View4, badgeView, textAtomV2View5);
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
