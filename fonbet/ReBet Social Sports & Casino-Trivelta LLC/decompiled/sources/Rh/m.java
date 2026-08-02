package Rh;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class m {
    public static final j a(int i10, d dVar, Function1 function1) {
        if (i10 == -2) {
            return dVar == d.f10307a ? new h(j.f10362p3.a(), function1) : new u(1, dVar, function1);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? dVar == d.f10307a ? new h(i10, function1) : new u(i10, dVar, function1) : new h(Integer.MAX_VALUE, function1) : dVar == d.f10307a ? new h(0, function1) : new u(1, dVar, function1);
        }
        if (dVar == d.f10307a) {
            return new u(1, d.f10308b, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ j b(int i10, d dVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            dVar = d.f10307a;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, dVar, function1);
    }
}
