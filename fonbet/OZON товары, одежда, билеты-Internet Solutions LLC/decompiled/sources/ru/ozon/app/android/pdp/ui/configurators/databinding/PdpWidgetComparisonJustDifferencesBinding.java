package ru.ozon.app.android.pdp.ui.configurators.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonJustDifferencesBinding implements a {

    @NonNull
    public final SingleAtom justDifferencesSA;

    @NonNull
    private final SingleAtom rootView;

    private PdpWidgetComparisonJustDifferencesBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.justDifferencesSA = singleAtom2;
    }

    @NonNull
    public static PdpWidgetComparisonJustDifferencesBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new PdpWidgetComparisonJustDifferencesBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
