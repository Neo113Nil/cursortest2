package ru.ozon.uni.ozi.components.notificationBar.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.R$drawable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarStatus;", "", "iconBackgroundImage", "", "<init>", "(Ljava/lang/String;II)V", "getIconBackgroundImage$uni_release", "()I", "Success", "Negative", "Warning", "Info", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNotificationBarStatus[] $VALUES;
    private final int iconBackgroundImage;
    public static final OziNotificationBarStatus Success = new OziNotificationBarStatus("Success", 0, R$drawable.ozi_img_success);
    public static final OziNotificationBarStatus Negative = new OziNotificationBarStatus("Negative", 1, R$drawable.ozi_img_negative);
    public static final OziNotificationBarStatus Warning = new OziNotificationBarStatus("Warning", 2, R$drawable.ozi_img_warning);
    public static final OziNotificationBarStatus Info = new OziNotificationBarStatus("Info", 3, R$drawable.ozi_img_info);

    private static final /* synthetic */ OziNotificationBarStatus[] $values() {
        return new OziNotificationBarStatus[]{Success, Negative, Warning, Info};
    }

    static {
        OziNotificationBarStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNotificationBarStatus(String str, int i11, int i12) {
        this.iconBackgroundImage = i12;
    }

    public static OziNotificationBarStatus valueOf(String str) {
        return (OziNotificationBarStatus) Enum.valueOf(OziNotificationBarStatus.class, str);
    }

    public static OziNotificationBarStatus[] values() {
        return (OziNotificationBarStatus[]) $VALUES.clone();
    }

    /* renamed from: getIconBackgroundImage$uni_release, reason: from getter */
    public final int getIconBackgroundImage() {
        return this.iconBackgroundImage;
    }
}
