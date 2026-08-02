package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class ItemCategoryButtonBinding implements a {

    @NonNull
    public final FrameAtomsLayout containerFAL;

    @NonNull
    public final CardView itemCv;

    @NonNull
    private final CardView rootView;

    private ItemCategoryButtonBinding(@NonNull CardView cardView, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull CardView cardView2) {
        this.rootView = cardView;
        this.containerFAL = frameAtomsLayout;
        this.itemCv = cardView2;
    }

    @NonNull
    public static ItemCategoryButtonBinding bind(@NonNull View view) {
        int i11 = R$id.containerFAL;
        FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
        if (frameAtomsLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        CardView cardView = (CardView) view;
        return new ItemCategoryButtonBinding(cardView, frameAtomsLayout, cardView);
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
