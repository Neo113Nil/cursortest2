package androidx.compose.material;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/BackdropLayers;", "", "<init>", "(Ljava/lang/String;I)V", ApiConstant.MODULE_TYPE_BACK, ApiConstant.MODULE_TYPE_FRONT, "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropLayers {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackdropLayers[] $VALUES;
    public static final BackdropLayers Back = new BackdropLayers(ApiConstant.MODULE_TYPE_BACK, 0);
    public static final BackdropLayers Front = new BackdropLayers(ApiConstant.MODULE_TYPE_FRONT, 1);

    private static final /* synthetic */ BackdropLayers[] $values() {
        return new BackdropLayers[]{Back, Front};
    }

    public static EnumEntries<BackdropLayers> getEntries() {
        return $ENTRIES;
    }

    private BackdropLayers(String str, int i) {
    }

    static {
        BackdropLayers[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) $VALUES.clone();
    }
}
