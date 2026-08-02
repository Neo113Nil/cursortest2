package com.surt.guardian.core;

import Ac.c;
import W9.d;
import X9.m;
import c.K;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import com.surt.guardian.utils.Logger;
import i3.C4527h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\b\n\u0002\b?\b\u0080\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0001NB\u0093\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0010\u00103\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0010\u00105\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0010\u00107\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0010\u00108\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b9\u0010%J\u0010\u0010:\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b<\u0010%J\u0010\u0010=\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b=\u0010%J\u0010\u0010>\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b>\u0010%J\u0010\u0010?\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b?\u0010%J\u0010\u0010@\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bD\u0010%J\u009c\u0002\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bG\u0010#J\u0010\u0010I\u001a\u00020HHÖ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010L\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bR\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\bV\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010%R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b_\u0010%R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b`\u0010X\u001a\u0004\ba\u0010%R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010%R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010%R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bf\u0010X\u001a\u0004\bg\u0010%R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bi\u0010%R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bj\u0010X\u001a\u0004\bk\u0010%R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bl\u0010X\u001a\u0004\bm\u0010%R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bn\u0010X\u001a\u0004\bo\u0010%R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bp\u0010X\u001a\u0004\bq\u0010%R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\br\u0010X\u001a\u0004\bs\u0010%R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bt\u0010X\u001a\u0004\bu\u0010%R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bv\u0010X\u001a\u0004\bw\u0010%R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bx\u0010X\u001a\u0004\by\u0010%R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bz\u0010X\u001a\u0004\b{\u0010%R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b|\u0010X\u001a\u0004\b}\u0010%R\u0018\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010AR\u001a\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010CR\u0019\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010X\u001a\u0005\b\u0085\u0001\u0010%¨\u0006\u0087\u0001"}, d2 = {"Lcom/surt/guardian/core/Configuration;", "", "", "customBaseUrl", "customerId", "verisoulProjectId", "verisoulApiKey", "", "collectHardwareInfo", "collectBatteryInfo", "collectTimezone", "detectRoot", "detectEmulator", "collectSensorList", "collectSystemFeatures", "collectScreenRefreshRate", "collectDeviceUptime", "collectAppInstallTime", "collectDarkModeSetting", "detectVPN", "detectDeveloperOptions", "collectCanvasFingerprint", "collectPublicIP", "collectLocation", "collectWifiInfo", "collectSimCardInfo", "collectCameraInfo", "LAc/d;", "locationPermissionConfig", "", "timeout", "enableLogging", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZZZZZZZZZZLAc/d;JZ)V", "getBaseUrl", "()Ljava/lang/String;", "requiresPermissions", "()Z", "", "getRequiredPermissions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "()LAc/d;", "component25", "()J", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZZZZZZZZZZLAc/d;JZ)Lcom/surt/guardian/core/Configuration;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCustomBaseUrl", b.f37029b, "getCustomerId", "c", "getVerisoulProjectId", d.f13160a, "getVerisoulApiKey", e.f29601m, "Z", "getCollectHardwareInfo", "f", "getCollectBatteryInfo", "g", "getCollectTimezone", C4527h.f48087o, "getDetectRoot", i.f35755A, "getDetectEmulator", "j", "getCollectSensorList", "k", "getCollectSystemFeatures", "l", "getCollectScreenRefreshRate", m.f13664a, "getCollectDeviceUptime", "n", "getCollectAppInstallTime", "o", "getCollectDarkModeSetting", "p", "getDetectVPN", "q", "getDetectDeveloperOptions", "r", "getCollectCanvasFingerprint", "s", "getCollectPublicIP", "t", "getCollectLocation", "u", "getCollectWifiInfo", "v", "getCollectSimCardInfo", "w", "getCollectCameraInfo", C5444x.f55808b, "LAc/d;", "getLocationPermissionConfig", "y", "J", "getTimeout", "z", "getEnableLogging", "Companion", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Configuration {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String customBaseUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String customerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String verisoulProjectId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String verisoulApiKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean collectHardwareInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean collectBatteryInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean collectTimezone;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean detectRoot;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean detectEmulator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean collectSensorList;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean collectSystemFeatures;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean collectScreenRefreshRate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean collectDeviceUptime;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean collectAppInstallTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final boolean collectDarkModeSetting;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final boolean detectVPN;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final boolean detectDeveloperOptions;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final boolean collectCanvasFingerprint;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final boolean collectPublicIP;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final boolean collectLocation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final boolean collectWifiInfo;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final boolean collectSimCardInfo;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final boolean collectCameraInfo;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Ac.d locationPermissionConfig;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final long timeout;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final boolean enableLogging;

    /* renamed from: com.surt.guardian.core.Configuration$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final Configuration a(c options) {
            Intrinsics.checkNotNullParameter(options, "options");
            K.f26450a.a().getClass();
            return new Configuration(null, null, "dd30c492-0643-4b4b-9113-13928dbad6ec", "vg97bIXlFtRTp00yz18yvXuRAV0C4MSVfIXh5cX4", false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, options.b(), options.d(), options.c(), options.a(), options.f(), options.h(), options.g().ordinal() < Logger.Level.NONE.ordinal(), 524274, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Configuration() {
        this(null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0L, false, 67108863, null);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, Ac.d dVar, long j10, boolean z29, int i10, Object obj) {
        boolean z30;
        long j11;
        String str5 = (i10 & 1) != 0 ? configuration.customBaseUrl : str;
        String str6 = (i10 & 2) != 0 ? configuration.customerId : str2;
        String str7 = (i10 & 4) != 0 ? configuration.verisoulProjectId : str3;
        String str8 = (i10 & 8) != 0 ? configuration.verisoulApiKey : str4;
        boolean z31 = (i10 & 16) != 0 ? configuration.collectHardwareInfo : z10;
        boolean z32 = (i10 & 32) != 0 ? configuration.collectBatteryInfo : z11;
        boolean z33 = (i10 & 64) != 0 ? configuration.collectTimezone : z12;
        boolean z34 = (i10 & 128) != 0 ? configuration.detectRoot : z13;
        boolean z35 = (i10 & 256) != 0 ? configuration.detectEmulator : z14;
        boolean z36 = (i10 & 512) != 0 ? configuration.collectSensorList : z15;
        boolean z37 = (i10 & 1024) != 0 ? configuration.collectSystemFeatures : z16;
        boolean z38 = (i10 & 2048) != 0 ? configuration.collectScreenRefreshRate : z17;
        boolean z39 = (i10 & 4096) != 0 ? configuration.collectDeviceUptime : z18;
        boolean z40 = (i10 & 8192) != 0 ? configuration.collectAppInstallTime : z19;
        String str9 = str5;
        boolean z41 = (i10 & 16384) != 0 ? configuration.collectDarkModeSetting : z20;
        boolean z42 = (i10 & 32768) != 0 ? configuration.detectVPN : z21;
        boolean z43 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? configuration.detectDeveloperOptions : z22;
        boolean z44 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? configuration.collectCanvasFingerprint : z23;
        boolean z45 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? configuration.collectPublicIP : z24;
        boolean z46 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? configuration.collectLocation : z25;
        boolean z47 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? configuration.collectWifiInfo : z26;
        boolean z48 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? configuration.collectSimCardInfo : z27;
        boolean z49 = (i10 & 4194304) != 0 ? configuration.collectCameraInfo : z28;
        Ac.d dVar2 = (i10 & 8388608) != 0 ? configuration.locationPermissionConfig : dVar;
        boolean z50 = z41;
        long j12 = (i10 & 16777216) != 0 ? configuration.timeout : j10;
        if ((i10 & 33554432) != 0) {
            j11 = j12;
            z30 = configuration.enableLogging;
        } else {
            z30 = z29;
            j11 = j12;
        }
        return configuration.copy(str9, str6, str7, str8, z31, z32, z33, z34, z35, z36, z37, z38, z39, z40, z50, z42, z43, z44, z45, z46, z47, z48, z49, dVar2, j11, z30);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCustomBaseUrl() {
        return this.customBaseUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getCollectSensorList() {
        return this.collectSensorList;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getCollectSystemFeatures() {
        return this.collectSystemFeatures;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCollectScreenRefreshRate() {
        return this.collectScreenRefreshRate;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCollectDeviceUptime() {
        return this.collectDeviceUptime;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getCollectAppInstallTime() {
        return this.collectAppInstallTime;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getCollectDarkModeSetting() {
        return this.collectDarkModeSetting;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getDetectVPN() {
        return this.detectVPN;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getDetectDeveloperOptions() {
        return this.detectDeveloperOptions;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getCollectCanvasFingerprint() {
        return this.collectCanvasFingerprint;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getCollectPublicIP() {
        return this.collectPublicIP;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getCollectLocation() {
        return this.collectLocation;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getCollectWifiInfo() {
        return this.collectWifiInfo;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getCollectSimCardInfo() {
        return this.collectSimCardInfo;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getCollectCameraInfo() {
        return this.collectCameraInfo;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final Ac.d getLocationPermissionConfig() {
        return this.locationPermissionConfig;
    }

    /* renamed from: component25, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getVerisoulProjectId() {
        return this.verisoulProjectId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getVerisoulApiKey() {
        return this.verisoulApiKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCollectHardwareInfo() {
        return this.collectHardwareInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCollectBatteryInfo() {
        return this.collectBatteryInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCollectTimezone() {
        return this.collectTimezone;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDetectRoot() {
        return this.detectRoot;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDetectEmulator() {
        return this.detectEmulator;
    }

    @NotNull
    public final Configuration copy(@Nullable String customBaseUrl, @Nullable String customerId, @Nullable String verisoulProjectId, @Nullable String verisoulApiKey, boolean collectHardwareInfo, boolean collectBatteryInfo, boolean collectTimezone, boolean detectRoot, boolean detectEmulator, boolean collectSensorList, boolean collectSystemFeatures, boolean collectScreenRefreshRate, boolean collectDeviceUptime, boolean collectAppInstallTime, boolean collectDarkModeSetting, boolean detectVPN, boolean detectDeveloperOptions, boolean collectCanvasFingerprint, boolean collectPublicIP, boolean collectLocation, boolean collectWifiInfo, boolean collectSimCardInfo, boolean collectCameraInfo, @NotNull Ac.d locationPermissionConfig, long timeout, boolean enableLogging) {
        Intrinsics.checkNotNullParameter(locationPermissionConfig, "locationPermissionConfig");
        return new Configuration(customBaseUrl, customerId, verisoulProjectId, verisoulApiKey, collectHardwareInfo, collectBatteryInfo, collectTimezone, detectRoot, detectEmulator, collectSensorList, collectSystemFeatures, collectScreenRefreshRate, collectDeviceUptime, collectAppInstallTime, collectDarkModeSetting, detectVPN, detectDeveloperOptions, collectCanvasFingerprint, collectPublicIP, collectLocation, collectWifiInfo, collectSimCardInfo, collectCameraInfo, locationPermissionConfig, timeout, enableLogging);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.customBaseUrl, configuration.customBaseUrl) && Intrinsics.areEqual(this.customerId, configuration.customerId) && Intrinsics.areEqual(this.verisoulProjectId, configuration.verisoulProjectId) && Intrinsics.areEqual(this.verisoulApiKey, configuration.verisoulApiKey) && this.collectHardwareInfo == configuration.collectHardwareInfo && this.collectBatteryInfo == configuration.collectBatteryInfo && this.collectTimezone == configuration.collectTimezone && this.detectRoot == configuration.detectRoot && this.detectEmulator == configuration.detectEmulator && this.collectSensorList == configuration.collectSensorList && this.collectSystemFeatures == configuration.collectSystemFeatures && this.collectScreenRefreshRate == configuration.collectScreenRefreshRate && this.collectDeviceUptime == configuration.collectDeviceUptime && this.collectAppInstallTime == configuration.collectAppInstallTime && this.collectDarkModeSetting == configuration.collectDarkModeSetting && this.detectVPN == configuration.detectVPN && this.detectDeveloperOptions == configuration.detectDeveloperOptions && this.collectCanvasFingerprint == configuration.collectCanvasFingerprint && this.collectPublicIP == configuration.collectPublicIP && this.collectLocation == configuration.collectLocation && this.collectWifiInfo == configuration.collectWifiInfo && this.collectSimCardInfo == configuration.collectSimCardInfo && this.collectCameraInfo == configuration.collectCameraInfo && Intrinsics.areEqual(this.locationPermissionConfig, configuration.locationPermissionConfig) && this.timeout == configuration.timeout && this.enableLogging == configuration.enableLogging;
    }

    @NotNull
    public final String getBaseUrl() {
        String str = this.customBaseUrl;
        return str == null ? "https://api.surt.com" : str;
    }

    public final boolean getCollectAppInstallTime() {
        return this.collectAppInstallTime;
    }

    public final boolean getCollectBatteryInfo() {
        return this.collectBatteryInfo;
    }

    public final boolean getCollectCameraInfo() {
        return this.collectCameraInfo;
    }

    public final boolean getCollectCanvasFingerprint() {
        return this.collectCanvasFingerprint;
    }

    public final boolean getCollectDarkModeSetting() {
        return this.collectDarkModeSetting;
    }

    public final boolean getCollectDeviceUptime() {
        return this.collectDeviceUptime;
    }

    public final boolean getCollectHardwareInfo() {
        return this.collectHardwareInfo;
    }

    public final boolean getCollectLocation() {
        return this.collectLocation;
    }

    public final boolean getCollectPublicIP() {
        return this.collectPublicIP;
    }

    public final boolean getCollectScreenRefreshRate() {
        return this.collectScreenRefreshRate;
    }

    public final boolean getCollectSensorList() {
        return this.collectSensorList;
    }

    public final boolean getCollectSimCardInfo() {
        return this.collectSimCardInfo;
    }

    public final boolean getCollectSystemFeatures() {
        return this.collectSystemFeatures;
    }

    public final boolean getCollectTimezone() {
        return this.collectTimezone;
    }

    public final boolean getCollectWifiInfo() {
        return this.collectWifiInfo;
    }

    @Nullable
    public final String getCustomBaseUrl() {
        return this.customBaseUrl;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    public final boolean getDetectDeveloperOptions() {
        return this.detectDeveloperOptions;
    }

    public final boolean getDetectEmulator() {
        return this.detectEmulator;
    }

    public final boolean getDetectRoot() {
        return this.detectRoot;
    }

    public final boolean getDetectVPN() {
        return this.detectVPN;
    }

    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    @NotNull
    public final Ac.d getLocationPermissionConfig() {
        return this.locationPermissionConfig;
    }

    @NotNull
    public final List<String> getRequiredPermissions() {
        ArrayList arrayList = new ArrayList();
        if (this.collectLocation) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (this.collectWifiInfo) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (this.collectSimCardInfo) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        return CollectionsKt.distinct(arrayList);
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final String getVerisoulApiKey() {
        return this.verisoulApiKey;
    }

    @Nullable
    public final String getVerisoulProjectId() {
        return this.verisoulProjectId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.customBaseUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verisoulProjectId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verisoulApiKey;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z10 = this.collectHardwareInfo;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode4 + i10) * 31;
        boolean z11 = this.collectBatteryInfo;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.collectTimezone;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.detectRoot;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.detectEmulator;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.collectSensorList;
        int i20 = z15;
        if (z15 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z16 = this.collectSystemFeatures;
        int i22 = z16;
        if (z16 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        boolean z17 = this.collectScreenRefreshRate;
        int i24 = z17;
        if (z17 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        boolean z18 = this.collectDeviceUptime;
        int i26 = z18;
        if (z18 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        boolean z19 = this.collectAppInstallTime;
        int i28 = z19;
        if (z19 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        boolean z20 = this.collectDarkModeSetting;
        int i30 = z20;
        if (z20 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        boolean z21 = this.detectVPN;
        int i32 = z21;
        if (z21 != 0) {
            i32 = 1;
        }
        int i33 = (i31 + i32) * 31;
        boolean z22 = this.detectDeveloperOptions;
        int i34 = z22;
        if (z22 != 0) {
            i34 = 1;
        }
        int i35 = (i33 + i34) * 31;
        boolean z23 = this.collectCanvasFingerprint;
        int i36 = z23;
        if (z23 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        boolean z24 = this.collectPublicIP;
        int i38 = z24;
        if (z24 != 0) {
            i38 = 1;
        }
        int i39 = (i37 + i38) * 31;
        boolean z25 = this.collectLocation;
        int i40 = z25;
        if (z25 != 0) {
            i40 = 1;
        }
        int i41 = (i39 + i40) * 31;
        boolean z26 = this.collectWifiInfo;
        int i42 = z26;
        if (z26 != 0) {
            i42 = 1;
        }
        int i43 = (i41 + i42) * 31;
        boolean z27 = this.collectSimCardInfo;
        int i44 = z27;
        if (z27 != 0) {
            i44 = 1;
        }
        int i45 = (i43 + i44) * 31;
        boolean z28 = this.collectCameraInfo;
        int i46 = z28;
        if (z28 != 0) {
            i46 = 1;
        }
        int hashCode5 = (Long.hashCode(this.timeout) + ((this.locationPermissionConfig.hashCode() + ((i45 + i46) * 31)) * 31)) * 31;
        boolean z29 = this.enableLogging;
        return hashCode5 + (z29 ? 1 : z29 ? 1 : 0);
    }

    public final boolean requiresPermissions() {
        return this.collectLocation || this.collectWifiInfo || this.collectSimCardInfo || this.collectCameraInfo;
    }

    @NotNull
    public String toString() {
        return "Configuration(customBaseUrl=" + this.customBaseUrl + ", customerId=" + this.customerId + ", verisoulProjectId=" + this.verisoulProjectId + ", verisoulApiKey=" + this.verisoulApiKey + ", collectHardwareInfo=" + this.collectHardwareInfo + ", collectBatteryInfo=" + this.collectBatteryInfo + ", collectTimezone=" + this.collectTimezone + ", detectRoot=" + this.detectRoot + ", detectEmulator=" + this.detectEmulator + ", collectSensorList=" + this.collectSensorList + ", collectSystemFeatures=" + this.collectSystemFeatures + ", collectScreenRefreshRate=" + this.collectScreenRefreshRate + ", collectDeviceUptime=" + this.collectDeviceUptime + ", collectAppInstallTime=" + this.collectAppInstallTime + ", collectDarkModeSetting=" + this.collectDarkModeSetting + ", detectVPN=" + this.detectVPN + ", detectDeveloperOptions=" + this.detectDeveloperOptions + ", collectCanvasFingerprint=" + this.collectCanvasFingerprint + ", collectPublicIP=" + this.collectPublicIP + ", collectLocation=" + this.collectLocation + ", collectWifiInfo=" + this.collectWifiInfo + ", collectSimCardInfo=" + this.collectSimCardInfo + ", collectCameraInfo=" + this.collectCameraInfo + ", locationPermissionConfig=" + this.locationPermissionConfig + ", timeout=" + this.timeout + ", enableLogging=" + this.enableLogging + ')';
    }

    public Configuration(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, @NotNull Ac.d locationPermissionConfig, long j10, boolean z29) {
        Intrinsics.checkNotNullParameter(locationPermissionConfig, "locationPermissionConfig");
        this.customBaseUrl = str;
        this.customerId = str2;
        this.verisoulProjectId = str3;
        this.verisoulApiKey = str4;
        this.collectHardwareInfo = z10;
        this.collectBatteryInfo = z11;
        this.collectTimezone = z12;
        this.detectRoot = z13;
        this.detectEmulator = z14;
        this.collectSensorList = z15;
        this.collectSystemFeatures = z16;
        this.collectScreenRefreshRate = z17;
        this.collectDeviceUptime = z18;
        this.collectAppInstallTime = z19;
        this.collectDarkModeSetting = z20;
        this.detectVPN = z21;
        this.detectDeveloperOptions = z22;
        this.collectCanvasFingerprint = z23;
        this.collectPublicIP = z24;
        this.collectLocation = z25;
        this.collectWifiInfo = z26;
        this.collectSimCardInfo = z27;
        this.collectCameraInfo = z28;
        this.locationPermissionConfig = locationPermissionConfig;
        this.timeout = j10;
        this.enableLogging = z29;
    }

    public /* synthetic */ Configuration(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, Ac.d dVar, long j10, boolean z29, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? true : z11, (i10 & 64) != 0 ? true : z12, (i10 & 128) != 0 ? true : z13, (i10 & 256) != 0 ? true : z14, (i10 & 512) != 0 ? true : z15, (i10 & 1024) != 0 ? true : z16, (i10 & 2048) != 0 ? true : z17, (i10 & 4096) != 0 ? true : z18, (i10 & 8192) != 0 ? true : z19, (i10 & 16384) != 0 ? true : z20, (i10 & 32768) != 0 ? true : z21, (i10 & PKIFailureInfo.notAuthorized) != 0 ? true : z22, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? true : z23, (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? true : z24, (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z25, (i10 & PKIFailureInfo.badCertTemplate) != 0 ? false : z26, (i10 & PKIFailureInfo.badSenderNonce) != 0 ? false : z27, (i10 & 4194304) == 0 ? z28 : false, (i10 & 8388608) != 0 ? new Ac.d(null, null, null, null, false, 0, 0, 127, null) : dVar, (i10 & 16777216) != 0 ? 30000L : j10, (i10 & 33554432) != 0 ? true : z29);
    }
}
