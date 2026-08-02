package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class to5 extends xka implements Function1 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to5(boolean z, Function0 function0) {
        super(1);
        this.i = z;
        this.j = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((f4g) obj).d(!this.i && ((Boolean) this.j.invoke()).booleanValue());
        return Unit.a;
    }
}
