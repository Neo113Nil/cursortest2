package je;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9842h;

/* renamed from: je.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7381g0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f69889c;

    C7381g0(ArrayList arrayList) {
        this.f69889c = arrayList;
    }

    @Override // je.u0
    public final y0 h(s0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f69889c.contains(key)) {
            return null;
        }
        InterfaceC9842h p11 = key.p();
        Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return H0.n((td.i0) p11);
    }
}
