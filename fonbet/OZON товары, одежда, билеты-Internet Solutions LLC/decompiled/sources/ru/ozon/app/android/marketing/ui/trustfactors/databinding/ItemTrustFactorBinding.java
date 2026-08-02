package ru.ozon.app.android.marketing.ui.trustfactors.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.ui.trustfactors.R$id;
import ru.ozon.app.android.marketing.ui.trustfactors.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemTrustFactorBinding implements a {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final IconView icon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private ItemTrustFactorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.icon = iconView;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static ItemTrustFactorBinding bind(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.icon;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.subtitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new ItemTrustFactorBinding((ConstraintLayout) view, barrier, iconView, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTrustFactorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_trust_factor, viewGroup, false);
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
