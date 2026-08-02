package androidx.compose.material;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Drawer.kt */
/* loaded from: classes11.dex */
public final class DrawerValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed;
    public static final DrawerValue Open;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        Closed = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        Open = drawerValue2;
        DrawerValue[] drawerValueArr = {drawerValue, drawerValue2};
        $VALUES = drawerValueArr;
        $ENTRIES = new asp(drawerValueArr);
    }

    public DrawerValue() {
        throw null;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}
