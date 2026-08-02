package ru.ozon.app.android.mapcommon.ozongeoproxyclient;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferencesImpl;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGeoProviderHold", "()Z", "isHold", "", "changeGeoProviderHolding", "(Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "LSc/j;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "Companion", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapPreferencesImpl implements MapPreferences {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferencesImpl$Companion;", "", "<init>", "()V", "MAP_PREFERENCES", "", "HOLD_GEO_PROVIDER", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapPreferencesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = k.b(new MapPreferencesImpl$preferences$2(context));
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) this.preferences.getValue();
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences
    public void changeGeoProviderHolding(boolean isHold) {
        getPreferences().edit().putBoolean("hold_geo_provider", isHold).apply();
    }

    @Override // ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences
    public boolean isGeoProviderHold() {
        return getPreferences().getBoolean("hold_geo_provider", false);
    }
}
