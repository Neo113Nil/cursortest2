package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MNouiviewPinnedItemBinding implements a {

    @NonNull
    public final FrameLayout pinnedItemBlockContainer;

    @NonNull
    public final LinearLayout pinnedItemButtonsContainer;

    @NonNull
    private final ConstraintLayout rootView;

    private MNouiviewPinnedItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.pinnedItemBlockContainer = frameLayout;
        this.pinnedItemButtonsContainer = linearLayout;
    }

    @NonNull
    public static MNouiviewPinnedItemBinding bind(@NonNull View view) {
        int i11 = R$id.pinnedItemBlockContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.pinnedItemButtonsContainer;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                return new MNouiviewPinnedItemBinding((ConstraintLayout) view, frameLayout, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MNouiviewPinnedItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_nouiview_pinned_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
