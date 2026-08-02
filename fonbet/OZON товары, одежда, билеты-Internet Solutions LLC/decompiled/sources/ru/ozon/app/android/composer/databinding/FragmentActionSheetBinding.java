package ru.ozon.app.android.composer.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class FragmentActionSheetBinding implements a {

    @NonNull
    public final VerticalAtomsLayout contentVAL;

    @NonNull
    public final SingleAtom emptyStateActionButtonsContainer;

    @NonNull
    public final ConstraintLayout emptyStateContainer;

    @NonNull
    public final ImageView emptyStateIv;

    @NonNull
    public final TextView emptyStateMessageTv;

    @NonNull
    public final TextView emptyStateTitleTv;

    @NonNull
    public final FrameLayout progressContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sheetTitleTV;

    private FragmentActionSheetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull SingleAtom singleAtom, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FrameLayout frameLayout, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.contentVAL = verticalAtomsLayout;
        this.emptyStateActionButtonsContainer = singleAtom;
        this.emptyStateContainer = constraintLayout2;
        this.emptyStateIv = imageView;
        this.emptyStateMessageTv = textView;
        this.emptyStateTitleTv = textView2;
        this.progressContainer = frameLayout;
        this.sheetTitleTV = textView3;
    }

    @NonNull
    public static FragmentActionSheetBinding bind(@NonNull View view) {
        int i11 = R$id.contentVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.emptyStateActionButtonsContainer;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.emptyStateContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.emptyStateIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.emptyStateMessageTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            i11 = R$id.emptyStateTitleTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.progressContainer;
                                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                if (frameLayout != null) {
                                    i11 = R$id.sheetTitleTV;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        return new FragmentActionSheetBinding((ConstraintLayout) view, verticalAtomsLayout, singleAtom, constraintLayout, imageView, textView, textView2, frameLayout, textView3);
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
