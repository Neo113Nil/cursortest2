package nd;

import Qd.C3856a;
import Rd.d;
import Td.h;
import g.C6594f;
import he.C6925G;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC8552n;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.InterfaceC9820K;
import td.InterfaceC9831W;
import td.InterfaceC9845k;
import zd.C11104f;

/* renamed from: nd.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8556p {

    /* renamed from: nd.p$a */
    /* loaded from: classes10.dex */
    public static final class a extends AbstractC8556p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Field f77013a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Field field) {
            super(0);
            Intrinsics.checkNotNullParameter(field, "field");
            this.f77013a = field;
        }

        @Override // nd.AbstractC8556p
        @NotNull
        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            Field field = this.f77013a;
            String name = field.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(Cd.E.b(name));
            sb2.append("()");
            Class<?> type = field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(C11104f.b(type));
            return sb2.toString();
        }

        @NotNull
        public final Field b() {
            return this.f77013a;
        }
    }

    /* renamed from: nd.p$b */
    /* loaded from: classes10.dex */
    public static final class b extends AbstractC8556p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Method f77014a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f77015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Method getterMethod, Method method) {
            super(0);
            Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
            this.f77014a = getterMethod;
            this.f77015b = method;
        }

        @Override // nd.AbstractC8556p
        @NotNull
        public final String a() {
            return e1.a(this.f77014a);
        }

        @NotNull
        public final Method b() {
            return this.f77014a;
        }

        public final Method c() {
            return this.f77015b;
        }
    }

    /* renamed from: nd.p$c */
    public static final class c extends AbstractC8556p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C6925G f77016a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Nd.m f77017b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C3856a.c f77018c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Pd.c f77019d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Pd.g f77020e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f77021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C6925G descriptor, @NotNull Nd.m proto, @NotNull C3856a.c signature, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable) {
            super(0);
            String str;
            String a11;
            String string;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f77016a = descriptor;
            this.f77017b = proto;
            this.f77018c = signature;
            this.f77019d = nameResolver;
            this.f77020e = typeTable;
            if (signature.B()) {
                a11 = nameResolver.getString(signature.s().l()) + nameResolver.getString(signature.s().j());
            } else {
                d.a c11 = Rd.h.c(proto, nameResolver, typeTable, true);
                if (c11 == null) {
                    throw new V0("No field signature for property: " + descriptor);
                }
                String b11 = c11.b();
                String c12 = c11.c();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Cd.E.b(b11));
                InterfaceC9845k d11 = descriptor.d();
                Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
                if (Intrinsics.d(descriptor.getVisibility(), C9852r.f99402d) && (d11 instanceof he.n)) {
                    Nd.b Q02 = ((he.n) d11).Q0();
                    h.f<Nd.b, Integer> classModuleName = C3856a.f23240i;
                    Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                    Integer num = (Integer) Pd.e.a(Q02, classModuleName);
                    str = "$" + Sd.g.b((num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string);
                } else {
                    if (Intrinsics.d(descriptor.getVisibility(), C9852r.f99399a) && (d11 instanceof InterfaceC9820K)) {
                        he.v b02 = descriptor.b0();
                        if (b02 instanceof Ld.t) {
                            Ld.t tVar = (Ld.t) b02;
                            if (tVar.d() != null) {
                                str = "$" + tVar.g().b();
                            }
                        }
                    }
                    str = "";
                }
                a11 = C6594f.a(str, "()", c12, sb2);
            }
            this.f77021f = a11;
        }

        @Override // nd.AbstractC8556p
        @NotNull
        public final String a() {
            return this.f77021f;
        }

        @NotNull
        public final InterfaceC9831W b() {
            return this.f77016a;
        }

        @NotNull
        public final Pd.c c() {
            return this.f77019d;
        }

        @NotNull
        public final Nd.m d() {
            return this.f77017b;
        }

        @NotNull
        public final C3856a.c e() {
            return this.f77018c;
        }

        @NotNull
        public final Pd.g f() {
            return this.f77020e;
        }
    }

    /* renamed from: nd.p$d */
    /* loaded from: classes10.dex */
    public static final class d extends AbstractC8556p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC8552n.e f77022a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC8552n.e f77023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull AbstractC8552n.e getterSignature, AbstractC8552n.e eVar) {
            super(0);
            Intrinsics.checkNotNullParameter(getterSignature, "getterSignature");
            this.f77022a = getterSignature;
            this.f77023b = eVar;
        }

        @Override // nd.AbstractC8556p
        @NotNull
        public final String a() {
            return this.f77022a.a();
        }

        @NotNull
        public final AbstractC8552n.e b() {
            return this.f77022a;
        }

        public final AbstractC8552n.e c() {
            return this.f77023b;
        }
    }

    public AbstractC8556p(int i11) {
    }

    @NotNull
    public abstract String a();
}
