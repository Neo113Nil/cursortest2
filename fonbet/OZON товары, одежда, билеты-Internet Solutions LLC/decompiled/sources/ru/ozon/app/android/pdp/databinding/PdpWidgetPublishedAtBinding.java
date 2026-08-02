package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;

/* loaded from: classes13.dex */
public final class PdpWidgetPublishedAtBinding implements a {

    @NonNull
    public final TextAtomWithIconView publishedAtTav;

    @NonNull
    private final TextAtomWithIconView rootView;

    private PdpWidgetPublishedAtBinding(@NonNull TextAtomWithIconView textAtomWithIconView, @NonNull TextAtomWithIconView textAtomWithIconView2) {
        this.rootView = textAtomWithIconView;
        this.publishedAtTav = textAtomWithIconView2;
    }

    @NonNull
    public static PdpWidgetPublishedAtBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomWithIconView textAtomWithIconView = (TextAtomWithIconView) view;
        return new PdpWidgetPublishedAtBinding(textAtomWithIconView, textAtomWithIconView);
    }

    @Override // X4.a
    @NonNull
    public TextAtomWithIconView getRoot() {
        return this.rootView;
    }
}
