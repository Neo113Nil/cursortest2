package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import java.util.UUID;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.ksr;
import xsna.spj;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: AndroidDeviceInfoRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    private final xh50<AllowedPiiOuterClass.AllowedPii> allowedPii = vtk0.a(AllowedPiiOuterClass.AllowedPii.getDefaultInstance());
    private final String analyticsUserId;
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final SessionRepository sessionRepository;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final ksr<VolumeSettingsChange> volumeSettingsChange;

    public AndroidDeviceInfoRepository(StaticDeviceInfoDataSource staticDeviceInfoDataSource, DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, SessionRepository sessionRepository) {
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sessionRepository = sessionRepository;
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public xh50<AllowedPiiOuterClass.AllowedPii> getAllowedPii() {
        return this.allowedPii;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuidByteString(spj<? super ByteString> spjVar) {
        AndroidDeviceInfoRepository$getAuidByteString$1 androidDeviceInfoRepository$getAuidByteString$1;
        int i;
        String str;
        if (spjVar instanceof AndroidDeviceInfoRepository$getAuidByteString$1) {
            androidDeviceInfoRepository$getAuidByteString$1 = (AndroidDeviceInfoRepository$getAuidByteString$1) spjVar;
            int i2 = androidDeviceInfoRepository$getAuidByteString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDeviceInfoRepository$getAuidByteString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidDeviceInfoRepository$getAuidByteString$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidDeviceInfoRepository$getAuidByteString$1.label;
                if (i != 0) {
                    a.a(obj);
                    androidDeviceInfoRepository$getAuidByteString$1.label = 1;
                    obj = getAuidString(androidDeviceInfoRepository$getAuidByteString$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                try {
                    return ProtobufExtensionsKt.toByteString(UUID.fromString(str));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        androidDeviceInfoRepository$getAuidByteString$1 = new AndroidDeviceInfoRepository$getAuidByteString$1(this, spjVar);
        Object obj3 = androidDeviceInfoRepository$getAuidByteString$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidDeviceInfoRepository$getAuidByteString$1.label;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getAuidString(spj<? super String> spjVar) {
        return this.staticDeviceInfoDataSource.getAuid(spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getIdfi(spj<? super String> spjVar) {
        return this.staticDeviceInfoDataSource.getIdfi(spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public List<String> getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch(getAllowedPii().getValue());
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getSystemBootTime() {
        return this.staticDeviceInfoDataSource.getSystemBootTime();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getUnityBuildGuid(spj<? super String> spjVar) {
        return this.staticDeviceInfoDataSource.getUnityBuildGuid(spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public ksr<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object staticDeviceInfo(spj<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> spjVar) {
        return this.staticDeviceInfoDataSource.fetch(this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList(), spjVar);
    }
}
