package ru.ozon.app.android.storefront.navBar;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import ru.ozon.uni.R$attr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarPlaceholderColors;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BACKGROUND_PRIMARY", "COLOR_PRIMARY", "BACKGROUND_SECONDARY", "COLOR_SECONDARY", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBarPlaceholderColors {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavBarPlaceholderColors[] $VALUES;
    private final int value;
    public static final NavBarPlaceholderColors BACKGROUND_PRIMARY = new NavBarPlaceholderColors("BACKGROUND_PRIMARY", 0, R$attr.bgLightKey);
    public static final NavBarPlaceholderColors COLOR_PRIMARY = new NavBarPlaceholderColors("COLOR_PRIMARY", 1, R$attr.graphicTertiaryOnLight);
    public static final NavBarPlaceholderColors BACKGROUND_SECONDARY = new NavBarPlaceholderColors("BACKGROUND_SECONDARY", 2, R$attr.bgPrimary);
    public static final NavBarPlaceholderColors COLOR_SECONDARY = new NavBarPlaceholderColors("COLOR_SECONDARY", 3, R$attr.graphicTertiary);

    private static final /* synthetic */ NavBarPlaceholderColors[] $values() {
        return new NavBarPlaceholderColors[]{BACKGROUND_PRIMARY, COLOR_PRIMARY, BACKGROUND_SECONDARY, COLOR_SECONDARY};
    }

    static {
        NavBarPlaceholderColors[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private NavBarPlaceholderColors(String str, int i11, int i12) {
        this.value = i12;
    }

    public static NavBarPlaceholderColors valueOf(String str) {
        return (NavBarPlaceholderColors) Enum.valueOf(NavBarPlaceholderColors.class, str);
    }

    public static NavBarPlaceholderColors[] values() {
        return (NavBarPlaceholderColors[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
