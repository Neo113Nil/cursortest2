package ru.ozon.uni.ozi.components.tabBar;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/components/tabBar/OziTabBarTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Tab", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTabBarTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziTabBarTestTags[] $VALUES;
    public static final OziTabBarTestTags Tab = new OziTabBarTestTags("Tab", 0);

    @NotNull
    private static final OziTestTagParameter<OziTabBarTestTags> TabIconName;

    private static final /* synthetic */ OziTabBarTestTags[] $values() {
        return new OziTabBarTestTags[]{Tab};
    }

    static {
        OziTabBarTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        TabIconName = new OziTestTagParameter<>("tabIconName");
    }

    private OziTabBarTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziTabBarTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziTabBarTestTags valueOf(String str) {
        return (OziTabBarTestTags) Enum.valueOf(OziTabBarTestTags.class, str);
    }

    public static OziTabBarTestTags[] values() {
        return (OziTabBarTestTags[]) $VALUES.clone();
    }
}
