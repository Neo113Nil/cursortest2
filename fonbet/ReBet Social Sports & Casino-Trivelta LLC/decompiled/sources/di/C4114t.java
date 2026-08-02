package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: di.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4114t implements V0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f45414a;

    /* renamed from: b, reason: collision with root package name */
    public final C4118v f45415b;

    /* renamed from: di.t$a */
    public static final class a implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KClass f45417b;

        public a(KClass kClass) {
            this.f45417b = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C4101m((InterfaceC1901b) C4114t.this.b().invoke(this.f45417b));
        }
    }

    public C4114t(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f45414a = compute;
        this.f45415b = new C4118v();
    }

    @Override // di.V0
    public InterfaceC1901b a(KClass key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.f45415b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C4106o0 c4106o0 = (C4106o0) obj;
        Object obj2 = c4106o0.f45400a.get();
        if (obj2 == null) {
            obj2 = c4106o0.a(new a(key));
        }
        return ((C4101m) obj2).f45389a;
    }

    public final Function1 b() {
        return this.f45414a;
    }
}
