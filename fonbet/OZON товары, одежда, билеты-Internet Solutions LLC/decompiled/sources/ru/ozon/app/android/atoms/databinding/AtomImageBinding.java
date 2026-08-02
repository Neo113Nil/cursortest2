package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;

/* loaded from: classes11.dex */
public final class AtomImageBinding implements a {

    @NonNull
    public final View borderV;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final ConstraintLayout rootView;

    private AtomImageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.borderV = view;
        this.imageIv = imageView;
    }

    @NonNull
    public static AtomImageBinding bind(@NonNull View view) {
        int i11 = R$id.borderV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.imageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new AtomImageBinding((ConstraintLayout) view, d11, imageView);
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
