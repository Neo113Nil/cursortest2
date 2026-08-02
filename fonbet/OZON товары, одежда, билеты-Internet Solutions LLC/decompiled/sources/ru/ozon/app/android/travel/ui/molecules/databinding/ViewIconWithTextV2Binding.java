package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewIconWithTextV2Binding implements a {

    @NonNull
    public final AppCompatImageView iconWIthTextIconACIV;

    @NonNull
    public final TextAtomView iconWIthTextSubtextTAV;

    @NonNull
    public final TextAtomView iconWIthTextTitleTAV;

    @NonNull
    private final View rootView;

    private ViewIconWithTextV2Binding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.iconWIthTextIconACIV = appCompatImageView;
        this.iconWIthTextSubtextTAV = textAtomView;
        this.iconWIthTextTitleTAV = textAtomView2;
    }

    @NonNull
    public static ViewIconWithTextV2Binding bind(@NonNull View view) {
        int i11 = R$id.iconWIthTextIconACIV;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.iconWIthTextSubtextTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.iconWIthTextTitleTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ViewIconWithTextV2Binding(view, appCompatImageView, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewIconWithTextV2Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_icon_with_text_v2, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
