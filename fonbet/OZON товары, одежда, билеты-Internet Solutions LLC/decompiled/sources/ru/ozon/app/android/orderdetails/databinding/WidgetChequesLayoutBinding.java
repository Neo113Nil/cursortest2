package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes13.dex */
public final class WidgetChequesLayoutBinding implements a {

    @NonNull
    public final SmallButtonView chequesButtonB;

    @NonNull
    public final TextView chequesPriceTv;

    @NonNull
    public final TextView chequesSubtitleTv;

    @NonNull
    public final TextView chequesTitleTv;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetChequesLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.chequesButtonB = smallButtonView;
        this.chequesPriceTv = textView;
        this.chequesSubtitleTv = textView2;
        this.chequesTitleTv = textView3;
        this.rootCl = constraintLayout2;
    }

    @NonNull
    public static WidgetChequesLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.chequesButtonB;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.chequesPriceTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.chequesSubtitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.chequesTitleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new WidgetChequesLayoutBinding(constraintLayout, smallButtonView, textView, textView2, textView3, constraintLayout);
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
