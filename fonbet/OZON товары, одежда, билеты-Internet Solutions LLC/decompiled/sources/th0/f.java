package th0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f99534a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Regex f99535b = new Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NEW;
        public static final a OLD;

        static {
            a aVar = new a("OLD", 0);
            OLD = aVar;
            a aVar2 = new a("NEW", 1);
            NEW = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public f(boolean z11) {
        this.f99534a = z11;
    }

    private final a a(String str) {
        return this.f99535b.f(str) ? a.OLD : a.NEW;
    }

    @NotNull
    public final e b(@NotNull String hwId, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(hwId, "hwId");
        a a11 = a(hwId);
        a aVar = a.OLD;
        if (a11 == aVar && str == null && !z11) {
            return e.CORRECT_NO_MIGRATION_OLD;
        }
        a a12 = a(hwId);
        a aVar2 = a.NEW;
        boolean z12 = this.f99534a;
        if (a12 == aVar2) {
            if ((str != null ? a(str) : null) == aVar && !z11 && z12) {
                return e.CORRECT_MIGRATION_FROM_OLD_TO_NEW;
            }
        }
        if (a(hwId) == aVar2 && str == null && z11) {
            return e.CORRECT_NO_MIGRATION_NEW;
        }
        if (a(hwId) == aVar2) {
            if ((str != null ? a(str) : null) == aVar2 && z11 && z12) {
                return e.CORRECT_MIGRATION_FROM_NEW_TO_NEW;
            }
        }
        return e.INCORRECT;
    }
}
