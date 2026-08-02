package ru.ozon.tracker.performance;

import Qj0.AbstractC3880a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class NavigationType extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Name f97772a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/tracker/performance/NavigationType$Name;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "INITIAL", "REFRESH", "PULL_TO_REFRESH", "REFRESH_MULTIPLE_PAGES", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Name {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @NotNull
        private final String type;
        public static final Name INITIAL = new Name("INITIAL", 0, "NT_INITIAL");
        public static final Name REFRESH = new Name("REFRESH", 1, "NT_REFRESH");
        public static final Name PULL_TO_REFRESH = new Name("PULL_TO_REFRESH", 2, "NT_PULL_TO_REFRESH");
        public static final Name REFRESH_MULTIPLE_PAGES = new Name("REFRESH_MULTIPLE_PAGES", 3, "NT_REFRESH_MULTIPLE_PAGES");

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{INITIAL, REFRESH, PULL_TO_REFRESH, REFRESH_MULTIPLE_PAGES};
        }

        static {
            Name[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Name(String str, int i11, String str2) {
            this.type = str2;
        }

        @NotNull
        public static Xc.a<Name> getEntries() {
            return $ENTRIES;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationType(@NotNull Name name) {
        super(0);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f97772a = name;
    }

    @NotNull
    public final Name a() {
        return this.f97772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.tracker.performance.NavigationType");
        return this.f97772a == ((NavigationType) obj).f97772a;
    }

    public final int hashCode() {
        return this.f97772a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "NavigationType(name=" + this.f97772a + ")";
    }
}
