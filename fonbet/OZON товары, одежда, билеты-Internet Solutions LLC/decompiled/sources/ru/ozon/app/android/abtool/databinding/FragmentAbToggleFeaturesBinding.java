package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class FragmentAbToggleFeaturesBinding implements a {

    @NonNull
    public final RecyclerView abRv;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final View divider;

    @NonNull
    public final EditText filterEt;

    @NonNull
    public final TextView overriddenFeatureFlagsDescription;

    @NonNull
    public final SwitchCompat overriddenFeatureFlagsSwitch;

    @NonNull
    public final TextView overriddenFeatureFlagsTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView variantsTextView;

    private FragmentAbToggleFeaturesBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull Barrier barrier, @NonNull View view, @NonNull EditText editText, @NonNull TextView textView, @NonNull SwitchCompat switchCompat, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.abRv = recyclerView;
        this.barrier = barrier;
        this.divider = view;
        this.filterEt = editText;
        this.overriddenFeatureFlagsDescription = textView;
        this.overriddenFeatureFlagsSwitch = switchCompat;
        this.overriddenFeatureFlagsTitle = textView2;
        this.variantsTextView = textView3;
    }

    @NonNull
    public static FragmentAbToggleFeaturesBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.abRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null && (d11 = C2548q.d((i11 = R$id.divider), view)) != null) {
                i11 = R$id.filterEt;
                EditText editText = (EditText) C2548q.d(i11, view);
                if (editText != null) {
                    i11 = R$id.overriddenFeatureFlagsDescription;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.overriddenFeatureFlagsSwitch;
                        SwitchCompat switchCompat = (SwitchCompat) C2548q.d(i11, view);
                        if (switchCompat != null) {
                            i11 = R$id.overriddenFeatureFlagsTitle;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.variantsTextView;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    return new FragmentAbToggleFeaturesBinding((ConstraintLayout) view, recyclerView, barrier, d11, editText, textView, switchCompat, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentAbToggleFeaturesBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ab_toggle_features, viewGroup, false);
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
