package ru.ozon.uni.ozi.components.notificationBar;

import Sc.o;
import Z1.d;
import Z1.m;
import Z1.n;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarContainerLocation;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LZ1/d;", "LZ1/m;", "invoke-Bjo55l4", "(LZ1/d;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$yOffsetLambda$1$1 extends AbstractC7737t implements Function1<d, m> {
    final /* synthetic */ OziNotificationBarContainerLocation $location;
    final /* synthetic */ OziNotificationBarState $notificationBarState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziNotificationBarContainerLocation.values().length];
            try {
                iArr[OziNotificationBarContainerLocation.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziNotificationBarContainerLocation.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$yOffsetLambda$1$1(OziNotificationBarContainerLocation oziNotificationBarContainerLocation, OziNotificationBarState oziNotificationBarState) {
        super(1);
        this.$location = oziNotificationBarContainerLocation;
        this.$notificationBarState = oziNotificationBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ m invoke(d dVar) {
        return m.a(m3121invokeBjo55l4(dVar));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m3121invokeBjo55l4(d dVar) {
        int i11;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.$location.ordinal()];
        if (i12 == 1) {
            i11 = -C6915b.c(this.$notificationBarState.getOffset());
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = C6915b.c(this.$notificationBarState.getOffset());
        }
        return n.a(0, i11);
    }
}
