package wZ;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: wZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10461c {

    /* renamed from: wZ.c$a */
    public static final class a extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f103711b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacksC5392m componentCallbacksC5392m) {
            super(0);
            this.f103711b = componentCallbacksC5392m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return this.f103711b;
        }
    }

    /* renamed from: wZ.c$b */
    public static final class b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f103712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f103712b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return this.f103712b.f103711b;
        }
    }

    /* renamed from: wZ.c$c, reason: collision with other inner class name */
    public static final class C2249c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f103713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2249c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f103713b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f103713b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: wZ.c$d */
    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f103714b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f103714b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f103714b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: wZ.c$e */
    static final class e extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f103715b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ComponentCallbacksC5392m componentCallbacksC5392m) {
            super(0);
            this.f103715b = componentCallbacksC5392m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new C10462d(this.f103715b);
        }
    }

    @NotNull
    public static final C10460b a(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        e eVar = new e(componentCallbacksC5392m);
        InterfaceC4008j a11 = k.a(n.NONE, new b(new a(componentCallbacksC5392m)));
        return (C10460b) b0.b(componentCallbacksC5392m, N.b(C10460b.class), new C2249c(a11), new d(a11), eVar).getValue();
    }
}
