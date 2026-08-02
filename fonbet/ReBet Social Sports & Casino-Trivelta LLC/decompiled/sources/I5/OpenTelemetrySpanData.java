package I5;

import I5.SpanDataStatus;
import Zh.B;
import Zh.InterfaceC1901b;
import di.C4087f;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import di.Z0;
import i3.C4527h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b'\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0002'\u001dBs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u00107\u0012\u0004\b=\u0010+\u001a\u0004\b<\u00109R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010+\u001a\u0004\b@\u0010AR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bF\u0010+\u001a\u0004\bE\u0010\"R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u00107\u0012\u0004\bI\u0010+\u001a\u0004\bH\u00109¨\u0006K"}, d2 = {"LI5/o;", "", "", "spanId", "traceId", "name", "Lkotlinx/serialization/json/JsonElement;", "attributes", "", "", "startTime", "endTime", "LI5/r;", "status", "", "kind", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Ljava/util/List;LI5/r;ILjava/util/List;)V", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Ljava/util/List;LI5/r;ILjava/util/List;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.crypto.tink.integration.android.b.f37029b, "(LI5/o;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSpanId", "getSpanId$annotations", "()V", "getTraceId", "getTraceId$annotations", "c", "getName", "getName$annotations", W9.d.f13160a, "Lkotlinx/serialization/json/JsonElement;", "getAttributes", "()Lkotlinx/serialization/json/JsonElement;", "getAttributes$annotations", com.bumptech.glide.gifdecoder.e.f29601m, "Ljava/util/List;", "getStartTime", "()Ljava/util/List;", "getStartTime$annotations", "f", "getEndTime", "getEndTime$annotations", "g", "LI5/r;", "getStatus", "()LI5/r;", "getStatus$annotations", C4527h.f48087o, "I", "getKind", "getKind$annotations", com.google.android.material.shape.i.f35755A, "getDuration", "getDuration$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.o, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class OpenTelemetrySpanData {

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String spanId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String traceId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonElement attributes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final List startTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final List endTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final SpanDataStatus status;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final int kind;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final List duration;

    /* renamed from: I5.o$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5463a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5463a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.OpenTelemetrySpanData", aVar, 9);
            j02.n("spanId", true);
            j02.n("traceId", true);
            j02.n("name", true);
            j02.n("attributes", true);
            j02.n("startTime", true);
            j02.n("endTime", true);
            j02.n("status", true);
            j02.n("kind", true);
            j02.n("duration", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OpenTelemetrySpanData deserialize(ci.e decoder) {
            int i10;
            SpanDataStatus spanDataStatus;
            List list;
            List list2;
            List list3;
            JsonElement jsonElement;
            int i11;
            String str;
            String str2;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = OpenTelemetrySpanData.$childSerializers;
            int i12 = 7;
            int i13 = 5;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                String s11 = c10.s(fVar, 1);
                String s12 = c10.s(fVar, 2);
                JsonElement jsonElement2 = (JsonElement) c10.i(fVar, 3, ei.q.f46124a, null);
                List list4 = (List) c10.i(fVar, 4, interfaceC1901bArr[4], null);
                List list5 = (List) c10.i(fVar, 5, interfaceC1901bArr[5], null);
                SpanDataStatus spanDataStatus2 = (SpanDataStatus) c10.i(fVar, 6, SpanDataStatus.a.f5477a, null);
                int F10 = c10.F(fVar, 7);
                list2 = (List) c10.i(fVar, 8, interfaceC1901bArr[8], null);
                str = s10;
                i10 = F10;
                spanDataStatus = spanDataStatus2;
                jsonElement = jsonElement2;
                str3 = s12;
                list = list5;
                i11 = 511;
                list3 = list4;
                str2 = s11;
            } else {
                int i14 = 4;
                boolean z10 = true;
                int i15 = 0;
                SpanDataStatus spanDataStatus3 = null;
                List list6 = null;
                List list7 = null;
                List list8 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i16 = 0;
                JsonElement jsonElement3 = null;
                while (z10) {
                    int i17 = i13;
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z10 = false;
                            i13 = 5;
                            i14 = 4;
                        case 0:
                            i16 |= 1;
                            str4 = c10.s(fVar, 0);
                            i12 = 7;
                            i13 = 5;
                            i14 = 4;
                        case 1:
                            i16 |= 2;
                            str5 = c10.s(fVar, 1);
                            i12 = 7;
                            i13 = 5;
                            i14 = 4;
                        case 2:
                            str6 = c10.s(fVar, 2);
                            i16 |= 4;
                            i12 = 7;
                            i13 = 5;
                            i14 = 4;
                        case 3:
                            jsonElement3 = (JsonElement) c10.i(fVar, 3, ei.q.f46124a, jsonElement3);
                            i16 |= 8;
                            i12 = 7;
                            i13 = 5;
                            i14 = 4;
                        case 4:
                            list8 = (List) c10.i(fVar, i14, interfaceC1901bArr[i14], list8);
                            i16 |= 16;
                            i12 = 7;
                            i13 = 5;
                        case 5:
                            list6 = (List) c10.i(fVar, i17, interfaceC1901bArr[i17], list6);
                            i16 |= 32;
                            i13 = i17;
                            i12 = 7;
                        case 6:
                            spanDataStatus3 = (SpanDataStatus) c10.i(fVar, 6, SpanDataStatus.a.f5477a, spanDataStatus3);
                            i16 |= 64;
                            i13 = i17;
                        case 7:
                            i15 = c10.F(fVar, i12);
                            i16 |= 128;
                            i13 = i17;
                        case 8:
                            list7 = (List) c10.i(fVar, 8, interfaceC1901bArr[8], list7);
                            i16 |= 256;
                            i13 = i17;
                        default:
                            throw new B(e10);
                    }
                }
                i10 = i15;
                spanDataStatus = spanDataStatus3;
                list = list6;
                list2 = list7;
                list3 = list8;
                jsonElement = jsonElement3;
                i11 = i16;
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            c10.b(fVar);
            return new OpenTelemetrySpanData(i11, str, str2, str3, jsonElement, list3, list, spanDataStatus, i10, list2, (U0) null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, OpenTelemetrySpanData value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            OpenTelemetrySpanData.b(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b[] interfaceC1901bArr = OpenTelemetrySpanData.$childSerializers;
            InterfaceC1901b interfaceC1901b = interfaceC1901bArr[4];
            InterfaceC1901b interfaceC1901b2 = interfaceC1901bArr[5];
            InterfaceC1901b interfaceC1901b3 = interfaceC1901bArr[8];
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, z02, ei.q.f46124a, interfaceC1901b, interfaceC1901b2, SpanDataStatus.a.f5477a, Y.f45337a, interfaceC1901b3};
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

    /* renamed from: I5.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5463a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C4096j0 c4096j0 = C4096j0.f45375a;
        $childSerializers = new InterfaceC1901b[]{null, null, null, null, new C4087f(c4096j0), new C4087f(c4096j0), null, null, new C4087f(c4096j0)};
    }

    public /* synthetic */ OpenTelemetrySpanData(int i10, String str, String str2, String str3, JsonElement jsonElement, List list, List list2, SpanDataStatus spanDataStatus, int i11, List list3, U0 u02) {
        if ((i10 & 1) == 0) {
            this.spanId = "";
        } else {
            this.spanId = str;
        }
        if ((i10 & 2) == 0) {
            this.traceId = "";
        } else {
            this.traceId = str2;
        }
        if ((i10 & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i10 & 8) == 0) {
            this.attributes = JsonNull.INSTANCE;
        } else {
            this.attributes = jsonElement;
        }
        if ((i10 & 16) == 0) {
            this.startTime = CollectionsKt.emptyList();
        } else {
            this.startTime = list;
        }
        if ((i10 & 32) == 0) {
            this.endTime = CollectionsKt.emptyList();
        } else {
            this.endTime = list2;
        }
        if ((i10 & 64) == 0) {
            this.status = new SpanDataStatus(0, 1, (DefaultConstructorMarker) null);
        } else {
            this.status = spanDataStatus;
        }
        if ((i10 & 128) == 0) {
            this.kind = 2;
        } else {
            this.kind = i11;
        }
        if ((i10 & 256) == 0) {
            this.duration = CollectionsKt.emptyList();
        } else {
            this.duration = list3;
        }
    }

    public static final /* synthetic */ void b(OpenTelemetrySpanData self, ci.d output, bi.f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.spanId, "")) {
            output.G(serialDesc, 0, self.spanId);
        }
        if (output.m(serialDesc, 1) || !Intrinsics.areEqual(self.traceId, "")) {
            output.G(serialDesc, 1, self.traceId);
        }
        if (output.m(serialDesc, 2) || !Intrinsics.areEqual(self.name, "")) {
            output.G(serialDesc, 2, self.name);
        }
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.attributes, JsonNull.INSTANCE)) {
            output.B(serialDesc, 3, ei.q.f46124a, self.attributes);
        }
        if (output.m(serialDesc, 4) || !Intrinsics.areEqual(self.startTime, CollectionsKt.emptyList())) {
            output.B(serialDesc, 4, interfaceC1901bArr[4], self.startTime);
        }
        if (output.m(serialDesc, 5) || !Intrinsics.areEqual(self.endTime, CollectionsKt.emptyList())) {
            output.B(serialDesc, 5, interfaceC1901bArr[5], self.endTime);
        }
        if (output.m(serialDesc, 6) || !Intrinsics.areEqual(self.status, new SpanDataStatus(0, 1, (DefaultConstructorMarker) null))) {
            output.B(serialDesc, 6, SpanDataStatus.a.f5477a, self.status);
        }
        if (output.m(serialDesc, 7) || self.kind != 2) {
            output.f(serialDesc, 7, self.kind);
        }
        if (!output.m(serialDesc, 8) && Intrinsics.areEqual(self.duration, CollectionsKt.emptyList())) {
            return;
        }
        output.B(serialDesc, 8, interfaceC1901bArr[8], self.duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenTelemetrySpanData)) {
            return false;
        }
        OpenTelemetrySpanData openTelemetrySpanData = (OpenTelemetrySpanData) other;
        return Intrinsics.areEqual(this.spanId, openTelemetrySpanData.spanId) && Intrinsics.areEqual(this.traceId, openTelemetrySpanData.traceId) && Intrinsics.areEqual(this.name, openTelemetrySpanData.name) && Intrinsics.areEqual(this.attributes, openTelemetrySpanData.attributes) && Intrinsics.areEqual(this.startTime, openTelemetrySpanData.startTime) && Intrinsics.areEqual(this.endTime, openTelemetrySpanData.endTime) && Intrinsics.areEqual(this.status, openTelemetrySpanData.status) && this.kind == openTelemetrySpanData.kind && Intrinsics.areEqual(this.duration, openTelemetrySpanData.duration);
    }

    public int hashCode() {
        return (((((((((((((((this.spanId.hashCode() * 31) + this.traceId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.attributes.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.kind)) * 31) + this.duration.hashCode();
    }

    public String toString() {
        return "OpenTelemetrySpanData(spanId=" + this.spanId + ", traceId=" + this.traceId + ", name=" + this.name + ", attributes=" + this.attributes + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", kind=" + this.kind + ", duration=" + this.duration + ")";
    }

    public OpenTelemetrySpanData(String spanId, String traceId, String name, JsonElement attributes, List startTime, List endTime, SpanDataStatus status, int i10, List duration) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.spanId = spanId;
        this.traceId = traceId;
        this.name = name;
        this.attributes = attributes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.kind = i10;
        this.duration = duration;
    }

    public /* synthetic */ OpenTelemetrySpanData(String str, String str2, String str3, JsonElement jsonElement, List list, List list2, SpanDataStatus spanDataStatus, int i10, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? JsonNull.INSTANCE : jsonElement, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 64) != 0 ? new SpanDataStatus(0, 1, (DefaultConstructorMarker) null) : spanDataStatus, (i11 & 128) != 0 ? 2 : i10, (i11 & 256) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
