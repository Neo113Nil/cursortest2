package ke;

import java.util.Collection;
import je.A0;
import je.AbstractC7360E;
import je.C7356A;
import je.C7371b0;
import je.C7401v;
import je.H0;
import je.K0;
import je.L0;
import je.M;
import je.N;
import je.Q;
import je.S;
import je.Y;
import je.s0;
import je.u0;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import ne.EnumC8580b;
import ne.InterfaceC8581c;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.C9813D;
import td.C9858x;
import td.EnumC9840f;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.i0;

/* renamed from: ke.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7670b extends ne.m {

    /* renamed from: ke.b$a */
    public static final class a {
        public static boolean A(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return S.a((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean B(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                InterfaceC9842h p11 = ((s0) receiver).p();
                InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
                return (interfaceC9839e != null ? interfaceC9839e.e0() : null) instanceof C9858x;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean C(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return receiver instanceof Xd.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean D(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return receiver instanceof M;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean E(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return ((Y) receiver).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean F(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return qd.m.j0((s0) receiver, s.a.f81899b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean G(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return H0.g((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean H(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return qd.m.g0((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean I(@NotNull InterfaceC8581c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean J(@NotNull ne.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean K(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return C8701c.l((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean L(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return C8701c.m((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static Y M(@NotNull ne.e receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC7360E) {
                return ((AbstractC7360E) receiver).P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static K0 N(@NotNull InterfaceC8581c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static K0 O(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof K0) {
                return O7.h.a((K0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static Y P(@NotNull ne.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C7401v) {
                return ((C7401v) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static int Q(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return ((s0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static Collection<ne.g> R(@NotNull InterfaceC7670b interfaceC7670b, @NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            s0 c02 = interfaceC7670b.c0(receiver);
            if (c02 instanceof Xd.q) {
                return ((Xd.q) c02).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static y0 S(@NotNull Wd.b receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof o) {
                return ((o) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static C7671c T(@NotNull InterfaceC7670b interfaceC7670b, @NotNull ne.h type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof Y) {
                u0.a aVar = u0.f69930b;
                N kotlinType = (N) type;
                Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                return new C7671c(interfaceC7670b, aVar.a(kotlinType.H0(), kotlinType.F0()).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + kotlin.jvm.internal.N.b(type.getClass())).toString());
        }

        @NotNull
        public static Collection U(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                Collection<N> o11 = ((s0) receiver).o();
                Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
                return o11;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static s0 V(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return ((Y) receiver).H0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static o W(@NotNull InterfaceC8581c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static Y X(@NotNull ne.e receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC7360E) {
                return ((AbstractC7360E) receiver).Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static Y Y(@NotNull ne.h receiver, boolean z11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return ((Y) receiver).L0(z11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static ne.g Z(@NotNull InterfaceC7670b interfaceC7670b, @NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof ne.h) {
                return interfaceC7670b.X((ne.h) receiver, true);
            }
            if (!(receiver instanceof ne.e)) {
                throw new IllegalStateException("sealed");
            }
            ne.e eVar = (ne.e) receiver;
            return interfaceC7670b.Y(interfaceC7670b.X(interfaceC7670b.i(eVar), true), interfaceC7670b.X(interfaceC7670b.Q(eVar), true));
        }

        public static boolean a(@NotNull ne.k c12, @NotNull ne.k c22) {
            Intrinsics.checkNotNullParameter(c12, "c1");
            Intrinsics.checkNotNullParameter(c22, "c2");
            if (!(c12 instanceof s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + kotlin.jvm.internal.N.b(c12.getClass())).toString());
            }
            if (c22 instanceof s0) {
                return Intrinsics.d(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + kotlin.jvm.internal.N.b(c22.getClass())).toString());
        }

        public static int b(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return ((N) receiver).F0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static ne.i c(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                return (ne.i) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static InterfaceC8581c d(@NotNull InterfaceC7670b interfaceC7670b, @NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                if (receiver instanceof C7371b0) {
                    return interfaceC7670b.t(((C7371b0) receiver).T0());
                }
                if (receiver instanceof j) {
                    return (j) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static C7401v e(@NotNull ne.h receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y) {
                if (receiver instanceof C7401v) {
                    return (C7401v) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static C7356A f(@NotNull AbstractC7360E receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C7356A) {
                return (C7356A) receiver;
            }
            return null;
        }

        public static AbstractC7360E g(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                K0 K02 = ((N) receiver).K0();
                if (K02 instanceof AbstractC7360E) {
                    return (AbstractC7360E) K02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static Y h(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                K0 K02 = ((N) receiver).K0();
                if (K02 instanceof Y) {
                    return (Y) K02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static A0 i(@NotNull ne.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return C8701c.a((N) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static Y j(@NotNull ne.h type, @NotNull EnumC8580b status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof Y) {
                return p.a((Y) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + kotlin.jvm.internal.N.b(type.getClass())).toString());
        }

        @NotNull
        public static EnumC8580b k(@NotNull InterfaceC8581c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static K0 l(@NotNull InterfaceC7670b interfaceC7670b, @NotNull ne.h lowerBound, @NotNull ne.h upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof Y)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7670b + ", " + kotlin.jvm.internal.N.b(interfaceC7670b.getClass())).toString());
            }
            if (upperBound instanceof Y) {
                return Q.c((Y) lowerBound, (Y) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7670b + ", " + kotlin.jvm.internal.N.b(interfaceC7670b.getClass())).toString());
        }

        @NotNull
        public static ne.j m(@NotNull ne.g receiver, int i11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N) {
                return ((N) receiver).F0().get(i11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static ne.l n(@NotNull ne.k receiver, int i11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                i0 i0Var = ((s0) receiver).getParameters().get(i11);
                Intrinsics.checkNotNullExpressionValue(i0Var, "get(...)");
                return i0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static K0 o(@NotNull ne.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).getType().K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static i0 p(@NotNull ne.p receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s) {
                return ((s) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static i0 q(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                InterfaceC9842h p11 = ((s0) receiver).p();
                if (p11 instanceof i0) {
                    return (i0) p11;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static ne.q r(@NotNull ne.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof y0) {
                L0 b11 = ((y0) receiver).b();
                Intrinsics.checkNotNullExpressionValue(b11, "getProjectionKind(...)");
                return ne.n.a(b11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        @NotNull
        public static ne.q s(@NotNull ne.l receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i0) {
                L0 x11 = ((i0) receiver).x();
                Intrinsics.checkNotNullExpressionValue(x11, "getVariance(...)");
                return ne.n.a(x11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean t(@NotNull N receiver, @NotNull Sd.c fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver != null) {
                return receiver.getAnnotations().K0(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean u(@NotNull ne.l receiver, ne.k kVar) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof i0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
            }
            i0 i0Var = (i0) receiver;
            if (kVar == null ? true : kVar instanceof s0) {
                return C8701c.k(i0Var, (s0) kVar, 4);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + i0Var + ", " + kotlin.jvm.internal.N.b(i0Var.getClass())).toString());
        }

        public static boolean v(@NotNull ne.h a11, @NotNull ne.h b11) {
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            if (!(a11 instanceof Y)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a11 + ", " + kotlin.jvm.internal.N.b(a11.getClass())).toString());
            }
            if (b11 instanceof Y) {
                return ((Y) a11).F0() == ((Y) b11).F0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b11 + ", " + kotlin.jvm.internal.N.b(b11.getClass())).toString());
        }

        public static boolean w(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return qd.m.j0((s0) receiver, s.a.f81897a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean x(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return ((s0) receiver).p() instanceof InterfaceC9839e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean y(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                InterfaceC9842h p11 = ((s0) receiver).p();
                InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
                return (interfaceC9839e == null || !C9813D.a(interfaceC9839e) || interfaceC9839e.getKind() == EnumC9840f.ENUM_ENTRY || interfaceC9839e.getKind() == EnumC9840f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }

        public static boolean z(@NotNull ne.k receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof s0) {
                return ((s0) receiver).q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
        }
    }

    @NotNull
    K0 Y(@NotNull ne.h hVar, @NotNull ne.h hVar2);
}
