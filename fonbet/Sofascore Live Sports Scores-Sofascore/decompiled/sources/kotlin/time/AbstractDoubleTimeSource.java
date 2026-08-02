package kotlin.time;

import defpackage.g3;
import defpackage.wx4;
import defpackage.xd5;
import defpackage.y53;
import defpackage.yhj;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lyhj;", "g3", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
@wx4
/* loaded from: classes7.dex */
public abstract class AbstractDoubleTimeSource implements yhj {
    @Override // defpackage.yhj
    public final y53 a() {
        double b = b();
        xd5.b.getClass();
        return new g3(b, this, 0L, null);
    }

    public abstract double b();
}
