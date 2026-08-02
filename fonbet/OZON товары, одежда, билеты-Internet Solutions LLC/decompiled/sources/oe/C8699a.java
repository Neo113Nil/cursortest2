package oe;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9842h;
import td.h0;
import td.i0;

/* renamed from: oe.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8699a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8699a f78094a = new C8699a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        K0 it = (K0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC9842h p11 = it.H0().p();
        if (p11 != null) {
            Intrinsics.checkNotNullParameter(p11, "<this>");
            if ((p11 instanceof i0) && (((i0) p11).d() instanceof h0)) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
