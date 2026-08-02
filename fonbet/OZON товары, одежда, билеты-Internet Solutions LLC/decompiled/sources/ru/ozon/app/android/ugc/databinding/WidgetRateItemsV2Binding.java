package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes2.dex */
public final class WidgetRateItemsV2Binding implements a {

    @NonNull
    public final IconButtonV3View closeSheetIconButton;

    @NonNull
    public final RecyclerView productsRv;

    @NonNull
    public final ConstraintLayout rateItemContainer;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetRateItemsV2Binding(@NonNull FrameLayout frameLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = frameLayout;
        this.closeSheetIconButton = iconButtonV3View;
        this.productsRv = recyclerView;
        this.rateItemContainer = constraintLayout;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetRateItemsV2Binding bind(@NonNull View view) {
        int i11 = R$id.closeSheetIconButton;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            i11 = R$id.productsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.rateItemContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new WidgetRateItemsV2Binding((FrameLayout) view, iconButtonV3View, recyclerView, constraintLayout, textAtomV2View);
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
