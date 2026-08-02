package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetAdditionalLuggageV2Binding implements a {

    @NonNull
    public final ConstraintLayout additionalLuggageV2ActionPaneRoot;

    @NonNull
    public final ConstraintLayout additionalLuggageV2AppBarRoot;

    @NonNull
    public final Barrier additionalLuggageV2Barrier;

    @NonNull
    public final RecyclerView additionalLuggageV2FlightsRecyclerView;

    @NonNull
    public final SmallIconButtonView additionalLuggageV2InfoButton;

    @NonNull
    public final TextAtomView additionalLuggageV2LuggageLabelTextView;

    @NonNull
    public final AppCompatTextView additionalLuggageV2LuggagePriceTextView;

    @NonNull
    public final LargeButtonView additionalLuggageV2SaveButton;

    @NonNull
    public final RecyclerView additionalLuggageV2TabsRecyclerView;

    @NonNull
    public final TextAtomView additionalLuggageV2TitleTextView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RoundedShimmerView shimmer1;

    @NonNull
    public final RoundedShimmerView shimmer2;

    @NonNull
    public final RoundedShimmerView shimmer3;

    @NonNull
    public final Group shimmerGroup;

    private WidgetAdditionalLuggageV2Binding(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier, @NonNull RecyclerView recyclerView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull AppCompatTextView appCompatTextView, @NonNull LargeButtonView largeButtonView, @NonNull RecyclerView recyclerView2, @NonNull TextAtomView textAtomView2, @NonNull RoundedShimmerView roundedShimmerView, @NonNull RoundedShimmerView roundedShimmerView2, @NonNull RoundedShimmerView roundedShimmerView3, @NonNull Group group) {
        this.rootView = frameLayout;
        this.additionalLuggageV2ActionPaneRoot = constraintLayout;
        this.additionalLuggageV2AppBarRoot = constraintLayout2;
        this.additionalLuggageV2Barrier = barrier;
        this.additionalLuggageV2FlightsRecyclerView = recyclerView;
        this.additionalLuggageV2InfoButton = smallIconButtonView;
        this.additionalLuggageV2LuggageLabelTextView = textAtomView;
        this.additionalLuggageV2LuggagePriceTextView = appCompatTextView;
        this.additionalLuggageV2SaveButton = largeButtonView;
        this.additionalLuggageV2TabsRecyclerView = recyclerView2;
        this.additionalLuggageV2TitleTextView = textAtomView2;
        this.shimmer1 = roundedShimmerView;
        this.shimmer2 = roundedShimmerView2;
        this.shimmer3 = roundedShimmerView3;
        this.shimmerGroup = group;
    }

    @NonNull
    public static WidgetAdditionalLuggageV2Binding bind(@NonNull View view) {
        int i11 = R$id.additionalLuggageV2ActionPaneRoot;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.additionalLuggageV2AppBarRoot;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout2 != null) {
                i11 = R$id.additionalLuggageV2Barrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.additionalLuggageV2FlightsRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.additionalLuggageV2InfoButton;
                        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                        if (smallIconButtonView != null) {
                            i11 = R$id.additionalLuggageV2LuggageLabelTextView;
                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView != null) {
                                i11 = R$id.additionalLuggageV2LuggagePriceTextView;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView != null) {
                                    i11 = R$id.additionalLuggageV2SaveButton;
                                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                                    if (largeButtonView != null) {
                                        i11 = R$id.additionalLuggageV2TabsRecyclerView;
                                        RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView2 != null) {
                                            i11 = R$id.additionalLuggageV2TitleTextView;
                                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView2 != null) {
                                                i11 = R$id.shimmer1;
                                                RoundedShimmerView roundedShimmerView = (RoundedShimmerView) C2548q.d(i11, view);
                                                if (roundedShimmerView != null) {
                                                    i11 = R$id.shimmer2;
                                                    RoundedShimmerView roundedShimmerView2 = (RoundedShimmerView) C2548q.d(i11, view);
                                                    if (roundedShimmerView2 != null) {
                                                        i11 = R$id.shimmer3;
                                                        RoundedShimmerView roundedShimmerView3 = (RoundedShimmerView) C2548q.d(i11, view);
                                                        if (roundedShimmerView3 != null) {
                                                            i11 = R$id.shimmerGroup;
                                                            Group group = (Group) C2548q.d(i11, view);
                                                            if (group != null) {
                                                                return new WidgetAdditionalLuggageV2Binding((FrameLayout) view, constraintLayout, constraintLayout2, barrier, recyclerView, smallIconButtonView, textAtomView, appCompatTextView, largeButtonView, recyclerView2, textAtomView2, roundedShimmerView, roundedShimmerView2, roundedShimmerView3, group);
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
