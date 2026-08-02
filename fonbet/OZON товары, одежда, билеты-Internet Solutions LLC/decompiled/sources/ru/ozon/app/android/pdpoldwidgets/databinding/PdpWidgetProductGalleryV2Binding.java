package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.PdpGalleryPagerIndicator;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class PdpWidgetProductGalleryV2Binding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout atomBadgeLayout;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final Flow buttonsFlow;

    @NonNull
    public final View classifiedBackgroundV;

    @NonNull
    public final TextAtomV2View classifiedTv;

    @NonNull
    public final ImageView emptyGalleryIv;

    @NonNull
    public final ViewPager galleryVp;

    @NonNull
    public final PdpGalleryPagerIndicator pagerIndicator;

    @NonNull
    public final ConstraintLayout pdpGalleryRootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final WaveView waveV;

    private PdpWidgetProductGalleryV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull Barrier barrier, @NonNull Flow flow, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull ViewPager viewPager, @NonNull PdpGalleryPagerIndicator pdpGalleryPagerIndicator, @NonNull ConstraintLayout constraintLayout2, @NonNull WaveView waveView) {
        this.rootView = constraintLayout;
        this.atomBadgeLayout = horizontalFlexAtomsLayout;
        this.barrier = barrier;
        this.buttonsFlow = flow;
        this.classifiedBackgroundV = view;
        this.classifiedTv = textAtomV2View;
        this.emptyGalleryIv = imageView;
        this.galleryVp = viewPager;
        this.pagerIndicator = pdpGalleryPagerIndicator;
        this.pdpGalleryRootCl = constraintLayout2;
        this.waveV = waveView;
    }

    @NonNull
    public static PdpWidgetProductGalleryV2Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.atomBadgeLayout;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.buttonsFlow;
                Flow flow = (Flow) C2548q.d(i11, view);
                if (flow != null && (d11 = C2548q.d((i11 = R$id.classifiedBackgroundV), view)) != null) {
                    i11 = R$id.classifiedTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.emptyGalleryIv;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.galleryVp;
                            ViewPager viewPager = (ViewPager) C2548q.d(i11, view);
                            if (viewPager != null) {
                                i11 = R$id.pagerIndicator;
                                PdpGalleryPagerIndicator pdpGalleryPagerIndicator = (PdpGalleryPagerIndicator) C2548q.d(i11, view);
                                if (pdpGalleryPagerIndicator != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i11 = R$id.waveV;
                                    WaveView waveView = (WaveView) C2548q.d(i11, view);
                                    if (waveView != null) {
                                        return new PdpWidgetProductGalleryV2Binding(constraintLayout, horizontalFlexAtomsLayout, barrier, flow, d11, textAtomV2View, imageView, viewPager, pdpGalleryPagerIndicator, constraintLayout, waveView);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
