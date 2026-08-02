package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.PdpGalleryPagerIndicator;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class PdpWidgetProductGalleryV3Binding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout atomBadgeLayout;

    @NonNull
    public final RecyclerView buttonsRv;

    @NonNull
    public final ViewStub classifiedStubV;

    @NonNull
    public final ViewPager2 galleryVp;

    @NonNull
    public final PdpGalleryPagerIndicator pagerIndicator;

    @NonNull
    public final ConstraintLayout pdpGalleryRootCl;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetProductGalleryV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull RecyclerView recyclerView, @NonNull ViewStub viewStub, @NonNull ViewPager2 viewPager2, @NonNull PdpGalleryPagerIndicator pdpGalleryPagerIndicator, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.atomBadgeLayout = horizontalFlexAtomsLayout;
        this.buttonsRv = recyclerView;
        this.classifiedStubV = viewStub;
        this.galleryVp = viewPager2;
        this.pagerIndicator = pdpGalleryPagerIndicator;
        this.pdpGalleryRootCl = constraintLayout2;
    }

    @NonNull
    public static PdpWidgetProductGalleryV3Binding bind(@NonNull View view) {
        int i11 = R$id.atomBadgeLayout;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.buttonsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.classifiedStubV;
                ViewStub viewStub = (ViewStub) C2548q.d(i11, view);
                if (viewStub != null) {
                    i11 = R$id.galleryVp;
                    ViewPager2 viewPager2 = (ViewPager2) C2548q.d(i11, view);
                    if (viewPager2 != null) {
                        i11 = R$id.pagerIndicator;
                        PdpGalleryPagerIndicator pdpGalleryPagerIndicator = (PdpGalleryPagerIndicator) C2548q.d(i11, view);
                        if (pdpGalleryPagerIndicator != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new PdpWidgetProductGalleryV3Binding(constraintLayout, horizontalFlexAtomsLayout, recyclerView, viewStub, viewPager2, pdpGalleryPagerIndicator, constraintLayout);
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
