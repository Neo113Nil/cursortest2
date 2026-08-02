package defpackage;

import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qq4 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(csa csaVar, boolean z) {
        return z ? ((dsa) CollectionsKt.h0(csaVar.k)).a + 1 : ((dsa) CollectionsKt.Y(csaVar.k)).a - 1;
    }

    public static int b(fpa fpaVar, boolean z) {
        if (z) {
            gpa gpaVar = (gpa) CollectionsKt.h0(fpaVar.m);
            return (fpaVar.q == ewd.a ? gpaVar.u : gpaVar.v) + 1;
        }
        gpa gpaVar2 = (gpa) CollectionsKt.Y(fpaVar.m);
        return (fpaVar.q == ewd.a ? gpaVar2.u : gpaVar2.v) - 1;
    }
}
