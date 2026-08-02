package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ReturnCreationReasonsHeaderBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    private ReturnCreationReasonsHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.subtitleTav = textAtomV2View;
        this.titleTav = textAtomV2View2;
    }

    @NonNull
    public static ReturnCreationReasonsHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.subtitleTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new ReturnCreationReasonsHeaderBinding((LinearLayout) view, textAtomV2View, textAtomV2View2);
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
