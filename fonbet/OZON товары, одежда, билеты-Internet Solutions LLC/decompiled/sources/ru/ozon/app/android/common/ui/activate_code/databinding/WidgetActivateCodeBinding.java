package ru.ozon.app.android.common.ui.activate_code.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import ru.ozon.app.android.common.ui.activate_code.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetActivateCodeBinding implements a {

    @NonNull
    public final LargeButtonView activateButton;

    @NonNull
    public final LinearLayout containerLl;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final TextInputEditText input;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SmallBorderlessButtonView termsButton;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetActivateCodeBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextInputEditText textInputEditText, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.activateButton = largeButtonView;
        this.containerLl = linearLayout2;
        this.iconIv = imageView;
        this.input = textInputEditText;
        this.termsButton = smallBorderlessButtonView;
        this.titleTav = textAtomView;
    }

    @NonNull
    public static WidgetActivateCodeBinding bind(@NonNull View view) {
        int i11 = R$id.activateButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.containerLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.iconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.input;
                    TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                    if (textInputEditText != null) {
                        i11 = R$id.termsButton;
                        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                        if (smallBorderlessButtonView != null) {
                            i11 = R$id.titleTav;
                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView != null) {
                                return new WidgetActivateCodeBinding((LinearLayout) view, largeButtonView, linearLayout, imageView, textInputEditText, smallBorderlessButtonView, textAtomView);
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
