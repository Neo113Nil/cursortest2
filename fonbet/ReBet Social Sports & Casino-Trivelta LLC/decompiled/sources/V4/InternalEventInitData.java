package V4;

import Q5.TraceParentInHeaderConfig;
import Q5.UserContext;
import Q5.ViewContext;
import X9.m;
import Zh.B;
import Zh.InterfaceC1901b;
import Zh.n;
import ai.AbstractC2028a;
import bi.f;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import di.C4084d0;
import di.C4087f;
import di.C4093i;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import di.Z0;
import ei.q;
import i3.C4527h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b:\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u00020'Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cBÙ\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010,R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010QR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u00101\u001a\u0004\b\\\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u00101\u001a\u0004\b^\u0010*¨\u0006`"}, d2 = {"LV4/a;", "", "", "applicationName", "Lkotlinx/serialization/json/JsonElement;", "labels", "environment", "version", "LQ5/w;", "userContext", "LQ5/A;", "viewContext", "", "", "instrumentations", "mobileVitalsOptions", "", "ignoreUrls", "ignoreErrors", "collectIPData", "", "sessionSampleRate", "LQ5/u;", "traceParentInHeader", "debug", "proxyUrl", "beforeSend", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;LQ5/w;LQ5/A;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;ZILQ5/u;ZLjava/lang/String;Ljava/lang/String;)V", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;LQ5/w;LQ5/A;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;ZILQ5/u;ZLjava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.crypto.tink.integration.android.b.f37029b, "(LV4/a;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getApplicationName", "Lkotlinx/serialization/json/JsonElement;", "getLabels", "()Lkotlinx/serialization/json/JsonElement;", "c", "getEnvironment", W9.d.f13160a, "getVersion", e.f29601m, "LQ5/w;", "getUserContext", "()LQ5/w;", "f", "LQ5/A;", "getViewContext", "()LQ5/A;", "g", "Ljava/util/Map;", "getInstrumentations", "()Ljava/util/Map;", C4527h.f48087o, "getMobileVitalsOptions", i.f35755A, "Ljava/util/List;", "getIgnoreUrls", "()Ljava/util/List;", "j", "getIgnoreErrors", "k", "Z", "getCollectIPData", "()Z", "l", "I", "getSessionSampleRate", m.f13664a, "LQ5/u;", "getTraceParentInHeader", "()LQ5/u;", "n", "getDebug", "o", "getProxyUrl", "p", "getBeforeSend", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: V4.a, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class InternalEventInitData {

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String applicationName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonElement labels;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String environment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String version;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final UserContext userContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final ViewContext viewContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map instrumentations;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map mobileVitalsOptions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final List ignoreUrls;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final List ignoreErrors;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean collectIPData;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final int sessionSampleRate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public final TraceParentInHeaderConfig traceParentInHeader;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean debug;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public final String proxyUrl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public final String beforeSend;

    /* renamed from: V4.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0260a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final C0260a f12502a;

        @NotNull
        private static final f descriptor;

        static {
            C0260a c0260a = new C0260a();
            f12502a = c0260a;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.features.instrumentations.internal_log.InternalEventInitData", c0260a, 16);
            j02.n("applicationName", false);
            j02.n("labels", true);
            j02.n("environment", false);
            j02.n("version", false);
            j02.n("userContext", false);
            j02.n("viewContext", false);
            j02.n("instrumentations", false);
            j02.n("mobileVitalsOptions", false);
            j02.n("ignoreUrls", false);
            j02.n("ignoreErrors", false);
            j02.n("collectIPData", false);
            j02.n("sessionSampleRate", false);
            j02.n("traceParentInHeader", false);
            j02.n("debug", false);
            j02.n("proxyUrl", true);
            j02.n("beforeSend", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InternalEventInitData deserialize(ci.e decoder) {
            int i10;
            List list;
            String str;
            UserContext userContext;
            JsonElement jsonElement;
            String str2;
            List list2;
            Map map;
            Map map2;
            ViewContext viewContext;
            String str3;
            TraceParentInHeaderConfig traceParentInHeaderConfig;
            String str4;
            String str5;
            boolean z10;
            int i11;
            boolean z11;
            InterfaceC1901b[] interfaceC1901bArr;
            InterfaceC1901b[] interfaceC1901bArr2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr3 = InternalEventInitData.$childSerializers;
            String str6 = null;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                JsonElement jsonElement2 = (JsonElement) c10.i(fVar, 1, q.f46124a, null);
                String s11 = c10.s(fVar, 2);
                String s12 = c10.s(fVar, 3);
                UserContext userContext2 = (UserContext) c10.i(fVar, 4, UserContext.a.f9503a, null);
                ViewContext viewContext2 = (ViewContext) c10.i(fVar, 5, ViewContext.a.f9361a, null);
                Map map3 = (Map) c10.i(fVar, 6, interfaceC1901bArr3[6], null);
                Map map4 = (Map) c10.i(fVar, 7, interfaceC1901bArr3[7], null);
                List list3 = (List) c10.i(fVar, 8, interfaceC1901bArr3[8], null);
                List list4 = (List) c10.i(fVar, 9, interfaceC1901bArr3[9], null);
                boolean t10 = c10.t(fVar, 10);
                int F10 = c10.F(fVar, 11);
                TraceParentInHeaderConfig traceParentInHeaderConfig2 = (TraceParentInHeaderConfig) c10.i(fVar, 12, TraceParentInHeaderConfig.a.f9496a, null);
                boolean t11 = c10.t(fVar, 13);
                Z0 z02 = Z0.f45341a;
                String str7 = (String) c10.C(fVar, 14, z02, null);
                i10 = 65535;
                str3 = (String) c10.C(fVar, 15, z02, null);
                map = map3;
                list2 = list3;
                jsonElement = jsonElement2;
                str4 = s11;
                z10 = t10;
                viewContext = viewContext2;
                str5 = s12;
                userContext = userContext2;
                map2 = map4;
                i11 = F10;
                z11 = t11;
                str = str7;
                traceParentInHeaderConfig = traceParentInHeaderConfig2;
                str2 = s10;
                list = list4;
            } else {
                int i12 = 6;
                int i13 = 8;
                boolean z12 = true;
                i10 = 0;
                boolean z13 = false;
                int i14 = 0;
                boolean z14 = false;
                List list5 = null;
                String str8 = null;
                UserContext userContext3 = null;
                JsonElement jsonElement3 = null;
                List list6 = null;
                Map map5 = null;
                Map map6 = null;
                ViewContext viewContext3 = null;
                String str9 = null;
                String str10 = null;
                int i15 = 9;
                int i16 = 7;
                String str11 = null;
                TraceParentInHeaderConfig traceParentInHeaderConfig3 = null;
                while (z12) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            z12 = false;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 0:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            str6 = c10.s(fVar, 0);
                            i10 |= 1;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 1:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            jsonElement3 = (JsonElement) c10.i(fVar, 1, q.f46124a, jsonElement3);
                            i10 |= 2;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 2:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            str9 = c10.s(fVar, 2);
                            i10 |= 4;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 3:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            str10 = c10.s(fVar, 3);
                            i10 |= 8;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 4:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            userContext3 = (UserContext) c10.i(fVar, 4, UserContext.a.f9503a, userContext3);
                            i10 |= 16;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 5:
                            interfaceC1901bArr2 = interfaceC1901bArr3;
                            viewContext3 = (ViewContext) c10.i(fVar, 5, ViewContext.a.f9361a, viewContext3);
                            i10 |= 32;
                            interfaceC1901bArr3 = interfaceC1901bArr2;
                            i12 = 6;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 6:
                            InterfaceC1901b[] interfaceC1901bArr4 = interfaceC1901bArr3;
                            map5 = (Map) c10.i(fVar, i12, interfaceC1901bArr4[i12], map5);
                            i10 |= 64;
                            interfaceC1901bArr3 = interfaceC1901bArr4;
                            i16 = 7;
                            i13 = 8;
                            i15 = 9;
                        case 7:
                            InterfaceC1901b[] interfaceC1901bArr5 = interfaceC1901bArr3;
                            map6 = (Map) c10.i(fVar, i16, interfaceC1901bArr5[i16], map6);
                            i10 |= 128;
                            interfaceC1901bArr3 = interfaceC1901bArr5;
                            i13 = 8;
                            i15 = 9;
                        case 8:
                            InterfaceC1901b[] interfaceC1901bArr6 = interfaceC1901bArr3;
                            list6 = (List) c10.i(fVar, i13, interfaceC1901bArr6[i13], list6);
                            i10 |= 256;
                            interfaceC1901bArr3 = interfaceC1901bArr6;
                            i15 = 9;
                        case 9:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            list5 = (List) c10.i(fVar, i15, interfaceC1901bArr[i15], list5);
                            i10 |= 512;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        case 10:
                            z13 = c10.t(fVar, 10);
                            i10 |= 1024;
                            interfaceC1901bArr3 = interfaceC1901bArr3;
                        case 11:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            i14 = c10.F(fVar, 11);
                            i10 |= 2048;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        case 12:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            traceParentInHeaderConfig3 = (TraceParentInHeaderConfig) c10.i(fVar, 12, TraceParentInHeaderConfig.a.f9496a, traceParentInHeaderConfig3);
                            i10 |= 4096;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        case 13:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            z14 = c10.t(fVar, 13);
                            i10 |= 8192;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        case 14:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            str8 = (String) c10.C(fVar, 14, Z0.f45341a, str8);
                            i10 |= 16384;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        case 15:
                            interfaceC1901bArr = interfaceC1901bArr3;
                            str11 = (String) c10.C(fVar, 15, Z0.f45341a, str11);
                            i10 |= 32768;
                            interfaceC1901bArr3 = interfaceC1901bArr;
                        default:
                            throw new B(e10);
                    }
                }
                list = list5;
                str = str8;
                userContext = userContext3;
                jsonElement = jsonElement3;
                str2 = str6;
                list2 = list6;
                map = map5;
                map2 = map6;
                viewContext = viewContext3;
                str3 = str11;
                traceParentInHeaderConfig = traceParentInHeaderConfig3;
                str4 = str9;
                str5 = str10;
                z10 = z13;
                i11 = i14;
                z11 = z14;
            }
            int i17 = i10;
            c10.b(fVar);
            return new InternalEventInitData(i17, str2, jsonElement, str4, str5, userContext, viewContext, map, map2, list2, list, z10, i11, traceParentInHeaderConfig, z11, str, str3, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, InternalEventInitData value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            InternalEventInitData.b(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b[] interfaceC1901bArr = InternalEventInitData.$childSerializers;
            Z0 z02 = Z0.f45341a;
            InterfaceC1901b interfaceC1901b = interfaceC1901bArr[6];
            InterfaceC1901b interfaceC1901b2 = interfaceC1901bArr[7];
            InterfaceC1901b interfaceC1901b3 = interfaceC1901bArr[8];
            InterfaceC1901b interfaceC1901b4 = interfaceC1901bArr[9];
            InterfaceC1901b t10 = AbstractC2028a.t(z02);
            InterfaceC1901b t11 = AbstractC2028a.t(z02);
            C4093i c4093i = C4093i.f45370a;
            return new InterfaceC1901b[]{z02, q.f46124a, z02, z02, UserContext.a.f9503a, ViewContext.a.f9361a, interfaceC1901b, interfaceC1901b2, interfaceC1901b3, interfaceC1901b4, c4093i, Y.f45337a, TraceParentInHeaderConfig.a.f9496a, c4093i, t10, t11};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: V4.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return C0260a.f12502a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Z0 z02 = Z0.f45341a;
        C4093i c4093i = C4093i.f45370a;
        $childSerializers = new InterfaceC1901b[]{null, null, null, null, null, null, new C4084d0(z02, c4093i), new C4084d0(z02, c4093i), new C4087f(z02), new C4087f(z02), null, null, null, null, null, null};
    }

    public /* synthetic */ InternalEventInitData(int i10, String str, JsonElement jsonElement, String str2, String str3, UserContext userContext, ViewContext viewContext, Map map, Map map2, List list, List list2, boolean z10, int i11, TraceParentInHeaderConfig traceParentInHeaderConfig, boolean z11, String str4, String str5, U0 u02) {
        if (16381 != (i10 & 16381)) {
            F0.a(i10, 16381, C0260a.f12502a.getDescriptor());
        }
        this.applicationName = str;
        if ((i10 & 2) == 0) {
            this.labels = JsonNull.INSTANCE;
        } else {
            this.labels = jsonElement;
        }
        this.environment = str2;
        this.version = str3;
        this.userContext = userContext;
        this.viewContext = viewContext;
        this.instrumentations = map;
        this.mobileVitalsOptions = map2;
        this.ignoreUrls = list;
        this.ignoreErrors = list2;
        this.collectIPData = z10;
        this.sessionSampleRate = i11;
        this.traceParentInHeader = traceParentInHeaderConfig;
        this.debug = z11;
        if ((i10 & 16384) == 0) {
            this.proxyUrl = null;
        } else {
            this.proxyUrl = str4;
        }
        if ((i10 & 32768) == 0) {
            this.beforeSend = null;
        } else {
            this.beforeSend = str5;
        }
    }

    public static final /* synthetic */ void b(InternalEventInitData self, ci.d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.G(serialDesc, 0, self.applicationName);
        if (output.m(serialDesc, 1) || !Intrinsics.areEqual(self.labels, JsonNull.INSTANCE)) {
            output.B(serialDesc, 1, q.f46124a, self.labels);
        }
        output.G(serialDesc, 2, self.environment);
        output.G(serialDesc, 3, self.version);
        output.B(serialDesc, 4, UserContext.a.f9503a, self.userContext);
        output.B(serialDesc, 5, ViewContext.a.f9361a, self.viewContext);
        output.B(serialDesc, 6, interfaceC1901bArr[6], self.instrumentations);
        output.B(serialDesc, 7, interfaceC1901bArr[7], self.mobileVitalsOptions);
        output.B(serialDesc, 8, interfaceC1901bArr[8], self.ignoreUrls);
        output.B(serialDesc, 9, interfaceC1901bArr[9], self.ignoreErrors);
        output.F(serialDesc, 10, self.collectIPData);
        output.f(serialDesc, 11, self.sessionSampleRate);
        output.B(serialDesc, 12, TraceParentInHeaderConfig.a.f9496a, self.traceParentInHeader);
        output.F(serialDesc, 13, self.debug);
        if (output.m(serialDesc, 14) || self.proxyUrl != null) {
            output.C(serialDesc, 14, Z0.f45341a, self.proxyUrl);
        }
        if (!output.m(serialDesc, 15) && self.beforeSend == null) {
            return;
        }
        output.C(serialDesc, 15, Z0.f45341a, self.beforeSend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalEventInitData)) {
            return false;
        }
        InternalEventInitData internalEventInitData = (InternalEventInitData) other;
        return Intrinsics.areEqual(this.applicationName, internalEventInitData.applicationName) && Intrinsics.areEqual(this.labels, internalEventInitData.labels) && Intrinsics.areEqual(this.environment, internalEventInitData.environment) && Intrinsics.areEqual(this.version, internalEventInitData.version) && Intrinsics.areEqual(this.userContext, internalEventInitData.userContext) && Intrinsics.areEqual(this.viewContext, internalEventInitData.viewContext) && Intrinsics.areEqual(this.instrumentations, internalEventInitData.instrumentations) && Intrinsics.areEqual(this.mobileVitalsOptions, internalEventInitData.mobileVitalsOptions) && Intrinsics.areEqual(this.ignoreUrls, internalEventInitData.ignoreUrls) && Intrinsics.areEqual(this.ignoreErrors, internalEventInitData.ignoreErrors) && this.collectIPData == internalEventInitData.collectIPData && this.sessionSampleRate == internalEventInitData.sessionSampleRate && Intrinsics.areEqual(this.traceParentInHeader, internalEventInitData.traceParentInHeader) && this.debug == internalEventInitData.debug && Intrinsics.areEqual(this.proxyUrl, internalEventInitData.proxyUrl) && Intrinsics.areEqual(this.beforeSend, internalEventInitData.beforeSend);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.applicationName.hashCode() * 31) + this.labels.hashCode()) * 31) + this.environment.hashCode()) * 31) + this.version.hashCode()) * 31) + this.userContext.hashCode()) * 31) + this.viewContext.hashCode()) * 31) + this.instrumentations.hashCode()) * 31) + this.mobileVitalsOptions.hashCode()) * 31) + this.ignoreUrls.hashCode()) * 31) + this.ignoreErrors.hashCode()) * 31) + Boolean.hashCode(this.collectIPData)) * 31) + Integer.hashCode(this.sessionSampleRate)) * 31) + this.traceParentInHeader.hashCode()) * 31) + Boolean.hashCode(this.debug)) * 31;
        String str = this.proxyUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.beforeSend;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InternalEventInitData(applicationName=" + this.applicationName + ", labels=" + this.labels + ", environment=" + this.environment + ", version=" + this.version + ", userContext=" + this.userContext + ", viewContext=" + this.viewContext + ", instrumentations=" + this.instrumentations + ", mobileVitalsOptions=" + this.mobileVitalsOptions + ", ignoreUrls=" + this.ignoreUrls + ", ignoreErrors=" + this.ignoreErrors + ", collectIPData=" + this.collectIPData + ", sessionSampleRate=" + this.sessionSampleRate + ", traceParentInHeader=" + this.traceParentInHeader + ", debug=" + this.debug + ", proxyUrl=" + this.proxyUrl + ", beforeSend=" + this.beforeSend + ")";
    }

    public InternalEventInitData(String applicationName, JsonElement labels, String environment, String version, UserContext userContext, ViewContext viewContext, Map instrumentations, Map mobileVitalsOptions, List ignoreUrls, List ignoreErrors, boolean z10, int i10, TraceParentInHeaderConfig traceParentInHeader, boolean z11, String str, String str2) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(instrumentations, "instrumentations");
        Intrinsics.checkNotNullParameter(mobileVitalsOptions, "mobileVitalsOptions");
        Intrinsics.checkNotNullParameter(ignoreUrls, "ignoreUrls");
        Intrinsics.checkNotNullParameter(ignoreErrors, "ignoreErrors");
        Intrinsics.checkNotNullParameter(traceParentInHeader, "traceParentInHeader");
        this.applicationName = applicationName;
        this.labels = labels;
        this.environment = environment;
        this.version = version;
        this.userContext = userContext;
        this.viewContext = viewContext;
        this.instrumentations = instrumentations;
        this.mobileVitalsOptions = mobileVitalsOptions;
        this.ignoreUrls = ignoreUrls;
        this.ignoreErrors = ignoreErrors;
        this.collectIPData = z10;
        this.sessionSampleRate = i10;
        this.traceParentInHeader = traceParentInHeader;
        this.debug = z11;
        this.proxyUrl = str;
        this.beforeSend = str2;
    }
}
