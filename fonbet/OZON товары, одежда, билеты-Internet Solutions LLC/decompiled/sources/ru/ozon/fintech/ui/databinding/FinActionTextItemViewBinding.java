package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class FinActionTextItemViewBinding implements a {

    @NonNull
    public final ImageView finRightImage;

    @NonNull
    public final TextAtomView finTextView;

    @NonNull
    private final View rootView;

    private FinActionTextItemViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.finRightImage = imageView;
        this.finTextView = textAtomView;
    }

    @NonNull
    public static FinActionTextItemViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_right_image;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_right_image, view);
        if (imageView != null) {
            i11 = R.id.fin_text_view;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_text_view, view);
            if (textAtomView != null) {
                return new FinActionTextItemViewBinding(view, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinActionTextItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_action_text_item_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
