package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hq3 implements f2f {
    public final Function0 a;

    @Override // defpackage.f2f
    public long a(x6a x6aVar, long j, ema emaVar, long j2) {
        return (kik.f(x6aVar.b + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (kik.f(x6aVar.a + ((int) (((r6a) this.a.invoke()).a >> 32)), (int) (j2 >> 32), (int) (j >> 32), emaVar == ema.a) << 32);
    }
}
