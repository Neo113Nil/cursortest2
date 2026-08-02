package com.unity3d.ads.core.data.datasource;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import kotlin.Lazy;
import xsna.ac;
import xsna.bpn0;
import xsna.drm0;
import xsna.f5;
import xsna.g5;

/* compiled from: AndroidAdQualityVersionDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {
    private final Lazy cachedVersion$delegate = new bpn0(new g5(this, 3));
    private final Logger logger;

    public AndroidAdQualityVersionDataSource(Logger logger) {
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion == null) {
                return null;
            }
            if (drm0.N(sDKVersion)) {
                return null;
            }
            return sDKVersion;
        } catch (ClassNotFoundException e) {
            androidAdQualityVersionDataSource.logger.debug(new ac(e, 5));
            return null;
        } catch (NoClassDefFoundError e2) {
            androidAdQualityVersionDataSource.logger.debug(new com.vk.movika.sdk.android.defaultplayer.interactive.a(e2, 3));
            return null;
        } catch (NoSuchMethodError e3) {
            androidAdQualityVersionDataSource.logger.debug(new f5(e3, 5));
            return null;
        } catch (Throwable th) {
            androidAdQualityVersionDataSource.logger.error("Failed to get Ad Quality version", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$1(NoClassDefFoundError noClassDefFoundError) {
        return "Ad Quality SDK not available: " + noClassDefFoundError.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$2(ClassNotFoundException classNotFoundException) {
        return "Ad Quality SDK not available: " + classNotFoundException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$3(NoSuchMethodError noSuchMethodError) {
        return "Ad Quality SDK not available: " + noSuchMethodError.getMessage();
    }

    private final String getCachedVersion() {
        return (String) this.cachedVersion$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    public String invoke() {
        return getCachedVersion();
    }
}
