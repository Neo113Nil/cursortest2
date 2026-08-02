package ru.ozon.uni.components.disclaimer;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Title", "Subtitle", "Icon", "MainButton", "AdditionalButton", "CloseButton", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniDisclaimerTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniDisclaimerTestTags[] $VALUES;
    public static final UniDisclaimerTestTags Container = new UniDisclaimerTestTags("Container", 0);
    public static final UniDisclaimerTestTags Title = new UniDisclaimerTestTags("Title", 1);
    public static final UniDisclaimerTestTags Subtitle = new UniDisclaimerTestTags("Subtitle", 2);
    public static final UniDisclaimerTestTags Icon = new UniDisclaimerTestTags("Icon", 3);
    public static final UniDisclaimerTestTags MainButton = new UniDisclaimerTestTags("MainButton", 4);
    public static final UniDisclaimerTestTags AdditionalButton = new UniDisclaimerTestTags("AdditionalButton", 5);
    public static final UniDisclaimerTestTags CloseButton = new UniDisclaimerTestTags("CloseButton", 6);

    private static final /* synthetic */ UniDisclaimerTestTags[] $values() {
        return new UniDisclaimerTestTags[]{Container, Title, Subtitle, Icon, MainButton, AdditionalButton, CloseButton};
    }

    static {
        UniDisclaimerTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniDisclaimerTestTags(String str, int i11) {
    }

    @NotNull
    public static a<UniDisclaimerTestTags> getEntries() {
        return $ENTRIES;
    }

    public static UniDisclaimerTestTags valueOf(String str) {
        return (UniDisclaimerTestTags) Enum.valueOf(UniDisclaimerTestTags.class, str);
    }

    public static UniDisclaimerTestTags[] values() {
        return (UniDisclaimerTestTags[]) $VALUES.clone();
    }
}
