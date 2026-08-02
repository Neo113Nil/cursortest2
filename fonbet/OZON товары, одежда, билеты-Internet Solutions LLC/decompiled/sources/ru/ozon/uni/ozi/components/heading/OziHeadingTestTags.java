package ru.ozon.uni.ozi.components.heading;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Title", "Subtitle", "Error", "Badges", "End", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziHeadingTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziHeadingTestTags[] $VALUES;
    public static final OziHeadingTestTags Container = new OziHeadingTestTags("Container", 0);
    public static final OziHeadingTestTags Title = new OziHeadingTestTags("Title", 1);
    public static final OziHeadingTestTags Subtitle = new OziHeadingTestTags("Subtitle", 2);
    public static final OziHeadingTestTags Error = new OziHeadingTestTags("Error", 3);
    public static final OziHeadingTestTags Badges = new OziHeadingTestTags("Badges", 4);
    public static final OziHeadingTestTags End = new OziHeadingTestTags("End", 5);

    private static final /* synthetic */ OziHeadingTestTags[] $values() {
        return new OziHeadingTestTags[]{Container, Title, Subtitle, Error, Badges, End};
    }

    static {
        OziHeadingTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziHeadingTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziHeadingTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziHeadingTestTags valueOf(String str) {
        return (OziHeadingTestTags) Enum.valueOf(OziHeadingTestTags.class, str);
    }

    public static OziHeadingTestTags[] values() {
        return (OziHeadingTestTags[]) $VALUES.clone();
    }
}
