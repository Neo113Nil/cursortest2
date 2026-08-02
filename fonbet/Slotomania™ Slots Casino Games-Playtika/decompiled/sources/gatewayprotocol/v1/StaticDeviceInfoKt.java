package gatewayprotocol.v1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.utils.j;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticDeviceInfoKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt;", "", "()V", "android", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeandroid", "ios", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "-initializeios", "AndroidKt", "Dsl", "IosKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    /* compiled from: StaticDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 ¥\u00012\u00020\u0001:\u0006¥\u0001¦\u0001§\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010c\u001a\u00020dH\u0001J\u0006\u0010e\u001a\u00020fJ\u0006\u0010g\u001a\u00020fJ\u0006\u0010h\u001a\u00020fJ\u0006\u0010i\u001a\u00020fJ\u0006\u0010j\u001a\u00020fJ\u0006\u0010k\u001a\u00020fJ\u0006\u0010l\u001a\u00020fJ\u0006\u0010m\u001a\u00020fJ\u0006\u0010n\u001a\u00020fJ\u0006\u0010o\u001a\u00020fJ\u0006\u0010p\u001a\u00020fJ\u0006\u0010q\u001a\u00020fJ\u0006\u0010r\u001a\u00020fJ\u0006\u0010s\u001a\u00020fJ\u0006\u0010t\u001a\u00020fJ\u0006\u0010u\u001a\u00020fJ\u0006\u0010v\u001a\u00020fJ\u0006\u0010w\u001a\u00020fJ\u0006\u0010x\u001a\u00020fJ\u0006\u0010y\u001a\u00020fJ\u0006\u0010z\u001a\u00020fJ\u0006\u0010{\u001a\u00020fJ\u0006\u0010|\u001a\u00020\fJ\u0006\u0010}\u001a\u00020\fJ\u0006\u0010~\u001a\u00020\fJ\u0006\u0010\u007f\u001a\u00020\fJ\u0007\u0010\u0080\u0001\u001a\u00020\fJ\u0007\u0010\u0081\u0001\u001a\u00020\fJ\u0007\u0010\u0082\u0001\u001a\u00020\fJ\u0007\u0010\u0083\u0001\u001a\u00020\fJ\u0007\u0010\u0084\u0001\u001a\u00020\fJ\u0007\u0010\u0085\u0001\u001a\u00020\fJ\u0007\u0010\u0086\u0001\u001a\u00020\fJ\u0007\u0010\u0087\u0001\u001a\u00020\fJ\u0007\u0010\u0088\u0001\u001a\u00020\fJ\u0007\u0010\u0089\u0001\u001a\u00020\fJ\u0007\u0010\u008a\u0001\u001a\u00020\fJ\u0007\u0010\u008b\u0001\u001a\u00020\fJ\u0007\u0010\u008c\u0001\u001a\u00020\fJ\u0007\u0010\u008d\u0001\u001a\u00020\fJ\u0007\u0010\u008e\u0001\u001a\u00020\fJ\u0007\u0010\u008f\u0001\u001a\u00020\fJ\u0007\u0010\u0090\u0001\u001a\u00020\fJ'\u0010\u0091\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0003\b\u0092\u0001J'\u0010\u0091\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0003\b\u0093\u0001J/\u0010\u0094\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205042\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0096\u0001H\u0007¢\u0006\u0003\b\u0097\u0001J/\u0010\u0094\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U042\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0096\u0001H\u0007¢\u0006\u0003\b\u0098\u0001J\u001f\u0010\u0099\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020504H\u0007¢\u0006\u0003\b\u009a\u0001J\u001f\u0010\u0099\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U04H\u0007¢\u0006\u0003\b\u009b\u0001J(\u0010\u009c\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205042\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\n¢\u0006\u0003\b\u009d\u0001J0\u0010\u009c\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205042\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0096\u0001H\u0087\n¢\u0006\u0003\b\u009e\u0001J(\u0010\u009c\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U042\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\n¢\u0006\u0003\b\u009f\u0001J0\u0010\u009c\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U042\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0096\u0001H\u0087\n¢\u0006\u0003\b \u0001J1\u0010¡\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205042\u0007\u0010¢\u0001\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0003\b£\u0001J1\u0010¡\u0001\u001a\u00020f*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U042\u0007\u0010¢\u0001\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0003\b¤\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010'\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010*\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205048F¢\u0006\u0006\u001a\u0004\b6\u00107R$\u00108\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\u0011\u0010>\u001a\u00020?8G¢\u0006\u0006\u001a\u0004\b@\u0010AR$\u0010B\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R$\u0010F\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010N\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR$\u0010Q\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010H\"\u0004\bS\u0010JR\u001d\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020U048F¢\u0006\u0006\u001a\u0004\bV\u00107R$\u0010W\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u0010 R$\u0010Z\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\u001e\"\u0004\b\\\u0010 R$\u0010]\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\u001e\"\u0004\b_\u0010 R$\u0010`\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010\u0017¨\u0006¨\u0001"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;)V", "value", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "android", "getAndroid", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;)V", "", "appDebuggable", "getAppDebuggable", "()Z", "setAppDebuggable", "(Z)V", "", "bundleId", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleVersion", "getBundleVersion", "setBundleVersion", "", "cpuCount", "getCpuCount", "()J", "setCpuCount", "(J)V", "cpuModel", "getCpuModel", "setCpuModel", "deviceMake", "getDeviceMake", "setDeviceMake", "deviceModel", "getDeviceModel", "setDeviceModel", "gpuModel", "getGpuModel", "setGpuModel", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "ios", "getIos", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;)V", "keyboardLanguages", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$KeyboardLanguagesProxy;", "getKeyboardLanguages", "()Lcom/google/protobuf/kotlin/DslList;", "madeWithUnity", "getMadeWithUnity", "setMadeWithUnity", "osVersion", "getOsVersion", "setOsVersion", "platformSpecificCase", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", OperatingSystem.JsonKeys.ROOTED, "getRooted", "setRooted", "", "screenDensity", "getScreenDensity", "()I", "setScreenDensity", "(I)V", "screenHeight", "getScreenHeight", "setScreenHeight", "screenSize", "getScreenSize", "setScreenSize", "screenWidth", "getScreenWidth", "setScreenWidth", "stores", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "getStores", "totalDiskSpace", "getTotalDiskSpace", "setTotalDiskSpace", "totalDiskSpaceBytes", "getTotalDiskSpaceBytes", "setTotalDiskSpaceBytes", "totalRamMemory", "getTotalRamMemory", "setTotalRamMemory", "webviewUa", "getWebviewUa", "setWebviewUa", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "clearAndroid", "", "clearAppDebuggable", "clearBundleId", "clearBundleVersion", "clearCpuCount", "clearCpuModel", "clearDeviceMake", "clearDeviceModel", "clearGpuModel", "clearIos", "clearMadeWithUnity", "clearOsVersion", "clearPlatformSpecific", "clearRooted", "clearScreenDensity", "clearScreenHeight", "clearScreenSize", "clearScreenWidth", "clearTotalDiskSpace", "clearTotalDiskSpaceBytes", "clearTotalRamMemory", "clearWebviewUa", "hasAndroid", "hasAppDebuggable", "hasBundleId", "hasBundleVersion", "hasCpuCount", "hasCpuModel", "hasDeviceMake", "hasDeviceModel", "hasGpuModel", "hasIos", "hasMadeWithUnity", "hasOsVersion", "hasRooted", "hasScreenDensity", "hasScreenHeight", "hasScreenSize", "hasScreenWidth", "hasTotalDiskSpace", "hasTotalDiskSpaceBytes", "hasTotalRamMemory", "hasWebviewUa", m.l, "addKeyboardLanguages", "addStores", "addAll", "values", "", "addAllKeyboardLanguages", "addAllStores", "clear", "clearKeyboardLanguages", "clearStores", "plusAssign", "plusAssignKeyboardLanguages", "plusAssignAllKeyboardLanguages", "plusAssignStores", "plusAssignAllStores", "set", FirebaseAnalytics.Param.INDEX, "setKeyboardLanguages", "setStores", k.M, "KeyboardLanguagesProxy", "StoresProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: StaticDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            Intrinsics.checkNotNullExpressionValue(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final void setBundleId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBundleId(value);
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            Intrinsics.checkNotNullExpressionValue(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final void setBundleVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBundleVersion(value);
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            Intrinsics.checkNotNullExpressionValue(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final void setOsVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            Intrinsics.checkNotNullExpressionValue(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final void setDeviceMake(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            Intrinsics.checkNotNullExpressionValue(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final void setDeviceModel(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            Intrinsics.checkNotNullExpressionValue(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final void setWebviewUa(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setWebviewUa(value);
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final void setScreenDensity(int i) {
            this._builder.setScreenDensity(i);
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final void setScreenSize(int i) {
            this._builder.setScreenSize(i);
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        /* compiled from: StaticDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public final DslList<String, StoresProxy> getStores() {
            List<String> storesList = this._builder.getStoresList();
            Intrinsics.checkNotNullExpressionValue(storesList, "_builder.getStoresList()");
            return new DslList<>(storesList);
        }

        public final /* synthetic */ void addStores(DslList dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addStores(value);
        }

        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addStores(dslList, value);
        }

        public final /* synthetic */ void addAllStores(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllStores(values);
        }

        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllStores(dslList, values);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStores(i, value);
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearStores();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            Intrinsics.checkNotNullExpressionValue(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
        }

        public final void setCpuModel(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCpuModel(value);
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final void setCpuCount(long j) {
            this._builder.setCpuCount(j);
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            Intrinsics.checkNotNullExpressionValue(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final void setGpuModel(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGpuModel(value);
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        public final void setMadeWithUnity(boolean z) {
            this._builder.setMadeWithUnity(z);
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        /* compiled from: StaticDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$KeyboardLanguagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class KeyboardLanguagesProxy extends DslProxy {
            private KeyboardLanguagesProxy() {
            }
        }

        public final DslList<String, KeyboardLanguagesProxy> getKeyboardLanguages() {
            List<String> keyboardLanguagesList = this._builder.getKeyboardLanguagesList();
            Intrinsics.checkNotNullExpressionValue(keyboardLanguagesList, "_builder.getKeyboardLanguagesList()");
            return new DslList<>(keyboardLanguagesList);
        }

        public final /* synthetic */ void addKeyboardLanguages(DslList dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addKeyboardLanguages(value);
        }

        public final /* synthetic */ void plusAssignKeyboardLanguages(DslList<String, KeyboardLanguagesProxy> dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addKeyboardLanguages(dslList, value);
        }

        public final /* synthetic */ void addAllKeyboardLanguages(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllKeyboardLanguages(values);
        }

        public final /* synthetic */ void plusAssignAllKeyboardLanguages(DslList<String, KeyboardLanguagesProxy> dslList, Iterable<String> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllKeyboardLanguages(dslList, values);
        }

        public final /* synthetic */ void setKeyboardLanguages(DslList dslList, int i, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setKeyboardLanguages(i, value);
        }

        public final /* synthetic */ void clearKeyboardLanguages(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearKeyboardLanguages();
        }

        public final long getTotalDiskSpaceBytes() {
            return this._builder.getTotalDiskSpaceBytes();
        }

        public final void setTotalDiskSpaceBytes(long j) {
            this._builder.setTotalDiskSpaceBytes(j);
        }

        public final void clearTotalDiskSpaceBytes() {
            this._builder.clearTotalDiskSpaceBytes();
        }

        public final boolean hasTotalDiskSpaceBytes() {
            return this._builder.hasTotalDiskSpaceBytes();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            Intrinsics.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            Intrinsics.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m10840initializeandroid(Function1<? super AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        AndroidKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: StaticDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* compiled from: StaticDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 |2\u00020\u0001:\u0001|B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010N\u001a\u00020OH\u0001J\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u00020QJ\u0006\u0010S\u001a\u00020QJ\u0006\u0010T\u001a\u00020QJ\u0006\u0010U\u001a\u00020QJ\u0006\u0010V\u001a\u00020QJ\u0006\u0010W\u001a\u00020QJ\u0006\u0010X\u001a\u00020QJ\u0006\u0010Y\u001a\u00020QJ\u0006\u0010Z\u001a\u00020QJ\u0006\u0010[\u001a\u00020QJ\u0006\u0010\\\u001a\u00020QJ\u0006\u0010]\u001a\u00020QJ\u0006\u0010^\u001a\u00020QJ\u0006\u0010_\u001a\u00020QJ\u0006\u0010`\u001a\u00020QJ\u0006\u0010a\u001a\u00020QJ\u0006\u0010b\u001a\u00020QJ\u0006\u0010c\u001a\u00020QJ\u0006\u0010d\u001a\u00020QJ\u0006\u0010e\u001a\u00020QJ\u0006\u0010f\u001a\u00020gJ\u0006\u0010h\u001a\u00020gJ\u0006\u0010i\u001a\u00020gJ\u0006\u0010j\u001a\u00020gJ\u0006\u0010k\u001a\u00020gJ\u0006\u0010l\u001a\u00020gJ\u0006\u0010m\u001a\u00020gJ\u0006\u0010n\u001a\u00020gJ\u0006\u0010o\u001a\u00020gJ\u0006\u0010p\u001a\u00020gJ\u0006\u0010q\u001a\u00020gJ\u0006\u0010r\u001a\u00020gJ\u0006\u0010s\u001a\u00020gJ\u0006\u0010t\u001a\u00020gJ\u0006\u0010u\u001a\u00020gJ\u0006\u0010v\u001a\u00020gJ\u0006\u0010w\u001a\u00020gJ\u0006\u0010x\u001a\u00020gJ\u0006\u0010y\u001a\u00020gJ\u0006\u0010z\u001a\u00020gJ\u0006\u0010{\u001a\u00020gR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR$\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R$\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R$\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR$\u0010H\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR$\u0010K\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u000f\"\u0004\bM\u0010\u0011¨\u0006}"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;)V", "value", "", "androidFingerprint", "getAndroidFingerprint", "()Ljava/lang/String;", "setAndroidFingerprint", "(Ljava/lang/String;)V", "", "apiLevel", "getApiLevel", "()I", "setApiLevel", "(I)V", "apkDeveloperSigningCertificateHash", "getApkDeveloperSigningCertificateHash", "setApkDeveloperSigningCertificateHash", "appInstaller", "getAppInstaller", "setAppInstaller", "buildBoard", "getBuildBoard", "setBuildBoard", "buildBootloader", "getBuildBootloader", "setBuildBootloader", "buildBrand", "getBuildBrand", "setBuildBrand", "buildDevice", "getBuildDevice", "setBuildDevice", "buildDisplay", "getBuildDisplay", "setBuildDisplay", "buildFingerprint", "getBuildFingerprint", "setBuildFingerprint", "buildHardware", "getBuildHardware", "setBuildHardware", "buildHost", "getBuildHost", "setBuildHost", "buildId", "getBuildId", "setBuildId", "buildProduct", "getBuildProduct", "setBuildProduct", "displayScreenDensity", "getDisplayScreenDensity", "setDisplayScreenDensity", "extensionVersion", "getExtensionVersion", "setExtensionVersion", "", "jvmMaxMemory", "getJvmMaxMemory", "()J", "setJvmMaxMemory", "(J)V", X3.j.S, "getPhoneType", "setPhoneType", X3.j.R, "getSimOperator", "setSimOperator", "totalDiskSpaceInternal", "getTotalDiskSpaceInternal", "setTotalDiskSpaceInternal", j.h, "getVersionCode", "setVersionCode", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "clearAndroidFingerprint", "", "clearApiLevel", "clearApkDeveloperSigningCertificateHash", "clearAppInstaller", "clearBuildBoard", "clearBuildBootloader", "clearBuildBrand", "clearBuildDevice", "clearBuildDisplay", "clearBuildFingerprint", "clearBuildHardware", "clearBuildHost", "clearBuildId", "clearBuildProduct", "clearDisplayScreenDensity", "clearExtensionVersion", "clearJvmMaxMemory", "clearPhoneType", "clearSimOperator", "clearTotalDiskSpaceInternal", "clearVersionCode", "hasAndroidFingerprint", "", "hasApiLevel", "hasApkDeveloperSigningCertificateHash", "hasAppInstaller", "hasBuildBoard", "hasBuildBootloader", "hasBuildBrand", "hasBuildDevice", "hasBuildDisplay", "hasBuildFingerprint", "hasBuildHardware", "hasBuildHost", "hasBuildId", "hasBuildProduct", "hasDisplayScreenDensity", "hasExtensionVersion", "hasJvmMaxMemory", "hasPhoneType", "hasSimOperator", "hasTotalDiskSpaceInternal", "hasVersionCode", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: StaticDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Android build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
                return build;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final void setApiLevel(int i) {
                this._builder.setApiLevel(i);
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final void setVersionCode(int i) {
                this._builder.setVersionCode(i);
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                Intrinsics.checkNotNullExpressionValue(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final void setAndroidFingerprint(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                Intrinsics.checkNotNullExpressionValue(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final void setAppInstaller(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAppInstaller(value);
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                Intrinsics.checkNotNullExpressionValue(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final void setApkDeveloperSigningCertificateHash(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                Intrinsics.checkNotNullExpressionValue(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final void setBuildBoard(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBoard(value);
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                Intrinsics.checkNotNullExpressionValue(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final void setBuildBrand(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBrand(value);
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                Intrinsics.checkNotNullExpressionValue(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final void setBuildDevice(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildDevice(value);
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                Intrinsics.checkNotNullExpressionValue(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final void setBuildDisplay(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildDisplay(value);
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                Intrinsics.checkNotNullExpressionValue(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final void setBuildFingerprint(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                Intrinsics.checkNotNullExpressionValue(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final void setBuildHardware(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildHardware(value);
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                Intrinsics.checkNotNullExpressionValue(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final void setBuildHost(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildHost(value);
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                Intrinsics.checkNotNullExpressionValue(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final void setBuildBootloader(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildBootloader(value);
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                Intrinsics.checkNotNullExpressionValue(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final void setBuildProduct(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildProduct(value);
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                Intrinsics.checkNotNullExpressionValue(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final void setBuildId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuildId(value);
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final void setExtensionVersion(int i) {
                this._builder.setExtensionVersion(i);
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final void setPhoneType(int i) {
                this._builder.setPhoneType(i);
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                Intrinsics.checkNotNullExpressionValue(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final void setSimOperator(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSimOperator(value);
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            public final void setTotalDiskSpaceInternal(long j) {
                this._builder.setTotalDiskSpaceInternal(j);
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            public final void setDisplayScreenDensity(int i) {
                this._builder.setDisplayScreenDensity(i);
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final long getJvmMaxMemory() {
                return this._builder.getJvmMaxMemory();
            }

            public final void setJvmMaxMemory(long j) {
                this._builder.setJvmMaxMemory(j);
            }

            public final void clearJvmMaxMemory() {
                this._builder.clearJvmMaxMemory();
            }

            public final boolean hasJvmMaxMemory() {
                return this._builder.hasJvmMaxMemory();
            }
        }

        private AndroidKt() {
        }
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m10841initializeios(Function1<? super IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        IosKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: StaticDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* compiled from: StaticDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 e2\u00020\u0001:\u0002efB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010>\u001a\u00020?H\u0001J\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020AJ\u0006\u0010C\u001a\u00020AJ\u0006\u0010D\u001a\u00020AJ\u0006\u0010E\u001a\u00020AJ\u0006\u0010F\u001a\u00020AJ\u0006\u0010G\u001a\u00020AJ\u0006\u0010H\u001a\u00020AJ\u0006\u0010I\u001a\u00020AJ\u0006\u0010J\u001a\u00020AJ\u0006\u0010K\u001a\u00020AJ\u0006\u0010L\u001a\u00020\u0006J\u0006\u0010M\u001a\u00020\u0006J\u0006\u0010N\u001a\u00020\u0006J\u0006\u0010O\u001a\u00020\u0006J\u0006\u0010P\u001a\u00020\u0006J\u0006\u0010Q\u001a\u00020\u0006J\u0006\u0010R\u001a\u00020\u0006J\u0006\u0010S\u001a\u00020\u0006J\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0006J\u0006\u0010V\u001a\u00020\u0006J%\u0010W\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0002\bXJ+\u0010Y\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\f0[H\u0007¢\u0006\u0002\b\\J\u001d\u0010]\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"H\u0007¢\u0006\u0002\b^J&\u0010_\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0005\u001a\u00020\fH\u0087\n¢\u0006\u0002\b`J,\u0010_\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\f0[H\u0087\n¢\u0006\u0002\baJ.\u0010b\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"2\u0006\u0010c\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\bdR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR$\u00105\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R$\u00108\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011¨\u0006g"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;)V", "value", "", "adAttributionKitSupported", "getAdAttributionKitSupported", "()Z", "setAdAttributionKitSupported", "(Z)V", "", "builtSdkVersion", "getBuiltSdkVersion", "()Ljava/lang/String;", "setBuiltSdkVersion", "(Ljava/lang/String;)V", "bundleVersionFull", "getBundleVersionFull", "setBundleVersionFull", "canMakePayments", "getCanMakePayments", "setCanMakePayments", "", "screenScale", "getScreenScale", "()I", "setScreenScale", "(I)V", Device.JsonKeys.SIMULATOR, "getSimulator", "setSimulator", "skadnetworkId", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "getSkadnetworkId", "()Lcom/google/protobuf/kotlin/DslList;", "", "systemBootTime", "getSystemBootTime", "()J", "setSystemBootTime", "(J)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;", "userInterfaceIdiom", "getUserInterfaceIdiom", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;", "setUserInterfaceIdiom", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;)V", "userInterfaceIdiomValue", "getUserInterfaceIdiomValue", "setUserInterfaceIdiomValue", "xcodeBuildVersion", "getXcodeBuildVersion", "setXcodeBuildVersion", "xcodeSdkBuildVersion", "getXcodeSdkBuildVersion", "setXcodeSdkBuildVersion", "xcodeVersion", "getXcodeVersion", "setXcodeVersion", "_build", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "clearAdAttributionKitSupported", "", "clearBuiltSdkVersion", "clearBundleVersionFull", "clearCanMakePayments", "clearScreenScale", "clearSimulator", "clearSystemBootTime", "clearUserInterfaceIdiom", "clearXcodeBuildVersion", "clearXcodeSdkBuildVersion", "clearXcodeVersion", "hasAdAttributionKitSupported", "hasBuiltSdkVersion", "hasBundleVersionFull", "hasCanMakePayments", "hasScreenScale", "hasSimulator", "hasSystemBootTime", "hasUserInterfaceIdiom", "hasXcodeBuildVersion", "hasXcodeSdkBuildVersion", "hasXcodeVersion", m.l, "addSkadnetworkId", "addAll", "values", "", "addAllSkadnetworkId", "clear", "clearSkadnetworkId", "plusAssign", "plusAssignSkadnetworkId", "plusAssignAllSkadnetworkId", "set", FirebaseAnalytics.Param.INDEX, "setSkadnetworkId", k.M, "SkadnetworkIdProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: StaticDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios build = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
                return build;
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final void setSystemBootTime(long j) {
                this._builder.setSystemBootTime(j);
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                Intrinsics.checkNotNullExpressionValue(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final void setBuiltSdkVersion(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            /* compiled from: StaticDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                Intrinsics.checkNotNullExpressionValue(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList<>(skadnetworkIdList);
            }

            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addSkadnetworkId(dslList, value);
            }

            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSkadnetworkId(i, value);
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final void setScreenScale(int i) {
                this._builder.setScreenScale(i);
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                Intrinsics.checkNotNullExpressionValue(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final void setXcodeVersion(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeVersion(value);
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                Intrinsics.checkNotNullExpressionValue(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final void setXcodeBuildVersion(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                Intrinsics.checkNotNullExpressionValue(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final void setXcodeSdkBuildVersion(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final String getBundleVersionFull() {
                String bundleVersionFull = this._builder.getBundleVersionFull();
                Intrinsics.checkNotNullExpressionValue(bundleVersionFull, "_builder.getBundleVersionFull()");
                return bundleVersionFull;
            }

            public final void setBundleVersionFull(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBundleVersionFull(value);
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom getUserInterfaceIdiom() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom userInterfaceIdiom = this._builder.getUserInterfaceIdiom();
                Intrinsics.checkNotNullExpressionValue(userInterfaceIdiom, "_builder.getUserInterfaceIdiom()");
                return userInterfaceIdiom;
            }

            public final void setUserInterfaceIdiom(StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setUserInterfaceIdiom(value);
            }

            public final int getUserInterfaceIdiomValue() {
                return this._builder.getUserInterfaceIdiomValue();
            }

            public final void setUserInterfaceIdiomValue(int i) {
                this._builder.setUserInterfaceIdiomValue(i);
            }

            public final void clearUserInterfaceIdiom() {
                this._builder.clearUserInterfaceIdiom();
            }

            public final boolean hasUserInterfaceIdiom() {
                return this._builder.hasUserInterfaceIdiom();
            }

            public final boolean getAdAttributionKitSupported() {
                return this._builder.getAdAttributionKitSupported();
            }

            public final void setAdAttributionKitSupported(boolean z) {
                this._builder.setAdAttributionKitSupported(z);
            }

            public final void clearAdAttributionKitSupported() {
                this._builder.clearAdAttributionKitSupported();
            }

            public final boolean hasAdAttributionKitSupported() {
                return this._builder.hasAdAttributionKitSupported();
            }
        }

        private IosKt() {
        }
    }
}
