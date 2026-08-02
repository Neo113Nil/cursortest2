package ru.ozon.app.android.travel.feature.hotels.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetHotelsMapCardV1Binding implements a {

    @NonNull
    public final LargeButtonView hotelsMapCardActionButton;

    @NonNull
    public final TextAtomView hotelsMapCardAddress;

    @NonNull
    public final AppCompatImageView hotelsMapCardIcon;

    @NonNull
    public final TextAtomView hotelsMapCardName;

    @NonNull
    public final TextAtomView hotelsMapCardPrice;

    @NonNull
    public final TextAtomView hotelsMapCardPriceDescription;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetHotelsMapCardV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.hotelsMapCardActionButton = largeButtonView;
        this.hotelsMapCardAddress = textAtomView;
        this.hotelsMapCardIcon = appCompatImageView;
        this.hotelsMapCardName = textAtomView2;
        this.hotelsMapCardPrice = textAtomView3;
        this.hotelsMapCardPriceDescription = textAtomView4;
    }

    @NonNull
    public static WidgetHotelsMapCardV1Binding bind(@NonNull View view) {
        int i11 = R$id.hotelsMapCardActionButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.hotelsMapCardAddress;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.hotelsMapCardIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.hotelsMapCardName;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.hotelsMapCardPrice;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            i11 = R$id.hotelsMapCardPriceDescription;
                            TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView4 != null) {
                                return new WidgetHotelsMapCardV1Binding((ConstraintLayout) view, largeButtonView, textAtomView, appCompatImageView, textAtomView2, textAtomView3, textAtomView4);
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
