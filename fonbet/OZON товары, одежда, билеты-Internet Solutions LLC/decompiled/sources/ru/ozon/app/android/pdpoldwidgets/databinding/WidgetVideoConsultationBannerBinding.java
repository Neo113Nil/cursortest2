package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes13.dex */
public final class WidgetVideoConsultationBannerBinding implements a {

    @NonNull
    public final TextAtomV2View bodyTAV;

    @NonNull
    public final FlexboxLayout containerFl;

    @NonNull
    public final TextAtomV2View footerTAV;

    @NonNull
    public final TextAtomV2View headerTAV;

    @NonNull
    public final SmallButtonView mainActionBA;

    @NonNull
    public final ImageView productIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final SmallBorderlessButtonView secondaryActionBorderlessButton;

    private WidgetVideoConsultationBannerBinding(@NonNull FrameLayout frameLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull FlexboxLayout flexboxLayout, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView) {
        this.rootView = frameLayout;
        this.bodyTAV = textAtomV2View;
        this.containerFl = flexboxLayout;
        this.footerTAV = textAtomV2View2;
        this.headerTAV = textAtomV2View3;
        this.mainActionBA = smallButtonView;
        this.productIv = imageView;
        this.secondaryActionBorderlessButton = smallBorderlessButtonView;
    }

    @NonNull
    public static WidgetVideoConsultationBannerBinding bind(@NonNull View view) {
        int i11 = R$id.bodyTAV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.containerFl;
            FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
            if (flexboxLayout != null) {
                i11 = R$id.footerTAV;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.headerTAV;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        i11 = R$id.mainActionBA;
                        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                        if (smallButtonView != null) {
                            i11 = R$id.productIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.secondaryActionBorderlessButton;
                                SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                                if (smallBorderlessButtonView != null) {
                                    return new WidgetVideoConsultationBannerBinding((FrameLayout) view, textAtomV2View, flexboxLayout, textAtomV2View2, textAtomV2View3, smallButtonView, imageView, smallBorderlessButtonView);
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
