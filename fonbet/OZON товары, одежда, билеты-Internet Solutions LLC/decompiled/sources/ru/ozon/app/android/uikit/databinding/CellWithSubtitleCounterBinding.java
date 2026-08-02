package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class CellWithSubtitleCounterBinding implements a {

    @NonNull
    public final TextAtomView counterTav;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    private CellWithSubtitleCounterBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull View view2, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.counterTav = textAtomView;
        this.disclosureIv = imageView;
        this.separator = view2;
        this.subtitleTav = textAtomView2;
        this.titleTav = textAtomView3;
    }

    @NonNull
    public static CellWithSubtitleCounterBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.counterTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.disclosureIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                i11 = R$id.subtitleTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.titleTav;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        return new CellWithSubtitleCounterBinding(view, textAtomView, imageView, d11, textAtomView2, textAtomView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CellWithSubtitleCounterBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.cell_with_subtitle_counter, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
