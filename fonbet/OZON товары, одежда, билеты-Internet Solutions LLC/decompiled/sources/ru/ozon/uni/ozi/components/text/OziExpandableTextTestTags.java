package ru.ozon.uni.ozi.components.text;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/text/OziExpandableTextTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Text", "TextContainer", "ExpandText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziExpandableTextTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziExpandableTextTestTags[] $VALUES;
    public static final OziExpandableTextTestTags Container = new OziExpandableTextTestTags("Container", 0);
    public static final OziExpandableTextTestTags Text = new OziExpandableTextTestTags("Text", 1);
    public static final OziExpandableTextTestTags TextContainer = new OziExpandableTextTestTags("TextContainer", 2);
    public static final OziExpandableTextTestTags ExpandText = new OziExpandableTextTestTags("ExpandText", 3);

    private static final /* synthetic */ OziExpandableTextTestTags[] $values() {
        return new OziExpandableTextTestTags[]{Container, Text, TextContainer, ExpandText};
    }

    static {
        OziExpandableTextTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziExpandableTextTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziExpandableTextTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziExpandableTextTestTags valueOf(String str) {
        return (OziExpandableTextTestTags) Enum.valueOf(OziExpandableTextTestTags.class, str);
    }

    public static OziExpandableTextTestTags[] values() {
        return (OziExpandableTextTestTags[]) $VALUES.clone();
    }
}
