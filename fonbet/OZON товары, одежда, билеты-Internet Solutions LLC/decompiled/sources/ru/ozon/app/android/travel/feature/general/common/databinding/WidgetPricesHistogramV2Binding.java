package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.toggle.ToggleTitleSubtitleCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.chip.ChipView;

/* loaded from: classes3.dex */
public final class WidgetPricesHistogramV2Binding implements a {

    @NonNull
    public final ImageView arrowIconPricesHistogramV2IV;

    @NonNull
    public final ChipView chipBackPricesHistogramV2CV;

    @NonNull
    public final ChipView chipTherePricesHistogramV2CV;

    @NonNull
    public final RecyclerView daysPricesHistogramV2RV;

    @NonNull
    public final ButtonV3View findTicketsPricesHistogramV2BV;

    @NonNull
    public final TextAtomV2View leftMonthPricesHistogramV2TV;

    @NonNull
    public final RecyclerView monthsPricesHistogramV2RV;

    @NonNull
    public final TextAtomV2View rightMonthPricesHistogramV2TV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View selectedDatesPricesHistogramV2TAV;

    @NonNull
    public final TextAtomV2View selectedPricesHistogramV2TAV;

    @NonNull
    public final TextAtomV2View titlePricesHistogramV2TAV;

    @NonNull
    public final ToggleTitleSubtitleCellView togglePricesHistogramV2TTSCV;

    @NonNull
    public final FrameLayout toggleWrapperPricesHistogramV2FL;

    private WidgetPricesHistogramV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ChipView chipView, @NonNull ChipView chipView2, @NonNull RecyclerView recyclerView, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView2, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4, @NonNull TextAtomV2View textAtomV2View5, @NonNull ToggleTitleSubtitleCellView toggleTitleSubtitleCellView, @NonNull FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.arrowIconPricesHistogramV2IV = imageView;
        this.chipBackPricesHistogramV2CV = chipView;
        this.chipTherePricesHistogramV2CV = chipView2;
        this.daysPricesHistogramV2RV = recyclerView;
        this.findTicketsPricesHistogramV2BV = buttonV3View;
        this.leftMonthPricesHistogramV2TV = textAtomV2View;
        this.monthsPricesHistogramV2RV = recyclerView2;
        this.rightMonthPricesHistogramV2TV = textAtomV2View2;
        this.selectedDatesPricesHistogramV2TAV = textAtomV2View3;
        this.selectedPricesHistogramV2TAV = textAtomV2View4;
        this.titlePricesHistogramV2TAV = textAtomV2View5;
        this.togglePricesHistogramV2TTSCV = toggleTitleSubtitleCellView;
        this.toggleWrapperPricesHistogramV2FL = frameLayout;
    }

    @NonNull
    public static WidgetPricesHistogramV2Binding bind(@NonNull View view) {
        int i11 = R$id.arrowIconPricesHistogramV2IV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.chipBackPricesHistogramV2CV;
            ChipView chipView = (ChipView) C2548q.d(i11, view);
            if (chipView != null) {
                i11 = R$id.chipTherePricesHistogramV2CV;
                ChipView chipView2 = (ChipView) C2548q.d(i11, view);
                if (chipView2 != null) {
                    i11 = R$id.daysPricesHistogramV2RV;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.findTicketsPricesHistogramV2BV;
                        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                        if (buttonV3View != null) {
                            i11 = R$id.leftMonthPricesHistogramV2TV;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View != null) {
                                i11 = R$id.monthsPricesHistogramV2RV;
                                RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView2 != null) {
                                    i11 = R$id.rightMonthPricesHistogramV2TV;
                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View2 != null) {
                                        i11 = R$id.selectedDatesPricesHistogramV2TAV;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View3 != null) {
                                            i11 = R$id.selectedPricesHistogramV2TAV;
                                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View4 != null) {
                                                i11 = R$id.titlePricesHistogramV2TAV;
                                                TextAtomV2View textAtomV2View5 = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View5 != null) {
                                                    i11 = R$id.togglePricesHistogramV2TTSCV;
                                                    ToggleTitleSubtitleCellView toggleTitleSubtitleCellView = (ToggleTitleSubtitleCellView) C2548q.d(i11, view);
                                                    if (toggleTitleSubtitleCellView != null) {
                                                        i11 = R$id.toggleWrapperPricesHistogramV2FL;
                                                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                                        if (frameLayout != null) {
                                                            return new WidgetPricesHistogramV2Binding((ConstraintLayout) view, imageView, chipView, chipView2, recyclerView, buttonV3View, textAtomV2View, recyclerView2, textAtomV2View2, textAtomV2View3, textAtomV2View4, textAtomV2View5, toggleTitleSubtitleCellView, frameLayout);
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
