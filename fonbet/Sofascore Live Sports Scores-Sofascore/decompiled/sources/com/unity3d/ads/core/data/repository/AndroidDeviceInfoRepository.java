package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z88;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u000eJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010$R\u0014\u0010>\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0014\u0010@\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00105R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010$R\u0014\u0010H\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010$R\u0014\u0010J\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010$R\u0014\u0010L\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010$R\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "staticDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "dynamicDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "privacyDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "(Lrq3;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "", "getIdfi", "getAuidString", "Lcom/google/protobuf/ByteString;", "getAuidByteString", "getUnityBuildGuid", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lf1d;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPii", "Lf1d;", "getAllowedPii", "()Lf1d;", "analyticsUserId", "Ljava/lang/String;", "getAnalyticsUserId", "()Ljava/lang/String;", "Lz88;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "volumeSettingsChange", "Lz88;", "getVolumeSettingsChange", "()Lz88;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiData", "", "getRingerMode", "()I", "ringerMode", "", "getSystemBootTime", "()J", "systemBootTime", "getOrientation", U3.i.n, "getConnectionTypeStr", "connectionTypeStr", "getCurrentUiTheme", "currentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "localeList", "getAppName", "appName", "getModel", L6.B, "getManufacturer", "manufacturer", "getOsVersion", "osVersion", "", "getHasInternet", "()Z", "hasInternet", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {

    @NotNull
    private final f1d allowedPii;

    @Nullable
    private final String analyticsUserId;

    @NotNull
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;

    @NotNull
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;

    @NotNull
    private final z88 volumeSettingsChange;

    public AndroidDeviceInfoRepository(@NotNull StaticDeviceInfoDataSource staticDeviceInfoDataSource, @NotNull DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, @NotNull PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, @NotNull SessionRepository sessionRepository) {
        staticDeviceInfoDataSource.getClass();
        dynamicDeviceInfoDataSource.getClass();
        privacyDeviceInfoDataSource.getClass();
        sessionRepository.getClass();
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sessionRepository = sessionRepository;
        this.allowedPii = gdi.a(AllowedPiiOuterClass.AllowedPii.getDefaultInstance());
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public f1d getAllowedPii() {
        return this.allowedPii;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuidByteString(@NotNull rq3<? super ByteString> rq3Var) {
        AndroidDeviceInfoRepository$getAuidByteString$1 androidDeviceInfoRepository$getAuidByteString$1;
        int i;
        String str;
        if (rq3Var instanceof AndroidDeviceInfoRepository$getAuidByteString$1) {
            androidDeviceInfoRepository$getAuidByteString$1 = (AndroidDeviceInfoRepository$getAuidByteString$1) rq3Var;
            int i2 = androidDeviceInfoRepository$getAuidByteString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDeviceInfoRepository$getAuidByteString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidDeviceInfoRepository$getAuidByteString$1.result;
                Object obj2 = lu3.a;
                i = androidDeviceInfoRepository$getAuidByteString$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    androidDeviceInfoRepository$getAuidByteString$1.label = 1;
                    obj = getAuidString(androidDeviceInfoRepository$getAuidByteString$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                try {
                    UUID fromString = UUID.fromString(str);
                    fromString.getClass();
                    return ProtobufExtensionsKt.toByteString(fromString);
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        androidDeviceInfoRepository$getAuidByteString$1 = new AndroidDeviceInfoRepository$getAuidByteString$1(this, rq3Var);
        Object obj3 = androidDeviceInfoRepository$getAuidByteString$1.result;
        Object obj22 = lu3.a;
        i = androidDeviceInfoRepository$getAuidByteString$1.label;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object getAuidString(@NotNull rq3<? super String> rq3Var) {
        return this.staticDeviceInfoDataSource.getAuid(rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object getIdfi(@NotNull rq3<? super String> rq3Var) {
        return this.staticDeviceInfoDataSource.getIdfi(rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public List<String> getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch((AllowedPiiOuterClass.AllowedPii) ((fdi) getAllowedPii()).getValue());
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
    @Nullable
    public Object getUnityBuildGuid(@NotNull rq3<? super String> rq3Var) {
        return this.staticDeviceInfoDataSource.getUnityBuildGuid(rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public z88 getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object staticDeviceInfo(@NotNull rq3<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> rq3Var) {
        StaticDeviceInfoDataSource staticDeviceInfoDataSource = this.staticDeviceInfoDataSource;
        List<String> additionalStorePackagesList = this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList();
        additionalStorePackagesList.getClass();
        return staticDeviceInfoDataSource.fetch(additionalStorePackagesList, rq3Var);
    }
}
