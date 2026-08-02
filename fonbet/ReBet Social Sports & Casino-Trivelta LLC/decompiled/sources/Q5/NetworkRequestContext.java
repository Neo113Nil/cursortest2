package Q5;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.twilio.voice.EventKeys;
import di.C4093i;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import di.Z0;
import ei.AbstractC4212b;
import ei.D;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002,*B\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010&R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010$R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b*\u0010$R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010+\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010$R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010+\u0012\u0004\b9\u0010.\u001a\u0004\b8\u0010$R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010+\u0012\u0004\b;\u0010.\u001a\u0004\b4\u0010$R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010=\u0012\u0004\bC\u0010.\u001a\u0004\bB\u0010?R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u0010.\u001a\u0004\b\u000f\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010.\u001a\u0004\bJ\u0010KR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010I\u0012\u0004\bO\u0010.\u001a\u0004\bN\u0010KR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010+\u0012\u0004\bR\u0010.\u001a\u0004\bQ\u0010$R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010+\u0012\u0004\bU\u0010.\u001a\u0004\bT\u0010$¨\u0006W"}, d2 = {"LQ5/s;", "", "", "method", "", "statusCode", EventKeys.URL, "fragments", "host", "schema", "statusText", "", "duration", "responseContentLength", "", "isNetworkPlugin", "Lkotlinx/serialization/json/JsonObject;", "requestHeaders", "responseHeaders", "requestPayload", "responsePayload", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "f", "(LQ5/s;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", com.google.crypto.tink.integration.android.b.f37029b, "getMethod$annotations", "()V", "I", "c", "getStatusCode$annotations", com.bumptech.glide.gifdecoder.e.f29601m, "getUrl$annotations", W9.d.f13160a, "getFragments$annotations", "getHost", "getHost$annotations", "getSchema", "getSchema$annotations", "g", "getStatusText$annotations", C4527h.f48087o, "J", "getDuration", "()J", "getDuration$annotations", com.google.android.material.shape.i.f35755A, "getResponseContentLength", "getResponseContentLength$annotations", "j", "Z", "()Z", "isNetworkPlugin$annotations", "k", "Lkotlinx/serialization/json/JsonObject;", "getRequestHeaders", "()Lkotlinx/serialization/json/JsonObject;", "getRequestHeaders$annotations", "l", "getResponseHeaders", "getResponseHeaders$annotations", X9.m.f13664a, "getRequestPayload", "getRequestPayload$annotations", "n", "getResponsePayload", "getResponsePayload$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Q5.s, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class NetworkRequestContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String method;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final int statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String url;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String fragments;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final String host;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String schema;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String statusText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final long duration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final long responseContentLength;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isNetworkPlugin;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonObject requestHeaders;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonObject responseHeaders;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public final String requestPayload;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final String responsePayload;

    /* renamed from: Q5.s$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9489a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9489a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.NetworkRequestContext", aVar, 14);
            j02.n("method", true);
            j02.n("status_code", true);
            j02.n(EventKeys.URL, true);
            j02.n("fragments", true);
            j02.n("host", true);
            j02.n("schema", true);
            j02.n("status_text", true);
            j02.n("duration", true);
            j02.n("response_content_length", true);
            j02.n("is_network_plugin", true);
            j02.n("request_headers", true);
            j02.n("response_headers", true);
            j02.n("request_payload", true);
            j02.n("response_payload", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NetworkRequestContext deserialize(ci.e decoder) {
            int i10;
            JsonObject jsonObject;
            String str;
            String str2;
            int i11;
            String str3;
            JsonObject jsonObject2;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            boolean z10;
            long j10;
            long j11;
            int i12;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i13 = 11;
            int i14 = 6;
            String str9 = null;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                int F10 = c10.F(fVar, 1);
                String s11 = c10.s(fVar, 2);
                String s12 = c10.s(fVar, 3);
                String s13 = c10.s(fVar, 4);
                String s14 = c10.s(fVar, 5);
                String s15 = c10.s(fVar, 6);
                long g10 = c10.g(fVar, 7);
                long g11 = c10.g(fVar, 8);
                boolean t10 = c10.t(fVar, 9);
                D d10 = D.f46068a;
                JsonObject jsonObject3 = (JsonObject) c10.C(fVar, 10, d10, null);
                JsonObject jsonObject4 = (JsonObject) c10.C(fVar, 11, d10, null);
                Z0 z02 = Z0.f45341a;
                String str10 = (String) c10.C(fVar, 12, z02, null);
                str = s10;
                i10 = F10;
                str2 = (String) c10.C(fVar, 13, z02, null);
                jsonObject2 = jsonObject4;
                jsonObject = jsonObject3;
                z10 = t10;
                i11 = 16383;
                str8 = s15;
                str7 = s14;
                str5 = s12;
                str3 = str10;
                str6 = s13;
                str4 = s11;
                j10 = g10;
                j11 = g11;
            } else {
                int i15 = 0;
                int i16 = 0;
                boolean z11 = false;
                JsonObject jsonObject5 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                boolean z12 = true;
                long j12 = 0;
                long j13 = 0;
                JsonObject jsonObject6 = null;
                String str16 = null;
                String str17 = null;
                while (z12) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z12 = false;
                        case 0:
                            i16 |= 1;
                            i14 = i14;
                            str9 = c10.s(fVar, 0);
                            i13 = 11;
                        case 1:
                            i16 |= 2;
                            i14 = i14;
                            i15 = c10.F(fVar, 1);
                            i13 = 11;
                        case 2:
                            i12 = i14;
                            str16 = c10.s(fVar, 2);
                            i16 |= 4;
                            i14 = i12;
                            i13 = 11;
                        case 3:
                            i12 = i14;
                            str17 = c10.s(fVar, 3);
                            i16 |= 8;
                            i14 = i12;
                            i13 = 11;
                        case 4:
                            i12 = i14;
                            str13 = c10.s(fVar, 4);
                            i16 |= 16;
                            i14 = i12;
                            i13 = 11;
                        case 5:
                            str14 = c10.s(fVar, 5);
                            i16 |= 32;
                            i14 = i14;
                            i13 = 11;
                        case 6:
                            int i17 = i14;
                            str15 = c10.s(fVar, i17);
                            i16 |= 64;
                            i14 = i17;
                        case 7:
                            j12 = c10.g(fVar, 7);
                            i16 |= 128;
                            i14 = 6;
                        case 8:
                            j13 = c10.g(fVar, 8);
                            i16 |= 256;
                            i14 = 6;
                        case 9:
                            z11 = c10.t(fVar, 9);
                            i16 |= 512;
                            i14 = 6;
                        case 10:
                            jsonObject5 = (JsonObject) c10.C(fVar, 10, D.f46068a, jsonObject5);
                            i16 |= 1024;
                            i14 = 6;
                        case 11:
                            jsonObject6 = (JsonObject) c10.C(fVar, i13, D.f46068a, jsonObject6);
                            i16 |= 2048;
                            i14 = 6;
                        case 12:
                            str12 = (String) c10.C(fVar, 12, Z0.f45341a, str12);
                            i16 |= 4096;
                            i14 = 6;
                        case 13:
                            str11 = (String) c10.C(fVar, 13, Z0.f45341a, str11);
                            i16 |= 8192;
                            i14 = 6;
                        default:
                            throw new B(e10);
                    }
                }
                i10 = i15;
                jsonObject = jsonObject5;
                str = str9;
                str2 = str11;
                i11 = i16;
                str3 = str12;
                jsonObject2 = jsonObject6;
                str4 = str16;
                str5 = str17;
                str6 = str13;
                str7 = str14;
                str8 = str15;
                z10 = z11;
                j10 = j12;
                j11 = j13;
            }
            c10.b(fVar);
            return new NetworkRequestContext(i11, str, i10, str4, str5, str6, str7, str8, j10, j11, z10, jsonObject, jsonObject2, str3, str2, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, NetworkRequestContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            NetworkRequestContext.f(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            Z0 z02 = Z0.f45341a;
            D d10 = D.f46068a;
            InterfaceC1901b t10 = AbstractC2028a.t(d10);
            InterfaceC1901b t11 = AbstractC2028a.t(d10);
            InterfaceC1901b t12 = AbstractC2028a.t(z02);
            InterfaceC1901b t13 = AbstractC2028a.t(z02);
            C4096j0 c4096j0 = C4096j0.f45375a;
            return new InterfaceC1901b[]{z02, Y.f45337a, z02, z02, z02, z02, z02, c4096j0, c4096j0, C4093i.f45370a, t10, t11, t12, t13};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final bi.f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: Q5.s$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkRequestContext a(oh.g attributes) {
            JsonObject jsonObject;
            JsonObject jsonObject2;
            Object obj;
            Object m147constructorimpl;
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (!R4.a.l(attributes)) {
                return null;
            }
            String c10 = R4.a.c(attributes, "http.method");
            String str = c10 == null ? "" : c10;
            String c11 = R4.a.c(attributes, "http.status_code");
            int intValue = (c11 == null || (intOrNull = StringsKt.toIntOrNull(c11)) == null) ? 0 : intOrNull.intValue();
            String c12 = R4.a.c(attributes, "http.url");
            String str2 = c12 == null ? "" : c12;
            String c13 = R4.a.c(attributes, "http.target");
            String str3 = c13 == null ? "" : c13;
            String c14 = R4.a.c(attributes, "net.peer.name");
            String str4 = c14 == null ? "" : c14;
            String c15 = R4.a.c(attributes, "http.scheme");
            String str5 = c15 == null ? "" : c15;
            String c16 = R4.a.c(attributes, "status_text");
            String str6 = c16 == null ? "" : c16;
            Long b10 = R4.a.b(attributes, "duration");
            long longValue = b10 != null ? b10.longValue() / DurationKt.NANOS_IN_MILLIS : 0L;
            Long b11 = R4.a.b(attributes, "http.response.body.size");
            long longValue2 = b11 != null ? b11.longValue() : 0L;
            Boolean a10 = R4.a.a(attributes, "auto_attached");
            boolean booleanValue = a10 != null ? a10.booleanValue() : false;
            String c17 = R4.a.c(attributes, "request_headers");
            if (c17 != null) {
                Companion companion = NetworkRequestContext.INSTANCE;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    JsonElement h10 = AbstractC4212b.f46079d.h(c17);
                    m147constructorimpl = Result.m147constructorimpl(h10 instanceof JsonObject ? (JsonObject) h10 : null);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                jsonObject = (JsonObject) m147constructorimpl;
            } else {
                jsonObject = null;
            }
            String c18 = R4.a.c(attributes, "response_headers");
            if (c18 != null) {
                Companion companion4 = NetworkRequestContext.INSTANCE;
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    JsonElement h11 = AbstractC4212b.f46079d.h(c18);
                    obj = Result.m147constructorimpl(h11 instanceof JsonObject ? (JsonObject) h11 : null);
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    obj = Result.m147constructorimpl(ResultKt.createFailure(th3));
                }
                jsonObject2 = (JsonObject) (Result.m153isFailureimpl(obj) ? null : obj);
            } else {
                jsonObject2 = null;
            }
            return new NetworkRequestContext(str, intValue, str2, str3, str4, str5, str6, longValue, longValue2, booleanValue, jsonObject, jsonObject2, R4.a.c(attributes, "request_payload"), R4.a.c(attributes, "response_payload"));
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9489a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ NetworkRequestContext(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, long j10, long j11, boolean z10, JsonObject jsonObject, JsonObject jsonObject2, String str7, String str8, U0 u02) {
        if ((i10 & 1) == 0) {
            this.method = "";
        } else {
            this.method = str;
        }
        if ((i10 & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i11;
        }
        if ((i10 & 4) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i10 & 8) == 0) {
            this.fragments = "";
        } else {
            this.fragments = str3;
        }
        if ((i10 & 16) == 0) {
            this.host = "";
        } else {
            this.host = str4;
        }
        if ((i10 & 32) == 0) {
            this.schema = "";
        } else {
            this.schema = str5;
        }
        if ((i10 & 64) == 0) {
            this.statusText = "";
        } else {
            this.statusText = str6;
        }
        if ((i10 & 128) == 0) {
            this.duration = 0L;
        } else {
            this.duration = j10;
        }
        if ((i10 & 256) == 0) {
            this.responseContentLength = 0L;
        } else {
            this.responseContentLength = j11;
        }
        if ((i10 & 512) == 0) {
            this.isNetworkPlugin = false;
        } else {
            this.isNetworkPlugin = z10;
        }
        if ((i10 & 1024) == 0) {
            this.requestHeaders = null;
        } else {
            this.requestHeaders = jsonObject;
        }
        if ((i10 & 2048) == 0) {
            this.responseHeaders = null;
        } else {
            this.responseHeaders = jsonObject2;
        }
        if ((i10 & 4096) == 0) {
            this.requestPayload = null;
        } else {
            this.requestPayload = str7;
        }
        if ((i10 & 8192) == 0) {
            this.responsePayload = null;
        } else {
            this.responsePayload = str8;
        }
    }

    public static final /* synthetic */ void f(NetworkRequestContext self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.method, "")) {
            output.G(serialDesc, 0, self.method);
        }
        if (output.m(serialDesc, 1) || self.statusCode != 0) {
            output.f(serialDesc, 1, self.statusCode);
        }
        if (output.m(serialDesc, 2) || !Intrinsics.areEqual(self.url, "")) {
            output.G(serialDesc, 2, self.url);
        }
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.fragments, "")) {
            output.G(serialDesc, 3, self.fragments);
        }
        if (output.m(serialDesc, 4) || !Intrinsics.areEqual(self.host, "")) {
            output.G(serialDesc, 4, self.host);
        }
        if (output.m(serialDesc, 5) || !Intrinsics.areEqual(self.schema, "")) {
            output.G(serialDesc, 5, self.schema);
        }
        if (output.m(serialDesc, 6) || !Intrinsics.areEqual(self.statusText, "")) {
            output.G(serialDesc, 6, self.statusText);
        }
        if (output.m(serialDesc, 7) || self.duration != 0) {
            output.e(serialDesc, 7, self.duration);
        }
        if (output.m(serialDesc, 8) || self.responseContentLength != 0) {
            output.e(serialDesc, 8, self.responseContentLength);
        }
        if (output.m(serialDesc, 9) || self.isNetworkPlugin) {
            output.F(serialDesc, 9, self.isNetworkPlugin);
        }
        if (output.m(serialDesc, 10) || self.requestHeaders != null) {
            output.C(serialDesc, 10, D.f46068a, self.requestHeaders);
        }
        if (output.m(serialDesc, 11) || self.responseHeaders != null) {
            output.C(serialDesc, 11, D.f46068a, self.responseHeaders);
        }
        if (output.m(serialDesc, 12) || self.requestPayload != null) {
            output.C(serialDesc, 12, Z0.f45341a, self.requestPayload);
        }
        if (!output.m(serialDesc, 13) && self.responsePayload == null) {
            return;
        }
        output.C(serialDesc, 13, Z0.f45341a, self.responsePayload);
    }

    /* renamed from: a, reason: from getter */
    public final String getFragments() {
        return this.fragments;
    }

    /* renamed from: b, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: d, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRequestContext)) {
            return false;
        }
        NetworkRequestContext networkRequestContext = (NetworkRequestContext) other;
        return Intrinsics.areEqual(this.method, networkRequestContext.method) && this.statusCode == networkRequestContext.statusCode && Intrinsics.areEqual(this.url, networkRequestContext.url) && Intrinsics.areEqual(this.fragments, networkRequestContext.fragments) && Intrinsics.areEqual(this.host, networkRequestContext.host) && Intrinsics.areEqual(this.schema, networkRequestContext.schema) && Intrinsics.areEqual(this.statusText, networkRequestContext.statusText) && this.duration == networkRequestContext.duration && this.responseContentLength == networkRequestContext.responseContentLength && this.isNetworkPlugin == networkRequestContext.isNetworkPlugin && Intrinsics.areEqual(this.requestHeaders, networkRequestContext.requestHeaders) && Intrinsics.areEqual(this.responseHeaders, networkRequestContext.responseHeaders) && Intrinsics.areEqual(this.requestPayload, networkRequestContext.requestPayload) && Intrinsics.areEqual(this.responsePayload, networkRequestContext.responsePayload);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.method.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.url.hashCode()) * 31) + this.fragments.hashCode()) * 31) + this.host.hashCode()) * 31) + this.schema.hashCode()) * 31) + this.statusText.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Long.hashCode(this.responseContentLength)) * 31) + Boolean.hashCode(this.isNetworkPlugin)) * 31;
        JsonObject jsonObject = this.requestHeaders;
        int hashCode2 = (hashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonObject jsonObject2 = this.responseHeaders;
        int hashCode3 = (hashCode2 + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        String str = this.requestPayload;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.responsePayload;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkRequestContext(method=" + this.method + ", statusCode=" + this.statusCode + ", url=" + this.url + ", fragments=" + this.fragments + ", host=" + this.host + ", schema=" + this.schema + ", statusText=" + this.statusText + ", duration=" + this.duration + ", responseContentLength=" + this.responseContentLength + ", isNetworkPlugin=" + this.isNetworkPlugin + ", requestHeaders=" + this.requestHeaders + ", responseHeaders=" + this.responseHeaders + ", requestPayload=" + this.requestPayload + ", responsePayload=" + this.responsePayload + ")";
    }

    public NetworkRequestContext(String method, int i10, String url, String fragments, String host, String schema, String statusText, long j10, long j11, boolean z10, JsonObject jsonObject, JsonObject jsonObject2, String str, String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        this.method = method;
        this.statusCode = i10;
        this.url = url;
        this.fragments = fragments;
        this.host = host;
        this.schema = schema;
        this.statusText = statusText;
        this.duration = j10;
        this.responseContentLength = j11;
        this.isNetworkPlugin = z10;
        this.requestHeaders = jsonObject;
        this.responseHeaders = jsonObject2;
        this.requestPayload = str;
        this.responsePayload = str2;
    }
}
