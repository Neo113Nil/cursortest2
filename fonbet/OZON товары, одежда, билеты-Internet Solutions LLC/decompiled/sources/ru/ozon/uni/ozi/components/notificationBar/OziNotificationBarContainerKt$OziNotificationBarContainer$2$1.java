package ru.ozon.uni.ozi.components.notificationBar;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarContainerKt$OziNotificationBarContainer$2$1", f = "OziNotificationBarContainer.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 67, 68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OziNotificationBarContainerKt$OziNotificationBarContainer$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $autoHideDelay;
    final /* synthetic */ OziNotificationBarState $notificationBarState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(OziNotificationBarState oziNotificationBarState, Long l11, d<? super OziNotificationBarContainerKt$OziNotificationBarContainer$2$1> dVar) {
        super(2, dVar);
        this.$notificationBarState = oziNotificationBarState;
        this.$autoHideDelay = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OziNotificationBarContainerKt$OziNotificationBarContainer$2$1(this.$notificationBarState, this.$autoHideDelay, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1.dismiss(r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r7.show(r6) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OziNotificationBarState oziNotificationBarState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            OziNotificationBarState oziNotificationBarState2 = this.$notificationBarState;
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            oziNotificationBarState = (OziNotificationBarState) this.L$0;
            s.b(obj);
            this.L$0 = null;
            this.label = 3;
        }
        Long l11 = this.$autoHideDelay;
        if (l11 != null) {
            oziNotificationBarState = this.$notificationBarState;
            long longValue = l11.longValue();
            this.L$0 = oziNotificationBarState;
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OziNotificationBarContainerKt$OziNotificationBarContainer$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
