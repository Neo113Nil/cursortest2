package com.unity3d.ads.core.data.datasource;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import defpackage.joa;
import defpackage.ypa;
import defpackage.z0;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001d\u0010\r\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "", "invoke", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/log/Logger;", "cachedVersion$delegate", "Ljoa;", "getCachedVersion", "cachedVersion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {

    /* renamed from: cachedVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa cachedVersion;

    @NotNull
    private final Logger logger;

    public AndroidAdQualityVersionDataSource(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.cachedVersion = ypa.b(new z0(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion == null) {
                return null;
            }
            if (StringsKt.R(sDKVersion)) {
                return null;
            }
            return sDKVersion;
        } catch (ClassNotFoundException e) {
            androidAdQualityVersionDataSource.logger.debug(new z0(e, 5));
            return null;
        } catch (NoClassDefFoundError e2) {
            androidAdQualityVersionDataSource.logger.debug(new z0(e2, 4));
            return null;
        } catch (NoSuchMethodError e3) {
            androidAdQualityVersionDataSource.logger.debug(new z0(e3, 6));
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
        return (String) this.cachedVersion.getValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    @Nullable
    public String invoke() {
        return getCachedVersion();
    }
}
