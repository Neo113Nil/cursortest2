package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomView;
import ru.ozon.uni.android.uikit.appearance.text.StrikethroughTextView;

/* loaded from: classes2.dex */
public final class ViewSocialLargeProductBinding implements a {

    @NonNull
    public final TextView descriptionView;

    @NonNull
    public final AppCompatImageView iconView;

    @NonNull
    public final AppCompatImageView imageView;

    @NonNull
    public final StrikethroughTextView priceOriginalView;

    @NonNull
    public final TextView priceView;

    @NonNull
    private final View rootView;

    @NonNull
    public final SocialBadgeAtomView socialBadgeAtomView;

    private ViewSocialLargeProductBinding(@NonNull View view, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull StrikethroughTextView strikethroughTextView, @NonNull TextView textView2, @NonNull SocialBadgeAtomView socialBadgeAtomView) {
        this.rootView = view;
        this.descriptionView = textView;
        this.iconView = appCompatImageView;
        this.imageView = appCompatImageView2;
        this.priceOriginalView = strikethroughTextView;
        this.priceView = textView2;
        this.socialBadgeAtomView = socialBadgeAtomView;
    }

    @NonNull
    public static ViewSocialLargeProductBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionView;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.iconView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.imageView;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    i11 = R$id.priceOriginalView;
                    StrikethroughTextView strikethroughTextView = (StrikethroughTextView) C2548q.d(i11, view);
                    if (strikethroughTextView != null) {
                        i11 = R$id.priceView;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.socialBadgeAtomView;
                            SocialBadgeAtomView socialBadgeAtomView = (SocialBadgeAtomView) C2548q.d(i11, view);
                            if (socialBadgeAtomView != null) {
                                return new ViewSocialLargeProductBinding(view, textView, appCompatImageView, appCompatImageView2, strikethroughTextView, textView2, socialBadgeAtomView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewSocialLargeProductBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_social_large_product, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
