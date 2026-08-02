package ru.ozon.uni.ozi.components.notificationBar;

import S0.InterfaceC3978p0;
import Z1.q;
import androidx.compose.foundation.gestures.C5158a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import r0.C9134n;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/q;", "<destruct>", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class BasicNotificationBarContainerKt$BasicNotificationBarContainer$1$1 extends AbstractC7737t implements Function1<q, Unit> {
    final /* synthetic */ InterfaceC3978p0<Float> $contentHeightPx$delegate;
    final /* synthetic */ OziNotificationBarState $notificationBarState;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/n;", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "", "invoke", "(Lr0/n;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.notificationBar.BasicNotificationBarContainerKt$BasicNotificationBarContainer$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C9134n<OziNotificationBarVisibility>, Unit> {
        final /* synthetic */ int $height;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i11) {
            super(1);
            this.$height = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9134n<OziNotificationBarVisibility> c9134n) {
            invoke2(c9134n);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C9134n<OziNotificationBarVisibility> DraggableAnchors) {
            Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
            DraggableAnchors.a(OziNotificationBarVisibility.Shown, 0.0f);
            DraggableAnchors.a(OziNotificationBarVisibility.Hidden, this.$height);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicNotificationBarContainerKt$BasicNotificationBarContainer$1$1(OziNotificationBarState oziNotificationBarState, InterfaceC3978p0<Float> interfaceC3978p0) {
        super(1);
        this.$notificationBarState = oziNotificationBarState;
        this.$contentHeightPx$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(q qVar) {
        m3120invokeozmzZPI(qVar.e());
        return Unit.f71690a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m3120invokeozmzZPI(long j11) {
        int i11 = (int) (j11 & 4294967295L);
        BasicNotificationBarContainerKt.BasicNotificationBarContainer$lambda$2(this.$contentHeightPx$delegate, i11);
        this.$notificationBarState.updateAnchors(C5158a.a(new AnonymousClass1(i11)));
    }
}
