package qd;

import ie.C7056e;
import org.jetbrains.annotations.NotNull;
import td.C9824O;
import td.InterfaceC9815F;
import vd.InterfaceC10304a;
import vd.InterfaceC10306c;

/* renamed from: qd.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9024b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f81826a = a.f81827a;

    /* renamed from: qd.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f81827a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Object f81828b = Sc.k.a(Sc.n.PUBLICATION, C9023a.f81825a);

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @NotNull
        public static InterfaceC9024b a() {
            return (InterfaceC9024b) f81828b.getValue();
        }
    }

    @NotNull
    C9824O a(@NotNull C7056e c7056e, @NotNull InterfaceC9815F interfaceC9815F, @NotNull Iterable iterable, @NotNull InterfaceC10306c interfaceC10306c, @NotNull InterfaceC10304a interfaceC10304a, boolean z11);
}
