package wf;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: wf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6745a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC6745a[] $VALUES;
    public static final EnumC6745a Retry = new EnumC6745a("Retry", 0);
    public static final EnumC6745a Reply = new EnumC6745a("Reply", 1);
    public static final EnumC6745a Edit = new EnumC6745a("Edit", 2);
    public static final EnumC6745a Copy = new EnumC6745a("Copy", 3);
    public static final EnumC6745a Delete = new EnumC6745a("Delete", 4);
    public static final EnumC6745a Read = new EnumC6745a("Read", 5);

    private static final /* synthetic */ EnumC6745a[] $values() {
        return new EnumC6745a[]{Retry, Reply, Edit, Copy, Delete, Read};
    }

    static {
        EnumC6745a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumC6745a(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<EnumC6745a> getEntries() {
        return $ENTRIES;
    }

    public static EnumC6745a valueOf(String str) {
        return (EnumC6745a) Enum.valueOf(EnumC6745a.class, str);
    }

    public static EnumC6745a[] values() {
        return (EnumC6745a[]) $VALUES.clone();
    }
}
