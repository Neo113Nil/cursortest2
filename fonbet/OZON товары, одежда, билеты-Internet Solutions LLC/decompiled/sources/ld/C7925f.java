package ld;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import je.A0;
import je.C7379f0;
import je.L0;
import je.N;
import je.Q;
import je.o0;
import je.s0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.s;
import nd.R0;
import nd.V0;
import nd.Z;
import ne.j;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.i0;

/* renamed from: ld.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7925f {

    /* renamed from: ld.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73179a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73179a = iArr;
        }
    }

    @NotNull
    public static final R0 a(@NotNull kotlin.reflect.d dVar, @NotNull List arguments, boolean z11, @NotNull List annotations) {
        InterfaceC9842h b11;
        o0 o0Var;
        j c7379f0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Z z12 = dVar instanceof Z ? (Z) dVar : null;
        if (z12 == null || (b11 = z12.b()) == null) {
            throw new V0("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
        }
        s0 k11 = b11.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        List<i0> parameters = k11.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            o0.f69907b.getClass();
            o0Var = o0.f69908c;
        } else {
            o0.f69907b.getClass();
            o0Var = o0.f69908c;
        }
        List<i0> parameters2 = k11.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        List list = arguments;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            R0 r02 = (R0) kTypeProjection.c();
            N i13 = r02 != null ? r02.i() : null;
            s d11 = kTypeProjection.d();
            int i14 = d11 == null ? -1 : a.f73179a[d11.ordinal()];
            if (i14 == -1) {
                i0 i0Var = parameters2.get(i11);
                Intrinsics.checkNotNullExpressionValue(i0Var, "get(...)");
                c7379f0 = new C7379f0(i0Var);
            } else if (i14 == 1) {
                L0 l02 = L0.INVARIANT;
                Intrinsics.f(i13);
                c7379f0 = new A0(i13, l02);
            } else if (i14 == 2) {
                L0 l03 = L0.IN_VARIANCE;
                Intrinsics.f(i13);
                c7379f0 = new A0(i13, l03);
            } else {
                if (i14 != 3) {
                    throw new o();
                }
                L0 l04 = L0.OUT_VARIANCE;
                Intrinsics.f(i13);
                c7379f0 = new A0(i13, l04);
            }
            arrayList.add(c7379f0);
            i11 = i12;
        }
        return new R0(Q.f(arrayList, o0Var, k11, null, z11), null);
    }
}
