package ie;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ie.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4544a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC4544a[] $VALUES;

    @NotNull
    public static final C0725a Companion;
    public static final EnumC4544a Online = new EnumC4544a("Online", 0);
    public static final EnumC4544a Offline = new EnumC4544a("Offline", 1);
    public static final EnumC4544a CallOnline = new EnumC4544a("CallOnline", 2);
    public static final EnumC4544a CallOffline = new EnumC4544a("CallOffline", 3);

    /* renamed from: ie.a$a, reason: collision with other inner class name */
    public static final class C0725a {
        public /* synthetic */ C0725a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4544a a(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1548612125:
                    if (str.equals("offline")) {
                        return EnumC4544a.Offline;
                    }
                    return null;
                case -1012222381:
                    if (str.equals("online")) {
                        return EnumC4544a.Online;
                    }
                    return null;
                case -381848748:
                    if (str.equals("call_online")) {
                        return EnumC4544a.CallOnline;
                    }
                    return null;
                case 813101314:
                    if (str.equals("call_offline")) {
                        return EnumC4544a.CallOffline;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public C0725a() {
        }
    }

    private static final /* synthetic */ EnumC4544a[] $values() {
        return new EnumC4544a[]{Online, Offline, CallOnline, CallOffline};
    }

    static {
        EnumC4544a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new C0725a(null);
    }

    private EnumC4544a(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<EnumC4544a> getEntries() {
        return $ENTRIES;
    }

    public static EnumC4544a valueOf(String str) {
        return (EnumC4544a) Enum.valueOf(EnumC4544a.class, str);
    }

    public static EnumC4544a[] values() {
        return (EnumC4544a[]) $VALUES.clone();
    }
}
