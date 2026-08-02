package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetAddLegalMobileBinding implements a {

    @NonNull
    public final TextView addressTv;

    @NonNull
    public final RecyclerView advantagesRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAddLegalMobileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.addressTv = textView;
        this.advantagesRv = recyclerView;
        this.subtitleTav = textAtomV2View;
        this.titleTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetAddLegalMobileBinding bind(@NonNull View view) {
        int i11 = R$id.addressTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.advantagesRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.subtitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.titleTav;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetAddLegalMobileBinding((ConstraintLayout) view, textView, recyclerView, textAtomV2View, textAtomV2View2);
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
