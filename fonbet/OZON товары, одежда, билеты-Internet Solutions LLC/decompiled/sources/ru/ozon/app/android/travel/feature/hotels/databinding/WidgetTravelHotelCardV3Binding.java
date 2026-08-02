package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelHotelCardV3Binding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final TextAtomView travelHotelCardV3AddressTv;

    @NonNull
    public final FlexboxLayout travelHotelCardV3BadgesFl;

    @NonNull
    public final Barrier travelHotelCardV3Barrier;

    @NonNull
    public final TextAtomView travelHotelCardV3CheckInDateTv;

    @NonNull
    public final TextAtomView travelHotelCardV3CheckInTitleTv;

    @NonNull
    public final TextAtomView travelHotelCardV3CheckOutDateTv;

    @NonNull
    public final TextAtomView travelHotelCardV3CheckOutTitleTv;

    @NonNull
    public final TextAtomView travelHotelCardV3NameTv;

    @NonNull
    public final TextAtomView travelHotelCardV3PriceDescriptionTv;

    @NonNull
    public final PriceView travelHotelCardV3TotalPricePv;

    private WidgetTravelHotelCardV3Binding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull TextAtomView textAtomView, @NonNull FlexboxLayout flexboxLayout, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull TextAtomView textAtomView6, @NonNull TextAtomView textAtomView7, @NonNull PriceView priceView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelHotelCardV3AddressTv = textAtomView;
        this.travelHotelCardV3BadgesFl = flexboxLayout;
        this.travelHotelCardV3Barrier = barrier;
        this.travelHotelCardV3CheckInDateTv = textAtomView2;
        this.travelHotelCardV3CheckInTitleTv = textAtomView3;
        this.travelHotelCardV3CheckOutDateTv = textAtomView4;
        this.travelHotelCardV3CheckOutTitleTv = textAtomView5;
        this.travelHotelCardV3NameTv = textAtomView6;
        this.travelHotelCardV3PriceDescriptionTv = textAtomView7;
        this.travelHotelCardV3TotalPricePv = priceView;
    }

    @NonNull
    public static WidgetTravelHotelCardV3Binding bind(@NonNull View view) {
        int i11 = R$id.travelHotelCardV3AddressTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.travelHotelCardV3BadgesFl;
            FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
            if (flexboxLayout != null) {
                i11 = R$id.travelHotelCardV3Barrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.travelHotelCardV3CheckInDateTv;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.travelHotelCardV3CheckInTitleTv;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            i11 = R$id.travelHotelCardV3CheckOutDateTv;
                            TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView4 != null) {
                                i11 = R$id.travelHotelCardV3CheckOutTitleTv;
                                TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView5 != null) {
                                    i11 = R$id.travelHotelCardV3NameTv;
                                    TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView6 != null) {
                                        i11 = R$id.travelHotelCardV3PriceDescriptionTv;
                                        TextAtomView textAtomView7 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView7 != null) {
                                            i11 = R$id.travelHotelCardV3TotalPricePv;
                                            PriceView priceView = (PriceView) C2548q.d(i11, view);
                                            if (priceView != null) {
                                                return new WidgetTravelHotelCardV3Binding((ConstraintLayoutWithBorder) view, textAtomView, flexboxLayout, barrier, textAtomView2, textAtomView3, textAtomView4, textAtomView5, textAtomView6, textAtomView7, priceView);
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
    public ConstraintLayoutWithBorder getConstraintLayout() {
        return this.rootView;
    }
}
