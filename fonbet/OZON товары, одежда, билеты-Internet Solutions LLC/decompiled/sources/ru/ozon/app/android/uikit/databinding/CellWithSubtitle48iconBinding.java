package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class CellWithSubtitle48iconBinding implements a {

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    private CellWithSubtitle48iconBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.disclosureIv = imageView;
        this.iconIv = imageView2;
        this.separator = view2;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
    }

    @NonNull
    public static CellWithSubtitle48iconBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.disclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.iconIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                i11 = R$id.subtitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.titleTav;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new CellWithSubtitle48iconBinding(view, imageView, imageView2, d11, textAtomView, textAtomView2);
                    }
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
