package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetAddLegalAddressMobileBinding implements a {

    @NonNull
    public final TextAtomV2View legalsAddressErrorTv;

    @NonNull
    public final TextAtomV2View legalsAddressInfoTv;

    @NonNull
    public final RecyclerView legalsAddressRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SearchView searchAddressSv;

    private WidgetAddLegalAddressMobileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull RecyclerView recyclerView, @NonNull SearchView searchView) {
        this.rootView = constraintLayout;
        this.legalsAddressErrorTv = textAtomV2View;
        this.legalsAddressInfoTv = textAtomV2View2;
        this.legalsAddressRv = recyclerView;
        this.searchAddressSv = searchView;
    }

    @NonNull
    public static WidgetAddLegalAddressMobileBinding bind(@NonNull View view) {
        int i11 = R$id.legalsAddressErrorTv;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.legalsAddressInfoTv;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.legalsAddressRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.searchAddressSv;
                    SearchView searchView = (SearchView) C2548q.d(i11, view);
                    if (searchView != null) {
                        return new WidgetAddLegalAddressMobileBinding((ConstraintLayout) view, textAtomV2View, textAtomV2View2, recyclerView, searchView);
                    }
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
