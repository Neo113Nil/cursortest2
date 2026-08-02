package expo.modules.contacts.next.records;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactQueryOptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/contacts/next/records/SortOrder;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UserDefault", "GivenName", "FamilyName", "None", "toColumn", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SortOrder implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    private final String value;
    public static final SortOrder UserDefault = new SortOrder("UserDefault", 0, "userDefault");
    public static final SortOrder GivenName = new SortOrder("GivenName", 1, "givenName");
    public static final SortOrder FamilyName = new SortOrder("FamilyName", 2, "familyName");
    public static final SortOrder None = new SortOrder("None", 3, "none");

    /* compiled from: ContactQueryOptions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortOrder.values().length];
            try {
                iArr[SortOrder.GivenName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortOrder.FamilyName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortOrder.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortOrder.UserDefault.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ SortOrder[] $values() {
        return new SortOrder[]{UserDefault, GivenName, FamilyName, None};
    }

    public static EnumEntries<SortOrder> getEntries() {
        return $ENTRIES;
    }

    private SortOrder(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SortOrder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final String toColumn() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "sort_key";
        }
        if (i == 2) {
            return "sort_key_alt";
        }
        if (i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }
}
