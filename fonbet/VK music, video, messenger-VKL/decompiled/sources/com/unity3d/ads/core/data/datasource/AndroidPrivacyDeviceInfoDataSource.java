package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import java.util.UUID;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: AndroidPrivacyDeviceInfoDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final Context context;
    private final FIdDataSource fIdDataSource;
    private final xh50<Boolean> idfaInitialized = vtk0.a(Boolean.FALSE);

    public AndroidPrivacyDeviceInfoDataSource(Context context, FIdDataSource fIdDataSource, AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = androidAppSetIdDataSource;
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
    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowedPii) {
        String appSetId;
        String invoke;
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        final PiiKt.Dsl _create = PiiKt.Dsl.Companion._create(PiiOuterClass.Pii.newBuilder());
        if (allowedPii.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                _create.setAdvertisingId(ProtobufExtensionsKt.toByteString(UUID.fromString(advertisingTrackingId)));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                _create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(UUID.fromString(openAdvertisingTrackingId)));
            }
        }
        if (allowedPii.getFid() && (invoke = this.fIdDataSource.invoke()) != null) {
            if (invoke.length() <= 0) {
                invoke = null;
            }
            if (invoke != null) {
                new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
                    }
                }.set(invoke);
            }
        }
        if (allowedPii.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$6
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getAppsetId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setAppsetId((String) obj);
                    }
                }.set(str);
            }
        }
        return _create._build();
    }
}
