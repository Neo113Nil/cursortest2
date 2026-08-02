package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;

/* loaded from: classes13.dex */
public final class WidgetMorkovskMenuBinding implements a {

    @NonNull
    public final MorkovskShadowButton bottomButton;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    private WidgetMorkovskMenuBinding(@NonNull LinearLayout linearLayout, @NonNull MorkovskShadowButton morkovskShadowButton, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.bottomButton = morkovskShadowButton;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static WidgetMorkovskMenuBinding bind(@NonNull View view) {
        int i11 = R$id.bottomButton;
        MorkovskShadowButton morkovskShadowButton = (MorkovskShadowButton) C2548q.d(i11, view);
        if (morkovskShadowButton != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetMorkovskMenuBinding((LinearLayout) view, morkovskShadowButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
