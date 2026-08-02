package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class FragmentCancelReasonBinding implements a {

    @NonNull
    public final RecyclerView cancelReasonRv;

    @NonNull
    public final Toolbar cancelReasonTb;

    @NonNull
    public final CheckboxTitleSubtitleCellView checkboxCell;

    @NonNull
    public final LargeButtonView confirmCancelBtn;

    @NonNull
    public final ViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View textAtomViewCaption;

    private FragmentCancelReasonBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar, @NonNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NonNull LargeButtonView largeButtonView, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.cancelReasonRv = recyclerView;
        this.cancelReasonTb = toolbar;
        this.checkboxCell = checkboxTitleSubtitleCellView;
        this.confirmCancelBtn = largeButtonView;
        this.progressBar = viewProgressbarBgBinding;
        this.textAtomViewCaption = textAtomV2View;
    }

    @NonNull
    public static FragmentCancelReasonBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.cancelReasonRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.cancelReasonTb;
            Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
            if (toolbar != null) {
                i11 = R$id.checkboxCell;
                CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView = (CheckboxTitleSubtitleCellView) C2548q.d(i11, view);
                if (checkboxTitleSubtitleCellView != null) {
                    i11 = R$id.confirmCancelBtn;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                        ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
                        i11 = R$id.textAtomViewCaption;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            return new FragmentCancelReasonBinding((ConstraintLayout) view, recyclerView, toolbar, checkboxTitleSubtitleCellView, largeButtonView, bind, textAtomV2View);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentCancelReasonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_cancel_reason, viewGroup, false);
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
