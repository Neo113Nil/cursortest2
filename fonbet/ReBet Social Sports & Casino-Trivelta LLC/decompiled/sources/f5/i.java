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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lf5/i;", "", "", "Le5/a;", "units", "<init>", "(Ljava/lang/String;ILe5/a;)V", "a", "Le5/a;", com.bumptech.glide.gifdecoder.e.f29601m, "()Le5/a;", "Companion", "c", W9.d.f13160a, "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f46412b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f46413c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f46414d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46415e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AbstractC4178a units;

    /* renamed from: f5.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ InterfaceC1901b a() {
            return (InterfaceC1901b) i.f46412b.getValue();
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
        AbstractC4178a.b bVar = AbstractC4178a.b.f45649b;
        f46413c = new i("SlowFrames", 0, bVar);
        f46414d = new i("FrozenFrames", 1, bVar);
        i[] b10 = b();
        $VALUES = b10;
        f46415e = EnumEntriesKt.enumEntries(b10);
        INSTANCE = new Companion(null);
        f46412b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: f5.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC1901b c10;
                c10 = i.c();
                return c10;
            }
        });
    }

    public i(String str, int i10, AbstractC4178a abstractC4178a) {
        this.units = abstractC4178a;
    }

    public static final /* synthetic */ i[] b() {
        return new i[]{f46413c, f46414d};
    }

    public static final /* synthetic */ InterfaceC1901b c() {
        return J.a("com.coralogix.android.sdk.internal.features.instrumentations.vitals.detectors.MetricKey.SlowFrozenFrameMetric", values());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    /* renamed from: e, reason: from getter */
    public AbstractC4178a getUnits() {
        return this.units;
    }
}
