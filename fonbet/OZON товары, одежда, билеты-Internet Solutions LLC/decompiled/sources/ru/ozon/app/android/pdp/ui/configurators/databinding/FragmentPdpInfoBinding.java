package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;

/* loaded from: classes13.dex */
public final class FragmentPdpInfoBinding implements a {

    @NonNull
    public final NestedScrollView infoNsv;

    @NonNull
    public final TextView infoTv;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private FragmentPdpInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.infoNsv = nestedScrollView;
        this.infoTv = textView;
        this.root = constraintLayout2;
        this.titleTv = textView2;
    }

    @NonNull
    public static FragmentPdpInfoBinding bind(@NonNull View view) {
        int i11 = R$id.infoNsv;
        NestedScrollView nestedScrollView = (NestedScrollView) C2548q.d(i11, view);
        if (nestedScrollView != null) {
            i11 = R$id.infoTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new FragmentPdpInfoBinding(constraintLayout, nestedScrollView, textView, constraintLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentPdpInfoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_pdp_info, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
