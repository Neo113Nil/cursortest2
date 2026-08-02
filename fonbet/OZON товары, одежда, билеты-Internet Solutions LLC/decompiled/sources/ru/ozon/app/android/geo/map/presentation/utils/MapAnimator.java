package ru.ozon.app.android.geo.map.presentation.utils;

import De.s;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/MapAnimator;", "", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "<init>", "(Lcom/airbnb/lottie/LottieAnimationView;Landroidx/recyclerview/widget/RecyclerView;)V", "", "performStop", "()V", "startAnimation", "stopAnimation", "clear", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "animationStartTime", "J", "Lxe/B0;", "pendingStopJob", "Lxe/B0;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapAnimator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private long animationStartTime;

    @NotNull
    private final LottieAnimationView animationView;
    private final RecyclerView composerRecyclerView;
    private B0 pendingStopJob;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/MapAnimator$Companion;", "", "<init>", "()V", "MIN_DURATION", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapAnimator(@NotNull LottieAnimationView animationView, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
        this.animationView = animationView;
        this.composerRecyclerView = recyclerView;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performStop() {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            ViewExtKt.show(recyclerView);
        }
        ViewExtKt.fadeOut$default(this.animationView, 0L, 1, null);
        this.animationView.cancelAnimation();
        clear();
    }

    public final void clear() {
        B0 b02 = this.pendingStopJob;
        if (b02 != null) {
            b02.j(null);
        }
        N.c(this.scope, null);
    }

    public final void startAnimation() {
        B0 b02 = this.pendingStopJob;
        if (b02 != null) {
            b02.j(null);
        }
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            ViewExtKt.gone(recyclerView);
        }
        ViewExtKt.show(this.animationView);
        this.animationView.playAnimation();
        this.animationStartTime = System.currentTimeMillis();
    }

    public final void stopAnimation() {
        long currentTimeMillis = System.currentTimeMillis() - this.animationStartTime;
        if (currentTimeMillis >= 3000) {
            performStop();
        } else {
            this.pendingStopJob = C10727i.c(this.scope, null, null, new MapAnimator$stopAnimation$1(currentTimeMillis, this, null), 3);
        }
    }
}
