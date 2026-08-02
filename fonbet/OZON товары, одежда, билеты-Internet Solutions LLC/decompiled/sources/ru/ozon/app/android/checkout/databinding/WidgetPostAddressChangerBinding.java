package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetPostAddressChangerBinding implements a {

    @NonNull
    public final TextInputEditText postIndexTiet;

    @NonNull
    public final TextInputLayout postIndexTil;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LargeButtonView submitLBV;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetPostAddressChangerBinding(@NonNull LinearLayout linearLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.postIndexTiet = textInputEditText;
        this.postIndexTil = textInputLayout;
        this.submitLBV = largeButtonView;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
    }

    @NonNull
    public static WidgetPostAddressChangerBinding bind(@NonNull View view) {
        int i11 = R$id.postIndexTiet;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.postIndexTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                i11 = R$id.submitLBV;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.subtitleTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.titleTav;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetPostAddressChangerBinding((LinearLayout) view, textInputEditText, textInputLayout, largeButtonView, textAtomView, textAtomView2);
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
