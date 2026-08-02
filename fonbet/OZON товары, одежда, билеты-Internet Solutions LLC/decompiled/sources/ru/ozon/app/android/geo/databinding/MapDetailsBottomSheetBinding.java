package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class MapDetailsBottomSheetBinding implements a {

    @NonNull
    public final IconButtonV3View actionDrawableIv;

    @NonNull
    public final LinearLayout addressEditMapDetailsBottomSheetContainer;

    @NonNull
    public final FrameLayout addressEditMapDetailsBottomSheetContainerContent;

    @NonNull
    public final FrameLayout addressEditMapDetailsBottomSheetStickyContainer;

    @NonNull
    public final LinearLayout addressEditMapDetailsBottomSheetStickyLinearContainer;

    @NonNull
    public final FrameLayout addressEditMapDetailsBottomSheetStickyLoadingFl;

    @NonNull
    public final HorizontalAtomsLayout badgesHAL;

    @NonNull
    public final FrameLayout detailsFragmentContainer;

    @NonNull
    public final FrameLayout detailsSheetLoadingFl;

    @NonNull
    public final TextView detailsSheetTitleTv;

    @NonNull
    public final TextAtomV2View numberPVZ;

    @NonNull
    public final LoaderView progressSpinnerMpb;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ConstraintLayout titleContainer;

    @NonNull
    public final View topPadding;

    private MapDetailsBottomSheetBinding(@NonNull LinearLayout linearLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout3, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull TextView textView, @NonNull TextAtomV2View textAtomV2View, @NonNull LoaderView loaderView, @NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.rootView = linearLayout;
        this.actionDrawableIv = iconButtonV3View;
        this.addressEditMapDetailsBottomSheetContainer = linearLayout2;
        this.addressEditMapDetailsBottomSheetContainerContent = frameLayout;
        this.addressEditMapDetailsBottomSheetStickyContainer = frameLayout2;
        this.addressEditMapDetailsBottomSheetStickyLinearContainer = linearLayout3;
        this.addressEditMapDetailsBottomSheetStickyLoadingFl = frameLayout3;
        this.badgesHAL = horizontalAtomsLayout;
        this.detailsFragmentContainer = frameLayout4;
        this.detailsSheetLoadingFl = frameLayout5;
        this.detailsSheetTitleTv = textView;
        this.numberPVZ = textAtomV2View;
        this.progressSpinnerMpb = loaderView;
        this.titleContainer = constraintLayout;
        this.topPadding = view;
    }

    @NonNull
    public static MapDetailsBottomSheetBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.actionDrawableIv;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.addressEditMapDetailsBottomSheetContainerContent;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = ru.ozon.app.android.composer.R$id.addressEditMapDetailsBottomSheetStickyContainer;
                FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout2 != null) {
                    i11 = ru.ozon.app.android.composer.R$id.addressEditMapDetailsBottomSheetStickyLinearContainer;
                    LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout2 != null) {
                        i11 = R$id.addressEditMapDetailsBottomSheetStickyLoadingFl;
                        FrameLayout frameLayout3 = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout3 != null) {
                            i11 = R$id.badgesHAL;
                            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
                            if (horizontalAtomsLayout != null) {
                                i11 = R$id.detailsFragmentContainer;
                                FrameLayout frameLayout4 = (FrameLayout) C2548q.d(i11, view);
                                if (frameLayout4 != null) {
                                    i11 = R$id.detailsSheetLoadingFl;
                                    FrameLayout frameLayout5 = (FrameLayout) C2548q.d(i11, view);
                                    if (frameLayout5 != null) {
                                        i11 = R$id.detailsSheetTitleTv;
                                        TextView textView = (TextView) C2548q.d(i11, view);
                                        if (textView != null) {
                                            i11 = R$id.numberPVZ;
                                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View != null) {
                                                i11 = R$id.progressSpinnerMpb;
                                                LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                                                if (loaderView != null) {
                                                    i11 = R$id.titleContainer;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                                                    if (constraintLayout != null && (d11 = C2548q.d((i11 = R$id.topPadding), view)) != null) {
                                                        return new MapDetailsBottomSheetBinding(linearLayout, iconButtonV3View, linearLayout, frameLayout, frameLayout2, linearLayout2, frameLayout3, horizontalAtomsLayout, frameLayout4, frameLayout5, textView, textAtomV2View, loaderView, constraintLayout, d11);
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

    @NonNull
    public static MapDetailsBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.map_details_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
