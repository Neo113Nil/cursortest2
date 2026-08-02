package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MLayoutFixedButtonBinding implements a {

    @NonNull
    public final LinearLayout bubbleFixedContainerLL;

    @NonNull
    public final LinearLayout fixedImagesLl;

    @NonNull
    public final LinearLayout fixedTitleLL;

    @NonNull
    public final LinearLayout rootOrderContainerLL;

    @NonNull
    private final LinearLayout rootView;

    private MLayoutFixedButtonBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.bubbleFixedContainerLL = linearLayout2;
        this.fixedImagesLl = linearLayout3;
        this.fixedTitleLL = linearLayout4;
        this.rootOrderContainerLL = linearLayout5;
    }

    @NonNull
    public static MLayoutFixedButtonBinding bind(@NonNull View view) {
        int i11 = R$id.bubbleFixedContainerLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.fixedImagesLl;
            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout2 != null) {
                i11 = R$id.fixedTitleLL;
                LinearLayout linearLayout3 = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout3 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) view;
                    return new MLayoutFixedButtonBinding(linearLayout4, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MLayoutFixedButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_layout_fixed_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
