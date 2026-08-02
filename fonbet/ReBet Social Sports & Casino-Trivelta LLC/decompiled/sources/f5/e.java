package f5;

import Zh.InterfaceC1901b;
import Zh.n;
import di.J;
import e5.AbstractC4178a;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\f¨\u0006\r"}, d2 = {"Lf5/e;", "", "", "Le5/a;", "units", "<init>", "(Ljava/lang/String;ILe5/a;)V", "a", "Le5/a;", "getUnits", "()Le5/a;", "Companion", "c", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f46398b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f46399c = new e("Fps", 0, null, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46400d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AbstractC4178a units;

    /* renamed from: f5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ InterfaceC1901b a() {
            return (InterfaceC1901b) e.f46398b.getValue();
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
        e[] b10 = b();
        $VALUES = b10;
        f46400d = EnumEntriesKt.enumEntries(b10);
        INSTANCE = new Companion(null);
        f46398b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: f5.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC1901b c10;
                c10 = e.c();
                return c10;
            }
        });
    }

    public e(String str, int i10, AbstractC4178a abstractC4178a) {
        this.units = abstractC4178a;
    }

    public static final /* synthetic */ e[] b() {
        return new e[]{f46399c};
    }

    public static final /* synthetic */ InterfaceC1901b c() {
        return J.a("com.coralogix.android.sdk.internal.features.instrumentations.vitals.detectors.MetricKey.FpsMetric", values());
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public /* synthetic */ e(String str, int i10, AbstractC4178a abstractC4178a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? AbstractC4178a.d.f45650b : abstractC4178a);
    }
}
