package B7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f843a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f844b = new f("LOW", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f845c = new f("MEDIUM", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f846d = new f("HIGH", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f847e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f priority1, f priority2) {
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        public a() {
        }
    }

    static {
        f[] a10 = a();
        $VALUES = a10;
        f847e = EnumEntriesKt.enumEntries(a10);
        f843a = new a(null);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f844b, f845c, f846d};
    }

    public static final f b(f fVar, f fVar2) {
        return f843a.a(fVar, fVar2);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
