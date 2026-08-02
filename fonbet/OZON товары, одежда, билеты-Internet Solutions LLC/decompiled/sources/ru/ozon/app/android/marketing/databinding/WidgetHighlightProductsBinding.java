package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetHighlightProductsBinding implements a {

    @NonNull
    public final CardView cardContainer;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final RecyclerView highlightProductsList;

    @NonNull
    public final TextAtomView highlightProductsSubtitle;

    @NonNull
    public final TextAtomView highlightProductsTitle;

    @NonNull
    public final ConstraintLayout miniWidgetContainer;

    @NonNull
    public final ImageView progressImage;

    @NonNull
    public final TextAtomView progressTitle;

    @NonNull
    private final LinearLayout rootView;

    private WidgetHighlightProductsBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull Guideline guideline, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView3) {
        this.rootView = linearLayout;
        this.cardContainer = cardView;
        this.guideline = guideline;
        this.highlightProductsList = recyclerView;
        this.highlightProductsSubtitle = textAtomView;
        this.highlightProductsTitle = textAtomView2;
        this.miniWidgetContainer = constraintLayout;
        this.progressImage = imageView;
        this.progressTitle = textAtomView3;
    }

    @NonNull
    public static WidgetHighlightProductsBinding bind(@NonNull View view) {
        int i11 = R$id.cardContainer;
        CardView cardView = (CardView) C2548q.d(i11, view);
        if (cardView != null) {
            i11 = R$id.guideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.highlightProductsList;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.highlightProductsSubtitle;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.highlightProductsTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.miniWidgetContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                            if (constraintLayout != null) {
                                i11 = R$id.progressImage;
                                ImageView imageView = (ImageView) C2548q.d(i11, view);
                                if (imageView != null) {
                                    i11 = R$id.progressTitle;
                                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView3 != null) {
                                        return new WidgetHighlightProductsBinding((LinearLayout) view, cardView, guideline, recyclerView, textAtomView, textAtomView2, constraintLayout, imageView, textAtomView3);
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
