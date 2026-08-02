package ru.ozon.app.android.returns.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.R$id;
import ru.ozon.app.android.returns.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes13.dex */
public final class ItemExemplarStateBinding implements a {

    @NonNull
    public final BadgeView exemplarStatusBv;

    @NonNull
    public final TextAtomView quantityTav;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemExemplarStateBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.exemplarStatusBv = badgeView;
        this.quantityTav = textAtomView;
    }

    @NonNull
    public static ItemExemplarStateBinding bind(@NonNull View view) {
        int i11 = R$id.exemplarStatusBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.quantityTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemExemplarStateBinding((ConstraintLayout) view, badgeView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemExemplarStateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_exemplar_state, viewGroup, false);
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
