package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.csma.tips.R$id;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetCourierTipsDetailsNoUiBinding implements a {

    @NonNull
    public final FrameLayout csmaButtonContainerFl;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final SingleAtom tipActionButton;

    private WidgetCourierTipsDetailsNoUiBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull SingleAtom singleAtom) {
        this.rootView = frameLayout;
        this.csmaButtonContainerFl = frameLayout2;
        this.tipActionButton = singleAtom;
    }

    @NonNull
    public static WidgetCourierTipsDetailsNoUiBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.tipActionButton;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            return new WidgetCourierTipsDetailsNoUiBinding(frameLayout, frameLayout, singleAtom);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCourierTipsDetailsNoUiBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_courier_tips_details_no_ui, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
