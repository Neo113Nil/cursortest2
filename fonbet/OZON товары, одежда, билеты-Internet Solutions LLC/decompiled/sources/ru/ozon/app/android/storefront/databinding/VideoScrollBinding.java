package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class VideoScrollBinding implements a {

    @NonNull
    public final LinearLayout containerHeader;

    @NonNull
    public final DisclosureView headerDisclosure;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvVideos;

    @NonNull
    public final TextAtomView tvHeader;

    private VideoScrollBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull DisclosureView disclosureView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.containerHeader = linearLayout2;
        this.headerDisclosure = disclosureView;
        this.rvVideos = recyclerView;
        this.tvHeader = textAtomView;
    }

    @NonNull
    public static VideoScrollBinding bind(@NonNull View view) {
        int i11 = R$id.containerHeader;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.headerDisclosure;
            DisclosureView disclosureView = (DisclosureView) C2548q.d(i11, view);
            if (disclosureView != null) {
                i11 = R$id.rvVideos;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.tvHeader;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new VideoScrollBinding((LinearLayout) view, linearLayout, disclosureView, recyclerView, textAtomView);
                    }
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
