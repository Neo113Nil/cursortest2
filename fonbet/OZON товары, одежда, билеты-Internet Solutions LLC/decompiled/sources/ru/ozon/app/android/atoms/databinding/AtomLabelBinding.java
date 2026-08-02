package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;

/* loaded from: classes11.dex */
public final class AtomLabelBinding implements a {

    @NonNull
    public final ImageView imageLabelIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textLabelTv;

    private AtomLabelBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = view;
        this.imageLabelIv = imageView;
        this.textLabelTv = textView;
    }

    @NonNull
    public static AtomLabelBinding bind(@NonNull View view) {
        int i11 = R$id.imageLabelIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.textLabelTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new AtomLabelBinding(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_label, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
