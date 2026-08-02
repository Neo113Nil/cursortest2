package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes6.dex */
public final class WidgetTextBlockBinding implements a {

    @NonNull
    public final VerticalAtomsLayout bodyVAL;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LinearLayout textBlockWidget;

    @NonNull
    public final FrameLayout textBlockWidgetWrapper;

    @NonNull
    public final TextView titleTv;

    private WidgetTextBlockBinding(@NonNull FrameLayout frameLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.bodyVAL = verticalAtomsLayout;
        this.textBlockWidget = linearLayout;
        this.textBlockWidgetWrapper = frameLayout2;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetTextBlockBinding bind(@NonNull View view) {
        int i11 = R$id.bodyVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.textBlockWidget;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetTextBlockBinding(frameLayout, verticalAtomsLayout, linearLayout, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
