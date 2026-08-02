package V4;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f12503b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f12504c = new b("INIT", 0, "init");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f12505d;

    /* renamed from: a, reason: collision with root package name */
    public final String f12506a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String type) {
            Object obj;
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it = b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((b) obj).c(), type)) {
                    break;
                }
            }
            return (b) obj;
        }

        public a() {
        }
    }

    static {
        b[] a10 = a();
        $VALUES = a10;
        f12505d = EnumEntriesKt.enumEntries(a10);
        f12503b = new a(null);
    }

    public b(String str, int i10, String str2) {
        this.f12506a = str2;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f12504c};
    }

    public static EnumEntries b() {
        return f12505d;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String c() {
        return this.f12506a;
    }
}
