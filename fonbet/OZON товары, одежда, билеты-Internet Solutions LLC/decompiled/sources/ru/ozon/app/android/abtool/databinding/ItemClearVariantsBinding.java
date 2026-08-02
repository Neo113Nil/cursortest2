package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.abtool.R$id;

/* loaded from: classes11.dex */
public final class ItemClearVariantsBinding implements a {

    @NonNull
    public final FrameLayout clearButtonContainer;

    @NonNull
    public final Button clearVariantsButton;

    @NonNull
    private final FrameLayout rootView;

    private ItemClearVariantsBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button) {
        this.rootView = frameLayout;
        this.clearButtonContainer = frameLayout2;
        this.clearVariantsButton = button;
    }

    @NonNull
    public static ItemClearVariantsBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.clearVariantsButton;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            return new ItemClearVariantsBinding(frameLayout, frameLayout, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
