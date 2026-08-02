package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetCharityAddressSelectorBinding implements a {

    @NonNull
    public final LargeButtonView button;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView tvSubtitle;

    @NonNull
    public final TextAtomView tvTitle;

    private WidgetCharityAddressSelectorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.button = largeButtonView;
        this.tvSubtitle = textAtomView;
        this.tvTitle = textAtomView2;
    }

    @NonNull
    public static WidgetCharityAddressSelectorBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.tvSubtitle;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.tvTitle;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new WidgetCharityAddressSelectorBinding((ConstraintLayout) view, largeButtonView, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
