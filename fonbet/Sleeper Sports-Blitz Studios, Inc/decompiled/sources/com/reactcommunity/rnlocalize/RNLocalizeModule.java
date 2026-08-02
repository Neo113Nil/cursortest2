package com.reactcommunity.rnlocalize;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.core.text.util.LocalePreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ReactModule(name = RNLocalizeModule.MODULE_NAME)
/* loaded from: classes8.dex */
public class RNLocalizeModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String MODULE_NAME = "RNLocalize";
    private final List<String> USES_FAHRENHEIT;
    private final List<String> USES_IMPERIAL;
    private final List<String> USES_RTL_LAYOUT;
    private boolean emitChangeOnResume;
    private boolean mainActivityVisible;

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    public RNLocalizeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.USES_FAHRENHEIT = Arrays.asList("BS", "BZ", "KY", "PR", "PW", "US");
        this.USES_IMPERIAL = Arrays.asList("LR", "MM", "US");
        this.USES_RTL_LAYOUT = Arrays.asList("ar", "ckb", "fa", "he", "ks", "lrc", "mzn", "ps", "ug", "ur", "yi");
        this.mainActivityVisible = true;
        this.emitChangeOnResume = false;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.reactcommunity.rnlocalize.RNLocalizeModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction() != null) {
                    RNLocalizeModule.this.onLocalizationDidChange();
                }
            }
        };
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialConstants", getExportedConstants());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocalizationDidChange() {
        if (this.mainActivityVisible) {
            emitLocalizationDidChange();
        } else {
            this.emitChangeOnResume = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mainActivityVisible = true;
        if (this.emitChangeOnResume) {
            emitLocalizationDidChange();
            this.emitChangeOnResume = false;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mainActivityVisible = false;
    }

    private void emitLocalizationDidChange() {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("localizationDidChange", getExportedConstants());
        }
    }

    @Nonnull
    private List<Locale> getLocales() {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = getReactApplicationContext().getResources().getConfiguration().getLocales();
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(locales.get(i));
        }
        return arrayList;
    }

    @Nonnull
    private String getLanguageCode(@Nonnull Locale locale) {
        String language;
        language = locale.getLanguage();
        language.hashCode();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            default:
                return language;
        }
    }

    @Nonnull
    private String getScriptCode(@Nonnull Locale locale) {
        String script = locale.getScript();
        return TextUtils.isEmpty(script) ? "" : script;
    }

    @Nonnull
    private String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return "";
        }
    }

    @Nonnull
    private String getCountryCode(@Nonnull Locale locale) {
        try {
            String country = locale.getCountry();
            if (country.equals("419")) {
                return "UN";
            }
            return TextUtils.isEmpty(country) ? "" : country;
        } catch (Exception unused) {
            return "";
        }
    }

    @Nonnull
    private String getRegionCode(@Nonnull Locale locale) {
        String systemProperty = getSystemProperty("ro.miui.region");
        return !TextUtils.isEmpty(systemProperty) ? systemProperty : getCountryCode(locale);
    }

    @Nonnull
    private String getCurrencyCode(@Nonnull Locale locale) {
        try {
            Currency currency = Currency.getInstance(locale);
            if (currency == null) {
                return "";
            }
            return currency.getCurrencyCode();
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean getIsRTL(@Nonnull Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    @Nonnull
    private String createLanguageTag(@Nonnull String str, @Nonnull String str2, @Nonnull String str3) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "-" + str2;
        }
        return str + "-" + str3;
    }

    @Nonnull
    private WritableMap getNumberFormatSettings(@Nonnull Locale locale) {
        WritableMap createMap = Arguments.createMap();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        createMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        createMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        return createMap;
    }

    private boolean getUsesAutoDateAndTime() {
        return Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "auto_time", 0) != 0;
    }

    private boolean getUsesAutoTimeZone() {
        return Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "auto_time_zone", 0) != 0;
    }

    @Nonnull
    private WritableMap getExportedConstants() {
        List<Locale> locales = getLocales();
        Locale locale = locales.get(0);
        String regionCode = getRegionCode(locale);
        if (TextUtils.isEmpty(regionCode)) {
            regionCode = "US";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        for (Locale locale2 : locales) {
            String languageCode = getLanguageCode(locale2);
            String scriptCode = getScriptCode(locale2);
            String countryCode = getCountryCode(locale2);
            String currencyCode = getCurrencyCode(locale2);
            if (TextUtils.isEmpty(countryCode)) {
                countryCode = regionCode;
            }
            String createLanguageTag = createLanguageTag(languageCode, scriptCode, countryCode);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, languageCode);
            createMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, countryCode);
            createMap.putString("languageTag", createLanguageTag);
            createMap.putBoolean("isRTL", getIsRTL(locale2));
            if (!TextUtils.isEmpty(scriptCode)) {
                createMap.putString("scriptCode", scriptCode);
            }
            if (!arrayList.contains(createLanguageTag)) {
                arrayList.add(createLanguageTag);
                createArray.pushMap(createMap);
            }
            if (!TextUtils.isEmpty(currencyCode) && !arrayList2.contains(currencyCode)) {
                arrayList2.add(currencyCode);
                createArray2.pushString(currencyCode);
            }
        }
        if (createArray2.size() == 0) {
            createArray2.pushString("USD");
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("calendar", LocalePreferences.CalendarType.GREGORIAN);
        createMap2.putString("country", regionCode);
        createMap2.putArray("currencies", createArray2);
        createMap2.putArray("locales", createArray);
        createMap2.putMap("numberFormatSettings", getNumberFormatSettings(locale));
        createMap2.putString("temperatureUnit", this.USES_FAHRENHEIT.contains(regionCode) ? "fahrenheit" : LocalePreferences.TemperatureUnit.CELSIUS);
        createMap2.putString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
        createMap2.putBoolean("uses24HourClock", DateFormat.is24HourFormat(getReactApplicationContext()));
        createMap2.putBoolean("usesAutoDateAndTime", getUsesAutoDateAndTime());
        createMap2.putBoolean("usesAutoTimeZone", getUsesAutoTimeZone());
        createMap2.putBoolean("usesMetricSystem", !this.USES_IMPERIAL.contains(regionCode));
        return createMap2;
    }
}
