package td;

import ce.l;
import ie.InterfaceC7061j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd.AbstractC10516b;

/* loaded from: classes.dex */
public final class b0<T extends ce.l> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC10516b f99385a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<ke.h, T> f99386b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ke.h f99387c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f99388d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f99384f = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(b0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f99383e = new a();

    public static final class a {
    }

    private b0() {
        throw null;
    }

    public b0(AbstractC10516b abstractC10516b, ie.o oVar, Function1 function1, ke.h hVar) {
        this.f99385a = abstractC10516b;
        this.f99386b = function1;
        this.f99387c = hVar;
        this.f99388d = oVar.a(new a0(this));
    }

    static ce.l a(b0 b0Var) {
        return b0Var.f99386b.invoke(b0Var.f99387c);
    }

    @NotNull
    public final T b(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.c(Zd.e.j(this.f99385a));
        return (T) ie.n.a(this.f99388d, f99384f[0]);
    }
}
