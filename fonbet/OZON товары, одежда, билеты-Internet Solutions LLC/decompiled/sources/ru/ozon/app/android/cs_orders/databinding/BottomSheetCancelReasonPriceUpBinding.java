package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes11.dex */
public final class BottomSheetCancelReasonPriceUpBinding implements a {

    @NonNull
    public final LinearLayout bottomSheetPriceUp;

    @NonNull
    public final Image ivImage;

    @NonNull
    public final ButtonV3View negativeButton;

    @NonNull
    public final ButtonV3View positiveButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private BottomSheetCancelReasonPriceUpBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Image image, @NonNull ButtonV3View buttonV3View, @NonNull ButtonV3View buttonV3View2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.bottomSheetPriceUp = linearLayout2;
        this.ivImage = image;
        this.negativeButton = buttonV3View;
        this.positiveButton = buttonV3View2;
        this.subtitleTv = textAtomV2View;
        this.titleTv = textAtomV2View2;
    }

    @NonNull
    public static BottomSheetCancelReasonPriceUpBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.ivImage;
        Image image = (Image) C2548q.d(i11, view);
        if (image != null) {
            i11 = R$id.negativeButton;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.positiveButton;
                ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View2 != null) {
                    i11 = R$id.subtitleTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.titleTv;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            return new BottomSheetCancelReasonPriceUpBinding(linearLayout, linearLayout, image, buttonV3View, buttonV3View2, textAtomV2View, textAtomV2View2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static BottomSheetCancelReasonPriceUpBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.bottom_sheet_cancel_reason_price_up, viewGroup, false);
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
