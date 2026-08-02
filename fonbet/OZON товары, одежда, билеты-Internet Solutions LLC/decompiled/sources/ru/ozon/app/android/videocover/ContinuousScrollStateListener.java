package ru.ozon.app.android.videocover;

import Nc.C3669c;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/videocover/ContinuousScrollStateListener;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "setOn", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LNc/c;", "", "kotlin.jvm.PlatformType", "_scrollingState", "LNc/c;", "Ljava/lang/ref/WeakReference;", "recyclerViewWithAppliedListenerRef", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "isScrolling", "Z", "()Z", "isScrollingBack", "setScrollingBack", "(Z)V", "Lio/reactivex/p;", "getScrollingState", "()Lio/reactivex/p;", "scrollingState", "Companion", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContinuousScrollStateListener {

    @NotNull
    private final C3669c<Boolean> _scrollingState;
    private final boolean isScrolling;
    private boolean isScrollingBack;
    private WeakReference<RecyclerView> recyclerViewWithAppliedListenerRef;

    @NotNull
    private final RecyclerView.t scrollListener;

    public ContinuousScrollStateListener() {
        C3669c<Boolean> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this._scrollingState = d11;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.videocover.ContinuousScrollStateListener$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                C3669c c3669c;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                c3669c = ContinuousScrollStateListener.this._scrollingState;
                c3669c.onNext(Boolean.TRUE);
                ContinuousScrollStateListener.this.setScrollingBack(dx < 0 || dy < 0);
            }
        };
    }

    @NotNull
    public p<Boolean> getScrollingState() {
        p<Boolean> sample = this._scrollingState.hide().sample(250L, TimeUnit.MILLISECONDS, true);
        Intrinsics.checkNotNullExpressionValue(sample, "sample(...)");
        return sample;
    }

    /* renamed from: isScrolling, reason: from getter */
    public boolean getIsScrolling() {
        return this.isScrolling;
    }

    public void setOn(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
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

    public void setScrollingBack(boolean z11) {
        this.isScrollingBack = z11;
    }
}
