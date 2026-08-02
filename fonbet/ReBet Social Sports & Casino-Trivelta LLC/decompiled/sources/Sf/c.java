package Sf;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10752a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Cache = new a("Cache", 0);
        public static final a Preferences = new a("Preferences", 1);
        public static final a CacheAndPreferences = new a("CacheAndPreferences", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{Cache, Preferences, CacheAndPreferences};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public c(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10752a = triggersRepository;
    }

    public static /* synthetic */ C5582a b(c cVar, Rf.a aVar, String str, a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = a.CacheAndPreferences;
        }
        return cVar.a(aVar, str, aVar2);
    }

    public final C5582a a(Rf.a actionType, String str, a dataSource) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return this.f10752a.d(actionType, str, dataSource);
    }

    public final C5582a c() {
        return this.f10752a.e();
    }
}
