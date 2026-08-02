package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomDisclaimerBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout buttonsFAL;

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final CardView cardCv;

    @NonNull
    public final AppCompatTextView headerTv;

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView textTv;

    private AtomDisclaimerBinding(@NonNull View view, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.buttonsFAL = horizontalFlexAtomsLayout;
        this.cardContainerCl = constraintLayout;
        this.cardCv = cardView;
        this.headerTv = appCompatTextView;
        this.iconIv = appCompatImageView;
        this.textTv = appCompatTextView2;
    }

    @NonNull
    public static AtomDisclaimerBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsFAL;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.cardContainerCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.cardCv;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    i11 = R$id.headerTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.iconIv;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView != null) {
                            i11 = R$id.textTv;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView2 != null) {
                                return new AtomDisclaimerBinding(view, horizontalFlexAtomsLayout, constraintLayout, cardView, appCompatTextView, appCompatImageView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomDisclaimerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_disclaimer, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
