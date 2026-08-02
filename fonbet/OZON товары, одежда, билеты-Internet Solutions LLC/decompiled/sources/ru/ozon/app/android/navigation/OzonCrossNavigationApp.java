package ru.ozon.app.android.navigation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/navigation/OzonCrossNavigationApp;", "", "", "appName", "prodPackage", "qaPackage", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "getProdPackage", "getQaPackage", "SELECT_APP", "BX_APP", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonCrossNavigationApp {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OzonCrossNavigationApp[] $VALUES;

    @NotNull
    private final String appName;

    @NotNull
    private final String prodPackage;

    @NotNull
    private final String qaPackage;
    public static final OzonCrossNavigationApp SELECT_APP = new OzonCrossNavigationApp("SELECT_APP", 0, "select", "ru.ozon.select", "ru.ozon.select.qa");
    public static final OzonCrossNavigationApp BX_APP = new OzonCrossNavigationApp("BX_APP", 1, "bx", "ru.ozon.app.android", "ru.ozon.app.android.qa");

    private static final /* synthetic */ OzonCrossNavigationApp[] $values() {
        return new OzonCrossNavigationApp[]{SELECT_APP, BX_APP};
    }

    static {
        OzonCrossNavigationApp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OzonCrossNavigationApp(String str, int i11, String str2, String str3, String str4) {
        this.appName = str2;
        this.prodPackage = str3;
        this.qaPackage = str4;
    }

    public static OzonCrossNavigationApp valueOf(String str) {
        return (OzonCrossNavigationApp) Enum.valueOf(OzonCrossNavigationApp.class, str);
    }

    public static OzonCrossNavigationApp[] values() {
        return (OzonCrossNavigationApp[]) $VALUES.clone();
    }

    @NotNull
    public final String getProdPackage() {
        return this.prodPackage;
    }

    @NotNull
    public final String getQaPackage() {
        return this.qaPackage;
    }
}
