package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetLuggageRequirementsV2Binding implements a {

    @NonNull
    public final RecyclerView luggageRequirementsV2RV;

    @NonNull
    public final TabLayout luggageRequirementsV2TabsTL;

    @NonNull
    public final TextAtomView luggageRequirementsV2TitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetLuggageRequirementsV2Binding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TabLayout tabLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.luggageRequirementsV2RV = recyclerView;
        this.luggageRequirementsV2TabsTL = tabLayout;
        this.luggageRequirementsV2TitleTAV = textAtomView;
    }

    @NonNull
    public static WidgetLuggageRequirementsV2Binding bind(@NonNull View view) {
        int i11 = R$id.luggageRequirementsV2RV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.luggageRequirementsV2TabsTL;
            TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
            if (tabLayout != null) {
                i11 = R$id.luggageRequirementsV2TitleTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetLuggageRequirementsV2Binding((LinearLayout) view, recyclerView, tabLayout, textAtomView);
                }
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
