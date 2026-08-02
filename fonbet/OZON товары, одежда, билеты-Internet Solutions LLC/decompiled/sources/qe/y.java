package qe;

import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.InterfaceC9035f;

/* loaded from: classes10.dex */
public abstract class y implements InterfaceC9035f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<qd.m, N> f82007a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f82008b;

    public static final class a extends y {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f82009c = new a("Boolean", x.f82006a);
    }

    public static final class b extends y {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f82010c = new b("Int", z.f82012a);
    }

    public static final class c extends y {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f82011c = new c("Unit", C9026A.f81936a);
    }

    public y(String str, Function1 function1) {
        this.f82007a = function1;
        this.f82008b = "must return ".concat(str);
    }

    @Override // qe.InterfaceC9035f
    public final boolean a(@NotNull Ed.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.d(functionDescriptor.getReturnType(), this.f82007a.invoke(Zd.e.e(functionDescriptor)));
    }

    @Override // qe.InterfaceC9035f
    public final String b(@NotNull Ed.e eVar) {
        return InterfaceC9035f.a.a(this, eVar);
    }

    @Override // qe.InterfaceC9035f
    @NotNull
    public final String getDescription() {
        return this.f82008b;
    }
}
