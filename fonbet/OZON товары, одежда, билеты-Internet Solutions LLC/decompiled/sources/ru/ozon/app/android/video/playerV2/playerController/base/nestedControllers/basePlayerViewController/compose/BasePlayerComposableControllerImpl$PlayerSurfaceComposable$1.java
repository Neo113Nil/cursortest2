package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import Cg0.c;
import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class BasePlayerComposableControllerImpl$PlayerSurfaceComposable$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ kotlin.jvm.internal.M<PlaceholderInfo> $placeholderInfo;
    final /* synthetic */ c $placeholderTracking;
    final /* synthetic */ BasePlayerComposableControllerImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableControllerImpl$PlayerSurfaceComposable$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<PlaceholderInfo> {
        final /* synthetic */ kotlin.jvm.internal.M<PlaceholderInfo> $placeholderInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.M<PlaceholderInfo> m11) {
            super(0);
            this.$placeholderInfo = m11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PlaceholderInfo invoke() {
            return this.$placeholderInfo.f71787a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerComposableControllerImpl$PlayerSurfaceComposable$1(BasePlayerComposableControllerImpl basePlayerComposableControllerImpl, c cVar, kotlin.jvm.internal.M<PlaceholderInfo> m11) {
        super(1);
        this.this$0 = basePlayerComposableControllerImpl;
        this.$placeholderTracking = cVar;
        this.$placeholderInfo = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        VideoComposablePlaceholderTimeTracker videoComposablePlaceholderTimeTracker;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        videoComposablePlaceholderTimeTracker = this.this$0.composablePlaceholderTimeTracker;
        videoComposablePlaceholderTimeTracker.bindPlaceholderData(this.$placeholderTracking.a(), new AnonymousClass1(this.$placeholderInfo));
        final BasePlayerComposableControllerImpl basePlayerComposableControllerImpl = this.this$0;
        return new M() { // from class: ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableControllerImpl$PlayerSurfaceComposable$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                VideoComposablePlaceholderTimeTracker videoComposablePlaceholderTimeTracker2;
                videoComposablePlaceholderTimeTracker2 = BasePlayerComposableControllerImpl.this.composablePlaceholderTimeTracker;
                videoComposablePlaceholderTimeTracker2.unbindPlaceholderData();
            }
        };
    }
}
