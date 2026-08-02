package ru.ozon.uni.components.indicator;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Text", "Icon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIndicatorTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniIndicatorTestTags[] $VALUES;
    public static final UniIndicatorTestTags Container = new UniIndicatorTestTags("Container", 0);
    public static final UniIndicatorTestTags Text = new UniIndicatorTestTags("Text", 1);
    public static final UniIndicatorTestTags Icon = new UniIndicatorTestTags("Icon", 2);

    private static final /* synthetic */ UniIndicatorTestTags[] $values() {
        return new UniIndicatorTestTags[]{Container, Text, Icon};
    }

    static {
        UniIndicatorTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniIndicatorTestTags(String str, int i11) {
    }

    @NotNull
    public static a<UniIndicatorTestTags> getEntries() {
        return $ENTRIES;
    }

    public static UniIndicatorTestTags valueOf(String str) {
        return (UniIndicatorTestTags) Enum.valueOf(UniIndicatorTestTags.class, str);
    }

    public static UniIndicatorTestTags[] values() {
        return (UniIndicatorTestTags[]) $VALUES.clone();
    }
}
