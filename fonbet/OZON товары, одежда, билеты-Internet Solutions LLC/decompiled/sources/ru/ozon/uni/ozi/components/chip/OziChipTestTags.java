package ru.ozon.uni.ozi.components.chip;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/chip/OziChipTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "StartIcon", "Label", "Indicator", "CloseButton", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziChipTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziChipTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziChipTestTags> StartIconName;
    public static final OziChipTestTags Container = new OziChipTestTags("Container", 0);
    public static final OziChipTestTags StartIcon = new OziChipTestTags("StartIcon", 1);
    public static final OziChipTestTags Label = new OziChipTestTags("Label", 2);
    public static final OziChipTestTags Indicator = new OziChipTestTags("Indicator", 3);
    public static final OziChipTestTags CloseButton = new OziChipTestTags("CloseButton", 4);

    private static final /* synthetic */ OziChipTestTags[] $values() {
        return new OziChipTestTags[]{Container, StartIcon, Label, Indicator, CloseButton};
    }

    static {
        OziChipTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        StartIconName = new OziTestTagParameter<>("chipStartIconName");
    }

    private OziChipTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziChipTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziChipTestTags valueOf(String str) {
        return (OziChipTestTags) Enum.valueOf(OziChipTestTags.class, str);
    }

    public static OziChipTestTags[] values() {
        return (OziChipTestTags[]) $VALUES.clone();
    }
}
