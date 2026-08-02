package defpackage;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v64 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ v64(long j, Function1 function1) {
        this.a = 0;
        this.c = function1;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                function1.invoke(Long.valueOf(Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).with((TemporalAdjuster) LocalTime.of(((Integer) obj).intValue(), ((Integer) obj2).intValue())).toEpochSecond()));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o02.j(j, function1, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ehd.c(j, function1, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v64(long j, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = function1;
    }
}
