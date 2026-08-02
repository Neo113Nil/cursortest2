package defpackage;

import com.blaze.blazesdk.features.moments.container.compose.BlazeMomentsPlayerContainerComposeKt;
import com.blaze.blazesdk.features.moments.container.compose.BlazeMomentsPlayerContainerComposeStateHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ux1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ BlazeMomentsPlayerContainerComposeStateHandler c;
    public final /* synthetic */ int d;

    public /* synthetic */ ux1(xtc xtcVar, BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, int i, int i2) {
        this.a = i2;
        this.b = xtcVar;
        this.c = blazeMomentsPlayerContainerComposeStateHandler;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                BlazeMomentsPlayerContainerComposeKt.BlazeMomentsPlayerContainerCompose(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            default:
                BlazeMomentsPlayerContainerComposeKt.a(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
