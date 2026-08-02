package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class CellWithSubtitle24iconToggleCounterBinding implements a {

    @NonNull
    public final BadgeView counterBadge;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final SwitchMaterial toggleSw;

    private CellWithSubtitle24iconToggleCounterBinding(@NonNull View view, @NonNull BadgeView badgeView, @NonNull ImageView imageView, @NonNull View view2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull SwitchMaterial switchMaterial) {
        this.rootView = view;
        this.counterBadge = badgeView;
        this.iconIv = imageView;
        this.separator = view2;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
        this.toggleSw = switchMaterial;
    }

    @NonNull
    public static CellWithSubtitle24iconToggleCounterBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.counterBadge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                i11 = R$id.subtitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.titleTav;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.toggleSw;
                        SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                        if (switchMaterial != null) {
                            return new CellWithSubtitle24iconToggleCounterBinding(view, badgeView, imageView, d11, textAtomView, textAtomView2, switchMaterial);
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
    public View getConstraintLayout() {
        return this.rootView;
    }
}
