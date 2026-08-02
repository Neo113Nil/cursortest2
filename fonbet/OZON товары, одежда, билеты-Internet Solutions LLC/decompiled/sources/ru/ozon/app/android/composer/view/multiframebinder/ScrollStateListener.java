package ru.ozon.app.android.composer.view.multiframebinder;

import Nc.C3669c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "setOn", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LNc/c;", "", "kotlin.jvm.PlatformType", "scrollingStateSubject", "LNc/c;", "Lio/reactivex/p;", "scrollingState", "Lio/reactivex/p;", "getScrollingState", "()Lio/reactivex/p;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isScrolling", "Z", "()Z", "isScrollingBack", "Ljava/lang/ref/WeakReference;", "recyclerViewWithAppliedListenerRef", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollStateListener {
    private boolean isScrolling;
    private boolean isScrollingBack;
    private WeakReference<RecyclerView> recyclerViewWithAppliedListenerRef;

    @NotNull
    private final RecyclerView.t scrollListener;

    @NotNull
    private final p<Boolean> scrollingState;

    @NotNull
    private final C3669c<Boolean> scrollingStateSubject;

    public ScrollStateListener() {
        C3669c<Boolean> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.scrollingStateSubject = d11;
        p<Boolean> hide = d11.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        this.scrollingState = hide;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                C3669c c3669c;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean z11 = newState != 0;
                if (ScrollStateListener.this.getIsScrolling() != z11) {
                    ScrollStateListener.this.isScrolling = z11;
                    c3669c = ScrollStateListener.this.scrollingStateSubject;
                    c3669c.onNext(Boolean.valueOf(z11));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ScrollStateListener.this.isScrollingBack = dx < 0 || dy < 0;
            }
        };
    }

    @NotNull
    public p<Boolean> getScrollingState() {
        return this.scrollingState;
    }

    /* renamed from: isScrolling, reason: from getter */
    public boolean getIsScrolling() {
        return this.isScrolling;
    }

    /* renamed from: isScrollingBack, reason: from getter */
    public boolean getIsScrollingBack() {
        return this.isScrollingBack;
    }

    public void setOn(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.isScrolling = recyclerView.getScrollState() != 0;
        WeakReference<RecyclerView> weakReference = this.recyclerViewWithAppliedListenerRef;
        RecyclerView recyclerView2 = weakReference != null ? weakReference.get() : null;
        if (Intrinsics.d(recyclerView2, recyclerView)) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.scrollListener);
        }
        this.recyclerViewWithAppliedListenerRef = new WeakReference<>(recyclerView);
        recyclerView.addOnScrollListener(this.scrollListener);
    }
}
