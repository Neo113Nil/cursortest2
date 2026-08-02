package i7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final H6.a f48172a;

    /* renamed from: b, reason: collision with root package name */
    public final a f48173b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f48174a = new a("SUCCESS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f48175b = new a("NEAREST", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f48176c = new a("MISSING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f48177d;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f48177d = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f48174a, f48175b, f48176c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public l(H6.a aVar, a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f48172a = aVar;
        this.f48173b = type;
    }

    public final H6.a a() {
        return this.f48172a;
    }

    public final a b() {
        return this.f48173b;
    }
}
