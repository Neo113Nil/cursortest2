package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class MDisclaimerModalBinding implements a {

    @NonNull
    public final ButtonV3View disclaimerModalDoneButton;

    @NonNull
    public final RecyclerView disclaimerModalRecyclerView;

    @NonNull
    public final TextAtomV2View disclaimerModalTitle;

    @NonNull
    private final NestedScrollView rootView;

    private MDisclaimerModalBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ButtonV3View buttonV3View, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = nestedScrollView;
        this.disclaimerModalDoneButton = buttonV3View;
        this.disclaimerModalRecyclerView = recyclerView;
        this.disclaimerModalTitle = textAtomV2View;
    }

    @NonNull
    public static MDisclaimerModalBinding bind(@NonNull View view) {
        int i11 = R$id.disclaimer_modal_done_button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.disclaimer_modal_recycler_view;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.disclaimer_modal_title;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new MDisclaimerModalBinding((NestedScrollView) view, buttonV3View, recyclerView, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MDisclaimerModalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_disclaimer_modal, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public NestedScrollView getConstraintLayout() {
        return this.rootView;
    }
}
