package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDeliveryToCharitiesInfoBinding implements a {

    @NonNull
    public final TextAtomV2View aboutTv;

    @NonNull
    public final TextAtomV2View agreementTv;

    @NonNull
    public final RecyclerView instructionsRecyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private WidgetDeliveryToCharitiesInfoBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4) {
        this.rootView = linearLayout;
        this.aboutTv = textAtomV2View;
        this.agreementTv = textAtomV2View2;
        this.instructionsRecyclerView = recyclerView;
        this.subtitleTv = textAtomV2View3;
        this.titleTv = textAtomV2View4;
    }

    @NonNull
    public static WidgetDeliveryToCharitiesInfoBinding bind(@NonNull View view) {
        int i11 = R$id.aboutTv;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.agreementTv;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.instructionsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.subtitleTv;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        i11 = R$id.titleTv;
                        TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View4 != null) {
                            return new WidgetDeliveryToCharitiesInfoBinding((LinearLayout) view, textAtomV2View, textAtomV2View2, recyclerView, textAtomV2View3, textAtomV2View4);
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
