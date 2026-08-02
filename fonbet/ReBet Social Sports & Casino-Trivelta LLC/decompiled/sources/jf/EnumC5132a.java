package jf;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5132a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC5132a[] $VALUES;

    @NotNull
    private final String value;
    public static final EnumC5132a Viewed = new EnumC5132a("Viewed", 0, "viewed");
    public static final EnumC5132a Liked = new EnumC5132a("Liked", 1, "liked");
    public static final EnumC5132a Disliked = new EnumC5132a("Disliked", 2, "disliked");

    private static final /* synthetic */ EnumC5132a[] $values() {
        return new EnumC5132a[]{Viewed, Liked, Disliked};
    }

    static {
        EnumC5132a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumC5132a(String str, int i10, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<EnumC5132a> getEntries() {
        return $ENTRIES;
    }

    public static EnumC5132a valueOf(String str) {
        return (EnumC5132a) Enum.valueOf(EnumC5132a.class, str);
    }

    public static EnumC5132a[] values() {
        return (EnumC5132a[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
