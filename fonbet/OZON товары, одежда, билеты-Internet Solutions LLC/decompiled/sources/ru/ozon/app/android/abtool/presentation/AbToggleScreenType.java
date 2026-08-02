package ru.ozon.app.android.abtool.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURES", "EXPERIMENTS", "AB_DEBUG", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleScreenType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AbToggleScreenType[] $VALUES;
    public static final AbToggleScreenType FEATURES = new AbToggleScreenType("FEATURES", 0);
    public static final AbToggleScreenType EXPERIMENTS = new AbToggleScreenType("EXPERIMENTS", 1);
    public static final AbToggleScreenType AB_DEBUG = new AbToggleScreenType("AB_DEBUG", 2);

    private static final /* synthetic */ AbToggleScreenType[] $values() {
        return new AbToggleScreenType[]{FEATURES, EXPERIMENTS, AB_DEBUG};
    }

    static {
        AbToggleScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AbToggleScreenType(String str, int i11) {
    }

    @NotNull
    public static a<AbToggleScreenType> getEntries() {
        return $ENTRIES;
    }

    public static AbToggleScreenType valueOf(String str) {
        return (AbToggleScreenType) Enum.valueOf(AbToggleScreenType.class, str);
    }

    public static AbToggleScreenType[] values() {
        return (AbToggleScreenType[]) $VALUES.clone();
    }
}
