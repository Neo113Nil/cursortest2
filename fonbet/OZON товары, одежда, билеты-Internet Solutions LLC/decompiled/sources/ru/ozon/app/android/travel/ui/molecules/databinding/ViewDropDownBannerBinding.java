package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewDropDownBannerBinding implements a {

    @NonNull
    public final Barrier dropDownBannerBarrier;

    @NonNull
    public final ConstraintLayout dropDownBannerContentRoot;

    @NonNull
    public final AppCompatImageView dropDownBannerExpandIcon;

    @NonNull
    public final TextAtomView dropDownBannerHiddenContent;

    @NonNull
    public final AppCompatImageView dropDownBannerIcon;

    @NonNull
    public final TextAtomView dropDownBannerTitle;

    @NonNull
    private final View rootView;

    private ViewDropDownBannerBinding(@NonNull View view, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.dropDownBannerBarrier = barrier;
        this.dropDownBannerContentRoot = constraintLayout;
        this.dropDownBannerExpandIcon = appCompatImageView;
        this.dropDownBannerHiddenContent = textAtomView;
        this.dropDownBannerIcon = appCompatImageView2;
        this.dropDownBannerTitle = textAtomView2;
    }

    @NonNull
    public static ViewDropDownBannerBinding bind(@NonNull View view) {
        int i11 = R$id.dropDownBannerBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.dropDownBannerContentRoot;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.dropDownBannerExpandIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.dropDownBannerHiddenContent;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.dropDownBannerIcon;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.dropDownBannerTitle;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                return new ViewDropDownBannerBinding(view, barrier, constraintLayout, appCompatImageView, textAtomView, appCompatImageView2, textAtomView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewDropDownBannerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_drop_down_banner, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
