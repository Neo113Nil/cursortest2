package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemProductHeaderExpressBinding implements a {

    @NonNull
    public final DisclosureView headerDisclosure;

    @NonNull
    public final SmallBorderlessButtonView headerLinkTa;

    @NonNull
    public final TextAtomView headerSubtitleTa;

    @NonNull
    public final TextAtomView headerTitleTa;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemProductHeaderExpressBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclosureView disclosureView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.headerDisclosure = disclosureView;
        this.headerLinkTa = smallBorderlessButtonView;
        this.headerSubtitleTa = textAtomView;
        this.headerTitleTa = textAtomView2;
    }

    @NonNull
    public static ItemProductHeaderExpressBinding bind(@NonNull View view) {
        int i11 = R$id.headerDisclosure;
        DisclosureView disclosureView = (DisclosureView) C2548q.d(i11, view);
        if (disclosureView != null) {
            i11 = R$id.headerLinkTa;
            SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
            if (smallBorderlessButtonView != null) {
                i11 = R$id.headerSubtitleTa;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.headerTitleTa;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new ItemProductHeaderExpressBinding((ConstraintLayout) view, disclosureView, smallBorderlessButtonView, textAtomView, textAtomView2);
                    }
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
