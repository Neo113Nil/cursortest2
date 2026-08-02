package ru.ozon.app.android.pdpoldwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpWidgetTextBlockBinding implements a {

    @NonNull
    private final TextAtomV2View rootView;

    @NonNull
    public final TextAtomV2View textBlockTv;

    private PdpWidgetTextBlockBinding(@NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = textAtomV2View;
        this.textBlockTv = textAtomV2View2;
    }

    @NonNull
    public static PdpWidgetTextBlockBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomV2View textAtomV2View = (TextAtomV2View) view;
        return new PdpWidgetTextBlockBinding(textAtomV2View, textAtomV2View);
    }

    @Override // X4.a
    @NonNull
    public TextAtomV2View getRoot() {
        return this.rootView;
    }
}
