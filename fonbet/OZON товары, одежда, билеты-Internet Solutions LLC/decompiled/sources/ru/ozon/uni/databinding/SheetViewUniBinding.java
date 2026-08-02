package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$layout;

/* loaded from: classes4.dex */
public final class SheetViewUniBinding implements a {

    @NonNull
    public final MaterialCardView cardContainer;

    @NonNull
    public final ConstraintLayout contentContainer;

    @NonNull
    public final FrameLayout root;

    @NonNull
    private final FrameLayout rootView;

    private SheetViewUniBinding(@NonNull FrameLayout frameLayout, @NonNull MaterialCardView materialCardView, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.cardContainer = materialCardView;
        this.contentContainer = constraintLayout;
        this.root = frameLayout2;
    }

    @NonNull
    public static SheetViewUniBinding bind(@NonNull View view) {
        int i11 = R$id.cardContainer;
        MaterialCardView materialCardView = (MaterialCardView) C2548q.d(i11, view);
        if (materialCardView != null) {
            i11 = R$id.contentContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new SheetViewUniBinding(frameLayout, materialCardView, constraintLayout, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SheetViewUniBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SheetViewUniBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.sheet_view_uni, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
