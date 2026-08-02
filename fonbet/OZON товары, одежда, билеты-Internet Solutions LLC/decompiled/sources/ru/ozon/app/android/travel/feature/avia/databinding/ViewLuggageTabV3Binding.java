package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.molecules.view.textCenteredImageView.TextCenteredImageView;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewLuggageTabV3Binding implements a {

    @NonNull
    public final AppCompatTextView handCarryCountTav;

    @NonNull
    public final TextCenteredImageView handCarryIconIv;

    @NonNull
    public final SkeletonPlaceholderView handCarrySkeleton;

    @NonNull
    public final AppCompatTextView luggageCountTav;

    @NonNull
    public final TextCenteredImageView luggageIconIv;

    @NonNull
    public final SkeletonPlaceholderView luggageSkeleton;

    @NonNull
    public final SkeletonPlaceholderView luggageTabPriceSkeletonSpv;

    @NonNull
    public final TextAtomView luggageTabPriceTav;

    @NonNull
    private final View rootView;

    private ViewLuggageTabV3Binding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull TextCenteredImageView textCenteredImageView, @NonNull SkeletonPlaceholderView skeletonPlaceholderView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextCenteredImageView textCenteredImageView2, @NonNull SkeletonPlaceholderView skeletonPlaceholderView2, @NonNull SkeletonPlaceholderView skeletonPlaceholderView3, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.handCarryCountTav = appCompatTextView;
        this.handCarryIconIv = textCenteredImageView;
        this.handCarrySkeleton = skeletonPlaceholderView;
        this.luggageCountTav = appCompatTextView2;
        this.luggageIconIv = textCenteredImageView2;
        this.luggageSkeleton = skeletonPlaceholderView2;
        this.luggageTabPriceSkeletonSpv = skeletonPlaceholderView3;
        this.luggageTabPriceTav = textAtomView;
    }

    @NonNull
    public static ViewLuggageTabV3Binding bind(@NonNull View view) {
        int i11 = R$id.handCarryCountTav;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.handCarryIconIv;
            TextCenteredImageView textCenteredImageView = (TextCenteredImageView) C2548q.d(i11, view);
            if (textCenteredImageView != null) {
                i11 = R$id.handCarrySkeleton;
                SkeletonPlaceholderView skeletonPlaceholderView = (SkeletonPlaceholderView) C2548q.d(i11, view);
                if (skeletonPlaceholderView != null) {
                    i11 = R$id.luggageCountTav;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView2 != null) {
                        i11 = R$id.luggageIconIv;
                        TextCenteredImageView textCenteredImageView2 = (TextCenteredImageView) C2548q.d(i11, view);
                        if (textCenteredImageView2 != null) {
                            i11 = R$id.luggageSkeleton;
                            SkeletonPlaceholderView skeletonPlaceholderView2 = (SkeletonPlaceholderView) C2548q.d(i11, view);
                            if (skeletonPlaceholderView2 != null) {
                                i11 = R$id.luggageTabPriceSkeletonSpv;
                                SkeletonPlaceholderView skeletonPlaceholderView3 = (SkeletonPlaceholderView) C2548q.d(i11, view);
                                if (skeletonPlaceholderView3 != null) {
                                    i11 = R$id.luggageTabPriceTav;
                                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView != null) {
                                        return new ViewLuggageTabV3Binding(view, appCompatTextView, textCenteredImageView, skeletonPlaceholderView, appCompatTextView2, textCenteredImageView2, skeletonPlaceholderView2, skeletonPlaceholderView3, textAtomView);
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
    public static ViewLuggageTabV3Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_luggage_tab_v3, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
