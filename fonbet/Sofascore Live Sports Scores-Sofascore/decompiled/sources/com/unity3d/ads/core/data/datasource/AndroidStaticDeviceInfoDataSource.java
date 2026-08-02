package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import com.ironsource.U3;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.a70;
import defpackage.d7a;
import defpackage.hz8;
import defpackage.km5;
import defpackage.lu3;
import defpackage.ogj;
import defpackage.r4;
import defpackage.rq3;
import defpackage.s80;
import defpackage.wx4;
import defpackage.wzb;
import defpackage.y6a;
import defpackage.zzl;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011H\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b&\u0010!J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0019J\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\u0019J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010\u0019J\r\u0010*\u001a\u00020\u0011¢\u0006\u0004\b*\u0010\u0019J\r\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0019J\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010\u0019J\r\u0010.\u001a\u00020\u0011¢\u0006\u0004\b.\u0010\u0019J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0010¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b4\u0010\u0019J\r\u00105\u001a\u00020\"¢\u0006\u0004\b5\u0010$J\u0017\u00108\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010\u0019J\r\u0010;\u001a\u00020\u001d¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u001d¢\u0006\u0004\b<\u0010\u001fJ\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0011H\u0002¢\u0006\u0004\bD\u0010\u0019J\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020@H\u0002¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020@H\u0002¢\u0006\u0004\bI\u0010BJ\u000f\u0010J\u001a\u00020@H\u0002¢\u0006\u0004\bJ\u0010BJ\u000f\u0010K\u001a\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010\u001fJ\u0017\u0010M\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0003¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bP\u0010\u0019J\u000f\u0010Q\u001a\u00020\u0011H\u0003¢\u0006\u0004\bQ\u0010\u0019J\u000f\u0010R\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010\u0019J\u000f\u0010S\u001a\u00020\"H\u0002¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u0010$J\u0012\u0010U\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\bU\u0010!J\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\bV\u00100J\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00110WH\u0003¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0011H\u0002¢\u0006\u0004\bZ\u0010\u0019J\u000f\u0010[\u001a\u00020@H\u0002¢\u0006\u0004\b[\u0010BJ%\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\"H\u0002¢\u0006\u0004\b^\u0010$J\u000f\u0010_\u001a\u00020\u0011H\u0002¢\u0006\u0004\b_\u0010\u0019J\u000f\u0010`\u001a\u00020\u001dH\u0002¢\u0006\u0004\b`\u0010\u001fJ\u000f\u0010a\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010\u0019J\u000f\u0010b\u001a\u00020\u0011H\u0002¢\u0006\u0004\bb\u0010\u0019J\u0017\u0010e\u001a\u00020\"2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ\u0019\u0010g\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bg\u00109J\u0015\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\bh\u00100J\u0019\u0010k\u001a\u0004\u0018\u0001062\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0011H\u0002¢\u0006\u0004\bm\u0010\u0019J\u000f\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\bn\u0010\u001fJ\u000f\u0010o\u001a\u00020@H\u0002¢\u0006\u0004\bo\u0010BJ\u001f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00102\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\br\u0010sJ!\u0010u\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020q2\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020qH\u0003¢\u0006\u0004\bw\u0010xJ!\u0010y\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020q2\b\u0010p\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\by\u0010vJ\u0017\u0010z\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020qH\u0003¢\u0006\u0004\bz\u0010xJ\u000f\u0010{\u001a\u00020@H\u0002¢\u0006\u0004\b{\u0010BJ\u000f\u0010|\u001a\u00020\u0011H\u0002¢\u0006\u0004\b|\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010}\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0080\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0081\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0082\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0083\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0019¨\u0006\u008d\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "unityBootConfigDataSource", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "", "", "additionalStores", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "(Ljava/util/List;Lrq3;)Ljava/lang/Object;", "fetchCached", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getOsVersion", "()Ljava/lang/String;", "getManufacturer", "getModel", "getAdvertisingTrackingId", "", "isLimitOpenAdTrackingEnabled", "()Z", "getIdfi", "(Lrq3;)Ljava/lang/Object;", "", "getSystemBootTime", "()J", "getAuid", "getUnityBuildGuid", "getBoard", "getBootloader", "getBrand", "getDisplay", "getDevice", "getHardware", "getHost", "getProduct", "getSupportedAbis", "()Ljava/util/List;", "Landroid/hardware/Sensor;", "getSensorList", "getBuildId", "getBuildVersionIncremental", "getTotalMemory", "Ljava/io/File;", U3.i.b, "getTotalSpace", "(Ljava/io/File;)J", "getAppName", "hasX264Decoder", "hasX265Decoder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchAndroidStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "", "getApiLevel", "()I", "getScreenLayout", "getOpenAdvertisingTrackingId", "", "getDisplayMetricDensity", "()F", "getScreenDensity", "getScreenWidth", "getScreenHeight", "isRooted", "binary", "searchPathForBinary", "(Ljava/lang/String;)Z", "getCertificateFingerprint", "getFingerprint", "getInstallerPackageName", "getCPUModel", "getCPUCount", "getJvmMaxMemory", "getGPUModel", "getOldAbiList", "Ljava/util/ArrayList;", "getNewAbiList", "()Ljava/util/ArrayList;", "getWebViewUserAgent", "getVersionCode", "getStores", "(Ljava/util/List;)Ljava/util/List;", "getAppStartTime", "getVersionName", "isTestMode", "getPlatform", "getGameId", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "infoType", "getMemoryInfo", "(Lcom/unity3d/services/core/device/Device$MemoryInfoType;)J", "getTotalSpaceBytes", "getKeyboardLanguages", "Lcom/unity3d/ads/core/data/model/StorageType;", "storageType", "getFileForStorageType", "(Lcom/unity3d/ads/core/data/model/StorageType;)Ljava/io/File;", "getAppVersion", "isAppDebuggable", "getExtensionVersion", "mimeType", "Landroid/media/MediaCodecInfo;", "selectAllDecodeCodecs", "(Ljava/lang/String;)Ljava/util/List;", "codecInfo", "isHardwareAccelerated", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z", "isHardwareAcceleratedV29", "(Landroid/media/MediaCodecInfo;)Z", "isSoftwareOnly", "isSoftwareOnlyV29", "getPhoneType", "getSimOperator", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "Ljavax/security/auth/x500/X500Principal;", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getAnalyticsUserId", "analyticsUserId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {

    @NotNull
    public static final String ALGORITHM_SHA1 = "SHA-1";

    @NotNull
    public static final String APP_VERSION_FAKE = "FakeVersionName";

    @NotNull
    public static final String BINARY_SU = "su";

    @NotNull
    public static final String CERTIFICATE_TYPE_X509 = "X.509";

    @NotNull
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";

    @NotNull
    public static final String PLATFORM_ANDROID = "android";

    @NotNull
    public static final String STORE_GOOGLE = "google";

    @NotNull
    private final X500Principal DEBUG_CERT;

    @NotNull
    private final AnalyticsDataSource analyticsDataSource;

    @NotNull
    private final Context context;

    @NotNull
    private final ByteStringDataSource glInfoStore;

    @NotNull
    private final Logger logger;

    @NotNull
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;

    @NotNull
    private final StoreDataSource storeDataSource;

    @NotNull
    private final UnityBootConfigDataSource unityBootConfigDataSource;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidStaticDeviceInfoDataSource(@NotNull Context context, @NotNull ByteStringDataSource byteStringDataSource, @NotNull AnalyticsDataSource analyticsDataSource, @NotNull StoreDataSource storeDataSource, @NotNull UnityBootConfigDataSource unityBootConfigDataSource, @NotNull Logger logger) {
        context.getClass();
        byteStringDataSource.getClass();
        analyticsDataSource.getClass();
        storeDataSource.getClass();
        unityBootConfigDataSource.getClass();
        logger.getClass();
        this.context = context;
        this.glInfoStore = byteStringDataSource;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.logger = logger;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        newBuilder.getClass();
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        StorageType storageType = StorageType.EXTERNAL;
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(storageType)));
        _create.setTotalDiskSpaceBytes(getTotalSpaceBytes(getFileForStorageType(storageType)));
        _create.addAllKeyboardLanguages(_create.getKeyboardLanguages(), getKeyboardLanguages());
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = _create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        newBuilder.getClass();
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        _create.setJvmMaxMemory(getJvmMaxMemory());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            str.getClass();
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Error getting package info", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            str.getClass();
            return str;
        }
        try {
            File file = new File("/proc/cpuinfo");
            Charset charset = Charsets.UTF_8;
            charset.getClass();
            ArrayList arrayList = new ArrayList();
            d7a.u(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), new s80(arrayList, 2));
            return (String) CollectionsKt.h0(arrayList);
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading CPU model", e);
            return "";
        }
    }

    @wx4
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (signatureArr.length == 0) {
                return "";
            }
            Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            generateCertificate.getClass();
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
            hexString.getClass();
            return hexString;
        } catch (Exception e) {
            this.logger.error("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        return (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        Logger.DefaultImpls.error$default(this.logger, "Unhandled storagetype: " + storageType, null, 2, null);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGPUModel(rq3<? super String> rq3Var) {
        AndroidStaticDeviceInfoDataSource$getGPUModel$1 androidStaticDeviceInfoDataSource$getGPUModel$1;
        int i;
        if (rq3Var instanceof AndroidStaticDeviceInfoDataSource$getGPUModel$1) {
            androidStaticDeviceInfoDataSource$getGPUModel$1 = (AndroidStaticDeviceInfoDataSource$getGPUModel$1) rq3Var;
            int i2 = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$getGPUModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
                lu3 lu3Var = lu3.a;
                i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.glInfoStore;
                    androidStaticDeviceInfoDataSource$getGPUModel$1.label = 1;
                    obj = byteStringDataSource.get(androidStaticDeviceInfoDataSource$getGPUModel$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(Charsets.UTF_8);
            }
        }
        androidStaticDeviceInfoDataSource$getGPUModel$1 = new AndroidStaticDeviceInfoDataSource$getGPUModel$1(this, rq3Var);
        Object obj2 = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData().toString(Charsets.UTF_8);
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    @wx4
    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getJvmMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    private final List<String> getKeyboardLanguages() {
        try {
            Object systemService = this.context.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null) {
                return km5.a;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            inputMethodList.getClass();
            Iterator<T> it = inputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), true);
                enabledInputMethodSubtypeList.getClass();
                Iterator<T> it2 = enabledInputMethodSubtypeList.iterator();
                while (it2.hasNext()) {
                    String locale = ((InputMethodSubtype) it2.next()).getLocale();
                    locale.getClass();
                    if (locale.length() > 0) {
                        linkedHashSet.add(locale);
                    }
                }
            }
            return CollectionsKt.S0(linkedHashSet);
        } catch (Exception e) {
            this.logger.error("Error getting keyboard languages", e);
            return km5.a;
        }
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                zzl.b();
                return 0L;
            }
        }
        String str = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    str = randomAccessFile.readLine();
                } finally {
                }
            }
            Unit unit = Unit.a;
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading memory info", e);
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        arrayList.addAll(b.j(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String str = Build.CPU_ABI;
        str.getClass();
        arrayList.add(str);
        String str2 = Build.CPU_ABI2;
        str2.getClass();
        arrayList.add(str2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        systemService.getClass();
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        systemService.getClass();
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        simOperator.getClass();
        return simOperator;
    }

    private final List<String> getStores(List<String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = km5.a;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getTotalSpaceBytes(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return file.getTotalSpace();
    }

    private final int getVersionCode() {
        return 41900;
    }

    private final String getVersionName() {
        return "4.19.0";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            defaultUserAgent.getClass();
            return defaultUserAgent;
        } catch (Exception e) {
            this.logger.error("Exception getting webview user agent", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        PackageManager packageManager = this.context.getPackageManager();
        packageManager.getClass();
        String packageName = this.context.getPackageName();
        packageName.getClass();
        boolean z = true;
        boolean z2 = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                z2 = true;
                z = false;
            } else {
                z = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Could not find name", e);
        }
        if (z) {
            try {
                r4 P = hz8.P(packageManager.getPackageInfo(packageName, 64).signatures);
                while (P.hasNext()) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(((Signature) P.next()).toByteArray()));
                    generateCertificate.getClass();
                    z2 = Intrinsics.c(((X509Certificate) generateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (z2) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.logger.error("Could not find name", e2);
            } catch (CertificateException e3) {
                this.logger.error("Certificate exception", e3);
            }
        }
        return z2;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo codecInfo, String mimeType) {
        return getApiLevel() >= 29 ? isHardwareAcceleratedV29(codecInfo) : !isSoftwareOnly(codecInfo, mimeType);
    }

    private final boolean isHardwareAcceleratedV29(MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            this.logger.error("Rooted check failed", e);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        String name = codecInfo.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!c.v(lowerCase, "arc.", false)) {
            if (c.v(lowerCase, "omx.google.", false) || c.v(lowerCase, "omx.ffmpeg.", false)) {
                return true;
            }
            if ((c.v(lowerCase, "omx.sec.", false) && StringsKt.J(lowerCase, ".sw.", false)) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || c.v(lowerCase, "c2.android.", false) || c.v(lowerCase, "c2.google.", false)) {
                return true;
            }
            if (!c.v(lowerCase, "omx.", false) && !c.v(lowerCase, "c2.", false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isSoftwareOnlyV29(MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final boolean searchPathForBinary(String binary) {
        List h;
        Collection collection;
        String[] strArr;
        File[] listFiles;
        String str = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str != null && (h = new Regex(":").h(str)) != null) {
            if (!h.isEmpty()) {
                ListIterator listIterator = h.listIterator(h.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = km5.a;
            if (collection != null && (strArr = (String[]) collection.toArray(new String[0])) != null) {
                for (String str2 : strArr) {
                    File file = new File(str2);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        int i = 0;
                        while (i < listFiles.length) {
                            int i2 = i + 1;
                            try {
                                if (Intrinsics.c(listFiles[i].getName(), binary)) {
                                    return true;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                ogj.m(e.getMessage());
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String mimeType) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (c.o(str, mimeType, true) && isHardwareAccelerated(codecInfoAt, mimeType)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(@NotNull List<String> list, @NotNull rq3<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> rq3Var) {
        AndroidStaticDeviceInfoDataSource$fetch$1 androidStaticDeviceInfoDataSource$fetch$1;
        int i;
        String str;
        if (rq3Var instanceof AndroidStaticDeviceInfoDataSource$fetch$1) {
            androidStaticDeviceInfoDataSource$fetch$1 = (AndroidStaticDeviceInfoDataSource$fetch$1) rq3Var;
            int i2 = androidStaticDeviceInfoDataSource$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$fetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$fetch$1.result;
                Object obj2 = lu3.a;
                i = androidStaticDeviceInfoDataSource$fetch$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    String gpuModel = this.staticDeviceInfo.getGpuModel();
                    if (gpuModel != null && gpuModel.length() != 0) {
                        return this.staticDeviceInfo;
                    }
                    androidStaticDeviceInfoDataSource$fetch$1.L$0 = list;
                    androidStaticDeviceInfoDataSource$fetch$1.label = 1;
                    obj = getGPUModel(androidStaticDeviceInfoDataSource$fetch$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) androidStaticDeviceInfoDataSource$fetch$1.L$0;
                    y6a.M(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return this.staticDeviceInfo;
                }
                StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo;
                StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
                builder.getClass();
                StaticDeviceInfoKt.Dsl _create = companion._create(builder);
                _create.setGpuModel(str);
                _create.clearStores(_create.getStores());
                _create.addAllStores(_create.getStores(), getStores(list));
                StaticDeviceInfoOuterClass.StaticDeviceInfo _build = _create._build();
                this.staticDeviceInfo = _build;
                return _build;
            }
        }
        androidStaticDeviceInfoDataSource$fetch$1 = new AndroidStaticDeviceInfoDataSource$fetch$1(this, rq3Var);
        Object obj3 = androidStaticDeviceInfoDataSource$fetch$1.result;
        Object obj22 = lu3.a;
        i = androidStaticDeviceInfoDataSource$fetch$1.label;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return this.staticDeviceInfo;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    /* renamed from: fetchCached, reason: from getter */
    public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    @NotNull
    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getAppName() {
        String packageName = this.context.getPackageName();
        packageName.getClass();
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getAuid(@NotNull rq3<? super String> rq3Var) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    @NotNull
    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getBuildId() {
        return Build.ID;
    }

    @Nullable
    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getIdfi(@NotNull rq3<? super String> rq3Var) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
        return uuid;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    @NotNull
    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        systemService.getClass();
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        sensorList.getClass();
        return sensorList;
    }

    @NotNull
    public final List<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(@Nullable File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return wzb.b(file.getTotalSpace() / 1024);
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getUnityBuildGuid(@NotNull rq3<? super String> rq3Var) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
