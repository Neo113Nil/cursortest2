package oe;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9842h;
import td.h0;
import td.i0;

/* renamed from: oe.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8700b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8700b f78095a = new C8700b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        K0 it = (K0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC9842h p11 = it.H0().p();
        return Boolean.valueOf(p11 != null && ((p11 instanceof h0) || (p11 instanceof i0)));
    }
}
