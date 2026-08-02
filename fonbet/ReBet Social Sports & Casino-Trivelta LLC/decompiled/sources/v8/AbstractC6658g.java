package v8;

import T7.C1661a;
import android.os.Bundle;
import g6.C4357q;
import g6.InterfaceC4354n;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6658g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4354n f67078a;

    public AbstractC6658g(InterfaceC4354n interfaceC4354n) {
        this.f67078a = interfaceC4354n;
    }

    public void a(C1661a appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        InterfaceC4354n interfaceC4354n = this.f67078a;
        if (interfaceC4354n == null) {
            return;
        }
        interfaceC4354n.onCancel();
    }

    public void b(C1661a appCall, C4357q error) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4354n interfaceC4354n = this.f67078a;
        if (interfaceC4354n == null) {
            return;
        }
        interfaceC4354n.a(error);
    }

    public abstract void c(C1661a c1661a, Bundle bundle);
}
