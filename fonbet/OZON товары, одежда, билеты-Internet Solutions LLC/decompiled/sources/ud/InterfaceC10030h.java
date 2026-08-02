package ud;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.J;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ud.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10030h extends Iterable<InterfaceC10025c>, InterfaceC6712a {

    /* renamed from: ud.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C2208a f100651a = new C2208a();

        /* renamed from: ud.h$a$a, reason: collision with other inner class name */
        public static final class C2208a implements InterfaceC10030h {
            @Override // ud.InterfaceC10030h
            public final boolean K0(Sd.c cVar) {
                return b.b(this, cVar);
            }

            @Override // ud.InterfaceC10030h
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<InterfaceC10025c> iterator() {
                K.f71697a.getClass();
                return J.f71696a;
            }

            @Override // ud.InterfaceC10030h
            public final InterfaceC10025c j(Sd.c fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            public final String toString() {
                return "EMPTY";
            }
        }

        @NotNull
        public static InterfaceC10030h a(@NotNull List annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? f100651a : new C10031i(annotations);
        }

        @NotNull
        public static C2208a b() {
            return f100651a;
        }
    }

    /* renamed from: ud.h$b */
    /* loaded from: classes10.dex */
    public static final class b {
        public static InterfaceC10025c a(@NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.c fqName) {
            InterfaceC10025c interfaceC10025c;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<InterfaceC10025c> it = interfaceC10030h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC10025c = null;
                    break;
                }
                interfaceC10025c = it.next();
                if (Intrinsics.d(interfaceC10025c.c(), fqName)) {
                    break;
                }
            }
            return interfaceC10025c;
        }

        public static boolean b(@NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return interfaceC10030h.j(fqName) != null;
        }
    }

    boolean K0(@NotNull Sd.c cVar);

    boolean isEmpty();

    InterfaceC10025c j(@NotNull Sd.c cVar);
}
