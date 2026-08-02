package ru.ozon.uni.ozi.components.radio;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/components/radio/OziRadioTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Icon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziRadioTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziRadioTestTags[] $VALUES;
    public static final OziRadioTestTags Container = new OziRadioTestTags("Container", 0);
    public static final OziRadioTestTags Icon = new OziRadioTestTags("Icon", 1);

    private static final /* synthetic */ OziRadioTestTags[] $values() {
        return new OziRadioTestTags[]{Container, Icon};
    }

    static {
        OziRadioTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziRadioTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziRadioTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziRadioTestTags valueOf(String str) {
        return (OziRadioTestTags) Enum.valueOf(OziRadioTestTags.class, str);
    }

    public static OziRadioTestTags[] values() {
        return (OziRadioTestTags[]) $VALUES.clone();
    }
}
