package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class MySettingsHeaderBinding implements a {

    @NonNull
    public final ImageView imageViewLogo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View text;

    private MySettingsHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.imageViewLogo = imageView;
        this.text = textAtomV2View;
    }

    @NonNull
    public static MySettingsHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.imageViewLogo;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.text;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new MySettingsHeaderBinding((LinearLayout) view, imageView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
