package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes13.dex */
public final class WidgetOrderTotalLayoutBinding implements a {

    @NonNull
    public final VerticalRecyclerContainer badgesVrc;

    @NonNull
    public final LargeBorderlessButtonView buttonV;

    @NonNull
    public final Barrier headerBarrier;

    @NonNull
    public final RecyclerView headerRv;

    @NonNull
    public final TextAtomView headerSubtitleTv;

    @NonNull
    public final AppCompatImageView imageIv;

    @NonNull
    public final RecyclerView pricesRv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetOrderTotalLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull Barrier barrier, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView2) {
        this.rootView = constraintLayout;
        this.badgesVrc = verticalRecyclerContainer;
        this.buttonV = largeBorderlessButtonView;
        this.headerBarrier = barrier;
        this.headerRv = recyclerView;
        this.headerSubtitleTv = textAtomView;
        this.imageIv = appCompatImageView;
        this.pricesRv = recyclerView2;
    }

    @NonNull
    public static WidgetOrderTotalLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.badgesVrc;
        VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
        if (verticalRecyclerContainer != null) {
            i11 = R$id.buttonV;
            LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
            if (largeBorderlessButtonView != null) {
                i11 = R$id.headerBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.headerRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.headerSubtitleTv;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.imageIv;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                            if (appCompatImageView != null) {
                                i11 = R$id.pricesRv;
                                RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView2 != null) {
                                    return new WidgetOrderTotalLayoutBinding((ConstraintLayout) view, verticalRecyclerContainer, largeBorderlessButtonView, barrier, recyclerView, textAtomView, appCompatImageView, recyclerView2);
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
