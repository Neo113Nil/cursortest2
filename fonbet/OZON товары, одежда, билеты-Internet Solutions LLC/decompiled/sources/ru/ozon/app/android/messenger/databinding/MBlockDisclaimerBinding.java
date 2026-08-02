package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MBlockDisclaimerBinding implements a {

    @NonNull
    public final TextAtomView descriptionTv;

    @NonNull
    public final Flow disclaimerButtonsFlow;

    @NonNull
    public final ImageView disclaimerImage;

    @NonNull
    public final ConstraintLayout disclaimerRootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTv;

    private MBlockDisclaimerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull Flow flow, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.descriptionTv = textAtomView;
        this.disclaimerButtonsFlow = flow;
        this.disclaimerImage = imageView;
        this.disclaimerRootCl = constraintLayout2;
        this.titleTv = textAtomView2;
    }

    @NonNull
    public static MBlockDisclaimerBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.disclaimerButtonsFlow;
            Flow flow = (Flow) C2548q.d(i11, view);
            if (flow != null) {
                i11 = R$id.disclaimerImage;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.titleTv;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new MBlockDisclaimerBinding(constraintLayout, textAtomView, flow, imageView, constraintLayout, textAtomView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockDisclaimerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_disclaimer, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
