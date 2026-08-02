package com.unity3d.ads.core.data.datasource;

import defpackage.rq3;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "", "", "", "additionalStores", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "(Ljava/util/List;Lrq3;)Ljava/lang/Object;", "fetchCached", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getIdfi", "(Lrq3;)Ljava/lang/Object;", "getAuid", "getUnityBuildGuid", "", "getSystemBootTime", "()J", "getAppName", "()Ljava/lang/String;", "getModel", "getManufacturer", "getOsVersion", "getAnalyticsUserId", "analyticsUserId", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StaticDeviceInfoDataSource {
    @Nullable
    Object fetch(@NotNull List<String> list, @NotNull rq3<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> rq3Var);

    @NotNull
    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    @Nullable
    String getAnalyticsUserId();

    @NotNull
    String getAppName();

    @Nullable
    Object getAuid(@NotNull rq3<? super String> rq3Var);

    @Nullable
    Object getIdfi(@NotNull rq3<? super String> rq3Var);

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOsVersion();

    long getSystemBootTime();

    @Nullable
    Object getUnityBuildGuid(@NotNull rq3<? super String> rq3Var);
}
