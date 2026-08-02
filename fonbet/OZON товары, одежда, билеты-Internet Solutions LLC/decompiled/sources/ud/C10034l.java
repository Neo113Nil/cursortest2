package ud;

import java.util.Map;
import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;

/* renamed from: ud.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10034l implements InterfaceC10025c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qd.m f100654a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sd.c f100655b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<Sd.f, Xd.g<?>> f100656c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f100657d;

    public C10034l(@NotNull qd.m builtIns, @NotNull Sd.c fqName, @NotNull Map allValueArguments) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f100654a = builtIns;
        this.f100655b = fqName;
        this.f100656c = allValueArguments;
        this.f100657d = Sc.k.a(Sc.n.PUBLICATION, new C10033k(this));
    }

    static Y d(C10034l c10034l) {
        return c10034l.f100654a.o(c10034l.f100655b).q();
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<?>> b() {
        return this.f100656c;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Sd.c c() {
        return this.f100655b;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final d0 e() {
        d0 NO_SOURCE = d0.f99392a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ud.InterfaceC10025c
    @NotNull
    public final N getType() {
        Object value = this.f100657d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (N) value;
    }
}
