package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import j3.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj3/y;", "Lj3/y$b;", "events", "", "invoke", "(Lj3/y;Lj3/y$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class PlayerTimelineObserver$observe$2 extends AbstractC7737t implements Function2<y, y.b, Unit> {
    final /* synthetic */ PlayerTimelineObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerTimelineObserver$observe$2(PlayerTimelineObserver playerTimelineObserver) {
        super(2);
        this.this$0 = playerTimelineObserver;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(y yVar, y.b bVar) {
        invoke2(yVar, bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(y listen, y.b events) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        iArr = PlayerTimelineObserverKt.TimelineEvents;
        if (events.b(Arrays.copyOf(iArr, iArr.length))) {
            this.this$0.restartUpdates();
        }
    }
}
