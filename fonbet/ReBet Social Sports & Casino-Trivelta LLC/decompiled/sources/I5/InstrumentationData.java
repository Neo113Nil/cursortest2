package I5;

import I5.ErrorContext;
import I5.OpenTelemetryResource;
import I5.OpenTelemetrySpanData;
import Q5.EventContext;
import Q5.NetworkRequestContext;
import Zh.B;
import Zh.InterfaceC1901b;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import ei.C;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002$\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010#\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"LI5/h;", "", "LI5/o;", "openTelemetryPartialSpanData", "LI5/n;", "openTelemetryResource", "<init>", "(LI5/o;LI5/n;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILI5/o;LI5/n;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "c", "(LI5/h;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LI5/o;", "getOpenTelemetryPartialSpanData", "()LI5/o;", "getOpenTelemetryPartialSpanData$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "LI5/n;", "getOpenTelemetryResource", "()LI5/n;", "getOpenTelemetryResource$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.h, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class InstrumentationData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final DeviceContext f5414c;

    /* renamed from: d, reason: collision with root package name */
    public static final MobileSdkMetadata f5415d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final OpenTelemetrySpanData openTelemetryPartialSpanData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final OpenTelemetryResource openTelemetryResource;

    /* renamed from: I5.h$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5418a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5418a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.InstrumentationData", aVar, 2);
            j02.n("otelSpan", false);
            j02.n("otelResource", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InstrumentationData deserialize(ci.e decoder) {
            OpenTelemetrySpanData openTelemetrySpanData;
            OpenTelemetryResource openTelemetryResource;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            U0 u02 = null;
            if (c10.q()) {
                openTelemetrySpanData = (OpenTelemetrySpanData) c10.i(fVar, 0, OpenTelemetrySpanData.a.f5463a, null);
                openTelemetryResource = (OpenTelemetryResource) c10.i(fVar, 1, OpenTelemetryResource.a.f5453a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                openTelemetrySpanData = null;
                OpenTelemetryResource openTelemetryResource2 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        openTelemetrySpanData = (OpenTelemetrySpanData) c10.i(fVar, 0, OpenTelemetrySpanData.a.f5463a, openTelemetrySpanData);
                        i11 |= 1;
                    } else {
                        if (e10 != 1) {
                            throw new B(e10);
                        }
                        openTelemetryResource2 = (OpenTelemetryResource) c10.i(fVar, 1, OpenTelemetryResource.a.f5453a, openTelemetryResource2);
                        i11 |= 2;
                    }
                }
                openTelemetryResource = openTelemetryResource2;
                i10 = i11;
            }
            c10.b(fVar);
            return new InstrumentationData(i10, openTelemetrySpanData, openTelemetryResource, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, InstrumentationData value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            InstrumentationData.c(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{OpenTelemetrySpanData.a.f5463a, OpenTelemetryResource.a.f5453a};
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

    /* renamed from: I5.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstrumentationData a(Ch.c span, Q5.c coralogixOptions) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(coralogixOptions, "coralogixOptions");
            oh.g attributes = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            if (!R4.a.l(attributes)) {
                return null;
            }
            Map asMap = span.g().e().toBuilder().a(oh.e.a("service.name"), coralogixOptions.c()).build().asMap();
            Intrinsics.checkNotNullExpressionValue(asMap, "asMap(...)");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : asMap.entrySet()) {
                oh.e eVar = (oh.e) entry.getKey();
                Object value = entry.getValue();
                String key = eVar.getKey();
                String obj = value != null ? value.toString() : null;
                Pair pair = obj != null ? TuplesKt.to(key, obj) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map map = MapsKt.toMap(arrayList);
            oh.g attributes2 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes2, "getAttributes(...)");
            String c10 = R4.a.c(attributes2, "span_id");
            if (c10 == null) {
                c10 = span.c();
            }
            String str = c10;
            oh.g attributes3 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes3, "getAttributes(...)");
            String c11 = R4.a.c(attributes3, "trace_id");
            if (c11 == null) {
                c11 = span.d();
            }
            String str2 = c11;
            oh.g attributes4 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes4, "getAttributes(...)");
            String c12 = R4.a.c(attributes4, "session_id");
            if (c12 == null) {
                c12 = "";
            }
            String str3 = c12;
            oh.g attributes5 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes5, "getAttributes(...)");
            EventContext eventContext = new EventContext(attributes5);
            NetworkRequestContext.Companion companion = NetworkRequestContext.INSTANCE;
            oh.g attributes6 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes6, "getAttributes(...)");
            NetworkRequestContext a10 = companion.a(attributes6);
            ErrorContext.Companion companion2 = ErrorContext.INSTANCE;
            oh.g attributes7 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes7, "getAttributes(...)");
            ErrorContext b10 = companion2.b(attributes7);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ei.j.l(F5.b.e(coralogixOptions.m())));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            JsonObject jsonObject = (JsonObject) m147constructorimpl;
            C c13 = new C();
            ei.i.a(c13, "cx_rum.session_context.session_id", str3);
            String userId = coralogixOptions.t().getUserId();
            if (userId.length() <= 0) {
                userId = null;
            }
            if (userId != null) {
                ei.i.a(c13, "cx_rum.session_context.user_id", userId);
            }
            String username = coralogixOptions.t().getUsername();
            if (username.length() <= 0) {
                username = null;
            }
            if (username != null) {
                ei.i.a(c13, "cx_rum.session_context.user_name", username);
            }
            String email = coralogixOptions.t().getEmail();
            String str4 = email.length() > 0 ? email : null;
            if (str4 != null) {
                ei.i.a(c13, "cx_rum.session_context.user_email", str4);
            }
            ei.i.a(c13, "cx_rum.session_context.os", InstrumentationData.f5414c.getOs());
            ei.i.a(c13, "cx_rum.session_context.osVersion", InstrumentationData.f5414c.getOsVersion());
            ei.i.a(c13, "cx_rum.session_context.device", InstrumentationData.f5414c.getDevice());
            ei.i.a(c13, "cx_rum.session_context.user_agent", InstrumentationData.f5414c.getUserAgent());
            ei.i.a(c13, "cx_rum.mobile_sdk.version", InstrumentationData.f5415d.getVersion());
            ei.i.a(c13, "cx_rum.version_metadata.app_name", coralogixOptions.c());
            ei.i.a(c13, "cx_rum.version_metadata.app_version", coralogixOptions.v());
            ei.i.a(c13, "cx_rum.event_context.type", eventContext.getType());
            ei.i.a(c13, "cx_rum.event_context.severity", String.valueOf(eventContext.getSeverity().getLevel()));
            String source = eventContext.getSource();
            if (source != null) {
                ei.i.a(c13, "cx_rum.event_context.source", source);
            }
            if (a10 != null) {
                ei.i.a(c13, "cx_rum.network_request_context.url", a10.getUrl());
                ei.i.a(c13, "cx_rum.network_request_context.method", a10.getMethod());
                ei.i.a(c13, "cx_rum.network_request_context.status_code", String.valueOf(a10.getStatusCode()));
                ei.i.a(c13, "cx_rum.network_request_context.status_text", a10.getStatusText());
                ei.i.a(c13, "cx_rum.network_request_context.fragments", a10.getFragments());
                ei.i.a(c13, "cx_rum.page_context.page_url", a10.getUrl());
                ei.i.a(c13, "cx_rum.page_context.page_fragments", a10.getFragments());
            }
            if (b10 != null) {
                ei.i.a(c13, "cx_rum.error_context.error_message", b10.getMessage());
                ei.i.a(c13, "cx_rum.error_context.error_type", b10.getType());
            }
            ei.i.a(c13, "cx_rum.environment", coralogixOptions.i());
            ei.i.a(c13, "cx_rum.platform", "mobile");
            if (jsonObject != null) {
                c13.b("cx_rum.labels", jsonObject);
            }
            JsonObject a11 = c13.a();
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            String name = span.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new InstrumentationData(new OpenTelemetrySpanData(str, str2, name, a11, CollectionsKt.listOf((Object[]) new Long[]{0L, Long.valueOf(span.e())}), CollectionsKt.listOf((Object[]) new Long[]{0L, Long.valueOf(span.f())}), R4.b.a(span), 0, CollectionsKt.listOf((Object[]) new Long[]{0L, Long.valueOf(span.f() - span.e())}), 128, (DefaultConstructorMarker) null), new OpenTelemetryResource(map));
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5418a;
        }

        public Companion() {
        }
    }

    static {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        f5414c = new DeviceContext((String) null, str, str2, str3, str4, false, 63, (DefaultConstructorMarker) null);
        f5415d = new MobileSdkMetadata(str, str2, str3, str4, 15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ InstrumentationData(int i10, OpenTelemetrySpanData openTelemetrySpanData, OpenTelemetryResource openTelemetryResource, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, a.f5418a.getDescriptor());
        }
        this.openTelemetryPartialSpanData = openTelemetrySpanData;
        this.openTelemetryResource = openTelemetryResource;
    }

    public static final /* synthetic */ void c(InstrumentationData self, ci.d output, bi.f serialDesc) {
        output.B(serialDesc, 0, OpenTelemetrySpanData.a.f5463a, self.openTelemetryPartialSpanData);
        output.B(serialDesc, 1, OpenTelemetryResource.a.f5453a, self.openTelemetryResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentationData)) {
            return false;
        }
        InstrumentationData instrumentationData = (InstrumentationData) other;
        return Intrinsics.areEqual(this.openTelemetryPartialSpanData, instrumentationData.openTelemetryPartialSpanData) && Intrinsics.areEqual(this.openTelemetryResource, instrumentationData.openTelemetryResource);
    }

    public int hashCode() {
        return (this.openTelemetryPartialSpanData.hashCode() * 31) + this.openTelemetryResource.hashCode();
    }

    public String toString() {
        return "InstrumentationData(openTelemetryPartialSpanData=" + this.openTelemetryPartialSpanData + ", openTelemetryResource=" + this.openTelemetryResource + ")";
    }

    public InstrumentationData(OpenTelemetrySpanData openTelemetryPartialSpanData, OpenTelemetryResource openTelemetryResource) {
        Intrinsics.checkNotNullParameter(openTelemetryPartialSpanData, "openTelemetryPartialSpanData");
        Intrinsics.checkNotNullParameter(openTelemetryResource, "openTelemetryResource");
        this.openTelemetryPartialSpanData = openTelemetryPartialSpanData;
        this.openTelemetryResource = openTelemetryResource;
    }
}
