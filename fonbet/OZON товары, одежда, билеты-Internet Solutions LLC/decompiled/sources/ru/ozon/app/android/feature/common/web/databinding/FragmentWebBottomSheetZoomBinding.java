package ru.ozon.app.android.feature.common.web.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.feature.common.web.R$layout;
import ru.ozon.app.android.web.zoomWebView.NestedScaleScrollView;

/* loaded from: classes12.dex */
public final class FragmentWebBottomSheetZoomBinding implements a {

    @NonNull
    public final ImageView closeIv;

    @NonNull
    public final FragmentContainerView containerFcv;

    @NonNull
    public final ConstraintLayout headerCl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScaleScrollView scaledNestedScrollView;

    @NonNull
    public final TextView titleTv;

    private FragmentWebBottomSheetZoomBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ConstraintLayout constraintLayout, @NonNull NestedScaleScrollView nestedScaleScrollView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.closeIv = imageView;
        this.containerFcv = fragmentContainerView;
        this.headerCl = constraintLayout;
        this.scaledNestedScrollView = nestedScaleScrollView;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentWebBottomSheetZoomBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.containerFcv;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.headerCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.scaledNestedScrollView;
                    NestedScaleScrollView nestedScaleScrollView = (NestedScaleScrollView) C2548q.d(i11, view);
                    if (nestedScaleScrollView != null) {
                        i11 = R$id.titleTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new FragmentWebBottomSheetZoomBinding((LinearLayout) view, imageView, fragmentContainerView, constraintLayout, nestedScaleScrollView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentWebBottomSheetZoomBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_web_bottom_sheet_zoom, viewGroup, false);
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
