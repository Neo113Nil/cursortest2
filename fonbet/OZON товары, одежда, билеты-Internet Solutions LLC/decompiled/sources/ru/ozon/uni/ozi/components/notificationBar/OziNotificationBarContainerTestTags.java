package ru.ozon.uni.ozi.components.notificationBar;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarContainerTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarContainerTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNotificationBarContainerTestTags[] $VALUES;
    public static final OziNotificationBarContainerTestTags Container = new OziNotificationBarContainerTestTags("Container", 0);

    private static final /* synthetic */ OziNotificationBarContainerTestTags[] $values() {
        return new OziNotificationBarContainerTestTags[]{Container};
    }

    static {
        OziNotificationBarContainerTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNotificationBarContainerTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziNotificationBarContainerTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziNotificationBarContainerTestTags valueOf(String str) {
        return (OziNotificationBarContainerTestTags) Enum.valueOf(OziNotificationBarContainerTestTags.class, str);
    }

    public static OziNotificationBarContainerTestTags[] values() {
        return (OziNotificationBarContainerTestTags[]) $VALUES.clone();
    }
}
