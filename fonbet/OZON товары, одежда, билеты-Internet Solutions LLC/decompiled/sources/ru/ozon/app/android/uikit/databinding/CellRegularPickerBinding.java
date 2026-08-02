package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class CellRegularPickerBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final TextAtomView valueTav;

    private CellRegularPickerBinding(@NonNull View view, @NonNull View view2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.separator = view2;
        this.titleTav = textAtomView;
        this.valueTav = textAtomView2;
    }

    @NonNull
    public static CellRegularPickerBinding bind(@NonNull View view) {
        int i11 = R$id.separator;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.titleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.valueTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new CellRegularPickerBinding(view, d11, textAtomView, textAtomView2);
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
