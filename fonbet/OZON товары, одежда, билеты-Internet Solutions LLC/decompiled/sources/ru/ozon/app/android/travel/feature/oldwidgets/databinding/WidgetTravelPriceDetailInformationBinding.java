package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelPriceDetailInformationBinding implements a {

    @NonNull
    public final BadgeView bonusBtn;

    @NonNull
    public final SmallIconButtonView infoButton;

    @NonNull
    public final LargeButtonView largeButton;

    @NonNull
    public final TextAtomView priceDetailAdditionalInfoTextView;

    @NonNull
    public final LinearLayout pricesContainerLL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorBonusView;

    @NonNull
    public final View separatorView;

    @NonNull
    public final TextView subtitleTV;

    @NonNull
    public final TextView titleTV;

    @NonNull
    public final TextView totalPriceTV;

    @NonNull
    public final TextView totalPriceTitleTV;

    private WidgetTravelPriceDetailInformationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.bonusBtn = badgeView;
        this.infoButton = smallIconButtonView;
        this.largeButton = largeButtonView;
        this.priceDetailAdditionalInfoTextView = textAtomView;
        this.pricesContainerLL = linearLayout;
        this.separatorBonusView = view;
        this.separatorView = view2;
        this.subtitleTV = textView;
        this.titleTV = textView2;
        this.totalPriceTV = textView3;
        this.totalPriceTitleTV = textView4;
    }

    @NonNull
    public static WidgetTravelPriceDetailInformationBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.bonusBtn;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.infoButton;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                i11 = R$id.largeButton;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.priceDetailAdditionalInfoTextView;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.pricesContainerLL;
                        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                        if (linearLayout != null && (d11 = C2548q.d((i11 = R$id.separatorBonusView), view)) != null && (d12 = C2548q.d((i11 = R$id.separatorView), view)) != null) {
                            i11 = R$id.subtitleTV;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                i11 = R$id.titleTV;
                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                if (textView2 != null) {
                                    i11 = R$id.totalPriceTV;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        i11 = R$id.totalPriceTitleTV;
                                        TextView textView4 = (TextView) C2548q.d(i11, view);
                                        if (textView4 != null) {
                                            return new WidgetTravelPriceDetailInformationBinding((ConstraintLayout) view, badgeView, smallIconButtonView, largeButtonView, textAtomView, linearLayout, d11, d12, textView, textView2, textView3, textView4);
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
