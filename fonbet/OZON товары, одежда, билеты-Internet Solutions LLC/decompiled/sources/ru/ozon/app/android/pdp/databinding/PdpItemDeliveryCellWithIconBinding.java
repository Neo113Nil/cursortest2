package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpItemDeliveryCellWithIconBinding implements a {

    @NonNull
    public final SingleAtom cellSa;

    @NonNull
    private final SingleAtom rootView;

    private PdpItemDeliveryCellWithIconBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.cellSa = singleAtom2;
    }

    @NonNull
    public static PdpItemDeliveryCellWithIconBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new PdpItemDeliveryCellWithIconBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
