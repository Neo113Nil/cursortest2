package ru.ozon.uni.ozi.components.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/button/OziUncontainedButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "Title", "Icon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziUncontainedButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziUncontainedButtonTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziUncontainedButtonTestTags> IconName;
    public static final OziUncontainedButtonTestTags Container = new OziUncontainedButtonTestTags("Container", 0);
    public static final OziUncontainedButtonTestTags Title = new OziUncontainedButtonTestTags("Title", 1);
    public static final OziUncontainedButtonTestTags Icon = new OziUncontainedButtonTestTags("Icon", 2);

    private static final /* synthetic */ OziUncontainedButtonTestTags[] $values() {
        return new OziUncontainedButtonTestTags[]{Container, Title, Icon};
    }

    static {
        OziUncontainedButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        IconName = new OziTestTagParameter<>("uncontainedButtonIconName");
    }

    private OziUncontainedButtonTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziUncontainedButtonTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziUncontainedButtonTestTags valueOf(String str) {
        return (OziUncontainedButtonTestTags) Enum.valueOf(OziUncontainedButtonTestTags.class, str);
    }

    public static OziUncontainedButtonTestTags[] values() {
        return (OziUncontainedButtonTestTags[]) $VALUES.clone();
    }
}
