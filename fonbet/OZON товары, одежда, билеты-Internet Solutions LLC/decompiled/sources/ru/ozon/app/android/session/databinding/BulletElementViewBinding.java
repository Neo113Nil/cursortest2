package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class BulletElementViewBinding implements a {

    @NonNull
    public final ImageView bulletIcon;

    @NonNull
    public final TextAtomView bulletText;

    @NonNull
    private final View rootView;

    private BulletElementViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.bulletIcon = imageView;
        this.bulletText = textAtomView;
    }

    @NonNull
    public static BulletElementViewBinding bind(@NonNull View view) {
        int i11 = R$id.bulletIcon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.bulletText;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new BulletElementViewBinding(view, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static BulletElementViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.bullet_element_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
