package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.ironsource.L6;
import com.ironsource.U3;
import defpackage.f1d;
import defpackage.rq3;
import defpackage.z88;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0014\u0010-\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0014\u0010/\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0014\u00107\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0014\u00109\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "(Lrq3;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "", "getIdfi", "getAuidString", "Lcom/google/protobuf/ByteString;", "getAuidByteString", "getUnityBuildGuid", "Lf1d;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lf1d;", "allowedPii", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiData", "Lz88;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lz88;", "volumeSettingsChange", "getAnalyticsUserId", "()Ljava/lang/String;", "analyticsUserId", "", "getRingerMode", "()I", "ringerMode", "", "getSystemBootTime", "()J", "systemBootTime", "getOrientation", U3.i.n, "getConnectionTypeStr", "connectionTypeStr", "getCurrentUiTheme", "currentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "localeList", "getAppName", "appName", "getModel", L6.B, "getManufacturer", "manufacturer", "getOsVersion", "osVersion", "", "getHasInternet", "()Z", "hasInternet", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeviceInfoRepository {
    @NotNull
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    @NotNull
    f1d getAllowedPii();

    @Nullable
    String getAnalyticsUserId();

    @NotNull
    String getAppName();

    @Nullable
    Object getAuidByteString(@NotNull rq3<? super ByteString> rq3Var);

    @Nullable
    Object getAuidString(@NotNull rq3<? super String> rq3Var);

    @NotNull
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    @Nullable
    Object getIdfi(@NotNull rq3<? super String> rq3Var);

    @NotNull
    List<String> getLocaleList();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOrientation();

    @NotNull
    String getOsVersion();

    @NotNull
    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    @Nullable
    Object getUnityBuildGuid(@NotNull rq3<? super String> rq3Var);

    @NotNull
    z88 getVolumeSettingsChange();

    @Nullable
    Object staticDeviceInfo(@NotNull rq3<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> rq3Var);
}
