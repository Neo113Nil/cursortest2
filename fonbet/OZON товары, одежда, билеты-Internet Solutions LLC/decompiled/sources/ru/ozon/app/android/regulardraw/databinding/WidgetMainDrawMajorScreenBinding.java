package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.MainDrawMajorScreenBg;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.MainDrawMajorScreenAnimationView;

/* loaded from: classes13.dex */
public final class WidgetMainDrawMajorScreenBinding implements a {

    @NonNull
    public final MainDrawMajorScreenAnimationView animation;

    @NonNull
    public final ItemMainDrawMajorScreenSideBarBinding leftSideBar;

    @NonNull
    public final AppCompatImageView mainImage;

    @NonNull
    public final MainDrawMajorScreenBg progress;

    @NonNull
    public final ItemMainDrawMajorScreenSideBarBinding rightSideBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Barrier sideBarBottomBarrier;

    private WidgetMainDrawMajorScreenBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MainDrawMajorScreenAnimationView mainDrawMajorScreenAnimationView, @NonNull ItemMainDrawMajorScreenSideBarBinding itemMainDrawMajorScreenSideBarBinding, @NonNull AppCompatImageView appCompatImageView, @NonNull MainDrawMajorScreenBg mainDrawMajorScreenBg, @NonNull ItemMainDrawMajorScreenSideBarBinding itemMainDrawMajorScreenSideBarBinding2, @NonNull Barrier barrier) {
        this.rootView = constraintLayout;
        this.animation = mainDrawMajorScreenAnimationView;
        this.leftSideBar = itemMainDrawMajorScreenSideBarBinding;
        this.mainImage = appCompatImageView;
        this.progress = mainDrawMajorScreenBg;
        this.rightSideBar = itemMainDrawMajorScreenSideBarBinding2;
        this.sideBarBottomBarrier = barrier;
    }

    @NonNull
    public static WidgetMainDrawMajorScreenBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.animation;
        MainDrawMajorScreenAnimationView mainDrawMajorScreenAnimationView = (MainDrawMajorScreenAnimationView) C2548q.d(i11, view);
        if (mainDrawMajorScreenAnimationView != null && (d11 = C2548q.d((i11 = R$id.leftSideBar), view)) != null) {
            ItemMainDrawMajorScreenSideBarBinding bind = ItemMainDrawMajorScreenSideBarBinding.bind(d11);
            i11 = R$id.mainImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.progress;
                MainDrawMajorScreenBg mainDrawMajorScreenBg = (MainDrawMajorScreenBg) C2548q.d(i11, view);
                if (mainDrawMajorScreenBg != null && (d12 = C2548q.d((i11 = R$id.rightSideBar), view)) != null) {
                    ItemMainDrawMajorScreenSideBarBinding bind2 = ItemMainDrawMajorScreenSideBarBinding.bind(d12);
                    i11 = R$id.sideBarBottomBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        return new WidgetMainDrawMajorScreenBinding((ConstraintLayout) view, mainDrawMajorScreenAnimationView, bind, appCompatImageView, mainDrawMajorScreenBg, bind2, barrier);
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
