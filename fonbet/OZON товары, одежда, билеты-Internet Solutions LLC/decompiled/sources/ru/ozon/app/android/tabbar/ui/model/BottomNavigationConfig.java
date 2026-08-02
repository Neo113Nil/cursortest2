package ru.ozon.app.android.tabbar.ui.model;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "", "height", "", "backgroundColor", "showIsland", "", "inactiveTextColorToken", "", "hapticEnabled", "<init>", "(Ljava/lang/String;IIIZLjava/lang/String;Z)V", "getHeight", "()I", "getBackgroundColor", "getShowIsland", "()Z", "getInactiveTextColorToken", "()Ljava/lang/String;", "getHapticEnabled", "DEFAULT", "TEENS", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomNavigationConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BottomNavigationConfig[] $VALUES;
    public static final BottomNavigationConfig DEFAULT = new BottomNavigationConfig("DEFAULT", 0, ResourceExtKt.toPx(49), R$attr.layerFloor1, false, null, false);
    public static final BottomNavigationConfig TEENS = new BottomNavigationConfig("TEENS", 1, ResourceExtKt.toPx(89), R$attr.bgDarkKey, true, UniColors.TEXT_SECONDARY_ON_DARK.getToken(), true);
    private final int backgroundColor;
    private final boolean hapticEnabled;
    private final int height;
    private final String inactiveTextColorToken;
    private final boolean showIsland;

    private static final /* synthetic */ BottomNavigationConfig[] $values() {
        return new BottomNavigationConfig[]{DEFAULT, TEENS};
    }

    static {
        BottomNavigationConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BottomNavigationConfig(String str, int i11, int i12, int i13, boolean z11, String str2, boolean z12) {
        this.height = i12;
        this.backgroundColor = i13;
        this.showIsland = z11;
        this.inactiveTextColorToken = str2;
        this.hapticEnabled = z12;
    }

    public static BottomNavigationConfig valueOf(String str) {
        return (BottomNavigationConfig) Enum.valueOf(BottomNavigationConfig.class, str);
    }

    public static BottomNavigationConfig[] values() {
        return (BottomNavigationConfig[]) $VALUES.clone();
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getInactiveTextColorToken() {
        return this.inactiveTextColorToken;
    }

    public final boolean getShowIsland() {
        return this.showIsland;
    }
}
