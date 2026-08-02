package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetAccessControlBinding implements a {

    @NonNull
    public final ImageView iconIV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallButtonView smallButtonView;

    @NonNull
    public final TextAtomView subtitleTv;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetAccessControlBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SmallButtonView smallButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.iconIV = imageView;
        this.smallButtonView = smallButtonView;
        this.subtitleTv = textAtomView;
        this.titleTv = textAtomView2;
    }

    @NonNull
    public static WidgetAccessControlBinding bind(@NonNull View view) {
        int i11 = R$id.iconIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.smallButtonView;
            SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
            if (smallButtonView != null) {
                i11 = R$id.subtitleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.titleTv;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetAccessControlBinding((ConstraintLayout) view, imageView, smallButtonView, textAtomView, textAtomView2);
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
