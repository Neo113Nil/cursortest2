package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes13.dex */
public final class PhotoPickerButtonsBinding implements a {

    @NonNull
    public final ButtonV3View addMorePhotoButton;

    @NonNull
    public final ButtonV3View addPhotoButton;

    @NonNull
    public final ButtonV3View continueButton;

    @NonNull
    private final ConstraintLayout rootView;

    private PhotoPickerButtonsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull ButtonV3View buttonV3View2, @NonNull ButtonV3View buttonV3View3) {
        this.rootView = constraintLayout;
        this.addMorePhotoButton = buttonV3View;
        this.addPhotoButton = buttonV3View2;
        this.continueButton = buttonV3View3;
    }

    @NonNull
    public static PhotoPickerButtonsBinding bind(@NonNull View view) {
        int i11 = R$id.addMorePhotoButton;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.addPhotoButton;
            ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View2 != null) {
                i11 = R$id.continueButton;
                ButtonV3View buttonV3View3 = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View3 != null) {
                    return new PhotoPickerButtonsBinding((ConstraintLayout) view, buttonV3View, buttonV3View2, buttonV3View3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PhotoPickerButtonsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PhotoPickerButtonsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.photo_picker_buttons, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
