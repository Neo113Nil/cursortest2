package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetRedesignGalleryFullViewBinding implements a {

    @NonNull
    public final ConstraintLayout galleryContainer;

    @NonNull
    public final RecyclerView previewRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ViewPager2 viewPager;

    private PdpWidgetRedesignGalleryFullViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.galleryContainer = constraintLayout2;
        this.previewRv = recyclerView;
        this.viewPager = viewPager2;
    }

    @NonNull
    public static PdpWidgetRedesignGalleryFullViewBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.previewRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) C2548q.d(i11, view);
            if (viewPager2 != null) {
                return new PdpWidgetRedesignGalleryFullViewBinding(constraintLayout, constraintLayout, recyclerView, viewPager2);
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
