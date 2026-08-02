package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.r0d;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidPrivacyDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "fIdDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "appSetIdDataSource", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;)V", "", "getAdvertisingTrackingId", "()Ljava/lang/String;", "getOpenAdvertisingTrackingId", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowed", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "fetch", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "Lf1d;", "", "idfaInitialized", "Lf1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {

    @NotNull
    private final AndroidAppSetIdDataSource appSetIdDataSource;

    @NotNull
    private final Context context;

    @NotNull
    private final FIdDataSource fIdDataSource;

    @NotNull
    private final f1d idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(@NotNull Context context, @NotNull FIdDataSource fIdDataSource, @NotNull AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        context.getClass();
        fIdDataSource.getClass();
        androidAppSetIdDataSource.getClass();
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = androidAppSetIdDataSource;
        this.idfaInitialized = gdi.a(Boolean.FALSE);
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    @NotNull
    public PiiOuterClass.Pii fetch(@NotNull AllowedPiiOuterClass.AllowedPii allowed) {
        String appSetId;
        String invoke;
        allowed.getClass();
        if (!((Boolean) ((fdi) this.idfaInitialized).getValue()).booleanValue()) {
            f1d f1dVar = this.idfaInitialized;
            Boolean bool = Boolean.TRUE;
            fdi fdiVar = (fdi) f1dVar;
            fdiVar.getClass();
            fdiVar.m(null, bool);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.INSTANCE;
        PiiOuterClass.Pii.Builder newBuilder = PiiOuterClass.Pii.newBuilder();
        newBuilder.getClass();
        final PiiKt.Dsl _create = companion._create(newBuilder);
        if (allowed.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID fromString = UUID.fromString(advertisingTrackingId);
                fromString.getClass();
                _create.setAdvertisingId(ProtobufExtensionsKt.toByteString(fromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID fromString2 = UUID.fromString(openAdvertisingTrackingId);
                fromString2.getClass();
                _create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(fromString2));
            }
        }
        if (allowed.getFid() && (invoke = this.fIdDataSource.invoke()) != null) {
            if (invoke.length() <= 0) {
                invoke = null;
            }
            if (invoke != null) {
                new r0d(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // kotlin.reflect.KProperty0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
                    }
                }.set(invoke);
            }
        }
        if (allowed.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new r0d(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$6
                    @Override // kotlin.reflect.KProperty0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getAppsetId();
                    }

                    @Override // kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setAppsetId((String) obj);
                    }
                }.set(str);
            }
        }
        return _create._build();
    }
}
