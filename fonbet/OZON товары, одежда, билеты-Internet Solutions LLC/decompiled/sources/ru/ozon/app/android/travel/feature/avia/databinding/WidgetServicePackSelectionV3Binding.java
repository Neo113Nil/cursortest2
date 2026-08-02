package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetServicePackSelectionV3Binding implements a {

    @NonNull
    public final RecyclerView benefitsListRV;

    @NonNull
    public final LargeBorderlessButtonView declineButtonLbbv;

    @NonNull
    public final LargeButtonView largeButtonLBV;

    @NonNull
    public final TextAtomView priceDescriptionTAV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout smsBlockCL;

    @NonNull
    public final CheckBox smsCheckBoxCB;

    @NonNull
    public final TextAtomView smsDescriptionTAV;

    @NonNull
    public final PriceView smsPriceV;

    @NonNull
    public final BadgeView smsSaleBadgeBV;

    @NonNull
    public final TextAtomView smsTitleTAV;

    @NonNull
    public final TextAtomView travelServicePackSelectionV3TitleTAV;

    @NonNull
    public final FlexboxLayout travelServicePackV3GroupLayout;

    private WidgetServicePackSelectionV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull ConstraintLayout constraintLayout2, @NonNull CheckBox checkBox, @NonNull TextAtomView textAtomView2, @NonNull PriceView priceView, @NonNull BadgeView badgeView, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull FlexboxLayout flexboxLayout) {
        this.rootView = constraintLayout;
        this.benefitsListRV = recyclerView;
        this.declineButtonLbbv = largeBorderlessButtonView;
        this.largeButtonLBV = largeButtonView;
        this.priceDescriptionTAV = textAtomView;
        this.smsBlockCL = constraintLayout2;
        this.smsCheckBoxCB = checkBox;
        this.smsDescriptionTAV = textAtomView2;
        this.smsPriceV = priceView;
        this.smsSaleBadgeBV = badgeView;
        this.smsTitleTAV = textAtomView3;
        this.travelServicePackSelectionV3TitleTAV = textAtomView4;
        this.travelServicePackV3GroupLayout = flexboxLayout;
    }

    @NonNull
    public static WidgetServicePackSelectionV3Binding bind(@NonNull View view) {
        int i11 = R$id.benefitsListRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.declineButtonLbbv;
            LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
            if (largeBorderlessButtonView != null) {
                i11 = R$id.largeButtonLBV;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.priceDescriptionTAV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.smsBlockCL;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout != null) {
                            i11 = R$id.smsCheckBoxCB;
                            CheckBox checkBox = (CheckBox) C2548q.d(i11, view);
                            if (checkBox != null) {
                                i11 = R$id.smsDescriptionTAV;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    i11 = R$id.smsPriceV;
                                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                                    if (priceView != null) {
                                        i11 = R$id.smsSaleBadgeBV;
                                        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                        if (badgeView != null) {
                                            i11 = R$id.smsTitleTAV;
                                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView3 != null) {
                                                i11 = R$id.travelServicePackSelectionV3TitleTAV;
                                                TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView4 != null) {
                                                    i11 = R$id.travelServicePackV3GroupLayout;
                                                    FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
                                                    if (flexboxLayout != null) {
                                                        return new WidgetServicePackSelectionV3Binding((ConstraintLayout) view, recyclerView, largeBorderlessButtonView, largeButtonView, textAtomView, constraintLayout, checkBox, textAtomView2, priceView, badgeView, textAtomView3, textAtomView4, flexboxLayout);
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
