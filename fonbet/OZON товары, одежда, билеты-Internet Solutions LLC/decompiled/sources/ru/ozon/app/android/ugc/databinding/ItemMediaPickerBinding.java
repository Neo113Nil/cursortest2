package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views.CircularProgressBar;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes2.dex */
public final class ItemMediaPickerBinding implements a {

    @NonNull
    public final View badgeBackgroundView;

    @NonNull
    public final Group badgeGroup;

    @NonNull
    public final BadgeView badgeView;

    @NonNull
    public final View borderView;

    @NonNull
    public final IconView cancelIcon;

    @NonNull
    public final IconView centerIcon;

    @NonNull
    public final Image image;

    @NonNull
    public final CircularProgressBar progressView;

    @NonNull
    public final IconView removeIcon;

    @NonNull
    public final IconView retryIcon;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemMediaPickerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Group group, @NonNull BadgeView badgeView, @NonNull View view2, @NonNull IconView iconView, @NonNull IconView iconView2, @NonNull Image image, @NonNull CircularProgressBar circularProgressBar, @NonNull IconView iconView3, @NonNull IconView iconView4) {
        this.rootView = constraintLayout;
        this.badgeBackgroundView = view;
        this.badgeGroup = group;
        this.badgeView = badgeView;
        this.borderView = view2;
        this.cancelIcon = iconView;
        this.centerIcon = iconView2;
        this.image = image;
        this.progressView = circularProgressBar;
        this.removeIcon = iconView3;
        this.retryIcon = iconView4;
    }

    @NonNull
    public static ItemMediaPickerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeBackgroundView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.badgeGroup;
            Group group = (Group) C2548q.d(i11, view);
            if (group != null) {
                i11 = R$id.badgeView;
                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                if (badgeView != null && (d11 = C2548q.d((i11 = R$id.borderView), view)) != null) {
                    i11 = R$id.cancelIcon;
                    IconView iconView = (IconView) C2548q.d(i11, view);
                    if (iconView != null) {
                        i11 = R$id.centerIcon;
                        IconView iconView2 = (IconView) C2548q.d(i11, view);
                        if (iconView2 != null) {
                            i11 = R$id.image;
                            Image image = (Image) C2548q.d(i11, view);
                            if (image != null) {
                                i11 = R$id.progressView;
                                CircularProgressBar circularProgressBar = (CircularProgressBar) C2548q.d(i11, view);
                                if (circularProgressBar != null) {
                                    i11 = R$id.removeIcon;
                                    IconView iconView3 = (IconView) C2548q.d(i11, view);
                                    if (iconView3 != null) {
                                        i11 = R$id.retryIcon;
                                        IconView iconView4 = (IconView) C2548q.d(i11, view);
                                        if (iconView4 != null) {
                                            return new ItemMediaPickerBinding((ConstraintLayout) view, d12, group, badgeView, d11, iconView, iconView2, image, circularProgressBar, iconView3, iconView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemMediaPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMediaPickerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_media_picker, viewGroup, false);
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
