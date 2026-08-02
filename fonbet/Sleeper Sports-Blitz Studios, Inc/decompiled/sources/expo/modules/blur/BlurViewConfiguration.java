package expo.modules.blur;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpoBlurView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/blur/BlurViewConfiguration;", "", "<init>", "(Ljava/lang/String;I)V", "UNCONFIGURED", "NONE", "DIMEZIS", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class BlurViewConfiguration {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlurViewConfiguration[] $VALUES;
    public static final BlurViewConfiguration UNCONFIGURED = new BlurViewConfiguration("UNCONFIGURED", 0);
    public static final BlurViewConfiguration NONE = new BlurViewConfiguration("NONE", 1);
    public static final BlurViewConfiguration DIMEZIS = new BlurViewConfiguration("DIMEZIS", 2);

    private static final /* synthetic */ BlurViewConfiguration[] $values() {
        return new BlurViewConfiguration[]{UNCONFIGURED, NONE, DIMEZIS};
    }

    public static EnumEntries<BlurViewConfiguration> getEntries() {
        return $ENTRIES;
    }

    private BlurViewConfiguration(String str, int i) {
    }

    static {
        BlurViewConfiguration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BlurViewConfiguration valueOf(String str) {
        return (BlurViewConfiguration) Enum.valueOf(BlurViewConfiguration.class, str);
    }

    public static BlurViewConfiguration[] values() {
        return (BlurViewConfiguration[]) $VALUES.clone();
    }
}
