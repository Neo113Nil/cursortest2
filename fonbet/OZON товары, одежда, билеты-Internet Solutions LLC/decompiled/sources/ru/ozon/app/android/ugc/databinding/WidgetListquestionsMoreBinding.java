package ru.ozon.app.android.ugc.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetListquestionsMoreBinding implements a {

    @NonNull
    public final SingleAtom moreQuestionsSa;

    @NonNull
    private final SingleAtom rootView;

    private WidgetListquestionsMoreBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.moreQuestionsSa = singleAtom2;
    }

    @NonNull
    public static WidgetListquestionsMoreBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new WidgetListquestionsMoreBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
