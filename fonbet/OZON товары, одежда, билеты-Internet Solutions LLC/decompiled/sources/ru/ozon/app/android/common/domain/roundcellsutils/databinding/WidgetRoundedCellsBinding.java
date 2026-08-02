package ru.ozon.app.android.common.domain.roundcellsutils.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetRoundedCellsBinding implements a {

    @NonNull
    private final SingleAtom rootView;

    @NonNull
    public final SingleAtom saCell;

    private WidgetRoundedCellsBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.saCell = singleAtom2;
    }

    @NonNull
    public static WidgetRoundedCellsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new WidgetRoundedCellsBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
