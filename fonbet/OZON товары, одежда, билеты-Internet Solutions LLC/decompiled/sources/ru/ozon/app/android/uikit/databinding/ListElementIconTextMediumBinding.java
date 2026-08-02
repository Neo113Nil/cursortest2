package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ListElementIconTextMediumBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView titleTav;

    private ListElementIconTextMediumBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull View view2, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.iconIv = imageView;
        this.separator = view2;
        this.titleTav = textAtomView;
    }

    @NonNull
    public static ListElementIconTextMediumBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
            i11 = R$id.titleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ListElementIconTextMediumBinding(view, imageView, d11, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
