package ru.ozon.uni.ozi.components.sheet;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/components/sheet/OziSheetTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "ContentContainer", "NavBar", "Cutoff", "Content", "BottomContainer", "CloseButton", "Backdrop", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziSheetTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziSheetTestTags[] $VALUES;
    public static final OziSheetTestTags Container = new OziSheetTestTags("Container", 0);
    public static final OziSheetTestTags ContentContainer = new OziSheetTestTags("ContentContainer", 1);
    public static final OziSheetTestTags NavBar = new OziSheetTestTags("NavBar", 2);
    public static final OziSheetTestTags Cutoff = new OziSheetTestTags("Cutoff", 3);
    public static final OziSheetTestTags Content = new OziSheetTestTags("Content", 4);
    public static final OziSheetTestTags BottomContainer = new OziSheetTestTags("BottomContainer", 5);
    public static final OziSheetTestTags CloseButton = new OziSheetTestTags("CloseButton", 6);
    public static final OziSheetTestTags Backdrop = new OziSheetTestTags("Backdrop", 7);

    private static final /* synthetic */ OziSheetTestTags[] $values() {
        return new OziSheetTestTags[]{Container, ContentContainer, NavBar, Cutoff, Content, BottomContainer, CloseButton, Backdrop};
    }

    static {
        OziSheetTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziSheetTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziSheetTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziSheetTestTags valueOf(String str) {
        return (OziSheetTestTags) Enum.valueOf(OziSheetTestTags.class, str);
    }

    public static OziSheetTestTags[] values() {
        return (OziSheetTestTags[]) $VALUES.clone();
    }
}
