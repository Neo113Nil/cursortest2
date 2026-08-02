package ru.ozon.mapsdk.common.geoproxy.model;

import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "", "mode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMode", "()Ljava/lang/String;", "PICKUP", "COURIER", "NONE", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActualBXTab {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActualBXTab[] $VALUES;

    @NotNull
    private final String mode;
    public static final ActualBXTab PICKUP = new ActualBXTab("PICKUP", 0, "pickup");
    public static final ActualBXTab COURIER = new ActualBXTab("COURIER", 1, "courier");
    public static final ActualBXTab NONE = new ActualBXTab("NONE", 2, DevicePublicKeyStringDef.NONE);

    private static final /* synthetic */ ActualBXTab[] $values() {
        return new ActualBXTab[]{PICKUP, COURIER, NONE};
    }

    static {
        ActualBXTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActualBXTab(String str, int i11, String str2) {
        this.mode = str2;
    }

    @NotNull
    public static a<ActualBXTab> getEntries() {
        return $ENTRIES;
    }

    public static ActualBXTab valueOf(String str) {
        return (ActualBXTab) Enum.valueOf(ActualBXTab.class, str);
    }

    public static ActualBXTab[] values() {
        return (ActualBXTab[]) $VALUES.clone();
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }
}
