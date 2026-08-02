package com.cxsdk;

import G5.CoralogixJsStackFrame;
import G5.CoralogixStackTrace;
import Q4.q;
import Q5.AbstractC1510a;
import Q5.TraceParentInHeaderConfig;
import Q5.TraceParentInHeaderConfigOptions;
import Q5.UserContext;
import Q5.ViewContext;
import Q5.b;
import Q5.k;
import Q5.l;
import Q5.m;
import Q5.r;
import Q5.x;
import T5.a;
import a5.C1920b;
import a6.C1921a;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.cxsdk.CxSdkModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import lb.C5444x;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0006\n\u0002\b\u001f\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0002:\u0002\u0089\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00162\u001a\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u00132\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010$J'\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b'\u0010\u0012J\u0013\u0010)\u001a\u00020(*\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020!H\u0002¢\u0006\u0004\b+\u0010$J\u0013\u0010-\u001a\u00020,*\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00100\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010\u0012J!\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b1\u0010\u0012J\u001f\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\u0012J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b3\u0010$J\u0013\u00105\u001a\u000204*\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\u000207*\u00020!H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u001e*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u000eH\u0002¢\u0006\u0004\b:\u0010 J\u0013\u0010:\u001a\u00020\u001e*\u00020,H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\u00020@*\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0013*\u00020!H\u0002¢\u0006\u0004\bD\u0010$J\u0019\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u0013*\u00020!H\u0002¢\u0006\u0004\bF\u0010$J\u000f\u0010G\u001a\u00020\u0014H\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u0007H\u0017¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\u0007H\u0017¢\u0006\u0004\bT\u0010PJ\u0017\u0010U\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bU\u0010RJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00020\u0007H\u0017¢\u0006\u0004\bW\u0010PJ\u0017\u0010X\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bX\u0010RJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u0014H\u0017¢\u0006\u0004\bZ\u0010[J/\u0010_\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007H\u0017¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00162\u0006\u0010a\u001a\u00020\u0007H\u0017¢\u0006\u0004\bb\u0010PJ\u0017\u0010d\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u0007H\u0017¢\u0006\u0004\bd\u0010PJ\u0017\u0010f\u001a\u00020\u00162\u0006\u0010e\u001a\u00020\u0007H\u0017¢\u0006\u0004\bf\u0010PJ\u0017\u0010h\u001a\u00020\u00162\u0006\u0010g\u001a\u00020!H\u0017¢\u0006\u0004\bh\u0010iJ'\u0010n\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\u00142\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020\u0014H\u0017¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\u00142\u0006\u0010p\u001a\u00020!H\u0017¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bs\u0010RJ\u0017\u0010t\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bt\u0010RJ\u0017\u0010v\u001a\u00020\u00162\u0006\u0010u\u001a\u00020\u0007H\u0007¢\u0006\u0004\bv\u0010PJ\u0017\u0010x\u001a\u00020\u00162\u0006\u0010w\u001a\u00020\u0014H\u0007¢\u0006\u0004\bx\u0010[J\u0017\u0010z\u001a\u00020\u00162\u0006\u0010y\u001a\u00020<H\u0007¢\u0006\u0004\bz\u0010{J\u001f\u0010}\u001a\u00020\u00162\u0006\u0010|\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\b}\u0010MJ\u0017\u0010~\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\b~\u0010RJ\u0017\u0010\u007f\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\b\u007f\u0010RJ\u0019\u0010\u0080\u0001\u001a\u00020\u00162\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0005\b\u0080\u0001\u0010RJ\u0012\u0010\u0081\u0001\u001a\u00020\u0016H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020\u0016H\u0017¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u0016H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00162\u0007\u0010\u0085\u0001\u001a\u00020<H\u0017¢\u0006\u0005\b\u0086\u0001\u0010{J\u0012\u0010\u0087\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/cxsdk/CxSdkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", "La6/a;", "toSessionReplayOptions", "(Lcom/facebook/react/bridge/ReadableMap;)La6/a;", "LQ5/c;", "toCoralogixOptions", "(Lcom/facebook/react/bridge/ReadableMap;)LQ5/c;", "", "LQ5/q;", "", "toMobileVitalsOptions", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "", "", EventKeys.DATA, "", "beforeSendCallback", "(Ljava/util/List;)V", "list", "Lcom/facebook/react/bridge/WritableArray;", "convertAnyListToWritableArray", "(Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;", "map", "Lcom/facebook/react/bridge/WritableMap;", "convertMapToWritableMap", "(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "readableArray", "convertStrictReadableArrayToListOfMaps", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "convertReadableArrayToAnyList", "readableMap", "convertReadableMapToMap", "LQ5/a;", "toCoralogixDomain", "(Ljava/lang/String;)LQ5/a;", "handleStringOrRegexList", "LQ5/w;", "toUserContext", "(Lcom/facebook/react/bridge/ReadableMap;)LQ5/w;", "LQ5/m;", "toInstrumentationMap", "toStringAnyMap", "toStringMap", "toStringList", "Lorg/json/JSONObject;", "toJsonObject", "(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "toJsonArray", "(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;", "toWritableMap", "(LQ5/w;)Lcom/facebook/react/bridge/WritableMap;", "", "LQ5/b;", "toCoralogixLogSeverity", "(I)LQ5/b;", "La5/b;", "toNetworkRequestDetails", "(Lcom/facebook/react/bridge/ReadableMap;)La5/b;", "LQ5/r;", "toNetworkCaptureRuleList", "LQ5/l;", "toHybridMetricList", "getName", "()Ljava/lang/String;", "config", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "initialize", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "userContextMap", "setUserContext", "(Lcom/facebook/react/bridge/ReadableMap;)V", "getUserContext", "(Lcom/facebook/react/bridge/Promise;)V", "appContextMap", "setApplicationContext", "getSessionId", "labelsMap", "setLabels", "getLabels", "viewContext", "setViewContext", "(Ljava/lang/String;)V", "severity", "message", "labels", "log", "(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)V", "requestDetails", "reportNetworkRequest", "measurement", "sendCustomMeasurement", ErrorBundle.DETAIL_ENTRY, "reportError", "results", "sendCxSpanData", "(Lcom/facebook/react/bridge/ReadableArray;)V", "type", "", EventKeys.VALUE_KEY, "units", "reportMobileVitalsMeasurement", "(Ljava/lang/String;DLjava/lang/String;)V", "metrics", "reportMobileVitalsMeasurementSet", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "isCoralogixGradlePluginApplied", "shutdown", "interaction", "reportUserInteraction", "eventName", "addListener", "count", "removeListeners", "(I)V", "options", "initializeSessionReplay", "shutdownSessionReplay", "isSessionReplayInitialized", "isRecording", "startSessionRecording", "()V", "stopSessionRecording", "captureScreenshot", "viewTag", "maskViewByTag", "invalidate", "Companion", "a", "coralogix_react-native-plugin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCxSdkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CxSdkModule.kt\ncom/cxsdk/CxSdkModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,783:1\n1617#2,9:784\n1869#2:793\n1870#2:795\n1626#2:796\n1563#2:797\n1634#2,3:798\n1869#2,2:801\n1#3:794\n1#3:805\n216#4,2:803\n*S KotlinDebug\n*F\n+ 1 CxSdkModule.kt\ncom/cxsdk/CxSdkModule\n*L\n148#1:784,9\n148#1:793\n148#1:795\n148#1:796\n149#1:797\n149#1:798,3\n410#1:801,2\n148#1:794\n433#1:803,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CxSdkModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "CxSdk";

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, CxSdkModule.class, "beforeSendCallback", "beforeSendCallback(Ljava/util/List;)V", 0);
        }

        public final void a(List p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((CxSdkModule) this.receiver).beforeSendCallback(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CxSdkModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beforeSendCallback(List<? extends Map<String, ? extends Object>> data) {
        WritableArray convertAnyListToWritableArray = convertAnyListToWritableArray(data);
        if (getReactApplicationContext().hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onBeforeSend", convertAnyListToWritableArray);
        }
    }

    private final WritableArray convertAnyListToWritableArray(List<? extends Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                createArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                createArray.pushMap(convertMapToWritableMap((Map) obj));
            } else if (obj instanceof List) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                createArray.pushArray(convertAnyListToWritableArray((List) obj));
            } else {
                createArray.pushString(obj.toString());
            }
        }
        return createArray;
    }

    private final WritableMap convertMapToWritableMap(Map<String, ? extends Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                createMap.putNull(key);
            } else if (value instanceof Boolean) {
                createMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                createMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                createMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Float) {
                createMap.putDouble(key, ((Number) value).floatValue());
            } else if (value instanceof Long) {
                if (Intrinsics.areEqual(key, "severity")) {
                    createMap.putInt(key, (int) ((Number) value).longValue());
                } else {
                    createMap.putString(key, String.valueOf(((Number) value).longValue()));
                }
            } else if (value instanceof String) {
                createMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                createMap.putMap(key, convertMapToWritableMap((Map) value));
            } else if (value instanceof List) {
                createMap.putArray(key, convertAnyListToWritableArray((List) value));
            } else {
                createMap.putString(key, value.toString());
            }
        }
        return createMap;
    }

    private final List<Object> convertReadableArrayToAnyList(ReadableArray readableArray) {
        if (readableArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (b.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    arrayList.add(d10 % ((double) 1) == 0.0d ? Integer.valueOf((int) d10) : Double.valueOf(d10));
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(convertReadableMapToMap(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList.add(convertReadableArrayToAnyList(readableArray.getArray(i10)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }

    private final Map<String, Object> convertReadableMapToMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (b.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    linkedHashMap.put(nextKey, null);
                    break;
                case 2:
                    linkedHashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case 3:
                    double d10 = readableMap.getDouble(nextKey);
                    linkedHashMap.put(nextKey, d10 % ((double) 1) == 0.0d ? Integer.valueOf((int) d10) : Double.valueOf(d10));
                    break;
                case 4:
                    linkedHashMap.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    Intrinsics.checkNotNull(map);
                    linkedHashMap.put(nextKey, convertReadableMapToMap(map));
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    Intrinsics.checkNotNull(array);
                    linkedHashMap.put(nextKey, convertReadableArrayToAnyList(array));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return linkedHashMap;
    }

    private final List<Map<String, Object>> convertStrictReadableArrayToListOfMaps(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readableArray.getType(i10) != ReadableType.Map) {
                throw new IllegalArgumentException("Expected array of maps, but found " + readableArray.getType(i10) + " at index " + i10);
            }
            arrayList.add(convertReadableMapToMap(readableArray.getMap(i10)));
        }
        return arrayList;
    }

    private final List<String> handleStringOrRegexList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = b.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()];
            if (i11 == 4) {
                String string = readableArray.getString(i10);
                if (string != null) {
                    arrayList.add(string);
                }
            } else if (i11 == 5) {
                ReadableMap map = readableArray.getMap(i10);
                String string2 = map != null ? map.getString("source") : null;
                if (string2 != null) {
                    arrayList.add(string2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(Application application, Q5.c cVar, String str, Promise promise) {
        q.f9352a.x(application, cVar, new k.b.a(str));
        promise.resolve(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSessionReplay$lambda$7(CxSdkModule cxSdkModule, C1921a c1921a, Promise promise) {
        a aVar = a.f10956a;
        ReactApplicationContext reactApplicationContext = cxSdkModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        aVar.b(reactApplicationContext, c1921a);
        promise.resolve(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidate$lambda$10() {
        q.f9352a.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maskViewByTag$lambda$9(int i10, NativeViewHierarchyManager nativeViewHierarchyManager) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyManager, "nativeViewHierarchyManager");
        try {
            View resolveView = nativeViewHierarchyManager.resolveView(i10);
            if (resolveView != null) {
                a.f10956a.e(resolveView);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdown$lambda$5(Promise promise) {
        q.f9352a.Z();
        promise.resolve(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownSessionReplay$lambda$8(Promise promise) {
        a.f10956a.h();
        promise.resolve(Boolean.TRUE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final AbstractC1510a toCoralogixDomain(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1179540453:
                if (upperCase.equals("STAGING")) {
                    return AbstractC1510a.f.f9368b;
                }
                break;
            case 64994:
                if (upperCase.equals("AP1")) {
                    return AbstractC1510a.C0181a.f9363b;
                }
                break;
            case 64995:
                if (upperCase.equals("AP2")) {
                    return AbstractC1510a.b.f9364b;
                }
                break;
            case 64996:
                if (upperCase.equals("AP3")) {
                    return AbstractC1510a.c.f9365b;
                }
                break;
            case 68993:
                if (upperCase.equals("EU1")) {
                    return AbstractC1510a.d.f9366b;
                }
                break;
            case 68994:
                if (upperCase.equals("EU2")) {
                    return AbstractC1510a.e.f9367b;
                }
                break;
            case 84307:
                if (upperCase.equals("US1")) {
                    return AbstractC1510a.g.f9369b;
                }
                break;
            case 84308:
                if (upperCase.equals("US2")) {
                    return AbstractC1510a.h.f9370b;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid coralogixDomain: " + str + ". Must be one of [EU1, EU2, US1, US2, AP1, AP2, AP3, STAGING]");
    }

    private final Q5.b toCoralogixLogSeverity(int i10) {
        switch (i10) {
            case 1:
                return b.d.f9375b;
            case 2:
                return b.g.f9378b;
            case 3:
                return b.f.f9377b;
            case 4:
                return b.h.f9379b;
            case 5:
                return b.e.f9376b;
            case 6:
                return b.c.f9374b;
            default:
                throw new IllegalArgumentException("Invalid severity: " + i10 + ". Must be one of [1, 2, 3, 4, 5, 6]");
        }
    }

    private final Q5.c toCoralogixOptions(ReadableMap readableMap) {
        AbstractC1510a coralogixDomain;
        List<String> emptyList;
        TraceParentInHeaderConfig traceParentInHeaderConfig;
        List<r> emptyList2;
        Map<String, Object> emptyMap;
        UserContext userContext;
        Map<m, Boolean> emptyMap2;
        Map<Q5.q, Boolean> emptyMap3;
        List<String> emptyList3;
        List<String> emptyList4;
        String string;
        ReadableMap map;
        ReadableArray array;
        String string2 = readableMap.getString("application");
        if (string2 == null) {
            throw new IllegalArgumentException("Missing required parameter: application");
        }
        String string3 = readableMap.getString("public_key");
        if (string3 == null) {
            throw new IllegalArgumentException("Missing required parameter: publicKey");
        }
        String string4 = readableMap.getString("coralogixDomain");
        if (string4 == null || (coralogixDomain = toCoralogixDomain(string4)) == null) {
            throw new IllegalArgumentException("Missing required parameter: coralogixDomain");
        }
        ReadableMap map2 = readableMap.getMap("traceParentInHeader");
        if (map2 == null || (map = map2.getMap("options")) == null || (array = map.getArray("allowedTracingUrls")) == null || (emptyList = toStringList(array)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        c cVar = null;
        if (map2 != null) {
            traceParentInHeaderConfig = new TraceParentInHeaderConfig(map2.hasKey(ViewProps.ENABLED) ? map2.getBoolean(ViewProps.ENABLED) : false, new TraceParentInHeaderConfigOptions(emptyList));
        } else {
            traceParentInHeaderConfig = new TraceParentInHeaderConfig(false, (TraceParentInHeaderConfigOptions) null, 3, (DefaultConstructorMarker) null);
        }
        TraceParentInHeaderConfig traceParentInHeaderConfig2 = traceParentInHeaderConfig;
        boolean z10 = readableMap.hasKey("collectIPData") ? readableMap.getBoolean("collectIPData") : true;
        if (!readableMap.hasKey("networkExtraConfig") || readableMap.isNull("networkExtraConfig")) {
            emptyList2 = CollectionsKt.emptyList();
        } else {
            ReadableArray array2 = readableMap.getArray("networkExtraConfig");
            if (array2 == null || (emptyList2 = toNetworkCaptureRuleList(array2)) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
        }
        List<r> list = emptyList2;
        ReadableMap map3 = readableMap.getMap("labels");
        if (map3 == null || (emptyMap = toStringAnyMap(map3)) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        String string5 = readableMap.getString("environment");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = readableMap.getString("version");
        if (string6 == null) {
            string6 = "";
        }
        ReadableMap map4 = readableMap.getMap("user_context");
        if (map4 == null || (userContext = toUserContext(map4)) == null) {
            userContext = new UserContext((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
        }
        ReadableMap map5 = readableMap.getMap("view_context");
        ViewContext viewContext = new ViewContext((map5 == null || (string = map5.getString("view")) == null) ? "" : string, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
        ReadableMap map6 = readableMap.getMap("instrumentations");
        if (map6 == null || (emptyMap2 = toInstrumentationMap(map6)) == null) {
            emptyMap2 = MapsKt.emptyMap();
        }
        Map<m, Boolean> map7 = emptyMap2;
        ReadableMap map8 = readableMap.getMap("mobileVitals");
        if (map8 == null || (emptyMap3 = toMobileVitalsOptions(map8)) == null) {
            emptyMap3 = MapsKt.emptyMap();
        }
        Map<Q5.q, Boolean> map9 = emptyMap3;
        ReadableArray array3 = readableMap.getArray("ignoreUrls");
        if (array3 == null || (emptyList3 = handleStringOrRegexList(array3)) == null) {
            emptyList3 = CollectionsKt.emptyList();
        }
        List<String> list2 = emptyList3;
        ReadableArray array4 = readableMap.getArray("ignoreErrors");
        if (array4 == null || (emptyList4 = handleStringOrRegexList(array4)) == null) {
            emptyList4 = CollectionsKt.emptyList();
        }
        List<String> list3 = emptyList4;
        boolean z11 = readableMap.hasKey("debug") ? readableMap.getBoolean("debug") : false;
        String string7 = readableMap.getString("proxyUrl");
        if (readableMap.hasKey("hasBeforeSend") && readableMap.getBoolean("hasBeforeSend")) {
            cVar = new c(this);
        }
        return new Q5.c(string2, coralogixDomain, string3, string6, emptyMap, string5, userContext, viewContext, map7, map9, list2, list3, z10, 100, traceParentInHeaderConfig2, z11, string7, null, cVar, null, list, 655360, null);
    }

    private final List<l> toHybridMetricList(ReadableArray readableArray) {
        String string;
        ArrayList arrayList = new ArrayList(readableArray.size());
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map == null || (string = map.getString("name")) == null) {
                throw new IllegalArgumentException("metrics[" + i10 + "].name is required");
            }
            if (!map.hasKey(EventKeys.VALUE_KEY) || map.isNull(EventKeys.VALUE_KEY)) {
                throw new IllegalArgumentException("metrics[" + i10 + "].value is required");
            }
            double d10 = map.getDouble(EventKeys.VALUE_KEY);
            String string2 = map.getString("units");
            if (string2 == null) {
                throw new IllegalArgumentException("metrics[" + i10 + "].units is required");
            }
            arrayList.add(new l(string, d10, string2));
        }
        return arrayList;
    }

    private final Map<m, Boolean> toInstrumentationMap(ReadableMap readableMap) {
        return MapsKt.mapOf(TuplesKt.to(m.c.f9443b, Boolean.valueOf(readableMap.hasKey("error") ? readableMap.getBoolean("error") : true)), TuplesKt.to(m.f.f9446b, Boolean.valueOf(readableMap.hasKey("fetch") ? readableMap.getBoolean("fetch") : true)), TuplesKt.to(m.b.f9442b, Boolean.valueOf(readableMap.hasKey("custom") ? readableMap.getBoolean("custom") : true)), TuplesKt.to(m.e.f9445b, Boolean.valueOf(readableMap.hasKey("mobile_vitals") ? readableMap.getBoolean("mobile_vitals") : true)), TuplesKt.to(m.a.f9441b, Boolean.valueOf(readableMap.hasKey("anr") ? readableMap.getBoolean("anr") : true)), TuplesKt.to(m.d.f9444b, Boolean.valueOf(readableMap.hasKey("lifecycle") ? readableMap.getBoolean("lifecycle") : true)), TuplesKt.to(m.g.f9447b, Boolean.valueOf(readableMap.hasKey("user_interaction") ? readableMap.getBoolean("user_interaction") : true)));
    }

    private final JSONArray toJsonArray(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = null;
            switch (b.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                case 1:
                    obj = JSONObject.NULL;
                    break;
                case 2:
                    obj = Boolean.valueOf(readableArray.getBoolean(i10));
                    break;
                case 3:
                    obj = Double.valueOf(readableArray.getDouble(i10));
                    break;
                case 4:
                    obj = readableArray.getString(i10);
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i10);
                    if (map != null) {
                        obj = toJsonObject(map);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    ReadableArray array = readableArray.getArray(i10);
                    if (array != null) {
                        obj = toJsonArray(array);
                        break;
                    } else {
                        break;
                    }
                default:
                    obj = JSONObject.NULL;
                    break;
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    private final JSONObject toJsonObject(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = null;
            switch (b.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    obj = JSONObject.NULL;
                    break;
                case 2:
                    obj = Boolean.valueOf(readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    obj = Double.valueOf(readableMap.getDouble(nextKey));
                    break;
                case 4:
                    obj = readableMap.getString(nextKey);
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map == null) {
                        break;
                    } else {
                        obj = toJsonObject(map);
                        break;
                    }
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    if (array == null) {
                        break;
                    } else {
                        obj = toJsonArray(array);
                        break;
                    }
                default:
                    obj = JSONObject.NULL;
                    break;
            }
            jSONObject.put(nextKey, obj);
        }
        return jSONObject;
    }

    private final Map<Q5.q, Boolean> toMobileVitalsOptions(ReadableMap readableMap) {
        Map mapOf = MapsKt.mapOf(TuplesKt.to("cold", Q5.q.f9462a), TuplesKt.to("warm", Q5.q.f9463b), TuplesKt.to("cpu", Q5.q.f9464c), TuplesKt.to("memory", Q5.q.f9465d), TuplesKt.to("slowFrozenFrames", Q5.q.f9466e), TuplesKt.to("rendering", Q5.q.f9467f));
        Map createMapBuilder = MapsKt.createMapBuilder();
        for (Map.Entry entry : mapOf.entrySet()) {
            String str = (String) entry.getKey();
            Q5.q qVar = (Q5.q) entry.getValue();
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                createMapBuilder.put(qVar, Boolean.valueOf(readableMap.getBoolean(str)));
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    private final List<r> toNetworkCaptureRuleList(ReadableArray readableArray) {
        List<String> emptyList;
        List<String> emptyList2;
        String string;
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map != null) {
                Regex regex = null;
                String string2 = (!map.hasKey(EventKeys.URL) || map.isNull(EventKeys.URL)) ? null : map.getString(EventKeys.URL);
                if (map.hasKey("urlPattern") && !map.isNull("urlPattern")) {
                    String string3 = map.getString("urlPattern");
                    String str = "";
                    if (string3 == null) {
                        string3 = "";
                    }
                    if (map.hasKey("urlPatternFlags") && !map.isNull("urlPatternFlags") && (string = map.getString("urlPatternFlags")) != null) {
                        str = string;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (StringsKt.contains$default((CharSequence) str, 'i', false, 2, (Object) null)) {
                        linkedHashSet.add(RegexOption.IGNORE_CASE);
                    }
                    if (StringsKt.contains$default((CharSequence) str, 'm', false, 2, (Object) null)) {
                        linkedHashSet.add(RegexOption.MULTILINE);
                    }
                    regex = new Regex(string3, linkedHashSet);
                }
                Regex regex2 = regex;
                if (!map.hasKey("reqHeaders") || map.isNull("reqHeaders")) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    ReadableArray array = map.getArray("reqHeaders");
                    if (array == null || (emptyList = toStringList(array)) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                }
                if (!map.hasKey("resHeaders") || map.isNull("resHeaders")) {
                    emptyList2 = CollectionsKt.emptyList();
                } else {
                    ReadableArray array2 = map.getArray("resHeaders");
                    if (array2 == null || (emptyList2 = toStringList(array2)) == null) {
                        emptyList2 = CollectionsKt.emptyList();
                    }
                }
                arrayList.add(new r(string2, regex2, emptyList, emptyList2, map.hasKey("collectReqPayload") ? map.getBoolean("collectReqPayload") : false, map.hasKey("collectResPayload") ? map.getBoolean("collectResPayload") : false));
            }
        }
        return arrayList;
    }

    private final C1920b toNetworkRequestDetails(ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        String string = readableMap.getString("method");
        String str = string == null ? "" : string;
        int i10 = readableMap.hasKey("statusCode") ? readableMap.getInt("statusCode") : 0;
        String string2 = readableMap.getString(EventKeys.URL);
        String str2 = string2 == null ? "" : string2;
        String string3 = readableMap.getString("fragments");
        String str3 = string3 == null ? "" : string3;
        String string4 = readableMap.getString("host");
        String str4 = string4 == null ? "" : string4;
        String string5 = readableMap.getString("schema");
        String str5 = string5 == null ? "" : string5;
        String string6 = readableMap.getString("statusText");
        String str6 = string6 == null ? "" : string6;
        long j10 = readableMap.hasKey("duration") ? (long) readableMap.getDouble("duration") : 0L;
        long j11 = readableMap.hasKey("responseContentLength") ? (long) readableMap.getDouble("responseContentLength") : 0L;
        String string7 = readableMap.getString("errorMessage");
        String string8 = readableMap.getString("customTraceId");
        String string9 = readableMap.getString("customSpanId");
        String str7 = null;
        Map<String, String> stringMap = (!readableMap.hasKey("request_headers") || readableMap.isNull("request_headers") || (map2 = readableMap.getMap("request_headers")) == null) ? null : toStringMap(map2);
        Map<String, String> stringMap2 = (!readableMap.hasKey("response_headers") || readableMap.isNull("response_headers") || (map = readableMap.getMap("response_headers")) == null) ? null : toStringMap(map);
        String string10 = (!readableMap.hasKey("request_payload") || readableMap.isNull("request_payload")) ? null : readableMap.getString("request_payload");
        if (readableMap.hasKey("response_payload") && !readableMap.isNull("response_payload")) {
            str7 = readableMap.getString("response_payload");
        }
        C1920b c1920b = new C1920b(string8, string9, str, i10, str2, str3, str4, str5, str6, j10, j11, string7, stringMap, stringMap2, string10, str7);
        c1920b.toString();
        return c1920b;
    }

    private final C1921a toSessionReplayOptions(ReadableMap readableMap) {
        List<String> emptyList;
        double d10 = readableMap.hasKey("captureScale") ? readableMap.getDouble("captureScale") : 0.5d;
        Number valueOf = readableMap.hasKey("captureCompressQuality") ? Double.valueOf(readableMap.getDouble("captureCompressQuality")) : 1;
        int i10 = readableMap.hasKey("sessionRecordingSampleRate") ? readableMap.getInt("sessionRecordingSampleRate") : 100;
        boolean z10 = readableMap.hasKey("autoStartSessionRecording") ? readableMap.getBoolean("autoStartSessionRecording") : true;
        boolean z11 = readableMap.hasKey("maskAllTexts") ? readableMap.getBoolean("maskAllTexts") : true;
        boolean z12 = readableMap.hasKey("maskAllImages") ? readableMap.getBoolean("maskAllImages") : false;
        if (!readableMap.hasKey("textsToMask") || readableMap.isNull("textsToMask")) {
            emptyList = CollectionsKt.emptyList();
        } else {
            ReadableArray array = readableMap.getArray("textsToMask");
            if (array == null || (emptyList = handleStringOrRegexList(array)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
        }
        return new C1921a((float) d10, valueOf.floatValue(), i10, z10, z11, emptyList, null, z12, 0, null, 832, null);
    }

    private final Map<String, Object> toStringAnyMap(ReadableMap readableMap) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (b.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    obj = JSONObject.NULL;
                    break;
                case 2:
                    obj = Boolean.valueOf(readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    obj = Double.valueOf(readableMap.getDouble(nextKey));
                    break;
                case 4:
                    obj = readableMap.getString(nextKey);
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map == null) {
                        obj = null;
                        break;
                    } else {
                        obj = toStringAnyMap(map);
                        break;
                    }
                case 6:
                    obj = convertReadableArrayToAnyList(readableMap.getArray(nextKey));
                    break;
                default:
                    obj = JSONObject.NULL;
                    break;
            }
            linkedHashMap.put(nextKey, obj);
        }
        return linkedHashMap;
    }

    private final List<String> toStringList(ReadableArray readableArray) {
        if (readableArray == null) {
            return CollectionsKt.emptyList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (readableArray.getType(i10) == ReadableType.String) {
                    String string = readableArray.getString(i10);
                    if (string != null) {
                        arrayList.add(string);
                    } else {
                        Log.w("CxSdkModule", "getString(" + i10 + ") returned null despite ReadableType.String, skipping value");
                    }
                } else {
                    Log.w("CxSdkModule", "Value at " + i10 + " in ReadableArray is of type " + readableArray.getType(i10) + ", expecting String, skipping value");
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final Map<String, String> toStringMap(ReadableMap readableMap) {
        String obj;
        Object wrap;
        String obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj3 = null;
            switch (b.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    obj3 = JSONObject.NULL;
                    break;
                case 2:
                    obj3 = Boolean.valueOf(readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    obj3 = Double.valueOf(readableMap.getDouble(nextKey));
                    break;
                case 4:
                    obj3 = readableMap.getString(nextKey);
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map != null) {
                        obj3 = toJsonObject(map);
                        break;
                    }
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    if (array != null) {
                        obj3 = toJsonArray(array);
                        break;
                    }
                    break;
                default:
                    obj3 = JSONObject.NULL;
                    break;
            }
            if ((obj3 instanceof JSONObject) || (obj3 instanceof JSONArray)) {
                obj = obj3.toString();
            } else {
                obj = "null";
                if (!Intrinsics.areEqual(obj3, JSONObject.NULL) && (wrap = JSONObject.wrap(obj3)) != null && (obj2 = wrap.toString()) != null) {
                    obj = obj2;
                }
            }
            linkedHashMap.put(nextKey, obj);
        }
        return linkedHashMap;
    }

    private final UserContext toUserContext(ReadableMap readableMap) {
        Map<String, String> emptyMap;
        String string = readableMap.getString("user_id");
        if (string == null) {
            string = "";
        }
        String string2 = readableMap.getString("user_name");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = readableMap.getString("user_email");
        String str = string3 != null ? string3 : "";
        ReadableMap map = readableMap.getMap("user_metadata");
        if (map == null || (emptyMap = toStringMap(map)) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        return new UserContext(string, string2, str, emptyMap);
    }

    private final WritableMap toWritableMap(Map<String, String> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            createMap.putString(entry.getKey(), entry.getValue());
        }
        return createMap;
    }

    @ReactMethod
    public final void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @ReactMethod
    public void captureScreenshot() {
        a.f10956a.a();
    }

    @ReactMethod
    public void getLabels(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(convertMapToWritableMap(q.f9352a.r()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSessionId(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(q.f9352a.t());
    }

    @ReactMethod
    public void getUserContext(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(toWritableMap(q.f9352a.v()));
    }

    @ReactMethod
    public void initialize(@NotNull ReadableMap config, @NotNull final Promise promise) {
        String string;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        final Application application = (Application) applicationContext;
        final Q5.c coralogixOptions = toCoralogixOptions(config);
        final String str = "";
        if (config.hasKey("frameworkVersion") && !config.isNull("frameworkVersion") && (string = config.getString("frameworkVersion")) != null) {
            str = string;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b6.a
            @Override // java.lang.Runnable
            public final void run() {
                CxSdkModule.initialize$lambda$0(application, coralogixOptions, str, promise);
            }
        });
    }

    @ReactMethod
    public void initializeSessionReplay(@NotNull ReadableMap options, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final C1921a sessionReplayOptions = toSessionReplayOptions(options);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b6.c
            @Override // java.lang.Runnable
            public final void run() {
                CxSdkModule.initializeSessionReplay$lambda$7(CxSdkModule.this, sessionReplayOptions, promise);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b6.e
            @Override // java.lang.Runnable
            public final void run() {
                CxSdkModule.invalidate$lambda$10();
            }
        });
    }

    @ReactMethod
    public void isCoralogixGradlePluginApplied(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        q qVar = q.f9352a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(qVar.y(reactApplicationContext)));
    }

    @ReactMethod
    public void isRecording(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(a.f10956a.d()));
    }

    @ReactMethod
    public void isSessionReplayInitialized(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(a.f10956a.c()));
    }

    @ReactMethod
    public void log(int severity, @NotNull String message, @NotNull ReadableMap data, @NotNull ReadableMap labels) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(labels, "labels");
        q.f9352a.A(toCoralogixLogSeverity(severity), message, toStringAnyMap(data), toStringAnyMap(labels));
    }

    @ReactMethod
    public void maskViewByTag(final int viewTag) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new UIBlock() { // from class: b6.f
                @Override // com.facebook.react.uimanager.UIBlock
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    CxSdkModule.maskViewByTag$lambda$9(viewTag, nativeViewHierarchyManager);
                }
            });
        }
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public void reportError(@NotNull ReadableMap details) {
        Intrinsics.checkNotNullParameter(details, "details");
        String string = details.getString("error_type");
        String str = string == null ? "" : string;
        String string2 = details.getString(EventKeys.ERROR_MESSAGE_KEY);
        String str2 = string2 == null ? "" : string2;
        Boolean valueOf = Boolean.valueOf(details.getBoolean("is_crash"));
        List list = null;
        if (!details.hasKey("is_crash")) {
            valueOf = null;
        }
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        ReadableArray array = details.getArray("stack_trace");
        if (array != null) {
            IntRange until = RangesKt.until(0, array.size());
            ArrayList<ReadableMap> arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                ReadableMap map = array.getMap(((IntIterator) it).nextInt());
                if (map != null) {
                    arrayList.add(map);
                }
            }
            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (ReadableMap readableMap : arrayList) {
                String string3 = readableMap.getString("functionName");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = readableMap.getString("fileName");
                if (string4 == null) {
                    string4 = "";
                }
                int i10 = -1;
                int i11 = readableMap.hasKey("lineNumber") ? readableMap.getInt("lineNumber") : -1;
                if (readableMap.hasKey("columnNumber")) {
                    i10 = readableMap.getInt("columnNumber");
                }
                list.add(new CoralogixJsStackFrame(string3, string4, i11, i10));
            }
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        q.f9352a.C(new U4.a(str, str2, new CoralogixStackTrace(list), booleanValue, null, null, null, 112, null));
    }

    @ReactMethod
    public void reportMobileVitalsMeasurement(@NotNull String type, double value, @NotNull String units) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(units, "units");
        q.f9352a.E(type, value, units);
    }

    @ReactMethod
    public void reportMobileVitalsMeasurementSet(@NotNull String type, @NotNull ReadableArray metrics) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        q.f9352a.F(type, toHybridMetricList(metrics));
    }

    @ReactMethod
    public void reportNetworkRequest(@NotNull ReadableMap requestDetails) {
        Intrinsics.checkNotNullParameter(requestDetails, "requestDetails");
        q.f9352a.I(toNetworkRequestDetails(requestDetails));
    }

    @ReactMethod
    public final void reportUserInteraction(@NotNull ReadableMap interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Double d10 = null;
        ReadableMap map = (!interaction.hasKey("attributes") || interaction.isNull("attributes")) ? null : interaction.getMap("attributes");
        String string = interaction.getString("type");
        if (string == null) {
            Log.w("CxSdkModule", "reportUserInteraction: missing required field 'type', dropping interaction");
            return;
        }
        String string2 = (!interaction.hasKey(EventKeys.DIRECTION_KEY) || interaction.isNull(EventKeys.DIRECTION_KEY)) ? null : interaction.getString(EventKeys.DIRECTION_KEY);
        String string3 = (!interaction.hasKey("target_element") || interaction.isNull("target_element")) ? null : interaction.getString("target_element");
        String string4 = (!interaction.hasKey("element_classes") || interaction.isNull("element_classes")) ? null : interaction.getString("element_classes");
        String string5 = (!interaction.hasKey("target_id") || interaction.isNull("target_id")) ? null : interaction.getString("target_id");
        String string6 = (!interaction.hasKey("inner_text") || interaction.isNull("inner_text")) ? null : interaction.getString("inner_text");
        Double valueOf = (map == null || !map.hasKey(C5444x.f55808b) || map.isNull(C5444x.f55808b)) ? null : Double.valueOf(map.getDouble(C5444x.f55808b));
        if (map != null && map.hasKey("y") && !map.isNull("y")) {
            d10 = Double.valueOf(map.getDouble("y"));
        }
        q.f9352a.K(new x(string, string2, string3, string4, string5, string6, valueOf, d10));
    }

    @ReactMethod
    public void sendCustomMeasurement(@NotNull ReadableMap measurement) {
        Intrinsics.checkNotNullParameter(measurement, "measurement");
        String string = measurement.getString("name");
        if (string == null) {
            throw new IllegalArgumentException("Missing required parameter: name");
        }
        if (!measurement.hasKey(EventKeys.VALUE_KEY)) {
            throw new IllegalArgumentException("Missing required parameter: value");
        }
        q.f9352a.M(string, (long) measurement.getDouble(EventKeys.VALUE_KEY));
    }

    @ReactMethod
    public void sendCxSpanData(@NotNull ReadableArray results) {
        Intrinsics.checkNotNullParameter(results, "results");
        q.f9352a.O(convertStrictReadableArrayToListOfMaps(results));
    }

    @ReactMethod
    public void setApplicationContext(@NotNull ReadableMap appContextMap) {
        Intrinsics.checkNotNullParameter(appContextMap, "appContextMap");
        String string = appContextMap.getString("application");
        if (string == null) {
            throw new IllegalArgumentException("Missing required parameter: application");
        }
        String string2 = appContextMap.getString("version");
        if (string2 == null) {
            throw new IllegalArgumentException("Missing required parameter: version");
        }
        q.f9352a.Q(string, string2);
    }

    @ReactMethod
    public void setLabels(@NotNull ReadableMap labelsMap) {
        Intrinsics.checkNotNullParameter(labelsMap, "labelsMap");
        q.f9352a.S(toStringAnyMap(labelsMap));
    }

    @ReactMethod
    public void setUserContext(@NotNull ReadableMap userContextMap) {
        Intrinsics.checkNotNullParameter(userContextMap, "userContextMap");
        q.f9352a.U(toUserContext(userContextMap));
    }

    @ReactMethod
    public void setViewContext(@NotNull String viewContext) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        q.f9352a.W(viewContext);
    }

    @ReactMethod
    public void shutdown(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b6.d
            @Override // java.lang.Runnable
            public final void run() {
                CxSdkModule.shutdown$lambda$5(Promise.this);
            }
        });
    }

    @ReactMethod
    public void shutdownSessionReplay(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b6.b
            @Override // java.lang.Runnable
            public final void run() {
                CxSdkModule.shutdownSessionReplay$lambda$8(Promise.this);
            }
        });
    }

    @ReactMethod
    public void startSessionRecording() {
        a.f10956a.i();
    }

    @ReactMethod
    public void stopSessionRecording() {
        a.f10956a.j();
    }

    private final WritableMap toWritableMap(UserContext userContext) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("user_id", userContext.getUserId());
        createMap.putString("user_name", userContext.getUsername());
        createMap.putString("user_email", userContext.getEmail());
        createMap.putMap("user_metadata", toWritableMap((Map<String, String>) userContext.getMetadata()));
        return createMap;
    }
}
