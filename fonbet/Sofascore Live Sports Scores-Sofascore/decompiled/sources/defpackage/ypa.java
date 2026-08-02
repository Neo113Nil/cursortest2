package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class ypa {
    public static joa a(ysa ysaVar, Function0 function0) {
        function0.getClass();
        int ordinal = ysaVar.ordinal();
        if (ordinal == 0) {
            return new mqi(function0, null, 2, null);
        }
        if (ordinal == 1) {
            yog yogVar = new yog();
            yogVar.a = function0;
            yogVar.b = j8k.a;
            return yogVar;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        ock ockVar = new ock();
        ockVar.a = function0;
        ockVar.b = j8k.a;
        return ockVar;
    }

    public static mqi b(Function0 function0) {
        function0.getClass();
        return new mqi(function0, null, 2, null);
    }
}
