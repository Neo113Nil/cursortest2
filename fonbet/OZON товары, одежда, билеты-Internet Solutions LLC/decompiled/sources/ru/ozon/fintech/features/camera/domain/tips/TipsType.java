package ru.ozon.fintech.features.camera.domain.tips;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "BUTTON", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TipsType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TipsType[] $VALUES;
    public static final TipsType TEXT = new TipsType("TEXT", 0);
    public static final TipsType BUTTON = new TipsType("BUTTON", 1);

    private static final /* synthetic */ TipsType[] $values() {
        return new TipsType[]{TEXT, BUTTON};
    }

    static {
        TipsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TipsType(String str, int i11) {
    }

    @NotNull
    public static a<TipsType> getEntries() {
        return $ENTRIES;
    }

    public static TipsType valueOf(String str) {
        return (TipsType) Enum.valueOf(TipsType.class, str);
    }

    public static TipsType[] values() {
        return (TipsType[]) $VALUES.clone();
    }
}
