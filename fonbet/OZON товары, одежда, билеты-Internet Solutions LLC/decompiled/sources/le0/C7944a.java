package le0;

import Sc.o;
import androidx.collection.C5155y;
import kd.InterfaceC7663b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import we0.m;

/* renamed from: le0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7944a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5155y<Integer, He0.b> f73272a = new C5155y<>(3);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: le0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class EnumC1234a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1234a[] $VALUES;
        public static final EnumC1234a LONG_TOP_RIGHT_POINT_LESS_THEN_BOTTOM_LEFT;

        static {
            EnumC1234a enumC1234a = new EnumC1234a("LONG_TOP_RIGHT_POINT_LESS_THEN_BOTTOM_LEFT", 0);
            LONG_TOP_RIGHT_POINT_LESS_THEN_BOTTOM_LEFT = enumC1234a;
            EnumC1234a[] enumC1234aArr = {enumC1234a};
            $VALUES = enumC1234aArr;
            $ENTRIES = Xc.b.a(enumC1234aArr);
        }

        private EnumC1234a() {
            throw null;
        }

        public static EnumC1234a valueOf(String str) {
            return (EnumC1234a) Enum.valueOf(EnumC1234a.class, str);
        }

        public static EnumC1234a[] values() {
            return (EnumC1234a[]) $VALUES.clone();
        }
    }

    /* renamed from: le0.a$b */
    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC7663b<Double> f73273a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC7663b<Double> f73274b;

        public b(@NotNull InterfaceC7663b<Double> left180thMeridian, @NotNull InterfaceC7663b<Double> right180thMeridian) {
            Intrinsics.checkNotNullParameter(left180thMeridian, "left180thMeridian");
            Intrinsics.checkNotNullParameter(right180thMeridian, "right180thMeridian");
            this.f73273a = left180thMeridian;
            this.f73274b = right180thMeridian;
        }

        @NotNull
        public final InterfaceC7663b<Double> a() {
            return this.f73273a;
        }

        @NotNull
        public final InterfaceC7663b<Double> b() {
            return this.f73274b;
        }
    }

    /* renamed from: le0.a$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73275a;

        static {
            int[] iArr = new int[EnumC1234a.values().length];
            try {
                iArr[EnumC1234a.LONG_TOP_RIGHT_POINT_LESS_THEN_BOTTOM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f73275a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static double b(InterfaceC7663b interfaceC7663b) {
        return ((Number) interfaceC7663b.e()).doubleValue() - ((Number) interfaceC7663b.getStart()).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final He0.b a(He0.b bVar) {
        if (bVar == null) {
            return null;
        }
        EnumC1234a enumC1234a = bVar.a().getLongitude() < bVar.b().getLongitude() ? EnumC1234a.LONG_TOP_RIGHT_POINT_LESS_THEN_BOTTOM_LEFT : null;
        if (enumC1234a == null) {
            return bVar;
        }
        C5155y<Integer, He0.b> c5155y = this.f73272a;
        He0.b bVar2 = c5155y.get(Integer.valueOf(bVar.hashCode()));
        if (bVar2 != null) {
            return bVar2;
        }
        if (c.f73275a[enumC1234a.ordinal()] != 1) {
            throw new o();
        }
        b bVar3 = new b(h.k(bVar.b().getLongitude(), 180.0d), h.k(-180.0d, bVar.a().getLongitude()));
        InterfaceC7663b k11 = b(bVar3.a()) > b(bVar3.b()) ? h.k(bVar3.a().getStart().doubleValue() + b(bVar3.b()), bVar3.a().e().doubleValue()) : h.k(bVar3.b().getStart().doubleValue(), bVar3.b().e().doubleValue() - b(bVar3.a()));
        He0.b bVar4 = new He0.b(new m(bVar.b().getLatitude(), ((Number) k11.getStart()).doubleValue()), new m(bVar.a().getLatitude(), ((Number) k11.e()).doubleValue()));
        c5155y.put(Integer.valueOf(bVar.hashCode()), bVar4);
        return bVar4;
    }
}
