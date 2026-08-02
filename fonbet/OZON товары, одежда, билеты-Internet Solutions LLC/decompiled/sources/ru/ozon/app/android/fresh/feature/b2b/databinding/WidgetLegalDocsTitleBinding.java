package ru.ozon.app.android.fresh.feature.b2b.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetLegalDocsTitleBinding implements a {

    @NonNull
    public final TextAtomV2View legalDocsTitleTAV;

    @NonNull
    private final TextAtomV2View rootView;

    private WidgetLegalDocsTitleBinding(@NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = textAtomV2View;
        this.legalDocsTitleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetLegalDocsTitleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomV2View textAtomV2View = (TextAtomV2View) view;
        return new WidgetLegalDocsTitleBinding(textAtomV2View, textAtomV2View);
    }

    @Override // X4.a
    @NonNull
    public TextAtomV2View getRoot() {
        return this.rootView;
    }
}
