package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes2.dex */
public final class FragmentBottomSheetSortsBinding implements a {

    @NonNull
    public final LargeButtonView applySortBtn;

    @NonNull
    public final LinearLayout fragmentBottomSheetSorts;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View sheetHandle;

    @NonNull
    public final VerticalAtomsLayout sortsAtomsLayout;

    @NonNull
    public final TextView title;

    private FragmentBottomSheetSortsBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.applySortBtn = largeButtonView;
        this.fragmentBottomSheetSorts = linearLayout2;
        this.sheetHandle = view;
        this.sortsAtomsLayout = verticalAtomsLayout;
        this.title = textView;
    }

    @NonNull
    public static FragmentBottomSheetSortsBinding bind(@NonNull View view) {
        int i11 = R$id.applySortBtn;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.sheetHandle;
            View d11 = C2548q.d(i11, view);
            if (d11 != null) {
                i11 = R$id.sortsAtomsLayout;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.title;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new FragmentBottomSheetSortsBinding(linearLayout, largeButtonView, linearLayout, d11, verticalAtomsLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentBottomSheetSortsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_bottom_sheet_sorts, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
