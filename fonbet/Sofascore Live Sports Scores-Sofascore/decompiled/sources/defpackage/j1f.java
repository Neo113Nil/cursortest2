package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class j1f {
    public static final List g = b.j(a1f.h, u0f.h, v0f.h, z0f.h);
    public final String a;
    public final j7f b;
    public final Function1 c;
    public final List d;
    public final Function1 e;
    public final Function2 f;

    public j1f(String str, j7f j7fVar, Function1 function1, List list, Function1 function12, i58 i58Var, int i) {
        list = (i & 8) != 0 ? km5.a : list;
        function12 = (i & 32) != 0 ? null : function12;
        i58Var = (i & 64) != 0 ? null : i58Var;
        this.a = str;
        this.b = j7fVar;
        this.c = function1;
        this.d = list;
        this.e = function12;
        this.f = i58Var;
    }

    public final int a() {
        Integer valueOf = Integer.valueOf(g.indexOf(this));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
