package ru.ozon.app.android.feature.common.web.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.feature.common.web.R$id;

/* loaded from: classes12.dex */
public final class FragmentWebBottomSheetBinding implements a {

    @NonNull
    public final ImageView closeIv;

    @NonNull
    public final FragmentContainerView containerFcv;

    @NonNull
    public final ConstraintLayout headerCl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private FragmentWebBottomSheetBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.closeIv = imageView;
        this.containerFcv = fragmentContainerView;
        this.headerCl = constraintLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentWebBottomSheetBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.containerFcv;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.headerCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new FragmentWebBottomSheetBinding((LinearLayout) view, imageView, fragmentContainerView, constraintLayout, textView);
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
