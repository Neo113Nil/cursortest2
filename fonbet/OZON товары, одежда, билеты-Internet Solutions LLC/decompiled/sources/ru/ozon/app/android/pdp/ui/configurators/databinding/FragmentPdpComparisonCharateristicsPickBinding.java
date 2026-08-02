package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class FragmentPdpComparisonCharateristicsPickBinding implements a {

    @NonNull
    public final ImageView backIV;

    @NonNull
    public final SingleAtom buttonSA;

    @NonNull
    public final RecyclerView characteristicsListRV;

    @NonNull
    public final ConstraintLayout characteristicsPickCL;

    @NonNull
    public final TextView clearTV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SearchView searchV;

    @NonNull
    public final TextView titleTV;

    private FragmentPdpComparisonCharateristicsPickBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull SingleAtom singleAtom, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull SearchView searchView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.backIV = imageView;
        this.buttonSA = singleAtom;
        this.characteristicsListRV = recyclerView;
        this.characteristicsPickCL = constraintLayout2;
        this.clearTV = textView;
        this.searchV = searchView;
        this.titleTV = textView2;
    }

    @NonNull
    public static FragmentPdpComparisonCharateristicsPickBinding bind(@NonNull View view) {
        int i11 = R$id.backIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.buttonSA;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.characteristicsListRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.clearTV;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.searchV;
                        SearchView searchView = (SearchView) C2548q.d(i11, view);
                        if (searchView != null) {
                            i11 = R$id.titleTV;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                return new FragmentPdpComparisonCharateristicsPickBinding(constraintLayout, imageView, singleAtom, recyclerView, constraintLayout, textView, searchView, textView2);
                            }
                        }
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
