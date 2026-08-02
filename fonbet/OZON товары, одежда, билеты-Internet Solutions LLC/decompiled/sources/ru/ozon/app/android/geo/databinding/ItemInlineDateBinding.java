package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class ItemInlineDateBinding implements a {

    @NonNull
    public final SingleAtom dateSa;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SingleAtom timeSa;

    private ItemInlineDateBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = constraintLayout;
        this.dateSa = singleAtom;
        this.timeSa = singleAtom2;
    }

    @NonNull
    public static ItemInlineDateBinding bind(@NonNull View view) {
        int i11 = R$id.dateSa;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.timeSa;
            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom2 != null) {
                return new ItemInlineDateBinding((ConstraintLayout) view, singleAtom, singleAtom2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemInlineDateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_inline_date, viewGroup, false);
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
