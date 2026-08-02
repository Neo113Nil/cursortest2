package fh;

import kotlin.jvm.internal.Intrinsics;
import zi.AbstractC7016b;
import zi.InterfaceC7015a;

/* renamed from: fh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4283a {
    public static final InterfaceC7015a a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC7015a j10 = AbstractC7016b.j(name);
        Intrinsics.checkNotNullExpressionValue(j10, "getLogger(name)");
        return j10;
    }
}
