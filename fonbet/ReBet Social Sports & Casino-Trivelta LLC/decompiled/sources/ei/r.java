package ei;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public abstract class r {

    public static final class a implements bi.f {

        /* renamed from: a, reason: collision with root package name */
        public final Lazy f46126a;

        public a(Function0 function0) {
            this.f46126a = LazyKt.lazy(function0);
        }

        public final bi.f a() {
            return (bi.f) this.f46126a.getValue();
        }

        @Override // bi.f
        public boolean b() {
            return super.b();
        }

        @Override // bi.f
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return a().c(name);
        }

        @Override // bi.f
        public int d() {
            return a().d();
        }

        @Override // bi.f
        public String e(int i10) {
            return a().e(i10);
        }

        @Override // bi.f
        public List f(int i10) {
            return a().f(i10);
        }

        @Override // bi.f
        public bi.f g(int i10) {
            return a().g(i10);
        }

        @Override // bi.f
        public List getAnnotations() {
            return super.getAnnotations();
        }

        @Override // bi.f
        public bi.m getKind() {
            return a().getKind();
        }

        @Override // bi.f
        public String h() {
            return a().h();
        }

        @Override // bi.f
        public boolean i(int i10) {
            return a().i(i10);
        }

        @Override // bi.f
        public boolean isInline() {
            return super.isInline();
        }
    }

    public static final h d(ci.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(eVar.getClass()));
    }

    public static final s e(ci.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        s sVar = fVar instanceof s ? (s) fVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(fVar.getClass()));
    }

    public static final bi.f f(Function0 function0) {
        return new a(function0);
    }

    public static final void g(ci.e eVar) {
        d(eVar);
    }

    public static final void h(ci.f fVar) {
        e(fVar);
    }
}
