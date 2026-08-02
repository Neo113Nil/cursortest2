package ru.ozon.app.android.common.ui.serviceCarousel.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import ru.ozon.app.android.common.ui.serviceCarousel.R$id;

/* loaded from: classes11.dex */
public final class WidgetServiceCarouselBinding implements a {

    @NonNull
    public final MaterialCardView rootCard;

    @NonNull
    private final MaterialCardView rootView;

    @NonNull
    public final RecyclerView rvItems;

    private WidgetServiceCarouselBinding(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull RecyclerView recyclerView) {
        this.rootView = materialCardView;
        this.rootCard = materialCardView2;
        this.rvItems = recyclerView;
    }

    @NonNull
    public static WidgetServiceCarouselBinding bind(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R$id.rvItems;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetServiceCarouselBinding(materialCardView, materialCardView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public MaterialCardView getConstraintLayout() {
        return this.rootView;
    }
}
