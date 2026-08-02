package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;

/* loaded from: classes2.dex */
public final class FragmentDeleteReviewBinding implements a {

    @NonNull
    public final ConstraintLayout cancelCl;

    @NonNull
    public final ImageView cancelIv;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final ConstraintLayout deleteCl;

    @NonNull
    public final ImageView deleteIv;

    @NonNull
    public final TextView deleteTv;

    @NonNull
    public final Group mainGroup;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private FragmentDeleteReviewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull Group group, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.cancelCl = constraintLayout2;
        this.cancelIv = imageView;
        this.cancelTv = textView;
        this.deleteCl = constraintLayout3;
        this.deleteIv = imageView2;
        this.deleteTv = textView2;
        this.mainGroup = group;
        this.titleTv = textView3;
    }

    @NonNull
    public static FragmentDeleteReviewBinding bind(@NonNull View view) {
        int i11 = R$id.cancelCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.cancelIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.cancelTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.deleteCl;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
                    if (constraintLayout2 != null) {
                        i11 = R$id.deleteIv;
                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                        if (imageView2 != null) {
                            i11 = R$id.deleteTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.mainGroup;
                                Group group = (Group) C2548q.d(i11, view);
                                if (group != null) {
                                    i11 = R$id.titleTv;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        return new FragmentDeleteReviewBinding((ConstraintLayout) view, constraintLayout, imageView, textView, constraintLayout2, imageView2, textView2, group, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentDeleteReviewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_delete_review, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
