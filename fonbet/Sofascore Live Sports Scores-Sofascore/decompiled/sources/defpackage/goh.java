package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class goh {
    public static final l2a a = new l2a(20);
    public static final l2a b = new l2a(20);

    public static final i1d a() {
        l2a l2aVar = b;
        i1d i1dVar = (i1d) l2aVar.l();
        if (i1dVar != null) {
            return i1dVar;
        }
        i1d i1dVar2 = new i1d(new zu8[0], 0);
        l2aVar.I(i1dVar2);
        return i1dVar2;
    }

    public static final ay4 b(Function0 function0) {
        return new ay4(function0, null);
    }

    public static final ay4 c(Function0 function0) {
        return new ay4(function0, wib.i);
    }
}
