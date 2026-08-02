package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsReviewBinding implements a {

    @NonNull
    public final AvatarView hotelsReviewAvatarAv;

    @NonNull
    public final RecyclerView hotelsReviewBlocksRv;

    @NonNull
    public final TextAtomView hotelsReviewDateTav;

    @NonNull
    public final Barrier hotelsReviewHeaderBottomBarrier;

    @NonNull
    public final TextAtomView hotelsReviewNameTav;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemHotelsReviewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AvatarView avatarView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.hotelsReviewAvatarAv = avatarView;
        this.hotelsReviewBlocksRv = recyclerView;
        this.hotelsReviewDateTav = textAtomView;
        this.hotelsReviewHeaderBottomBarrier = barrier;
        this.hotelsReviewNameTav = textAtomView2;
    }

    @NonNull
    public static ItemHotelsReviewBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsReviewAvatarAv;
        AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
        if (avatarView != null) {
            i11 = R$id.hotelsReviewBlocksRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.hotelsReviewDateTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.hotelsReviewHeaderBottomBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        i11 = R$id.hotelsReviewNameTav;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new ItemHotelsReviewBinding((ConstraintLayout) view, avatarView, recyclerView, textAtomView, barrier, textAtomView2);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
