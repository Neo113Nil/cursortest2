package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetOrderitemsTitleBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView titleTAV;

    private WidgetOrderitemsTitleBinding(@NonNull FrameLayout frameLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = frameLayout;
        this.titleTAV = textAtomView;
    }

    @NonNull
    public static WidgetOrderitemsTitleBinding bind(@NonNull View view) {
        int i11 = R$id.titleTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            return new WidgetOrderitemsTitleBinding((FrameLayout) view, textAtomView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
