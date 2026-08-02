package ai.verisoul.sdk.helpers.settings;

import ai.verisoul.sdk.logger.Logger;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\bH\u0002J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/helpers/settings/SettingsHelperImpl;", "Lai/verisoul/sdk/helpers/settings/SettingsHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultFloatValue", "", "defaultIntValue", "", "logTag", "", "collect", "Lai/verisoul/sdk/helpers/settings/SettingsData;", "getDataRoamingData", "getNetworkRoaming", "", "()Ljava/lang/Boolean;", "getProxySettings", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingsHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsHelperImpl.kt\nai/verisoul/sdk/helpers/settings/SettingsHelperImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsHelperImpl implements SettingsHelper {

    @NotNull
    private final Context context;
    private final float defaultFloatValue;
    private final int defaultIntValue;

    @NotNull
    private final String logTag;

    public SettingsHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + SettingsHelperImpl.class.getSimpleName() + "]";
        this.defaultIntValue = -1;
        this.defaultFloatValue = -1.0f;
    }

    private final int getDataRoamingData() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "data_roaming", this.defaultIntValue);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                Logger.INSTANCE.error(this.logTag, message);
            }
            return this.defaultIntValue;
        }
    }

    private final Boolean getNetworkRoaming() {
        try {
            Object systemService = this.context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return Boolean.valueOf(((TelephonyManager) systemService).isNetworkRoaming());
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                return null;
            }
            Logger.INSTANCE.error(this.logTag, message);
            return null;
        }
    }

    private final String getProxySettings(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ProxyInfo defaultProxy = ((ConnectivityManager) systemService).getDefaultProxy();
            if (defaultProxy == null) {
                return "No Proxy Set";
            }
            String str = "Host: " + defaultProxy.getHost() + ", Port: " + defaultProxy.getPort();
            return str == null ? "No Proxy Set" : str;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                Logger.INSTANCE.error(this.logTag, message);
            }
            e10.getMessage();
            return null;
        }
    }

    @Override // ai.verisoul.sdk.helpers.settings.SettingsHelper
    @SuppressLint({"HardwareIds"})
    @NotNull
    public SettingsData collect() {
        long currentTimeMillis = System.currentTimeMillis();
        String proxySettings = getProxySettings(this.context);
        getNetworkRoaming();
        SettingsGlobalData settingsGlobalData = new SettingsGlobalData(Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", this.defaultIntValue), Settings.Global.getInt(this.context.getContentResolver(), "auto_time", this.defaultIntValue), Settings.Global.getInt(this.context.getContentResolver(), "auto_time_zone", this.defaultIntValue), Settings.Global.getInt(this.context.getContentResolver(), "bluetooth_on", this.defaultIntValue), Settings.Global.getInt(this.context.getContentResolver(), "boot_count", this.defaultIntValue), getDataRoamingData(), Settings.Global.getInt(this.context.getContentResolver(), "development_settings_enabled", this.defaultIntValue), proxySettings, Settings.Global.getFloat(this.context.getContentResolver(), "transition_animation_scale", this.defaultFloatValue), Settings.Global.getFloat(this.context.getContentResolver(), "window_animation_scale", this.defaultFloatValue), getNetworkRoaming());
        int i10 = Build.VERSION.SDK_INT >= 28 ? Settings.Secure.getInt(this.context.getContentResolver(), "rtt_calling_mode", this.defaultIntValue) : this.defaultIntValue;
        int i11 = Settings.Secure.getInt(this.context.getContentResolver(), "accessibility_enabled", this.defaultIntValue);
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = Settings.Secure.getString(this.context.getContentResolver(), "default_input_method");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SettingsSecureData settingsSecureData = new SettingsSecureData(i11, string, string2, i10, Settings.Secure.getInt(this.context.getContentResolver(), "touch_exploration_enabled", this.defaultIntValue));
        Logger.INSTANCE.metricLog(this.logTag, "settings_duration", System.currentTimeMillis() - currentTimeMillis);
        return new SettingsData(settingsGlobalData, settingsSecureData);
    }
}
