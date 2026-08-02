package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetTariffLuggageV2Binding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout tariffLuggageCL;

    @NonNull
    public final Barrier tariffLuggageV2BarrierB;

    @NonNull
    public final View tariffLuggageV2HeaderV;

    @NonNull
    public final AppCompatImageView tariffLuggageV2IV;

    @NonNull
    public final TextAtomView tariffLuggageV2PriceDescriptionTAV;

    @NonNull
    public final RecyclerView tariffLuggageV2RV;

    @NonNull
    public final SmallButtonView tariffLuggageV2SBV;

    @NonNull
    public final TextAtomView tariffLuggageV2SubtitleTAV;

    @NonNull
    public final TextAtomView tariffLuggageV2TextInfoTAV;

    @NonNull
    public final TextAtomView tariffLuggageV2TitleTAV;

    @NonNull
    public final TextAtomView tariffLuggageV2TotalPriceTAV;

    private WidgetTariffLuggageV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull RecyclerView recyclerView, @NonNull SmallButtonView smallButtonView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5) {
        this.rootView = constraintLayout;
        this.tariffLuggageCL = constraintLayout2;
        this.tariffLuggageV2BarrierB = barrier;
        this.tariffLuggageV2HeaderV = view;
        this.tariffLuggageV2IV = appCompatImageView;
        this.tariffLuggageV2PriceDescriptionTAV = textAtomView;
        this.tariffLuggageV2RV = recyclerView;
        this.tariffLuggageV2SBV = smallButtonView;
        this.tariffLuggageV2SubtitleTAV = textAtomView2;
        this.tariffLuggageV2TextInfoTAV = textAtomView3;
        this.tariffLuggageV2TitleTAV = textAtomView4;
        this.tariffLuggageV2TotalPriceTAV = textAtomView5;
    }

    @NonNull
    public static WidgetTariffLuggageV2Binding bind(@NonNull View view) {
        View d11;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.tariffLuggageV2BarrierB;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null && (d11 = C2548q.d((i11 = R$id.tariffLuggageV2HeaderV), view)) != null) {
            i11 = R$id.tariffLuggageV2IV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.tariffLuggageV2PriceDescriptionTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.tariffLuggageV2RV;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.tariffLuggageV2SBV;
                        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                        if (smallButtonView != null) {
                            i11 = R$id.tariffLuggageV2SubtitleTAV;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                i11 = R$id.tariffLuggageV2TextInfoTAV;
                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView3 != null) {
                                    i11 = R$id.tariffLuggageV2TitleTAV;
                                    TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView4 != null) {
                                        i11 = R$id.tariffLuggageV2TotalPriceTAV;
                                        TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView5 != null) {
                                            return new WidgetTariffLuggageV2Binding(constraintLayout, constraintLayout, barrier, d11, appCompatImageView, textAtomView, recyclerView, smallButtonView, textAtomView2, textAtomView3, textAtomView4, textAtomView5);
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
