package Ud;

import jg.InterfaceC5134b;
import kotlin.jvm.internal.Intrinsics;
import we.AbstractC6744a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12184a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static Dg.b f12185b;

    /* renamed from: c, reason: collision with root package name */
    public static Dg.a f12186c;

    public static final void d(Dg.b bVar, Dg.a aVar) {
        if (f12185b == bVar && f12186c == aVar) {
            return;
        }
        f12185b = bVar;
        f12186c = aVar;
    }

    public static final void e(String conversationId, int i10) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
    }

    public final InterfaceC5134b a() {
        return null;
    }

    public final void c(AbstractC6744a error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public final void b(InterfaceC5134b interfaceC5134b) {
    }
}
