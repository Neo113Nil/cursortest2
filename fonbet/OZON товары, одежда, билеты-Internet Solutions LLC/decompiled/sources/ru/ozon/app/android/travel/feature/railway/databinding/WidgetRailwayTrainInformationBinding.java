package ru.ozon.app.android.travel.feature.railway.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.molecules.view.timer.TimerView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetRailwayTrainInformationBinding implements a {

    @NonNull
    public final TextAtomView railwayTrainInformationDescriptionTav;

    @NonNull
    public final TextAtomView railwayTrainInformationLocalTimeInfoTav;

    @NonNull
    public final PriceView railwayTrainInformationPricePv;

    @NonNull
    public final RecyclerView railwayTrainInformationSegmentsRv;

    @NonNull
    public final TimerView railwayTrainInformationTimerTv;

    @NonNull
    public final TextAtomView railwayTrainInformationTitleTav;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    private WidgetRailwayTrainInformationBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull PriceView priceView, @NonNull RecyclerView recyclerView, @NonNull TimerView timerView, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayoutWithBorder;
        this.railwayTrainInformationDescriptionTav = textAtomView;
        this.railwayTrainInformationLocalTimeInfoTav = textAtomView2;
        this.railwayTrainInformationPricePv = priceView;
        this.railwayTrainInformationSegmentsRv = recyclerView;
        this.railwayTrainInformationTimerTv = timerView;
        this.railwayTrainInformationTitleTav = textAtomView3;
    }

    @NonNull
    public static WidgetRailwayTrainInformationBinding bind(@NonNull View view) {
        int i11 = R$id.railwayTrainInformationDescriptionTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.railwayTrainInformationLocalTimeInfoTav;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.railwayTrainInformationPricePv;
                PriceView priceView = (PriceView) C2548q.d(i11, view);
                if (priceView != null) {
                    i11 = R$id.railwayTrainInformationSegmentsRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.railwayTrainInformationTimerTv;
                        TimerView timerView = (TimerView) C2548q.d(i11, view);
                        if (timerView != null) {
                            i11 = R$id.railwayTrainInformationTitleTav;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                return new WidgetRailwayTrainInformationBinding((ConstraintLayoutWithBorder) view, textAtomView, textAtomView2, priceView, recyclerView, timerView, textAtomView3);
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
