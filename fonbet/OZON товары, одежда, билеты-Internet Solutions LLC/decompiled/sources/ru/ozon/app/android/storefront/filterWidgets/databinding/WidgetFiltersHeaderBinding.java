package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes2.dex */
public final class WidgetFiltersHeaderBinding implements a {

    @NonNull
    public final LargeButtonView headerLargeButton;

    @NonNull
    public final LargeBorderlessButtonView headerRightButton;

    @NonNull
    public final TextView headerTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetFiltersHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.headerLargeButton = largeButtonView;
        this.headerRightButton = largeBorderlessButtonView;
        this.headerTitle = textView;
    }

    @NonNull
    public static WidgetFiltersHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.headerLargeButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.headerRightButton;
            LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
            if (largeBorderlessButtonView != null) {
                i11 = R$id.headerTitle;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetFiltersHeaderBinding((ConstraintLayout) view, largeButtonView, largeBorderlessButtonView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
