package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core;

import Ae.C2399j;
import Ae.C2408n0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollableVH;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 !*\u0010\b\u0000\u0010\u0004*\u00060\u0001j\u0002`\u0002*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0002!\"B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SubListPositioned;", "VO", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "itemView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;)V", "", "targetPosition", "", "scrollToTop", "(I)V", "scrollToBottom", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "OffsetSmoothScroller", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SelectionItemDescriptionScrollableVH<VO extends c & SubListPositioned> extends k<VO> {

    @NotNull
    private final Handler handler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SelectionItemDescriptionScrollViewModel scrollViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH$Companion;", "", "<init>", "()V", "SCROLL_START_DELAY_MS", "", "MILLISECONDS_PER_INCH", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH$OffsetSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "", "snapPreference", "offset", "<init>", "(Landroid/content/Context;II)V", "getVerticalSnapPreference", "()I", "viewStart", "viewEnd", "boxStart", "boxEnd", "calculateDtToFit", "(IIIII)I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "I", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class OffsetSmoothScroller extends r {
        private final int offset;
        private final int snapPreference;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OffsetSmoothScroller(@NotNull Context context, int i11, int i12) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.snapPreference = i11;
            this.offset = i12;
        }

        @Override // androidx.recyclerview.widget.r
        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            int calculateDtToFit = super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, snapPreference);
            return snapPreference == -1 ? calculateDtToFit + this.offset : calculateDtToFit;
        }

        @Override // androidx.recyclerview.widget.r
        protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return 85.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        /* renamed from: getVerticalSnapPreference, reason: from getter */
        protected int getSnapPreference() {
            return this.snapPreference;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemDescriptionScrollableVH(@NotNull View itemView, @NotNull ComposerReferences refs, @NotNull SelectionItemDescriptionScrollViewModel scrollViewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(scrollViewModel, "scrollViewModel");
        this.refs = refs;
        this.scrollViewModel = scrollViewModel;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToBottom(final int targetPosition) {
        View view;
        final RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        RecyclerView.o layoutManager = composerRecyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        this.handler.post(new Runnable() { // from class: lV.a
            @Override // java.lang.Runnable
            public final void run() {
                SelectionItemDescriptionScrollableVH.scrollToBottom$lambda$3(RecyclerView.this, linearLayoutManager, targetPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToBottom$lambda$3(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i11) {
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OffsetSmoothScroller offsetSmoothScroller = new OffsetSmoothScroller(context, -1, 0);
        offsetSmoothScroller.setTargetPosition(i11);
        linearLayoutManager.startSmoothScroll(offsetSmoothScroller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToTop(final int targetPosition) {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return;
        }
        final RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
        RecyclerView.o layoutManager = composerRecyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(view);
        final int height = composerAppbar != null ? composerAppbar.getHeight() : 0;
        this.handler.post(new Runnable() { // from class: lV.b
            @Override // java.lang.Runnable
            public final void run() {
                SelectionItemDescriptionScrollableVH.scrollToTop$lambda$1(RecyclerView.this, height, linearLayoutManager, targetPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToTop$lambda$1(RecyclerView recyclerView, int i11, LinearLayoutManager linearLayoutManager, int i12) {
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OffsetSmoothScroller offsetSmoothScroller = new OffsetSmoothScroller(context, -1, i11);
        offsetSmoothScroller.setTargetPosition(i12);
        linearLayoutManager.startSmoothScroll(offsetSmoothScroller);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final ComposerReferences getRefs() {
        return this.refs;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C2399j.C(new C2408n0(this.scrollViewModel.getScrollEvent(), new SelectionItemDescriptionScrollableVH$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
    }
}
