package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetPromoBannerB2bBinding implements a {

    @NonNull
    public final RecyclerView promoBannerB2BListRV;

    @NonNull
    public final TextAtomView promoBannerB2BTitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetPromoBannerB2bBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.promoBannerB2BListRV = recyclerView;
        this.promoBannerB2BTitleTAV = textAtomView;
    }

    @NonNull
    public static WidgetPromoBannerB2bBinding bind(@NonNull View view) {
        int i11 = R$id.promoBannerB2BListRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.promoBannerB2BTitleTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new WidgetPromoBannerB2bBinding((LinearLayout) view, recyclerView, textAtomView);
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
