package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ListElementBulletBinding implements a {

    @NonNull
    public final TextAtomView bulletTav;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView textTav;

    private ListElementBulletBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull View view2, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.bulletTav = textAtomView;
        this.separator = view2;
        this.textTav = textAtomView2;
    }

    @NonNull
    public static ListElementBulletBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.bulletTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
            i11 = R$id.textTav;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new ListElementBulletBinding(view, textAtomView, d11, textAtomView2);
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
