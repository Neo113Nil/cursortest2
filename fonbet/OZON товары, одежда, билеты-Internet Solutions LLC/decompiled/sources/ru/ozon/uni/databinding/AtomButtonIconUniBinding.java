package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.uni.R$id;

/* loaded from: classes4.dex */
public final class AtomButtonIconUniBinding implements a {

    @NonNull
    public final ImageView buttonIv;

    @NonNull
    private final FrameLayout rootView;

    private AtomButtonIconUniBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.buttonIv = imageView;
    }

    @NonNull
    public static AtomButtonIconUniBinding bind(@NonNull View view) {
        int i11 = R$id.buttonIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            return new AtomButtonIconUniBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
