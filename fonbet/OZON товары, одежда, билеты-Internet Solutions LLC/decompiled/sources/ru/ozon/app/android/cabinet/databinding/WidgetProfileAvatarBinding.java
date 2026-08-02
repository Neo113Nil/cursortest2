package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class WidgetProfileAvatarBinding implements a {

    @NonNull
    public final IconView profileAvatarIconView;

    @NonNull
    public final LoaderView profileAvatarLoader;

    @NonNull
    public final TextAtomV2View profileTitleView;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetProfileAvatarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull LoaderView loaderView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.profileAvatarIconView = iconView;
        this.profileAvatarLoader = loaderView;
        this.profileTitleView = textAtomV2View;
    }

    @NonNull
    public static WidgetProfileAvatarBinding bind(@NonNull View view) {
        int i11 = R$id.profileAvatarIconView;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.profileAvatarLoader;
            LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
            if (loaderView != null) {
                i11 = R$id.profileTitleView;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetProfileAvatarBinding((ConstraintLayout) view, iconView, loaderView, textAtomV2View);
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
