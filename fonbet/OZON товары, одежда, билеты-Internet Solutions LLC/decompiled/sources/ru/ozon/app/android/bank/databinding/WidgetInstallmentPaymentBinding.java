package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetInstallmentPaymentBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final RecyclerView paymentsRv;

    @NonNull
    public final SmallBorderlessButtonWithIconView paymentsSwitch;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subTitleTv;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetInstallmentPaymentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.iconIv = imageView;
        this.paymentsRv = recyclerView;
        this.paymentsSwitch = smallBorderlessButtonWithIconView;
        this.subTitleTv = textAtomView;
        this.titleTv = textAtomView2;
    }

    @NonNull
    public static WidgetInstallmentPaymentBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.paymentsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.paymentsSwitch;
                SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView = (SmallBorderlessButtonWithIconView) C2548q.d(i11, view);
                if (smallBorderlessButtonWithIconView != null) {
                    i11 = R$id.subTitleTv;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.titleTv;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetInstallmentPaymentBinding((ConstraintLayout) view, imageView, recyclerView, smallBorderlessButtonWithIconView, textAtomView, textAtomView2);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
