package f5;

import Zh.InterfaceC1901b;
import Zh.n;
import di.J;
import e5.AbstractC4178a;
import i3.C4527h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@n
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lf5/g;", "", "", "Le5/a;", "units", "<init>", "(Ljava/lang/String;ILe5/a;)V", "a", "Le5/a;", com.bumptech.glide.gifdecoder.e.f29601m, "()Le5/a;", "Companion", "c", W9.d.f13160a, "f", "g", C4527h.f48087o, com.google.android.material.shape.i.f35755A, "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f46402b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f46403c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f46404d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f46405e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f46406f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f46407g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f46408h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f46409i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46410j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AbstractC4178a units;

    /* renamed from: f5.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ InterfaceC1901b a() {
            return (InterfaceC1901b) g.f46402b.getValue();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AbstractC4178a.g gVar = AbstractC4178a.g.f45654b;
        f46403c = new g("ResidentMemory", 0, gVar);
        AbstractC4178a.i iVar = AbstractC4178a.i.f45656b;
        f46404d = new g("MemoryUtilization", 1, iVar);
        f46405e = new g("HeapMax", 2, gVar);
        f46406f = new g("HeapUsed", 3, gVar);
        f46407g = new g("HeapUtilization", 4, iVar);
        AbstractC4178a.e eVar = AbstractC4178a.e.f45651b;
        f46408h = new g("JavaMemory", 5, eVar);
        f46409i = new g("NativeMemory", 6, eVar);
        g[] b10 = b();
        $VALUES = b10;
        f46410j = EnumEntriesKt.enumEntries(b10);
        INSTANCE = new Companion(null);
        f46402b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: f5.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC1901b c10;
                c10 = g.c();
                return c10;
            }
        });
    }

    public g(String str, int i10, AbstractC4178a abstractC4178a) {
        this.units = abstractC4178a;
    }

    public static final /* synthetic */ g[] b() {
        return new g[]{f46403c, f46404d, f46405e, f46406f, f46407g, f46408h, f46409i};
    }

    public static final /* synthetic */ InterfaceC1901b c() {
        return J.a("com.coralogix.android.sdk.internal.features.instrumentations.vitals.detectors.MetricKey.MemoryMetric", values());
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    /* renamed from: e, reason: from getter */
    public AbstractC4178a getUnits() {
        return this.units;
    }
}
