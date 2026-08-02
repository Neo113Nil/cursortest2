package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetLegalDocsEmptyBinding implements a {

    @NonNull
    public final AppCompatImageView imageIV;

    @NonNull
    public final TextAtomV2View messageTAV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View titleTAV;

    private WidgetLegalDocsEmptyBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.imageIV = appCompatImageView;
        this.messageTAV = textAtomV2View;
        this.titleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetLegalDocsEmptyBinding bind(@NonNull View view) {
        int i11 = R$id.imageIV;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.messageTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.titleTAV;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetLegalDocsEmptyBinding((LinearLayout) view, appCompatImageView, textAtomV2View, textAtomV2View2);
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
