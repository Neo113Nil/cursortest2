package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.views.input.CommonB2BTextWithErrorInputLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetAddLegalBinding implements a {

    @NonNull
    public final CommonB2BTextWithErrorInputLayout input;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private WidgetAddLegalBinding(@NonNull LinearLayout linearLayout, @NonNull CommonB2BTextWithErrorInputLayout commonB2BTextWithErrorInputLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.input = commonB2BTextWithErrorInputLayout;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static WidgetAddLegalBinding bind(@NonNull View view) {
        int i11 = R$id.input;
        CommonB2BTextWithErrorInputLayout commonB2BTextWithErrorInputLayout = (CommonB2BTextWithErrorInputLayout) C2548q.d(i11, view);
        if (commonB2BTextWithErrorInputLayout != null) {
            i11 = R$id.subtitle;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.title;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetAddLegalBinding((LinearLayout) view, commonB2BTextWithErrorInputLayout, textAtomV2View, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
