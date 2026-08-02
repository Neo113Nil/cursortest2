package ru.ozon.uni.ozi.components.navBar;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/OziNavBarTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "TopPart", "BottomPart", "TopTitle", "TopSubtitle", "Search", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNavBarTestTags[] $VALUES;
    public static final OziNavBarTestTags Container = new OziNavBarTestTags("Container", 0);
    public static final OziNavBarTestTags TopPart = new OziNavBarTestTags("TopPart", 1);
    public static final OziNavBarTestTags BottomPart = new OziNavBarTestTags("BottomPart", 2);
    public static final OziNavBarTestTags TopTitle = new OziNavBarTestTags("TopTitle", 3);
    public static final OziNavBarTestTags TopSubtitle = new OziNavBarTestTags("TopSubtitle", 4);
    public static final OziNavBarTestTags Search = new OziNavBarTestTags("Search", 5);

    private static final /* synthetic */ OziNavBarTestTags[] $values() {
        return new OziNavBarTestTags[]{Container, TopPart, BottomPart, TopTitle, TopSubtitle, Search};
    }

    static {
        OziNavBarTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNavBarTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziNavBarTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziNavBarTestTags valueOf(String str) {
        return (OziNavBarTestTags) Enum.valueOf(OziNavBarTestTags.class, str);
    }

    public static OziNavBarTestTags[] values() {
        return (OziNavBarTestTags[]) $VALUES.clone();
    }
}
