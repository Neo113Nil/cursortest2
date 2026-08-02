package ru.ozon.app.android.composer.view.multiframebinder;

import Ej.b;
import Hh.C3140a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;", "", "LHh/a;", "fpsTracker", "<init>", "(LHh/a;)V", "", "composerVoHashCode", "", "isCurrentVoLayout", "(I)Z", "Landroid/view/View;", "view", "", "init", "(Landroid/view/View;)V", "isInitialized", "()Z", "setObjHashCode", "(I)V", "bindStep", "addBindStepAnalytic", "addLayoutStepAnalytic", "stepsCount", "addLayoutRemainingStepsAnalytic", "(II)V", "LHh/a;", "I", "itemView", "Landroid/view/View;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiFrameBinderAnalyticHelper {
    private int composerVoHashCode;

    @NotNull
    private final C3140a fpsTracker;
    private View itemView;
    public static final int $stable = 8;

    public MultiFrameBinderAnalyticHelper(@NotNull C3140a fpsTracker) {
        Intrinsics.checkNotNullParameter(fpsTracker, "fpsTracker");
        this.fpsTracker = fpsTracker;
        this.composerVoHashCode = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentVoLayout(int composerVoHashCode) {
        return this.composerVoHashCode == composerVoHashCode;
    }

    public final void addBindStepAnalytic(int bindStep) {
        this.fpsTracker.o(this.composerVoHashCode, b.a(bindStep, "bindStep"));
    }

    public final void addLayoutRemainingStepsAnalytic(final int bindStep, final int stepsCount) {
        final int i11 = this.composerVoHashCode;
        View view = this.itemView;
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderAnalyticHelper$addLayoutRemainingStepsAnalytic$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    boolean isCurrentVoLayout;
                    C3140a c3140a;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    isCurrentVoLayout = MultiFrameBinderAnalyticHelper.this.isCurrentVoLayout(i11);
                    if (isCurrentVoLayout) {
                        for (int i12 = bindStep; i12 < stepsCount; i12++) {
                            c3140a = MultiFrameBinderAnalyticHelper.this.fpsTracker;
                            c3140a.o(i11, b.a(i12, "layoutStep"));
                        }
                    }
                }
            });
        } else {
            Intrinsics.n("itemView");
            throw null;
        }
    }

    public final void addLayoutStepAnalytic(final int bindStep) {
        final int i11 = this.composerVoHashCode;
        View view = this.itemView;
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderAnalyticHelper$addLayoutStepAnalytic$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    boolean isCurrentVoLayout;
                    C3140a c3140a;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    isCurrentVoLayout = MultiFrameBinderAnalyticHelper.this.isCurrentVoLayout(i11);
                    if (isCurrentVoLayout) {
                        c3140a = MultiFrameBinderAnalyticHelper.this.fpsTracker;
                        c3140a.o(i11, b.a(bindStep, "layoutStep"));
                    }
                }
            });
        } else {
            Intrinsics.n("itemView");
            throw null;
        }
    }

    public final void init(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.itemView = view;
    }

    public final boolean isInitialized() {
        return this.itemView != null;
    }

    public final void setObjHashCode(int composerVoHashCode) {
        this.composerVoHashCode = composerVoHashCode;
    }
}
