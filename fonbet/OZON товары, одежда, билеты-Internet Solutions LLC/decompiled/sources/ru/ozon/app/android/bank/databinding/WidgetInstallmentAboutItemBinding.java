package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetInstallmentAboutItemBinding implements a {

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView textTv;

    private WidgetInstallmentAboutItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.imageIv = imageView;
        this.textTv = textAtomView;
    }

    @NonNull
    public static WidgetInstallmentAboutItemBinding bind(@NonNull View view) {
        int i11 = R$id.imageIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.textTv;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new WidgetInstallmentAboutItemBinding((ConstraintLayout) view, imageView, textAtomView);
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
