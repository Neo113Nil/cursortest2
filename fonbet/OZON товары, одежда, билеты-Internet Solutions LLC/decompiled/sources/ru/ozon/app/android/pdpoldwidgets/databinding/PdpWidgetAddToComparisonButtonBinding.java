package ru.ozon.app.android.pdpoldwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpWidgetAddToComparisonButtonBinding implements a {

    @NonNull
    public final SingleAtom pdpAddToComparisonSAL;

    @NonNull
    private final SingleAtom rootView;

    private PdpWidgetAddToComparisonButtonBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.pdpAddToComparisonSAL = singleAtom2;
    }

    @NonNull
    public static PdpWidgetAddToComparisonButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new PdpWidgetAddToComparisonButtonBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
