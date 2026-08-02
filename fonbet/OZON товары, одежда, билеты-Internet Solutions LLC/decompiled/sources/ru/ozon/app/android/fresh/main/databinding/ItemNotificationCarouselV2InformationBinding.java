package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemNotificationCarouselV2InformationBinding implements a {

    @NonNull
    public final IconView leftIcon;

    @NonNull
    public final IconView rightIcon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private ItemNotificationCarouselV2InformationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull IconView iconView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.leftIcon = iconView;
        this.rightIcon = iconView2;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static ItemNotificationCarouselV2InformationBinding bind(@NonNull View view) {
        int i11 = R$id.leftIcon;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.rightIcon;
            IconView iconView2 = (IconView) C2548q.d(i11, view);
            if (iconView2 != null) {
                i11 = R$id.subtitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new ItemNotificationCarouselV2InformationBinding((ConstraintLayout) view, iconView, iconView2, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemNotificationCarouselV2InformationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNotificationCarouselV2InformationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_notification_carousel_v2_information, viewGroup, false);
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
