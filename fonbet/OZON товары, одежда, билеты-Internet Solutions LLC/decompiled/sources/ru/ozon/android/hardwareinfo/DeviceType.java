package ru.ozon.android.hardwareinfo;

import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/android/hardwareinfo/DeviceType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MOBILE", "TABLET", "TV", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceType {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType MOBILE = new DeviceType("MOBILE", 0, "mobile");
    public static final DeviceType TABLET = new DeviceType("TABLET", 1, "tablet");

    /* renamed from: TV, reason: collision with root package name */
    public static final DeviceType f83814TV = new DeviceType("TV", 2, "tv");

    @NotNull
    private final String type;

    private static final /* synthetic */ DeviceType[] $values() {
        return new DeviceType[]{MOBILE, TABLET, f83814TV};
    }

    static {
        DeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DeviceType(String str, int i11, String str2) {
        this.type = str2;
    }

    @NotNull
    public static Xc.a<DeviceType> getEntries() {
        return $ENTRIES;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
