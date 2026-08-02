package s4;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.twilio.voice.EventKeys;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s4.V;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: A, reason: collision with root package name */
    public Function1 f64691A;

    /* renamed from: a, reason: collision with root package name */
    public Function0 f64692a;

    /* renamed from: b, reason: collision with root package name */
    public Function8 f64693b;

    /* renamed from: c, reason: collision with root package name */
    public Function3 f64694c;

    /* renamed from: d, reason: collision with root package name */
    public Function4 f64695d;

    /* renamed from: e, reason: collision with root package name */
    public Function4 f64696e;

    /* renamed from: f, reason: collision with root package name */
    public Function2 f64697f;

    /* renamed from: g, reason: collision with root package name */
    public Function2 f64698g;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f64699h;

    /* renamed from: i, reason: collision with root package name */
    public Function0 f64700i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f64701j;

    /* renamed from: k, reason: collision with root package name */
    public Function0 f64702k;

    /* renamed from: l, reason: collision with root package name */
    public Function0 f64703l;

    /* renamed from: m, reason: collision with root package name */
    public Function0 f64704m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f64705n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f64706o;

    /* renamed from: p, reason: collision with root package name */
    public Function0 f64707p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f64708q;

    /* renamed from: r, reason: collision with root package name */
    public Function0 f64709r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f64710s;

    /* renamed from: t, reason: collision with root package name */
    public Function1 f64711t;

    /* renamed from: u, reason: collision with root package name */
    public Function1 f64712u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f64713v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f64714w;

    /* renamed from: x, reason: collision with root package name */
    public Function1 f64715x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f64716y;

    /* renamed from: z, reason: collision with root package name */
    public Function2 f64717z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64718a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64719b;

        /* renamed from: c, reason: collision with root package name */
        public final EventDispatcher f64720c;

        public a(int i10, int i11, EventDispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f64718a = i10;
            this.f64719b = i11;
            this.f64720c = dispatcher;
        }

        public static /* synthetic */ void b(a aVar, EnumC6317a enumC6317a, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                function1 = null;
            }
            aVar.a(enumC6317a, function1);
        }

        public final void a(EnumC6317a event, Function1 function1) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f64720c.dispatchEvent(new b(this.f64718a, this.f64719b, event, function1));
        }
    }

    public static final class b extends Event {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC6317a f64721a;

        /* renamed from: b, reason: collision with root package name */
        public final Function1 f64722b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, EnumC6317a event, Function1 function1) {
            super(i10, i11);
            Intrinsics.checkNotNullParameter(event, "event");
            this.f64721a = event;
            this.f64722b = function1;
        }

        public static final Unit c(WritableMap writableMap) {
            Intrinsics.checkNotNullParameter(writableMap, "<this>");
            return Unit.INSTANCE;
        }

        @Override // com.facebook.react.uimanager.events.Event
        /* renamed from: getEventData */
        public WritableMap getAccessibilityEventData() {
            WritableMap createMap = Arguments.createMap();
            Function1 function1 = this.f64722b;
            if (function1 == null) {
                function1 = new Function1() { // from class: s4.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit c10;
                        c10 = V.b.c((WritableMap) obj);
                        return c10;
                    }
                };
            }
            function1.invoke(createMap);
            return createMap;
        }

        @Override // com.facebook.react.uimanager.events.Event
        public String getEventName() {
            return ViewProps.TOP + StringsKt.removePrefix(this.f64721a.b(), (CharSequence) ViewProps.ON);
        }
    }

    public static final Unit A0(float f10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("volume", f10);
        return Unit.INSTANCE;
    }

    public static final Unit B0(a aVar, final V v10, final ArrayList arrayList) {
        aVar.a(EnumC6317a.f64749x, new Function1() { // from class: s4.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit C02;
                C02 = V.C0(V.this, arrayList, (WritableMap) obj);
                return C02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit C0(V v10, ArrayList arrayList, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putArray("audioTracks", v10.O0(arrayList));
        return Unit.INSTANCE;
    }

    public static final Unit D0(a aVar, final V v10, final ArrayList arrayList) {
        aVar.a(EnumC6317a.f64750y, new Function1() { // from class: s4.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit E02;
                E02 = V.E0(V.this, arrayList, (WritableMap) obj);
                return E02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit E0(V v10, ArrayList arrayList, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putArray("textTracks", v10.q1(arrayList));
        return Unit.INSTANCE;
    }

    public static final Unit F0(a aVar, final V v10, final ArrayList arrayList) {
        aVar.a(EnumC6317a.f64723A, new Function1() { // from class: s4.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit G02;
                G02 = V.G0(V.this, arrayList, (WritableMap) obj);
                return G02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit G0(V v10, ArrayList arrayList, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putArray("videoTracks", v10.r1(arrayList));
        return Unit.INSTANCE;
    }

    public static final Unit H0(a aVar, final String textTrackData) {
        Intrinsics.checkNotNullParameter(textTrackData, "textTrackData");
        aVar.a(EnumC6317a.f64751z, new Function1() { // from class: s4.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit I02;
                I02 = V.I0(textTrackData, (WritableMap) obj);
                return I02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit I0(String str, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putString("subtitleTracks", str);
        return Unit.INSTANCE;
    }

    public static final Unit J0(a aVar, final String adEvent, final Map map) {
        Intrinsics.checkNotNullParameter(adEvent, "adEvent");
        aVar.a(EnumC6317a.f64724B, new Function1() { // from class: s4.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit K02;
                K02 = V.K0(adEvent, map, (WritableMap) obj);
                return K02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit K0(String str, Map map, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putString("event", str);
        WritableMap createMap = Arguments.createMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                Intrinsics.checkNotNull(str2);
                createMap.putString(str2, str3);
            }
        }
        Unit unit = Unit.INSTANCE;
        dispatch.putMap(EventKeys.DATA, createMap);
        return Unit.INSTANCE;
    }

    public static final Unit L0(a aVar, final boolean z10) {
        aVar.a(EnumC6317a.f64725C, new Function1() { // from class: s4.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit M02;
                M02 = V.M0(z10, (WritableMap) obj);
                return M02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit M0(boolean z10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putBoolean("isActive", z10);
        return Unit.INSTANCE;
    }

    public static final Unit U(a aVar) {
        a.b(aVar, EnumC6317a.f64728c, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit V(a aVar, final String errorString, final Exception exception, final String errorCode) {
        Intrinsics.checkNotNullParameter(errorString, "errorString");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        aVar.a(EnumC6317a.f64730e, new Function1() { // from class: s4.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W10;
                W10 = V.W(exception, errorString, errorCode, (WritableMap) obj);
                return W10;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit W(Exception exc, String str, String str2, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        WritableMap createMap = Arguments.createMap();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.toString());
        createMap.putString("errorCode", str2);
        createMap.putString("errorStackTrace", stringWriter2);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("name", exc.getClass().getSimpleName());
        String message = exc.getMessage();
        if (message != null) {
            createMap2.putString("message", message);
        }
        WritableArray createArray = Arguments.createArray();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putString("className", stackTraceElement.getClassName());
            createMap3.putString("fileName", stackTraceElement.getFileName());
            createMap3.putInt("lineNumber", stackTraceElement.getLineNumber());
            createMap3.putString("methodName", stackTraceElement.getMethodName());
            createArray.pushMap(createMap3);
        }
        Unit unit = Unit.INSTANCE;
        createMap2.putArray("stackElements", createArray);
        createMap.putMap("cause", createMap2);
        dispatch.putMap("error", createMap);
        return Unit.INSTANCE;
    }

    public static final Unit X(a aVar, final long j10, final long j11, final long j12, final double d10) {
        aVar.a(EnumC6317a.f64731f, new Function1() { // from class: s4.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y10;
                Y10 = V.Y(j10, j11, j12, d10, (WritableMap) obj);
                return Y10;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit Y(long j10, long j11, long j12, double d10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("currentTime", j10 / 1000.0d);
        dispatch.putDouble("playableDuration", j11 / 1000.0d);
        dispatch.putDouble("seekableDuration", j12 / 1000.0d);
        dispatch.putDouble("currentPlaybackTime", d10);
        return Unit.INSTANCE;
    }

    public static final Unit Z(a aVar, final long j10, final int i10, final int i11, final String str) {
        aVar.a(EnumC6317a.f64732g, new Function1() { // from class: s4.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a02;
                a02 = V.a0(j10, i11, i10, str, (WritableMap) obj);
                return a02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a0(long j10, int i10, int i11, String str, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("bitrate", j10);
        if (i10 > 0) {
            dispatch.putInt("width", i10);
        }
        if (i11 > 0) {
            dispatch.putInt("height", i11);
        }
        if (str != null) {
            dispatch.putString("trackId", str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b0(a aVar, final boolean z10, final boolean z11) {
        aVar.a(EnumC6317a.f64742q, new Function1() { // from class: s4.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c02;
                c02 = V.c0(z10, z11, (WritableMap) obj);
                return c02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit c0(boolean z10, boolean z11, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putBoolean("isPlaying", z10);
        dispatch.putBoolean("isSeeking", z11);
        return Unit.INSTANCE;
    }

    public static final Unit d0(a aVar, final long j10, final long j11) {
        aVar.a(EnumC6317a.f64734i, new Function1() { // from class: s4.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e02;
                e02 = V.e0(j10, j11, (WritableMap) obj);
                return e02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit e0(long j10, long j11, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("currentTime", j10 / 1000.0d);
        dispatch.putDouble("seekTime", j11 / 1000.0d);
        return Unit.INSTANCE;
    }

    public static final Unit f0(a aVar) {
        a.b(aVar, EnumC6317a.f64735j, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit g0(a aVar) {
        a.b(aVar, EnumC6317a.f64736k, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit h0(a aVar) {
        a.b(aVar, EnumC6317a.f64737l, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit i0(a aVar) {
        a.b(aVar, EnumC6317a.f64738m, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit j0(a aVar) {
        a.b(aVar, EnumC6317a.f64739n, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit k0(a aVar) {
        a.b(aVar, EnumC6317a.f64740o, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit l0(a aVar, final boolean z10) {
        aVar.a(EnumC6317a.f64741p, new Function1() { // from class: s4.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit m02;
                m02 = V.m0(z10, (WritableMap) obj);
                return m02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit m0(boolean z10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putBoolean("isBuffering", z10);
        return Unit.INSTANCE;
    }

    public static final Unit n0(a aVar, final V v10, final long j10, final long j11, final int i10, final int i11, final ArrayList audioTracks, final ArrayList textTracks, final ArrayList videoTracks, final String str) {
        Intrinsics.checkNotNullParameter(audioTracks, "audioTracks");
        Intrinsics.checkNotNullParameter(textTracks, "textTracks");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        aVar.a(EnumC6317a.f64729d, new Function1() { // from class: s4.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o02;
                o02 = V.o0(j10, j11, v10, i10, i11, str, videoTracks, audioTracks, textTracks, (WritableMap) obj);
                return o02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit o0(long j10, long j11, V v10, int i10, int i11, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("duration", j10 / 1000.0d);
        dispatch.putDouble("currentTime", j11 / 1000.0d);
        dispatch.putMap("naturalSize", v10.N0(i10, i11));
        if (str != null) {
            dispatch.putString("trackId", str);
        }
        dispatch.putArray("videoTracks", v10.r1(arrayList));
        dispatch.putArray("audioTracks", v10.O0(arrayList2));
        dispatch.putArray("textTracks", v10.q1(arrayList3));
        dispatch.putBoolean("canPlayFastForward", true);
        dispatch.putBoolean("canPlaySlowForward", true);
        dispatch.putBoolean("canPlaySlowReverse", true);
        dispatch.putBoolean("canPlayReverse", true);
        dispatch.putBoolean("canPlayFastForward", true);
        dispatch.putBoolean("canStepBackward", true);
        dispatch.putBoolean("canStepForward", true);
        return Unit.INSTANCE;
    }

    public static final Unit p0(a aVar, final boolean z10) {
        aVar.a(EnumC6317a.f64733h, new Function1() { // from class: s4.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q02;
                q02 = V.q0(z10, (WritableMap) obj);
                return q02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit q0(boolean z10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putBoolean("isVisible", z10);
        return Unit.INSTANCE;
    }

    public static final Unit r0(a aVar) {
        a.b(aVar, EnumC6317a.f64743r, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit s0(a aVar, final ArrayList metadataArrayList) {
        Intrinsics.checkNotNullParameter(metadataArrayList, "metadataArrayList");
        if (metadataArrayList.size() == 0) {
            return Unit.INSTANCE;
        }
        aVar.a(EnumC6317a.f64744s, new Function1() { // from class: s4.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t02;
                t02 = V.t0(metadataArrayList, (WritableMap) obj);
                return t02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit t0(ArrayList arrayList, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        WritableArray createArray = Arguments.createArray();
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            r4.k kVar = (r4.k) obj;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("identifier", kVar.a());
            createMap.putString(EventKeys.VALUE_KEY, kVar.b());
            createArray.pushMap(createMap);
            i10 = i11;
        }
        Unit unit = Unit.INSTANCE;
        dispatch.putArray("metadata", createArray);
        return Unit.INSTANCE;
    }

    public static final Unit u0(a aVar) {
        a.b(aVar, EnumC6317a.f64745t, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit v0(a aVar, final boolean z10) {
        aVar.a(EnumC6317a.f64746u, new Function1() { // from class: s4.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w02;
                w02 = V.w0(z10, (WritableMap) obj);
                return w02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit w0(boolean z10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putBoolean("hasAudioFocus", z10);
        return Unit.INSTANCE;
    }

    public static final Unit x0(a aVar, final float f10) {
        aVar.a(EnumC6317a.f64747v, new Function1() { // from class: s4.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y02;
                y02 = V.y0(f10, (WritableMap) obj);
                return y02;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit y0(float f10, WritableMap dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "$this$dispatch");
        dispatch.putDouble("playbackRate", f10);
        return Unit.INSTANCE;
    }

    public static final Unit z0(a aVar, final float f10) {
        aVar.a(EnumC6317a.f64748w, new Function1() { // from class: s4.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit A02;
                A02 = V.A0(f10, (WritableMap) obj);
                return A02;
            }
        });
        return Unit.INSTANCE;
    }

    public final WritableMap N0(int i10, int i11) {
        WritableMap createMap = Arguments.createMap();
        if (i10 > 0) {
            createMap.putInt("width", i10);
        }
        if (i11 > 0) {
            createMap.putInt("height", i11);
        }
        createMap.putString("orientation", i10 > i11 ? "landscape" : i10 < i11 ? "portrait" : "square");
        return createMap;
    }

    public final WritableArray O0(ArrayList arrayList) {
        WritableArray createArray = Arguments.createArray();
        if (arrayList != null) {
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                r4.l lVar = (r4.l) obj;
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i10);
                createMap.putString("title", lVar.d());
                String c10 = lVar.c();
                if (c10 != null) {
                    createMap.putString("type", c10);
                }
                String b10 = lVar.b();
                if (b10 != null) {
                    createMap.putString("language", b10);
                }
                if (lVar.a() > 0) {
                    createMap.putInt("bitrate", lVar.a());
                }
                createMap.putBoolean("selected", lVar.e());
                createArray.pushMap(createMap);
                i10 = i11;
            }
        }
        return createArray;
    }

    public final void P0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64710s = function1;
    }

    public final void Q0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64713v = function1;
    }

    public final void R0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64706o = function1;
    }

    public final void S0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64691A = function1;
    }

    public final void T(ThemedReactContext reactContext, u4.W view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        if (eventDispatcherForReactTag != null) {
            final a aVar = new a(surfaceId, view.getId(), eventDispatcherForReactTag);
            k1(new Function0() { // from class: s4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit U10;
                    U10 = V.U(V.a.this);
                    return U10;
                }
            });
            j1(new Function8() { // from class: s4.d
                @Override // kotlin.jvm.functions.Function8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                    Unit n02;
                    n02 = V.n0(V.a.this, this, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), (ArrayList) obj5, (ArrayList) obj6, (ArrayList) obj7, (String) obj8);
                    return n02;
                }
            });
            d1(new Function3() { // from class: s4.l
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit V10;
                    V10 = V.V(V.a.this, (String) obj, (Exception) obj2, (String) obj3);
                    return V10;
                }
            });
            m1(new Function4() { // from class: s4.n
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Unit X10;
                    X10 = V.X(V.a.this, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Long) obj3).longValue(), ((Double) obj4).doubleValue());
                    return X10;
                }
            });
            a1(new Function4() { // from class: s4.o
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Unit Z10;
                    Z10 = V.Z(V.a.this, ((Long) obj).longValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (String) obj4);
                    return Z10;
                }
            });
            l1(new Function2() { // from class: s4.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit b02;
                    b02 = V.b0(V.a.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                    return b02;
                }
            });
            n1(new Function2() { // from class: s4.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit d02;
                    d02 = V.d0(V.a.this, ((Long) obj).longValue(), ((Long) obj2).longValue());
                    return d02;
                }
            });
            c1(new Function0() { // from class: s4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit f02;
                    f02 = V.f0(V.a.this);
                    return f02;
                }
            });
            h1(new Function0() { // from class: s4.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit g02;
                    g02 = V.g0(V.a.this);
                    return g02;
                }
            });
            f1(new Function0() { // from class: s4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit h02;
                    h02 = V.h0(V.a.this);
                    return h02;
                }
            });
            g1(new Function0() { // from class: s4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit i02;
                    i02 = V.i0(V.a.this);
                    return i02;
                }
            });
            e1(new Function0() { // from class: s4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit j02;
                    j02 = V.j0(V.a.this);
                    return j02;
                }
            });
            U0(new Function0() { // from class: s4.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit k02;
                    k02 = V.k0(V.a.this);
                    return k02;
                }
            });
            b1(new Function1() { // from class: s4.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit l02;
                    l02 = V.l0(V.a.this, ((Boolean) obj).booleanValue());
                    return l02;
                }
            });
            R0(new Function1() { // from class: s4.P
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p02;
                    p02 = V.p0(V.a.this, ((Boolean) obj).booleanValue());
                    return p02;
                }
            });
            i1(new Function0() { // from class: s4.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit r02;
                    r02 = V.r0(V.a.this);
                    return r02;
                }
            });
            Y0(new Function1() { // from class: s4.S
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit s02;
                    s02 = V.s0(V.a.this, (ArrayList) obj);
                    return s02;
                }
            });
            Z0(new Function0() { // from class: s4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit u02;
                    u02 = V.u0(V.a.this);
                    return u02;
                }
            });
            P0(new Function1() { // from class: s4.U
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit v02;
                    v02 = V.v0(V.a.this, ((Boolean) obj).booleanValue());
                    return v02;
                }
            });
            T0(new Function1() { // from class: s4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit x02;
                    x02 = V.x0(V.a.this, ((Float) obj).floatValue());
                    return x02;
                }
            });
            p1(new Function1() { // from class: s4.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit z02;
                    z02 = V.z0(V.a.this, ((Float) obj).floatValue());
                    return z02;
                }
            });
            Q0(new Function1() { // from class: s4.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit B02;
                    B02 = V.B0(V.a.this, this, (ArrayList) obj);
                    return B02;
                }
            });
            X0(new Function1() { // from class: s4.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit D02;
                    D02 = V.D0(V.a.this, this, (ArrayList) obj);
                    return D02;
                }
            });
            o1(new Function1() { // from class: s4.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit F02;
                    F02 = V.F0(V.a.this, this, (ArrayList) obj);
                    return F02;
                }
            });
            W0(new Function1() { // from class: s4.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit H02;
                    H02 = V.H0(V.a.this, (String) obj);
                    return H02;
                }
            });
            V0(new Function2() { // from class: s4.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit J02;
                    J02 = V.J0(V.a.this, (String) obj, (Map) obj2);
                    return J02;
                }
            });
            S0(new Function1() { // from class: s4.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit L02;
                    L02 = V.L0(V.a.this, ((Boolean) obj).booleanValue());
                    return L02;
                }
            });
        }
    }

    public final void T0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64711t = function1;
    }

    public final void U0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64704m = function0;
    }

    public final void V0(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f64717z = function2;
    }

    public final void W0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64716y = function1;
    }

    public final void X0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64714w = function1;
    }

    public final void Y0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64708q = function1;
    }

    public final void Z0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64709r = function0;
    }

    public final void a1(Function4 function4) {
        Intrinsics.checkNotNullParameter(function4, "<set-?>");
        this.f64696e = function4;
    }

    public final void b1(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64705n = function1;
    }

    public final void c1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64699h = function0;
    }

    public final void d1(Function3 function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.f64694c = function3;
    }

    public final void e1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64703l = function0;
    }

    public final void f1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64701j = function0;
    }

    public final void g1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64702k = function0;
    }

    public final void h1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64700i = function0;
    }

    public final void i1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64707p = function0;
    }

    public final void j1(Function8 function8) {
        Intrinsics.checkNotNullParameter(function8, "<set-?>");
        this.f64693b = function8;
    }

    public final void k1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f64692a = function0;
    }

    public final void l1(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f64697f = function2;
    }

    public final void m1(Function4 function4) {
        Intrinsics.checkNotNullParameter(function4, "<set-?>");
        this.f64695d = function4;
    }

    public final void n1(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f64698g = function2;
    }

    public final void o1(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64715x = function1;
    }

    public final void p1(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f64712u = function1;
    }

    public final WritableArray q1(ArrayList arrayList) {
        WritableArray createArray = Arguments.createArray();
        if (arrayList != null) {
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                r4.l lVar = (r4.l) obj;
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i10);
                createMap.putString("title", lVar.d());
                createMap.putString("type", lVar.c());
                createMap.putString("language", lVar.b());
                createMap.putBoolean("selected", lVar.e());
                createArray.pushMap(createMap);
                i10 = i11;
            }
        }
        return createArray;
    }

    public final WritableArray r1(ArrayList arrayList) {
        WritableArray createArray = Arguments.createArray();
        if (arrayList != null) {
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                r4.m mVar = (r4.m) obj;
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("width", mVar.g());
                createMap.putInt("height", mVar.c());
                createMap.putInt("bitrate", mVar.a());
                createMap.putString("codecs", mVar.b());
                createMap.putString("trackId", mVar.f());
                createMap.putInt("index", mVar.d());
                createMap.putBoolean("selected", mVar.h());
                createMap.putInt(ViewProps.ROTATION, mVar.e());
                createArray.pushMap(createMap);
                i10 = i11;
            }
        }
        return createArray;
    }
}
