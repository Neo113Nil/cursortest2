package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetValuesTotalItemBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final TextAtomView valueTav;

    private WidgetValuesTotalItemBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
        this.valueTav = textAtomView3;
    }

    @NonNull
    public static WidgetValuesTotalItemBinding bind(@NonNull View view) {
        int i11 = R$id.subtitleTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.titleTav;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.valueTav;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    return new WidgetValuesTotalItemBinding(view, textAtomView, textAtomView2, textAtomView3);
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
