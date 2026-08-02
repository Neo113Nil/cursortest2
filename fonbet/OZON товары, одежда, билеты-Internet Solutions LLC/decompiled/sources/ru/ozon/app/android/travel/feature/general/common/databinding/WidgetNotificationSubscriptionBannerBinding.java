package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes3.dex */
public final class WidgetNotificationSubscriptionBannerBinding implements a {

    @NonNull
    public final ButtonV3View bannerButtonBv;

    @NonNull
    public final IconButtonV3View bannerCloseButtonIbv;

    @NonNull
    public final Guideline bannerImageGuideline;

    @NonNull
    public final Image bannerImageIv;

    @NonNull
    public final TextAtomV2View bannerSubtitleTav;

    @NonNull
    public final TextAtomV2View bannerTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetNotificationSubscriptionBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull IconButtonV3View iconButtonV3View, @NonNull Guideline guideline, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.bannerButtonBv = buttonV3View;
        this.bannerCloseButtonIbv = iconButtonV3View;
        this.bannerImageGuideline = guideline;
        this.bannerImageIv = image;
        this.bannerSubtitleTav = textAtomV2View;
        this.bannerTitleTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetNotificationSubscriptionBannerBinding bind(@NonNull View view) {
        int i11 = R$id.bannerButtonBv;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.bannerCloseButtonIbv;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.bannerImageGuideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    i11 = R$id.bannerImageIv;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.bannerSubtitleTav;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.bannerTitleTav;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new WidgetNotificationSubscriptionBannerBinding((ConstraintLayout) view, buttonV3View, iconButtonV3View, guideline, image, textAtomV2View, textAtomV2View2);
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
