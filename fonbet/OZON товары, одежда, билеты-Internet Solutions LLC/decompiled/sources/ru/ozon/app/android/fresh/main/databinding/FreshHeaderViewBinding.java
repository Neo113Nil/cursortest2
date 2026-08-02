package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class FreshHeaderViewBinding implements a {

    @NonNull
    public final DisclosureView headerDisclosure;

    @NonNull
    public final ConstraintLayout headerLayout;

    @NonNull
    public final TextAtomView headerTitleTa;

    @NonNull
    private final ConstraintLayout rootView;

    private FreshHeaderViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclosureView disclosureView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.headerDisclosure = disclosureView;
        this.headerLayout = constraintLayout2;
        this.headerTitleTa = textAtomView;
    }

    @NonNull
    public static FreshHeaderViewBinding bind(@NonNull View view) {
        int i11 = R$id.headerDisclosure;
        DisclosureView disclosureView = (DisclosureView) C2548q.d(i11, view);
        if (disclosureView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.headerTitleTa;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i12, view);
            if (textAtomView != null) {
                return new FreshHeaderViewBinding(constraintLayout, disclosureView, constraintLayout, textAtomView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FreshHeaderViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fresh_header_view, viewGroup, false);
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
