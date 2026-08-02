package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class CommonItemNextStepButtonBinding implements a {

    @NonNull
    public final TextAtomView buttonDescription;

    @NonNull
    public final LargeButtonView buttonNext;

    @NonNull
    private final LinearLayout rootView;

    private CommonItemNextStepButtonBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull LargeButtonView largeButtonView) {
        this.rootView = linearLayout;
        this.buttonDescription = textAtomView;
        this.buttonNext = largeButtonView;
    }

    @NonNull
    public static CommonItemNextStepButtonBinding bind(@NonNull View view) {
        int i11 = R$id.buttonDescription;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.buttonNext;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                return new CommonItemNextStepButtonBinding((LinearLayout) view, textAtomView, largeButtonView);
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
