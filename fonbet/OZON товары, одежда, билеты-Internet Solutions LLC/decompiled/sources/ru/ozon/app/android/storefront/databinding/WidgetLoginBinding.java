package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes2.dex */
public final class WidgetLoginBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView buttonAtomSubTitleTv;

    @NonNull
    public final ButtonV3View buttonAtomTitleTv;

    @NonNull
    public final ConstraintLayout loginContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    private WidgetLoginBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull ButtonV3View buttonV3View, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.buttonAtomSubTitleTv = largeBorderlessButtonView;
        this.buttonAtomTitleTv = buttonV3View;
        this.loginContainer = constraintLayout2;
        this.subtitle = textView;
        this.title = textView2;
    }

    @NonNull
    public static WidgetLoginBinding bind(@NonNull View view) {
        int i11 = R$id.buttonAtomSubTitleTv;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.buttonAtomTitleTv;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.subtitle;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.title;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new WidgetLoginBinding(constraintLayout, largeBorderlessButtonView, buttonV3View, constraintLayout, textView, textView2);
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
