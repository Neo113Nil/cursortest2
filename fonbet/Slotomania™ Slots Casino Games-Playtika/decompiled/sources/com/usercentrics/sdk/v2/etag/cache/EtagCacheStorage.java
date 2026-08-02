package com.usercentrics.sdk.v2.etag.cache;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.core.time.DateTime;
import com.usercentrics.sdk.errors.CacheException;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.etag.repository.EtagHolder;
import com.usercentrics.sdk.v2.file.IFileStorage;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EtagCacheStorage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/usercentrics/sdk/v2/etag/cache/EtagCacheStorage;", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "fileStorage", "Lcom/usercentrics/sdk/v2/file/IFileStorage;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "(Lcom/usercentrics/sdk/v2/file/IFileStorage;Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;)V", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "boot", "", "checkIfDirtyDirectoriesExist", "decodeEtagFileName", "etagFileName", "defaultEtagPath", "encodeEtagFileName", "etagValue", "etagDirFor", "key", "getRawEtagFileName", "getStoredFile", "offlineEtagPath", "removeOfflineStaging", "restoreOfflineStaging", "saveOfflineStaging", "storeFileAndEtag", "etagHolder", "Lcom/usercentrics/sdk/v2/etag/repository/EtagHolder;", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EtagCacheStorage implements IEtagCacheStorage {
    public static final String additionalConsentModeDir = "acp";
    public static final String aggregatorDir = "aggregator-";
    public static final String cacheControlSeparator = "@#$";
    private static final String eTagsDir = "etags";
    private static final String eTagsOfflineStagingDir = "etags-staging";
    private static final String etagLanguageParamSeparator = "-";
    public static final String languagesDir = "languages";
    public static final String ruleSetDir = "ruleSet";
    public static final String settingsDir = "settings-";
    public static final String tcfDeclarationsDir = "tcf-declarations-";
    public static final String tcfVendorListDir = "tcf-vendorlist";
    public static final String translationsDir = "translations-";
    private final Dispatcher dispatcher;
    private final IFileStorage fileStorage;
    private String identifier;

    public EtagCacheStorage(IFileStorage fileStorage, Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(fileStorage, "fileStorage");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.fileStorage = fileStorage;
        this.dispatcher = dispatcher;
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public void boot(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        checkIfDirtyDirectoriesExist();
    }

    private final void checkIfDirtyDirectoriesExist() {
        this.dispatcher.dispatch(new EtagCacheStorage$checkIfDirtyDirectoriesExist$1(this, null));
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public String getRawEtagFileName(String key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        List<String> ls = this.fileStorage.ls(etagDirFor(key));
        if (ls == null || (str = (String) CollectionsKt.firstOrNull((List) ls)) == null) {
            return null;
        }
        return decodeEtagFileName(str);
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public void storeFileAndEtag(EtagHolder etagHolder) {
        Intrinsics.checkNotNullParameter(etagHolder, "etagHolder");
        String etagDirFor = etagDirFor(etagHolder.getEtagKey());
        this.fileStorage.rmdir(etagDirFor);
        this.fileStorage.mkdir(etagDirFor);
        this.fileStorage.storeFile(etagDirFor + "/" + encodeEtagFileName(etagHolder.getEtagValue()) + cacheControlSeparator + new DateTime().addSeconds(etagHolder.getCacheMaxAge()).timestamp(), etagHolder.getResponseBody());
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public String getStoredFile(String key, String etagValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(etagValue, "etagValue");
        String file = this.fileStorage.getFile(etagDirFor(key) + "/" + encodeEtagFileName(etagValue));
        if (file != null) {
            return file;
        }
        throw new CacheException(key);
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public void saveOfflineStaging() {
        this.fileStorage.rmdir(offlineEtagPath());
        this.fileStorage.copy(defaultEtagPath(), offlineEtagPath());
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public void removeOfflineStaging() {
        this.fileStorage.rmdir(offlineEtagPath());
    }

    @Override // com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage
    public void restoreOfflineStaging() {
        this.fileStorage.rmdir(defaultEtagPath());
        this.fileStorage.copy(offlineEtagPath(), defaultEtagPath());
        this.fileStorage.rmdir(offlineEtagPath());
    }

    private final String etagDirFor(String key) {
        return defaultEtagPath() + "/" + key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String defaultEtagPath() {
        return "etags-" + this.identifier;
    }

    private final String offlineEtagPath() {
        return "etags-staging-" + this.identifier;
    }

    private final String encodeEtagFileName(String etagValue) {
        return StringsKt.replace$default(StringsKt.removeSurrounding(etagValue, (CharSequence) "\""), "/", "_", false, 4, (Object) null);
    }

    private final String decodeEtagFileName(String etagFileName) {
        return "\"" + etagFileName + "\"";
    }
}
