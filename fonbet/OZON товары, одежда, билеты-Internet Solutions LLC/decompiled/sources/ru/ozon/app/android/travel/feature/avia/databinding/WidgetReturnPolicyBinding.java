package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.view.ReturnPolicyView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetReturnPolicyBinding implements a {

    @NonNull
    public final ReturnPolicyView returnPolicyRPV;

    @NonNull
    public final TabLayout returnPolicyTabsTL;

    @NonNull
    public final TextAtomView returnPolicyTitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetReturnPolicyBinding(@NonNull LinearLayout linearLayout, @NonNull ReturnPolicyView returnPolicyView, @NonNull TabLayout tabLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.returnPolicyRPV = returnPolicyView;
        this.returnPolicyTabsTL = tabLayout;
        this.returnPolicyTitleTAV = textAtomView;
    }

    @NonNull
    public static WidgetReturnPolicyBinding bind(@NonNull View view) {
        int i11 = R$id.returnPolicyRPV;
        ReturnPolicyView returnPolicyView = (ReturnPolicyView) C2548q.d(i11, view);
        if (returnPolicyView != null) {
            i11 = R$id.returnPolicyTabsTL;
            TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
            if (tabLayout != null) {
                i11 = R$id.returnPolicyTitleTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetReturnPolicyBinding((LinearLayout) view, returnPolicyView, tabLayout, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
