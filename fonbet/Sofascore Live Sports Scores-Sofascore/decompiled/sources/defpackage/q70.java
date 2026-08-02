package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q70 extends xka implements ct8 {
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ axj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(Function1 function1, axj axjVar) {
        super(3);
        this.i = function1;
        this.j = axjVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        m1c m1cVar = (m1c) obj;
        qhe J = ((g1c) obj2).J(((an3) obj3).a);
        if (m1cVar.W()) {
            if (!((Boolean) this.i.invoke(((eoh) this.j.d).getValue())).booleanValue()) {
                j = 0;
                return m1c.G0(m1cVar, (int) (j >> 32), (int) (4294967295L & j), new jy(J, 2));
            }
        }
        j = (J.a << 32) | (J.b & 4294967295L);
        return m1c.G0(m1cVar, (int) (j >> 32), (int) (4294967295L & j), new jy(J, 2));
    }
}
