package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ItemDateSlotV2Binding implements a {

    @NonNull
    public final AspectView dateAspectView;

    @NonNull
    public final TextAtomV2View dateTV;

    @NonNull
    private final AspectView rootView;

    @NonNull
    public final TextAtomV2View weekDayTV;

    private ItemDateSlotV2Binding(@NonNull AspectView aspectView, @NonNull AspectView aspectView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = aspectView;
        this.dateAspectView = aspectView2;
        this.dateTV = textAtomV2View;
        this.weekDayTV = textAtomV2View2;
    }

    @NonNull
    public static ItemDateSlotV2Binding bind(@NonNull View view) {
        AspectView aspectView = (AspectView) view;
        int i11 = R$id.dateTV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.weekDayTV;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new ItemDateSlotV2Binding(aspectView, aspectView, textAtomV2View, textAtomV2View2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public AspectView getConstraintLayout() {
        return this.rootView;
    }
}
