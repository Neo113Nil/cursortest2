package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MLabeledIconViewBinding implements a {

    @NonNull
    public final AppCompatImageView labeledIcon;

    @NonNull
    public final TextAtomV2View labeledText;

    @NonNull
    private final View rootView;

    private MLabeledIconViewBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.labeledIcon = appCompatImageView;
        this.labeledText = textAtomV2View;
    }

    @NonNull
    public static MLabeledIconViewBinding bind(@NonNull View view) {
        int i11 = R$id.labeledIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.labeledText;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new MLabeledIconViewBinding(view, appCompatImageView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MLabeledIconViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_labeled_icon_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
