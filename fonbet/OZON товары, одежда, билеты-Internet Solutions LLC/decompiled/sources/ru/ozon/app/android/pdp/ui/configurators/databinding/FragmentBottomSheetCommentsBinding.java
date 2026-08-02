package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;

/* loaded from: classes13.dex */
public final class FragmentBottomSheetCommentsBinding implements a {

    @NonNull
    public final FrameLayout commentsContainer;

    @NonNull
    public final FrameLayout fragmentBottomSheetComments;

    @NonNull
    private final FrameLayout rootView;

    private FragmentBottomSheetCommentsBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.commentsContainer = frameLayout2;
        this.fragmentBottomSheetComments = frameLayout3;
    }

    @NonNull
    public static FragmentBottomSheetCommentsBinding bind(@NonNull View view) {
        int i11 = R$id.commentsContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        return new FragmentBottomSheetCommentsBinding(frameLayout2, frameLayout, frameLayout2);
    }

    @NonNull
    public static FragmentBottomSheetCommentsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_bottom_sheet_comments, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
