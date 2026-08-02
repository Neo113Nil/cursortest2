package ru.ozon.app.android.search.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class SelectorDataMobileStepItemBinding implements a {

    @NonNull
    private final SingleAtom rootView;

    @NonNull
    public final SingleAtom stepItem;

    private SelectorDataMobileStepItemBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.stepItem = singleAtom2;
    }

    @NonNull
    public static SelectorDataMobileStepItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new SelectorDataMobileStepItemBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
