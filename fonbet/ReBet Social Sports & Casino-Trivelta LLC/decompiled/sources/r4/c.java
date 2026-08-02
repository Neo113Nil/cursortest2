package r4;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t4.C6441a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f63950a = new b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f63951a = new a("Default", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f63952b = new a("DisableBuffering", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f63953c = new a("DependingOnMemory", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f63954d;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f63954d = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f63951a, f63952b, f63953c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            if (str == null) {
                return a.f63951a;
            }
            try {
                return a.valueOf(str);
            } catch (Exception unused) {
                C6441a.b("BufferingStrategy", "cannot parse buffering strategy " + str);
                return a.f63951a;
            }
        }

        public b() {
        }
    }
}
