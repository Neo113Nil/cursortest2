package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.accesscontrol.presentation.author.view.AuthorImageStackView;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetAccessControlUserBinding implements a {

    @NonNull
    public final SingleAtom atomHolder;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AuthorImageStackView userAvatarView;

    @NonNull
    public final TextAtomView userNameTAV;

    private WidgetAccessControlUserBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SingleAtom singleAtom, @NonNull AuthorImageStackView authorImageStackView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.atomHolder = singleAtom;
        this.userAvatarView = authorImageStackView;
        this.userNameTAV = textAtomView;
    }

    @NonNull
    public static WidgetAccessControlUserBinding bind(@NonNull View view) {
        int i11 = R$id.atomHolder;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.userAvatarView;
            AuthorImageStackView authorImageStackView = (AuthorImageStackView) C2548q.d(i11, view);
            if (authorImageStackView != null) {
                i11 = R$id.userNameTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetAccessControlUserBinding((ConstraintLayout) view, singleAtom, authorImageStackView, textAtomView);
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
