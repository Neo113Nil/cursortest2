package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.partpayment.R$layout;

/* loaded from: classes13.dex */
public final class FragmentModalPickerBinding implements a {

    @NonNull
    public final AppBarLayout appBarAbl;

    @NonNull
    public final TextView completeTv;

    @NonNull
    public final RecyclerView listRv;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final Toolbar toolbarT;

    private FragmentModalPickerBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.appBarAbl = appBarLayout;
        this.completeTv = textView;
        this.listRv = recyclerView;
        this.toolbarT = toolbar;
    }

    @NonNull
    public static FragmentModalPickerBinding bind(@NonNull View view) {
        int i11 = R$id.appBarAbl;
        AppBarLayout appBarLayout = (AppBarLayout) C2548q.d(i11, view);
        if (appBarLayout != null) {
            i11 = R$id.completeTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.listRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.toolbarT;
                    Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                    if (toolbar != null) {
                        return new FragmentModalPickerBinding((CoordinatorLayout) view, appBarLayout, textView, recyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentModalPickerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_modal_picker, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CoordinatorLayout getConstraintLayout() {
        return this.rootView;
    }
}
