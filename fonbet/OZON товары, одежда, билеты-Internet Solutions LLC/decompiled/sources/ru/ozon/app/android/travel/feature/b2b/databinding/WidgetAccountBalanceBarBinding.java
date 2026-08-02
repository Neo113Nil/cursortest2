package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;

/* loaded from: classes12.dex */
public final class WidgetAccountBalanceBarBinding implements a {

    @NonNull
    public final CellWithSubtitleCounterView accountBalanceBar;

    @NonNull
    public final FrameLayout accountBalanceBarRoot;

    @NonNull
    private final FrameLayout rootView;

    private WidgetAccountBalanceBarBinding(@NonNull FrameLayout frameLayout, @NonNull CellWithSubtitleCounterView cellWithSubtitleCounterView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.accountBalanceBar = cellWithSubtitleCounterView;
        this.accountBalanceBarRoot = frameLayout2;
    }

    @NonNull
    public static WidgetAccountBalanceBarBinding bind(@NonNull View view) {
        int i11 = R$id.accountBalanceBar;
        CellWithSubtitleCounterView cellWithSubtitleCounterView = (CellWithSubtitleCounterView) C2548q.d(i11, view);
        if (cellWithSubtitleCounterView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new WidgetAccountBalanceBarBinding(frameLayout, cellWithSubtitleCounterView, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
