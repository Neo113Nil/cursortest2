package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.favorites.feature.R$id;

/* loaded from: classes12.dex */
public final class WidgetCreateShoppingListTitleBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextInputEditText titleEt;

    @NonNull
    public final TextInputLayout titleTil;

    private WidgetCreateShoppingListTitleBinding(@NonNull FrameLayout frameLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout) {
        this.rootView = frameLayout;
        this.titleEt = textInputEditText;
        this.titleTil = textInputLayout;
    }

    @NonNull
    public static WidgetCreateShoppingListTitleBinding bind(@NonNull View view) {
        int i11 = R$id.titleEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.titleTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                return new WidgetCreateShoppingListTitleBinding((FrameLayout) view, textInputEditText, textInputLayout);
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
