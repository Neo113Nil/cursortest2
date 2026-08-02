package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes13.dex */
public final class WidgetOrderTrackShipmentBinding implements a {

    @NonNull
    public final ImageView copyIcon;

    @NonNull
    public final TextView orderTrackNumber;

    @NonNull
    public final ConstraintLayout orderTrackNumberContainer;

    @NonNull
    public final ConstraintLayout orderTrackShipmentContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallBorderlessButtonView trackButton;

    @NonNull
    public final TextView trackNumberLabel;

    private WidgetOrderTrackShipmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.copyIcon = imageView;
        this.orderTrackNumber = textView;
        this.orderTrackNumberContainer = constraintLayout2;
        this.orderTrackShipmentContainer = constraintLayout3;
        this.trackButton = smallBorderlessButtonView;
        this.trackNumberLabel = textView2;
    }

    @NonNull
    public static WidgetOrderTrackShipmentBinding bind(@NonNull View view) {
        int i11 = R$id.copyIcon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.orderTrackNumber;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.orderTrackNumberContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i11 = R$id.trackButton;
                    SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                    if (smallBorderlessButtonView != null) {
                        i11 = R$id.trackNumberLabel;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new WidgetOrderTrackShipmentBinding(constraintLayout2, imageView, textView, constraintLayout, constraintLayout2, smallBorderlessButtonView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
