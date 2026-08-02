package ru.ozon.uni.ozi.components.disclaimer;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/disclaimer/OziDisclaimerTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Icon", "Title", "Subtitle", "CloseButton", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziDisclaimerTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziDisclaimerTestTags[] $VALUES;
    public static final OziDisclaimerTestTags Container = new OziDisclaimerTestTags("Container", 0);
    public static final OziDisclaimerTestTags Icon = new OziDisclaimerTestTags("Icon", 1);
    public static final OziDisclaimerTestTags Title = new OziDisclaimerTestTags("Title", 2);
    public static final OziDisclaimerTestTags Subtitle = new OziDisclaimerTestTags("Subtitle", 3);
    public static final OziDisclaimerTestTags CloseButton = new OziDisclaimerTestTags("CloseButton", 4);

    private static final /* synthetic */ OziDisclaimerTestTags[] $values() {
        return new OziDisclaimerTestTags[]{Container, Icon, Title, Subtitle, CloseButton};
    }

    static {
        OziDisclaimerTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziDisclaimerTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziDisclaimerTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziDisclaimerTestTags valueOf(String str) {
        return (OziDisclaimerTestTags) Enum.valueOf(OziDisclaimerTestTags.class, str);
    }

    public static OziDisclaimerTestTags[] values() {
        return (OziDisclaimerTestTags[]) $VALUES.clone();
    }
}
