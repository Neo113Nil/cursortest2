package com.oblador.performance;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.oblador.performance.RNPerformance;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes8.dex */
public class PerformanceModule extends ReactContextBaseJavaModule implements TurboModule, RNPerformance.MarkerListener {
    public static final String BRIDGE_SETUP_START = "bridgeSetupStart";
    public static final String PERFORMANCE_MODULE = "RNPerformanceManager";
    private static boolean eventsBuffered = true;
    private static final Queue<PerformanceEntry> markBuffer = new ConcurrentLinkedQueue();
    private static boolean didEmit = false;

    public void addListener(String str) {
    }

    public PerformanceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        setupMarkerListener();
        setupNativeMarkerListener();
    }

    private void setupNativeMarkerListener() {
        RNPerformance.getInstance().addListener(this);
    }

    public static void setupListener() {
        ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: com.oblador.performance.PerformanceModule$$ExternalSyntheticLambda1
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
                PerformanceModule.lambda$setupListener$0(reactMarkerConstants, str, i);
            }
        });
    }

    static /* synthetic */ void lambda$setupListener$0(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[reactMarkerConstants.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                addMark(new PerformanceMark(getMarkName(reactMarkerConstants), SystemClock.uptimeMillis()));
                break;
            case 2:
                clearMarkBuffer();
                addMark(new PerformanceMark(BRIDGE_SETUP_START, SystemClock.uptimeMillis()));
                break;
        }
    }

    private static void clearMarkBuffer() {
        RNPerformance.getInstance().clearEphermalEntries();
        Iterator<PerformanceEntry> it = markBuffer.iterator();
        while (it.hasNext()) {
            if (it.next().isEphemeral()) {
                it.remove();
            }
        }
    }

    private static String getMarkName(ReactMarkerConstants reactMarkerConstants) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : reactMarkerConstants.toString().toLowerCase().split("_")) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(Character.toUpperCase(str.charAt(0)));
                if (str.length() > 1) {
                    stringBuffer.append(str.substring(1, str.length()));
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPerformanceManager";
    }

    private void emitNativeStartupTime() {
        safelyEmitMark(new PerformanceMark("nativeLaunchStart", StartTimeProvider.getStartTime()));
        safelyEmitMark(new PerformanceMark("nativeLaunchEnd", StartTimeProvider.getEndTime()));
    }

    private void setupMarkerListener() {
        ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: com.oblador.performance.PerformanceModule$$ExternalSyntheticLambda0
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
                PerformanceModule.this.lambda$setupMarkerListener$1(reactMarkerConstants, str, i);
            }
        });
    }

    /* renamed from: com.oblador.performance.PerformanceModule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants;

        static {
            int[] iArr = new int[ReactMarkerConstants.values().length];
            $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants = iArr;
            try {
                iArr[ReactMarkerConstants.CONTENT_APPEARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.RELOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_REACT_CONTEXT_END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_REACT_CONTEXT_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_VIEW_MANAGERS_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.CREATE_VIEW_MANAGERS_START.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.DOWNLOAD_END.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.DOWNLOAD_START.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.REACT_CONTEXT_THREAD_END.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.REACT_CONTEXT_THREAD_START.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.RUN_JS_BUNDLE_END.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.RUN_JS_BUNDLE_START.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.SETUP_REACT_CONTEXT_END.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.SETUP_REACT_CONTEXT_START.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[ReactMarkerConstants.VM_INIT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMarkerListener$1(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReactMarkerConstants[reactMarkerConstants.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            eventsBuffered = true;
        } else {
            eventsBuffered = false;
            emitNativeStartupTime();
            emitBufferedMarks();
        }
    }

    private void safelyEmitMark(PerformanceEntry performanceEntry) {
        if (eventsBuffered) {
            addMark(performanceEntry);
        } else {
            emitMark(performanceEntry);
        }
    }

    private static void addMark(PerformanceEntry performanceEntry) {
        markBuffer.add(performanceEntry);
    }

    private void emitBufferedMarks() {
        didEmit = true;
        Iterator<PerformanceEntry> it = markBuffer.iterator();
        while (it.hasNext()) {
            emitMark(it.next());
        }
        emitNativeBufferedMarks();
    }

    private void emitNativeBufferedMarks() {
        Iterator<PerformanceEntry> it = RNPerformance.getInstance().getEntries().iterator();
        while (it.hasNext()) {
            emitMark(it.next());
        }
    }

    private void emitMark(PerformanceEntry performanceEntry) {
        if (performanceEntry instanceof PerformanceMark) {
            emit((PerformanceMark) performanceEntry);
        } else if (performanceEntry instanceof PerformanceMetric) {
            emit((PerformanceMetric) performanceEntry);
        }
    }

    private void emit(PerformanceMetric performanceMetric) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("name", performanceMetric.getName());
        createMap.putDouble("startTime", performanceMetric.getStartTime());
        createMap.putDouble("value", performanceMetric.getValue());
        if (performanceMetric.getDetail() != null) {
            createMap.putMap("detail", Arguments.fromBundle(performanceMetric.getDetail()));
        }
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(AnalyticsConstantsKt.METRIC, createMap);
        }
    }

    private void emit(PerformanceMark performanceMark) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("name", performanceMark.getName());
        createMap.putDouble("startTime", performanceMark.getStartTime());
        if (performanceMark.getDetail() != null) {
            createMap.putMap("detail", Arguments.fromBundle(performanceMark.getDetail()));
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("mark", createMap);
    }

    @Override // com.oblador.performance.RNPerformance.MarkerListener
    public void logMarker(PerformanceEntry performanceEntry) {
        if (didEmit) {
            emitMark(performanceEntry);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        RNPerformance.getInstance().removeListener(this);
    }
}
