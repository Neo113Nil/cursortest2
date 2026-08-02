package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d2m extends j25 {
    @Override // defpackage.j25
    public final boolean a(Object obj, Object obj2) {
        ((ipm) obj).getClass();
        ((ipm) obj2).getClass();
        return false;
    }

    @Override // defpackage.j25
    public final boolean b(Object obj, Object obj2) {
        ipm ipmVar = (ipm) obj;
        ipm ipmVar2 = (ipm) obj2;
        ipmVar.getClass();
        ipmVar2.getClass();
        return Intrinsics.c(ipmVar.a, ipmVar2.a);
    }
}
