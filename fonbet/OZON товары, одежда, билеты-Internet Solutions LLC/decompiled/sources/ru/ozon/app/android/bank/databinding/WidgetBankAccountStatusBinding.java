package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetBankAccountStatusBinding implements a {

    @NonNull
    public final SmallButtonView buttonSbv;

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final SingleAtom descriptionTv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomV2View subTitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private WidgetBankAccountStatusBinding(@NonNull FrameLayout frameLayout, @NonNull SmallButtonView smallButtonView, @NonNull ConstraintLayout constraintLayout, @NonNull SingleAtom singleAtom, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = frameLayout;
        this.buttonSbv = smallButtonView;
        this.cardContainerCl = constraintLayout;
        this.descriptionTv = singleAtom;
        this.subTitleTv = textAtomV2View;
        this.titleTv = textAtomV2View2;
    }

    @NonNull
    public static WidgetBankAccountStatusBinding bind(@NonNull View view) {
        int i11 = R$id.buttonSbv;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.cardContainerCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.descriptionTv;
                SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                if (singleAtom != null) {
                    i11 = R$id.subTitleTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.titleTv;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            return new WidgetBankAccountStatusBinding((FrameLayout) view, smallButtonView, constraintLayout, singleAtom, textAtomV2View, textAtomV2View2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
