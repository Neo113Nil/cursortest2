package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes12.dex */
public final class WidgetBannerEdoBinding implements a {

    @NonNull
    public final SmallButtonView button;

    @NonNull
    public final Guideline contentGuideline;

    @NonNull
    public final ConstraintLayout edoBanner;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetBannerEdoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.button = smallButtonView;
        this.contentGuideline = guideline;
        this.edoBanner = constraintLayout2;
        this.image = imageView;
        this.recyclerView = recyclerView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetBannerEdoBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.contentGuideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.image;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.title;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            return new WidgetBannerEdoBinding(constraintLayout, smallButtonView, guideline, constraintLayout, imageView, recyclerView, textAtomV2View);
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
