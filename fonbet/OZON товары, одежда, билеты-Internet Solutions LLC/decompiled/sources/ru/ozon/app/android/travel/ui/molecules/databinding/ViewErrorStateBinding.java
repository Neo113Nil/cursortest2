package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes2.dex */
public final class ViewErrorStateBinding implements a {

    @NonNull
    public final VerticalAtomsLayout errorStateActionButtonsContainerVAL;

    @NonNull
    public final ImageView errorStateIV;

    @NonNull
    public final TextView errorStateMessageTV;

    @NonNull
    public final TextView errorStateTitleTV;

    @NonNull
    private final View rootView;

    private ViewErrorStateBinding(@NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.errorStateActionButtonsContainerVAL = verticalAtomsLayout;
        this.errorStateIV = imageView;
        this.errorStateMessageTV = textView;
        this.errorStateTitleTV = textView2;
    }

    @NonNull
    public static ViewErrorStateBinding bind(@NonNull View view) {
        int i11 = R$id.errorStateActionButtonsContainerVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.errorStateIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.errorStateMessageTV;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.errorStateTitleTV;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new ViewErrorStateBinding(view, verticalAtomsLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewErrorStateBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_error_state, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
