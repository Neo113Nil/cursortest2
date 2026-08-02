package Yg;

import ah.C2020l;
import ah.InterfaceC2019k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final InterfaceC2019k a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C2020l c2020l = new C2020l(0, 1, null);
        block.invoke(c2020l);
        return c2020l.p();
    }
}
