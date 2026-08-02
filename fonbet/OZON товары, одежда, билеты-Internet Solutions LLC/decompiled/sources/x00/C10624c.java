package x00;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.AbstractC10744q0;
import xe.C10745r0;

/* renamed from: x00.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10624c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4008j f104799a = k.b(a.f104801b);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4008j f104800b = k.b(new b());

    /* renamed from: x00.c$a */
    static final class a extends AbstractC7737t implements Function0<ThreadFactoryC10623b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f104801b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ThreadFactoryC10623b invoke() {
            return new ThreadFactoryC10623b();
        }
    }

    /* renamed from: x00.c$b */
    static final class b extends AbstractC7737t implements Function0<AbstractC10744q0> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10744q0 invoke() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C10624c.a(C10624c.this));
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            return new C10745r0(newSingleThreadExecutor);
        }
    }

    C10624c() {
    }

    public static final ThreadFactoryC10623b a(C10624c c10624c) {
        return (ThreadFactoryC10623b) c10624c.f104799a.getValue();
    }

    public final AbstractC10744q0 b() {
        return (AbstractC10744q0) this.f104800b.getValue();
    }
}
