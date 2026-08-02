package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemAdditionalLuggageBaseTariffInfoV2Binding implements a {

    @NonNull
    public final TextAtomView baseTariffInfoV2HandCarryLabelTextView;

    @NonNull
    public final TextAtomView baseTariffInfoV2HandCarryTextView;

    @NonNull
    public final Barrier baseTariffInfoV2HorizontalBarrier;

    @NonNull
    public final TextAtomView baseTariffInfoV2LuggageLabelTextView;

    @NonNull
    public final TextAtomView baseTariffInfoV2LuggageTextView;

    @NonNull
    public final ConstraintLayout baseTariffInfoV2Root;

    @NonNull
    public final TextAtomView baseTariffInfoV2SubtitleTextView;

    @NonNull
    public final TextAtomView baseTariffInfoV2TitleTextView;

    @NonNull
    public final Barrier baseTariffInfoV2VerticalBarrier;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemAdditionalLuggageBaseTariffInfoV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView5, @NonNull TextAtomView textAtomView6, @NonNull Barrier barrier2) {
        this.rootView = constraintLayout;
        this.baseTariffInfoV2HandCarryLabelTextView = textAtomView;
        this.baseTariffInfoV2HandCarryTextView = textAtomView2;
        this.baseTariffInfoV2HorizontalBarrier = barrier;
        this.baseTariffInfoV2LuggageLabelTextView = textAtomView3;
        this.baseTariffInfoV2LuggageTextView = textAtomView4;
        this.baseTariffInfoV2Root = constraintLayout2;
        this.baseTariffInfoV2SubtitleTextView = textAtomView5;
        this.baseTariffInfoV2TitleTextView = textAtomView6;
        this.baseTariffInfoV2VerticalBarrier = barrier2;
    }

    @NonNull
    public static ItemAdditionalLuggageBaseTariffInfoV2Binding bind(@NonNull View view) {
        int i11 = R$id.baseTariffInfoV2HandCarryLabelTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.baseTariffInfoV2HandCarryTextView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.baseTariffInfoV2HorizontalBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.baseTariffInfoV2LuggageLabelTextView;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.baseTariffInfoV2LuggageTextView;
                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView4 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.baseTariffInfoV2SubtitleTextView;
                            TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView5 != null) {
                                i11 = R$id.baseTariffInfoV2TitleTextView;
                                TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView6 != null) {
                                    i11 = R$id.baseTariffInfoV2VerticalBarrier;
                                    Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                    if (barrier2 != null) {
                                        return new ItemAdditionalLuggageBaseTariffInfoV2Binding(constraintLayout, textAtomView, textAtomView2, barrier, textAtomView3, textAtomView4, constraintLayout, textAtomView5, textAtomView6, barrier2);
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

    @NonNull
    public static ItemAdditionalLuggageBaseTariffInfoV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_luggage_base_tariff_info_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
