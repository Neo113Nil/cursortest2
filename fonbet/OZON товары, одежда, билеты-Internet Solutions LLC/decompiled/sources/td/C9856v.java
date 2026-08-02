package td;

import ce.AbstractC5814a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9856v {

    /* renamed from: td.v$a */
    /* synthetic */ class a extends kotlin.jvm.internal.D {

        /* renamed from: a, reason: collision with root package name */
        public static final a f99431a = new a();

        @Override // kotlin.reflect.o
        public final Object get(Object obj) {
            return ((Sd.b) obj).e();
        }

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "outerClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final kotlin.reflect.g getOwner() {
            return kotlin.jvm.internal.N.b(Sd.b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public static final InterfaceC9839e a(@NotNull InterfaceC9815F interfaceC9815F, @NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC9842h b11 = b(interfaceC9815F, classId);
        if (b11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) b11;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC9842h b(@NotNull InterfaceC9815F interfaceC9815F, @NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC9815F a11 = Vd.y.a(interfaceC9815F);
        if (a11 == null) {
            InterfaceC9827S v11 = interfaceC9815F.v(classId.f());
            List<Sd.f> f7 = classId.g().f();
            Intrinsics.checkNotNullExpressionValue(f7, "pathSegments(...)");
            ce.l p11 = v11.p();
            Object K11 = C7714v.K(f7);
            Intrinsics.checkNotNullExpressionValue(K11, "first(...)");
            InterfaceC9842h d11 = ((AbstractC5814a) p11).d((Sd.f) K11, Bd.c.FROM_DESERIALIZATION);
            if (d11 != null) {
                for (Sd.f fVar : f7.subList(1, f7.size())) {
                    if (d11 instanceof InterfaceC9839e) {
                        ce.l H11 = ((InterfaceC9839e) d11).H();
                        Intrinsics.f(fVar);
                        InterfaceC9842h d12 = H11.d(fVar, Bd.c.FROM_DESERIALIZATION);
                        d11 = d12 instanceof InterfaceC9839e ? (InterfaceC9839e) d12 : null;
                        if (d11 != null) {
                        }
                    }
                }
                return d11;
            }
        } else {
            InterfaceC9827S v12 = a11.v(classId.f());
            List<Sd.f> f11 = classId.g().f();
            Intrinsics.checkNotNullExpressionValue(f11, "pathSegments(...)");
            ce.l p12 = v12.p();
            Object K12 = C7714v.K(f11);
            Intrinsics.checkNotNullExpressionValue(K12, "first(...)");
            InterfaceC9842h d13 = ((AbstractC5814a) p12).d((Sd.f) K12, Bd.c.FROM_DESERIALIZATION);
            if (d13 != null) {
                for (Sd.f fVar2 : f11.subList(1, f11.size())) {
                    if (d13 instanceof InterfaceC9839e) {
                        ce.l H12 = ((InterfaceC9839e) d13).H();
                        Intrinsics.f(fVar2);
                        InterfaceC9842h d14 = H12.d(fVar2, Bd.c.FROM_DESERIALIZATION);
                        d13 = d14 instanceof InterfaceC9839e ? (InterfaceC9839e) d14 : null;
                        if (d13 != null) {
                        }
                    }
                }
                if (d13 == null) {
                    return d13;
                }
                InterfaceC9827S v13 = interfaceC9815F.v(classId.f());
                List<Sd.f> f12 = classId.g().f();
                Intrinsics.checkNotNullExpressionValue(f12, "pathSegments(...)");
                ce.l p13 = v13.p();
                Object K13 = C7714v.K(f12);
                Intrinsics.checkNotNullExpressionValue(K13, "first(...)");
                InterfaceC9842h d15 = ((AbstractC5814a) p13).d((Sd.f) K13, Bd.c.FROM_DESERIALIZATION);
                if (d15 != null) {
                    for (Sd.f fVar3 : f12.subList(1, f12.size())) {
                        if (d15 instanceof InterfaceC9839e) {
                            ce.l H13 = ((InterfaceC9839e) d15).H();
                            Intrinsics.f(fVar3);
                            InterfaceC9842h d16 = H13.d(fVar3, Bd.c.FROM_DESERIALIZATION);
                            d15 = d16 instanceof InterfaceC9839e ? (InterfaceC9839e) d16 : null;
                            if (d15 != null) {
                            }
                        }
                    }
                    return d15;
                }
            }
            d13 = null;
            if (d13 == null) {
            }
        }
        return null;
    }

    @NotNull
    public static final InterfaceC9839e c(@NotNull InterfaceC9815F interfaceC9815F, @NotNull Sd.b classId, @NotNull C9819J notFoundClasses) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        InterfaceC9839e a11 = a(interfaceC9815F, classId);
        return a11 != null ? a11 : notFoundClasses.c(classId, kotlin.sequences.l.C(kotlin.sequences.l.v(kotlin.sequences.l.q(classId, a.f99431a), C9855u.f99430a)));
    }
}
