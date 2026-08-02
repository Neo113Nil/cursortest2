package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes11.dex */
public final class AtomAuthorBlockBinding implements a {

    @NonNull
    public final AvatarView avatar;

    @NonNull
    public final View barrierEnd;

    @NonNull
    public final Barrier barrierStart;

    @NonNull
    private final View rootView;

    @NonNull
    public final SmallIconButtonView smallIconButton;

    @NonNull
    public final ImageView subtitleIconIV;

    @NonNull
    public final AppCompatTextView subtitleTextTV;

    @NonNull
    public final ImageView titleIconIV;

    @NonNull
    public final AppCompatTextView titleTextTV;

    private AtomAuthorBlockBinding(@NonNull View view, @NonNull AvatarView avatarView, @NonNull View view2, @NonNull Barrier barrier, @NonNull SmallIconButtonView smallIconButtonView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.avatar = avatarView;
        this.barrierEnd = view2;
        this.barrierStart = barrier;
        this.smallIconButton = smallIconButtonView;
        this.subtitleIconIV = imageView;
        this.subtitleTextTV = appCompatTextView;
        this.titleIconIV = imageView2;
        this.titleTextTV = appCompatTextView2;
    }

    @NonNull
    public static AtomAuthorBlockBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.avatar;
        AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
        if (avatarView != null && (d11 = C2548q.d((i11 = R$id.barrierEnd), view)) != null) {
            i11 = R$id.barrierStart;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.smallIconButton;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null) {
                    i11 = R$id.subtitleIconIV;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.subtitleTextTV;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView != null) {
                            i11 = R$id.titleIconIV;
                            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                            if (imageView2 != null) {
                                i11 = R$id.titleTextTV;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView2 != null) {
                                    return new AtomAuthorBlockBinding(view, avatarView, d11, barrier, smallIconButtonView, imageView, appCompatTextView, imageView2, appCompatTextView2);
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
    public static AtomAuthorBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_author_block, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
