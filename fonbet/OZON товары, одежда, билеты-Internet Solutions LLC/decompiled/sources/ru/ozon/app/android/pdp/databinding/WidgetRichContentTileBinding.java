package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetRichContentTileBinding implements a {

    @NonNull
    public final ImageView richTileIV;

    @NonNull
    public final TextAtomV2View richTileTextTV;

    @NonNull
    public final TextAtomV2View richTileTitleTV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetRichContentTileBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.richTileIV = imageView;
        this.richTileTextTV = textAtomV2View;
        this.richTileTitleTV = textAtomV2View2;
    }

    @NonNull
    public static WidgetRichContentTileBinding bind(@NonNull View view) {
        int i11 = R$id.richTileIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.richTileTextTV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.richTileTitleTV;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetRichContentTileBinding((LinearLayout) view, imageView, textAtomV2View, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
