package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes11.dex */
public final class WidgetTotalCommonBinding implements a {

    @NonNull
    public final RecyclerView additionalHintsRV;

    @NonNull
    public final FrameLayout buttonContainer;

    @NonNull
    public final TextView footerPriceTv;

    @NonNull
    public final RecyclerView footerPricesRv;

    @NonNull
    public final View footerSeparatorV;

    @NonNull
    public final TextView footerSubtitleTv;

    @NonNull
    public final TextView footerTitleTv;

    @NonNull
    public final Barrier headerBarrier;

    @NonNull
    public final TextView headerSubtitleTv;

    @NonNull
    public final TextView headerTitleTv;

    @NonNull
    public final ButtonAtom interactionButtonBA;

    @NonNull
    public final RecyclerView interactionHintsRV;

    @NonNull
    public final PartnerBanksView partnersBankMoleculeView;

    @NonNull
    public final RecyclerView pricesRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ShimmerFrameLayout shimmerView;

    @NonNull
    public final ConstraintLayout summaryCl;

    @NonNull
    public final ButtonV3View totalButtonView;

    private WidgetTotalCommonBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView2, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Barrier barrier, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ButtonAtom buttonAtom, @NonNull RecyclerView recyclerView3, @NonNull PartnerBanksView partnerBanksView, @NonNull RecyclerView recyclerView4, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View) {
        this.rootView = linearLayout;
        this.additionalHintsRV = recyclerView;
        this.buttonContainer = frameLayout;
        this.footerPriceTv = textView;
        this.footerPricesRv = recyclerView2;
        this.footerSeparatorV = view;
        this.footerSubtitleTv = textView2;
        this.footerTitleTv = textView3;
        this.headerBarrier = barrier;
        this.headerSubtitleTv = textView4;
        this.headerTitleTv = textView5;
        this.interactionButtonBA = buttonAtom;
        this.interactionHintsRV = recyclerView3;
        this.partnersBankMoleculeView = partnerBanksView;
        this.pricesRv = recyclerView4;
        this.shimmerView = shimmerFrameLayout;
        this.summaryCl = constraintLayout;
        this.totalButtonView = buttonV3View;
    }

    @NonNull
    public static WidgetTotalCommonBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.additionalHintsRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.footerPriceTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.footerPricesRv;
                    RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView2 != null && (d11 = C2548q.d((i11 = R$id.footerSeparatorV), view)) != null) {
                        i11 = R$id.footerSubtitleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.footerTitleTv;
                            TextView textView3 = (TextView) C2548q.d(i11, view);
                            if (textView3 != null) {
                                i11 = R$id.headerBarrier;
                                Barrier barrier = (Barrier) C2548q.d(i11, view);
                                if (barrier != null) {
                                    i11 = R$id.headerSubtitleTv;
                                    TextView textView4 = (TextView) C2548q.d(i11, view);
                                    if (textView4 != null) {
                                        i11 = R$id.headerTitleTv;
                                        TextView textView5 = (TextView) C2548q.d(i11, view);
                                        if (textView5 != null) {
                                            i11 = R$id.interactionButtonBA;
                                            ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
                                            if (buttonAtom != null) {
                                                i11 = R$id.interactionHintsRV;
                                                RecyclerView recyclerView3 = (RecyclerView) C2548q.d(i11, view);
                                                if (recyclerView3 != null) {
                                                    i11 = R$id.partnersBankMoleculeView;
                                                    PartnerBanksView partnerBanksView = (PartnerBanksView) C2548q.d(i11, view);
                                                    if (partnerBanksView != null) {
                                                        i11 = R$id.pricesRv;
                                                        RecyclerView recyclerView4 = (RecyclerView) C2548q.d(i11, view);
                                                        if (recyclerView4 != null) {
                                                            i11 = R$id.shimmerView;
                                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(i11, view);
                                                            if (shimmerFrameLayout != null) {
                                                                i11 = R$id.summaryCl;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                                                                if (constraintLayout != null) {
                                                                    i11 = R$id.totalButtonView;
                                                                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                                                    if (buttonV3View != null) {
                                                                        return new WidgetTotalCommonBinding((LinearLayout) view, recyclerView, frameLayout, textView, recyclerView2, d11, textView2, textView3, barrier, textView4, textView5, buttonAtom, recyclerView3, partnerBanksView, recyclerView4, shimmerFrameLayout, constraintLayout, buttonV3View);
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
