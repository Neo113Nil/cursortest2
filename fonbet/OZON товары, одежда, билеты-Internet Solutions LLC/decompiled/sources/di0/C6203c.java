package di0;

import Sc.InterfaceC4008j;
import Sc.k;
import bi0.C5667a;
import bi0.InterfaceC5669c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: di0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6203c implements InterfaceC5669c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f61632b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6203c f61631a = new C6203c();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f61633c = k.b(new C6202b());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f61634d = k.b(new C5667a(1));

    @NotNull
    public static InterfaceC5669c c() {
        return f61632b ? (InterfaceC5669c) f61633c.getValue() : (InterfaceC5669c) f61634d.getValue();
    }

    public static void d(boolean z11) {
        f61632b = z11;
    }

    @Override // bi0.InterfaceC5669c
    public final void a() {
        c().a();
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a b(@NotNull C6201a trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return c().b(trace);
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return c().beginTrace(name);
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return c().endTrace(name);
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return c().removeTrace(name);
    }
}
