package ru.ozon.app.android.marketing.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterView;

/* loaded from: classes12.dex */
public final class WidgetBlackFridayCounterBinding implements a {

    @NonNull
    public final BlackFridayCounterView root;

    @NonNull
    private final BlackFridayCounterView rootView;

    private WidgetBlackFridayCounterBinding(@NonNull BlackFridayCounterView blackFridayCounterView, @NonNull BlackFridayCounterView blackFridayCounterView2) {
        this.rootView = blackFridayCounterView;
        this.root = blackFridayCounterView2;
    }

    @NonNull
    public static WidgetBlackFridayCounterBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BlackFridayCounterView blackFridayCounterView = (BlackFridayCounterView) view;
        return new WidgetBlackFridayCounterBinding(blackFridayCounterView, blackFridayCounterView);
    }

    @Override // X4.a
    @NonNull
    public BlackFridayCounterView getRoot() {
        return this.rootView;
    }
}
