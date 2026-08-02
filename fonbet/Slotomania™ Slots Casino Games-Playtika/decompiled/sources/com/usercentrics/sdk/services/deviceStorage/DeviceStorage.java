package com.usercentrics.sdk.services.deviceStorage;

import com.usercentrics.ccpa.CCPAStorage;
import com.usercentrics.sdk.models.common.UserSessionDataConsent;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBuffer;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: DeviceStorage.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0007H&J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u001bJ\b\u0010 \u001a\u00020\u0007H&J\b\u0010!\u001a\u00020\u0007H&J\b\u0010\"\u001a\u00020\u0007H&J\b\u0010#\u001a\u00020\nH&J\b\u0010$\u001a\u00020%H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0018H&J\b\u0010(\u001a\u00020\u0003H&J\u000f\u0010)\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u001bJ\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0007H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0007H&J\u001e\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0018H&J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\nH&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0005H&J\u0010\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u001dH&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0005H&J\u001c\u0010=\u001a\u00020\u00032\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010?H&J\b\u0010@\u001a\u00020AH&¨\u0006B"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", "", "addSessionToBuffer", "", "currentTime", "", "settingsId", "", "bootSettings", "bootTCFData", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;", "clear", "clearTCFStorageEntries", "clearUserActionRequired", "deleteSettingsThatDoNotMatch", "settingsIds", "", "fetchCcpaString", "fetchSettings", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;", "getABTestingVariant", "getACString", "getActualTCFSettingsId", "getAndEraseSessionBuffer", "", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;", "getCcpaTimestampInMillis", "()Ljava/lang/Long;", "getConsentBuffer", "Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;", "getControllerId", "getSessionTimestamp", "getSettingsId", "getSettingsLanguage", "getSettingsVersion", "getTCFData", "getUserActionRequired", "", "getUserSessionDataConsents", "Lcom/usercentrics/sdk/models/common/UserSessionDataConsent;", "init", "lastInteractionTimestamp", "saveABTestingVariant", "variant", "saveACString", "acString", "saveActualTCFSettingsId", "actualSettingsId", "saveSettings", "settings", "Lcom/usercentrics/sdk/models/settings/LegacyExtendedSettings;", "services", "Lcom/usercentrics/sdk/models/settings/LegacyService;", "saveTCFData", "tcfData", "setCcpaTimestampInMillis", "timestampInMillis", "setConsentBuffer", "buffer", "setSessionTimestamp", "sessionTimestamp", "storeValuesDefaultStorage", "values", "", "toCcpaStorage", "Lcom/usercentrics/ccpa/CCPAStorage;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeviceStorage {
    void addSessionToBuffer(long currentTime, String settingsId);

    void bootSettings(String settingsId);

    StorageTCF bootTCFData(String settingsId);

    void clear();

    void clearTCFStorageEntries();

    void clearUserActionRequired();

    void deleteSettingsThatDoNotMatch(Set<String> settingsIds);

    String fetchCcpaString();

    StorageSettings fetchSettings();

    String getABTestingVariant();

    String getACString();

    String getActualTCFSettingsId();

    List<StorageSessionEntry> getAndEraseSessionBuffer();

    Long getCcpaTimestampInMillis();

    ConsentsBuffer getConsentBuffer();

    String getControllerId();

    Long getSessionTimestamp();

    String getSettingsId();

    String getSettingsLanguage();

    String getSettingsVersion();

    StorageTCF getTCFData();

    boolean getUserActionRequired();

    List<UserSessionDataConsent> getUserSessionDataConsents();

    void init();

    Long lastInteractionTimestamp();

    void saveABTestingVariant(String variant);

    void saveACString(String acString);

    void saveActualTCFSettingsId(String actualSettingsId);

    void saveSettings(LegacyExtendedSettings settings, List<LegacyService> services);

    void saveTCFData(StorageTCF tcfData);

    void setCcpaTimestampInMillis(long timestampInMillis);

    void setConsentBuffer(ConsentsBuffer buffer);

    void setSessionTimestamp(long sessionTimestamp);

    void storeValuesDefaultStorage(Map<String, ? extends Object> values);

    CCPAStorage toCcpaStorage();
}
