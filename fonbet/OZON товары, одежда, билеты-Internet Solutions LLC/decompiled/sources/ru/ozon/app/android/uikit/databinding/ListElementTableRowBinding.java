package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ListElementTableRowBinding implements a {

    @NonNull
    public final TextAtomView leftTav;

    @NonNull
    public final AppCompatImageView rightIconIv;

    @NonNull
    public final TextAtomView rightTav;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    private ListElementTableRowBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2, @NonNull View view2) {
        this.rootView = view;
        this.leftTav = textAtomView;
        this.rightIconIv = appCompatImageView;
        this.rightTav = textAtomView2;
        this.separator = view2;
    }

    @NonNull
    public static ListElementTableRowBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.leftTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.rightIconIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.rightTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                    return new ListElementTableRowBinding(view, textAtomView, appCompatImageView, textAtomView2, d11);
                }
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
