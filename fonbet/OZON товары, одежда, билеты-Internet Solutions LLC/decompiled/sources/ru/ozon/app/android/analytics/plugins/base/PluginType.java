package ru.ozon.app.android.analytics.plugins.base;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/analytics/plugins/base/PluginType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "APPSFLYER", "OZONTRACKER", "toString", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PluginType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PluginType[] $VALUES;
    public static final PluginType APPSFLYER = new PluginType("APPSFLYER", 0, "APPSFLYER");
    public static final PluginType OZONTRACKER = new PluginType("OZONTRACKER", 1, "OzonTracker");

    @NotNull
    private final String value;

    private static final /* synthetic */ PluginType[] $values() {
        return new PluginType[]{APPSFLYER, OZONTRACKER};
    }

    static {
        PluginType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PluginType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static PluginType valueOf(String str) {
        return (PluginType) Enum.valueOf(PluginType.class, str);
    }

    public static PluginType[] values() {
        return (PluginType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}
