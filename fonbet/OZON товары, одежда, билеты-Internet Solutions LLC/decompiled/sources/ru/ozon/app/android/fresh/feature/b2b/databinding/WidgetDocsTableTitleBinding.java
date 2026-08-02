package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDocsTableTitleBinding implements a {

    @NonNull
    public final View divider;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetDocsTableTitleBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.divider = view;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetDocsTableTitleBinding bind(@NonNull View view) {
        int i11 = R$id.divider;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.title;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetDocsTableTitleBinding((LinearLayout) view, d11, textAtomV2View);
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
