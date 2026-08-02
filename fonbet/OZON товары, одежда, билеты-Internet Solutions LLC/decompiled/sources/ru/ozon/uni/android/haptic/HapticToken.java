package ru.ozon.uni.android.haptic;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/haptic/HapticToken;", "", "category", "Lru/ozon/uni/android/haptic/HapticCategory;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/haptic/HapticCategory;)V", "getCategory$uni_release", "()Lru/ozon/uni/android/haptic/HapticCategory;", "HEAVY", "MEDIUM", "LIGHT", "SOFT", "SUCCESS", "WARNING", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HapticToken {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HapticToken[] $VALUES;
    public static final HapticToken ERROR;
    public static final HapticToken HEAVY;
    public static final HapticToken LIGHT;
    public static final HapticToken MEDIUM;
    public static final HapticToken SOFT;
    public static final HapticToken SUCCESS;
    public static final HapticToken WARNING;

    @NotNull
    private final HapticCategory category;

    private static final /* synthetic */ HapticToken[] $values() {
        return new HapticToken[]{HEAVY, MEDIUM, LIGHT, SOFT, SUCCESS, WARNING, ERROR};
    }

    static {
        HapticCategory hapticCategory = HapticCategory.PREDEFINED_EFFECTS;
        HEAVY = new HapticToken("HEAVY", 0, hapticCategory);
        MEDIUM = new HapticToken("MEDIUM", 1, hapticCategory);
        LIGHT = new HapticToken("LIGHT", 2, hapticCategory);
        HapticCategory hapticCategory2 = HapticCategory.FEEDBACK_EFFECTS;
        SOFT = new HapticToken("SOFT", 3, hapticCategory2);
        SUCCESS = new HapticToken("SUCCESS", 4, hapticCategory2);
        WARNING = new HapticToken("WARNING", 5, hapticCategory2);
        ERROR = new HapticToken("ERROR", 6, hapticCategory2);
        HapticToken[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HapticToken(String str, int i11, HapticCategory hapticCategory) {
        this.category = hapticCategory;
    }

    public static HapticToken valueOf(String str) {
        return (HapticToken) Enum.valueOf(HapticToken.class, str);
    }

    public static HapticToken[] values() {
        return (HapticToken[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getCategory$uni_release, reason: from getter */
    public final HapticCategory getCategory() {
        return this.category;
    }
}
