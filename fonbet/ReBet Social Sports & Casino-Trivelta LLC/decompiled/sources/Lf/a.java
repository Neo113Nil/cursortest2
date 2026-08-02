package Lf;

import Gb.c;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String value;

    @c("landed_on_site")
    public static final a LandedOnApp = new a("LandedOnApp", 0, "landed_on_site");

    @c("access_any_page_on_website")
    public static final a AccessAnyPageOnApp = new a("AccessAnyPageOnApp", 1, "access_any_page_on_website");

    @c("clicked")
    public static final a Clicked = new a("Clicked", 2, "clicked");

    @c("performs_custom_action")
    public static final a PerformedCustomAction = new a("PerformedCustomAction", 3, "performs_custom_action");

    @c("restart")
    public static final a Restart = new a("Restart", 4, "restart");

    private static final /* synthetic */ a[] $values() {
        return new a[]{LandedOnApp, AccessAnyPageOnApp, Clicked, PerformedCustomAction, Restart};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private a(String str, int i10, String str2) {
        this.value = str2;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
