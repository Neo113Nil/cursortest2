package ru.ozon.uni.ozi.components.emptyState;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/emptyState/OziEmptyStateTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Icon", "Title", "Subtitle", "Button", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziEmptyStateTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziEmptyStateTestTags[] $VALUES;
    public static final OziEmptyStateTestTags Container = new OziEmptyStateTestTags("Container", 0);
    public static final OziEmptyStateTestTags Icon = new OziEmptyStateTestTags("Icon", 1);
    public static final OziEmptyStateTestTags Title = new OziEmptyStateTestTags("Title", 2);
    public static final OziEmptyStateTestTags Subtitle = new OziEmptyStateTestTags("Subtitle", 3);
    public static final OziEmptyStateTestTags Button = new OziEmptyStateTestTags("Button", 4);

    private static final /* synthetic */ OziEmptyStateTestTags[] $values() {
        return new OziEmptyStateTestTags[]{Container, Icon, Title, Subtitle, Button};
    }

    static {
        OziEmptyStateTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziEmptyStateTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziEmptyStateTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziEmptyStateTestTags valueOf(String str) {
        return (OziEmptyStateTestTags) Enum.valueOf(OziEmptyStateTestTags.class, str);
    }

    public static OziEmptyStateTestTags[] values() {
        return (OziEmptyStateTestTags[]) $VALUES.clone();
    }
}
