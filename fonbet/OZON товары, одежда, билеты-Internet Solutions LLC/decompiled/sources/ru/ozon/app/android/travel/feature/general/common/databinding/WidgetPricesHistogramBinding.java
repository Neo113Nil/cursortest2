package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetPricesHistogramBinding implements a {

    @NonNull
    public final ImageView arrowIconFromPriceHistogramIV;

    @NonNull
    public final ImageView arrowIconToPriceHistogramIV;

    @NonNull
    public final SmallBorderlessButtonView cancelPricesHistogramBtn;

    @NonNull
    public final RecyclerView daysFromPriceHistogramRV;

    @NonNull
    public final RecyclerView daysToPriceHistogramRV;

    @NonNull
    public final LargeButtonView findTicketsPriceHistogramBtn;

    @NonNull
    public final TextAtomView leftMonthFromPricesHistogramTV;

    @NonNull
    public final TextAtomView leftMonthToPricesHistogramTV;

    @NonNull
    public final RecyclerView monthsFromPriceHistogramRV;

    @NonNull
    public final RecyclerView monthsToPriceHistogramRV;

    @NonNull
    public final TextAtomView rightMonthFromPricesHistogramTV;

    @NonNull
    public final TextAtomView rightMonthToPricesHistogramTV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView selectedDateFromTAV;

    @NonNull
    public final TextAtomView selectedDateToTAV;

    @NonNull
    public final TextAtomView selectedPriceFromTAV;

    @NonNull
    public final TextAtomView selectedPriceToTAV;

    @NonNull
    public final TextAtomView titleFromPricesHistogramTAV;

    @NonNull
    public final TextAtomView titlePricesHistogramTAV;

    @NonNull
    public final TextAtomView titleToPricesHistogramTAV;

    private WidgetPricesHistogramBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull RecyclerView recyclerView3, @NonNull RecyclerView recyclerView4, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull TextAtomView textAtomView6, @NonNull TextAtomView textAtomView7, @NonNull TextAtomView textAtomView8, @NonNull TextAtomView textAtomView9, @NonNull TextAtomView textAtomView10, @NonNull TextAtomView textAtomView11) {
        this.rootView = constraintLayout;
        this.arrowIconFromPriceHistogramIV = imageView;
        this.arrowIconToPriceHistogramIV = imageView2;
        this.cancelPricesHistogramBtn = smallBorderlessButtonView;
        this.daysFromPriceHistogramRV = recyclerView;
        this.daysToPriceHistogramRV = recyclerView2;
        this.findTicketsPriceHistogramBtn = largeButtonView;
        this.leftMonthFromPricesHistogramTV = textAtomView;
        this.leftMonthToPricesHistogramTV = textAtomView2;
        this.monthsFromPriceHistogramRV = recyclerView3;
        this.monthsToPriceHistogramRV = recyclerView4;
        this.rightMonthFromPricesHistogramTV = textAtomView3;
        this.rightMonthToPricesHistogramTV = textAtomView4;
        this.selectedDateFromTAV = textAtomView5;
        this.selectedDateToTAV = textAtomView6;
        this.selectedPriceFromTAV = textAtomView7;
        this.selectedPriceToTAV = textAtomView8;
        this.titleFromPricesHistogramTAV = textAtomView9;
        this.titlePricesHistogramTAV = textAtomView10;
        this.titleToPricesHistogramTAV = textAtomView11;
    }

    @NonNull
    public static WidgetPricesHistogramBinding bind(@NonNull View view) {
        int i11 = R$id.arrowIconFromPriceHistogramIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.arrowIconToPriceHistogramIV;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.cancelPricesHistogramBtn;
                SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                if (smallBorderlessButtonView != null) {
                    i11 = R$id.daysFromPriceHistogramRV;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.daysToPriceHistogramRV;
                        RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView2 != null) {
                            i11 = R$id.findTicketsPriceHistogramBtn;
                            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                            if (largeButtonView != null) {
                                i11 = R$id.leftMonthFromPricesHistogramTV;
                                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView != null) {
                                    i11 = R$id.leftMonthToPricesHistogramTV;
                                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView2 != null) {
                                        i11 = R$id.monthsFromPriceHistogramRV;
                                        RecyclerView recyclerView3 = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView3 != null) {
                                            i11 = R$id.monthsToPriceHistogramRV;
                                            RecyclerView recyclerView4 = (RecyclerView) C2548q.d(i11, view);
                                            if (recyclerView4 != null) {
                                                i11 = R$id.rightMonthFromPricesHistogramTV;
                                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView3 != null) {
                                                    i11 = R$id.rightMonthToPricesHistogramTV;
                                                    TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                                    if (textAtomView4 != null) {
                                                        i11 = R$id.selectedDateFromTAV;
                                                        TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                                        if (textAtomView5 != null) {
                                                            i11 = R$id.selectedDateToTAV;
                                                            TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                                            if (textAtomView6 != null) {
                                                                i11 = R$id.selectedPriceFromTAV;
                                                                TextAtomView textAtomView7 = (TextAtomView) C2548q.d(i11, view);
                                                                if (textAtomView7 != null) {
                                                                    i11 = R$id.selectedPriceToTAV;
                                                                    TextAtomView textAtomView8 = (TextAtomView) C2548q.d(i11, view);
                                                                    if (textAtomView8 != null) {
                                                                        i11 = R$id.titleFromPricesHistogramTAV;
                                                                        TextAtomView textAtomView9 = (TextAtomView) C2548q.d(i11, view);
                                                                        if (textAtomView9 != null) {
                                                                            i11 = R$id.titlePricesHistogramTAV;
                                                                            TextAtomView textAtomView10 = (TextAtomView) C2548q.d(i11, view);
                                                                            if (textAtomView10 != null) {
                                                                                i11 = R$id.titleToPricesHistogramTAV;
                                                                                TextAtomView textAtomView11 = (TextAtomView) C2548q.d(i11, view);
                                                                                if (textAtomView11 != null) {
                                                                                    return new WidgetPricesHistogramBinding((ConstraintLayout) view, imageView, imageView2, smallBorderlessButtonView, recyclerView, recyclerView2, largeButtonView, textAtomView, textAtomView2, recyclerView3, recyclerView4, textAtomView3, textAtomView4, textAtomView5, textAtomView6, textAtomView7, textAtomView8, textAtomView9, textAtomView10, textAtomView11);
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
