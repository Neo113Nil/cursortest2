package I5;

import I5.InstrumentationData;
import I5.LogData;
import I5.VersionMetadata;
import Q5.b;
import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.twilio.voice.EventKeys;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u0000 N2\u00020\u0001:\u0002'5BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0017B_\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u000f\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&JX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010*R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010=\u0012\u0004\b?\u00104\u001a\u0004\b8\u0010>R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010@\u0012\u0004\bC\u00104\u001a\u0004\bA\u0010BR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u00104\u001a\u0004\bF\u0010GR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00104\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"LI5/l;", "", "", "applicationName", "subsystemName", "LQ5/b;", "severity", "LI5/k;", "logData", "", EventKeys.TIMESTAMP, "LI5/s;", "versionMetadata", "LI5/h;", "instrumentationData", "<init>", "(Ljava/lang/String;Ljava/lang/String;LQ5/b;LI5/k;JLI5/s;LI5/h;)V", "LCh/c;", "span", "LI5/p;", "sessionConfiguration", "LO5/a;", "snapshotManager", "(LCh/c;LI5/p;LO5/a;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LQ5/b;LI5/k;JLI5/s;LI5/h;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.bumptech.glide.gifdecoder.e.f29601m, "(LI5/l;Lci/d;Lbi/f;)V", W9.d.f13160a, "()LI5/l;", "a", "(Ljava/lang/String;Ljava/lang/String;LQ5/b;LI5/k;JLI5/s;LI5/h;)LI5/l;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationName", "getApplicationName$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getSubsystemName", "getSubsystemName$annotations", "c", "LQ5/b;", "getSeverity", "()LQ5/b;", "getSeverity$annotations", "LI5/k;", "()LI5/k;", "getLogData$annotations", "J", "getTimestamp", "()J", "getTimestamp$annotations", "f", "LI5/s;", "getVersionMetadata", "()LI5/s;", "getVersionMetadata$annotations", "g", "LI5/h;", "getInstrumentationData", "()LI5/h;", "getInstrumentationData$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.l, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class LogEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String applicationName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String subsystemName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Q5.b severity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final LogData logData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timestamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final VersionMetadata versionMetadata;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final InstrumentationData instrumentationData;

    /* renamed from: I5.l$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5446a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5446a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.LogEntry", aVar, 7);
            j02.n("applicationName", true);
            j02.n("subsystemName", true);
            j02.n("severity", true);
            j02.n("text", true);
            j02.n(EventKeys.TIMESTAMP, true);
            j02.n("version_metadata", true);
            j02.n("instrumentation_data", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LogEntry deserialize(ci.e decoder) {
            int i10;
            String str;
            String str2;
            Q5.b bVar;
            LogData logData;
            VersionMetadata versionMetadata;
            InstrumentationData instrumentationData;
            long j10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            String str3 = null;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                String s11 = c10.s(fVar, 1);
                Q5.b bVar2 = (Q5.b) c10.i(fVar, 2, b.C0182b.f9372a, null);
                LogData logData2 = (LogData) c10.i(fVar, 3, LogData.a.f5438a, null);
                long g10 = c10.g(fVar, 4);
                VersionMetadata versionMetadata2 = (VersionMetadata) c10.i(fVar, 5, VersionMetadata.a.f5480a, null);
                str = s10;
                instrumentationData = (InstrumentationData) c10.C(fVar, 6, InstrumentationData.a.f5418a, null);
                versionMetadata = versionMetadata2;
                logData = logData2;
                i10 = 127;
                bVar = bVar2;
                str2 = s11;
                j10 = g10;
            } else {
                boolean z10 = true;
                int i11 = 0;
                LogData logData3 = null;
                VersionMetadata versionMetadata3 = null;
                InstrumentationData instrumentationData2 = null;
                long j11 = 0;
                String str4 = null;
                Q5.b bVar3 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            str3 = c10.s(fVar, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            str4 = c10.s(fVar, 1);
                            i11 |= 2;
                            break;
                        case 2:
                            bVar3 = (Q5.b) c10.i(fVar, 2, b.C0182b.f9372a, bVar3);
                            i11 |= 4;
                            break;
                        case 3:
                            logData3 = (LogData) c10.i(fVar, 3, LogData.a.f5438a, logData3);
                            i11 |= 8;
                            break;
                        case 4:
                            j11 = c10.g(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            versionMetadata3 = (VersionMetadata) c10.i(fVar, 5, VersionMetadata.a.f5480a, versionMetadata3);
                            i11 |= 32;
                            break;
                        case 6:
                            instrumentationData2 = (InstrumentationData) c10.C(fVar, 6, InstrumentationData.a.f5418a, instrumentationData2);
                            i11 |= 64;
                            break;
                        default:
                            throw new B(e10);
                    }
                }
                i10 = i11;
                str = str3;
                str2 = str4;
                bVar = bVar3;
                logData = logData3;
                versionMetadata = versionMetadata3;
                instrumentationData = instrumentationData2;
                j10 = j11;
            }
            c10.b(fVar);
            return new LogEntry(i10, str, str2, bVar, logData, j10, versionMetadata, instrumentationData, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, LogEntry value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            LogEntry.e(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b t10 = AbstractC2028a.t(InstrumentationData.a.f5418a);
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, b.C0182b.f9372a, LogData.a.f5438a, C4096j0.f45375a, VersionMetadata.a.f5480a, t10};
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

    /* renamed from: I5.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5446a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ LogEntry(int i10, String str, String str2, Q5.b bVar, LogData logData, long j10, VersionMetadata versionMetadata, InstrumentationData instrumentationData, U0 u02) {
        if ((i10 & 1) == 0) {
            this.applicationName = "";
        } else {
            this.applicationName = str;
        }
        if ((i10 & 2) == 0) {
            this.subsystemName = "";
        } else {
            this.subsystemName = str2;
        }
        if ((i10 & 4) == 0) {
            this.severity = b.f.f9377b;
        } else {
            this.severity = bVar;
        }
        CxRum cxRum = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if ((i10 & 8) == 0) {
            this.logData = new LogData(cxRum, 1, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0));
        } else {
            this.logData = logData;
        }
        if ((i10 & 16) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j10;
        }
        if ((i10 & 32) == 0) {
            this.versionMetadata = new VersionMetadata((String) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.versionMetadata = versionMetadata;
        }
        if ((i10 & 64) == 0) {
            this.instrumentationData = null;
        } else {
            this.instrumentationData = instrumentationData;
        }
    }

    public static /* synthetic */ LogEntry b(LogEntry logEntry, String str, String str2, Q5.b bVar, LogData logData, long j10, VersionMetadata versionMetadata, InstrumentationData instrumentationData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logEntry.applicationName;
        }
        if ((i10 & 2) != 0) {
            str2 = logEntry.subsystemName;
        }
        if ((i10 & 4) != 0) {
            bVar = logEntry.severity;
        }
        if ((i10 & 8) != 0) {
            logData = logEntry.logData;
        }
        if ((i10 & 16) != 0) {
            j10 = logEntry.timestamp;
        }
        if ((i10 & 32) != 0) {
            versionMetadata = logEntry.versionMetadata;
        }
        if ((i10 & 64) != 0) {
            instrumentationData = logEntry.instrumentationData;
        }
        long j11 = j10;
        Q5.b bVar2 = bVar;
        LogData logData2 = logData;
        return logEntry.a(str, str2, bVar2, logData2, j11, versionMetadata, instrumentationData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void e(LogEntry self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.applicationName, "")) {
            output.G(serialDesc, 0, self.applicationName);
        }
        int i10 = 1;
        if (output.m(serialDesc, 1) || !Intrinsics.areEqual(self.subsystemName, "")) {
            output.G(serialDesc, 1, self.subsystemName);
        }
        if (output.m(serialDesc, 2) || !Intrinsics.areEqual(self.severity, b.f.f9377b)) {
            output.B(serialDesc, 2, b.C0182b.f9372a, self.severity);
        }
        int i11 = 3;
        CxRum cxRum = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.logData, new LogData(cxRum, i10, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0)))) {
            output.B(serialDesc, 3, LogData.a.f5438a, self.logData);
        }
        if (output.m(serialDesc, 4) || self.timestamp != 0) {
            output.e(serialDesc, 4, self.timestamp);
        }
        if (output.m(serialDesc, 5) || !Intrinsics.areEqual(self.versionMetadata, new VersionMetadata((String) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), i11, (DefaultConstructorMarker) (objArr == true ? 1 : 0)))) {
            output.B(serialDesc, 5, VersionMetadata.a.f5480a, self.versionMetadata);
        }
        if (!output.m(serialDesc, 6) && self.instrumentationData == null) {
            return;
        }
        output.C(serialDesc, 6, InstrumentationData.a.f5418a, self.instrumentationData);
    }

    public final LogEntry a(String applicationName, String subsystemName, Q5.b severity, LogData logData, long timestamp, VersionMetadata versionMetadata, InstrumentationData instrumentationData) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(subsystemName, "subsystemName");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(logData, "logData");
        Intrinsics.checkNotNullParameter(versionMetadata, "versionMetadata");
        return new LogEntry(applicationName, subsystemName, severity, logData, timestamp, versionMetadata, instrumentationData);
    }

    /* renamed from: c, reason: from getter */
    public final LogData getLogData() {
        return this.logData;
    }

    public final LogEntry d() {
        Q5.b severity = this.logData.getData().getEventContext().getSeverity();
        return Intrinsics.areEqual(this.severity, severity) ? this : b(this, null, null, severity, null, 0L, null, null, 123, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) other;
        return Intrinsics.areEqual(this.applicationName, logEntry.applicationName) && Intrinsics.areEqual(this.subsystemName, logEntry.subsystemName) && Intrinsics.areEqual(this.severity, logEntry.severity) && Intrinsics.areEqual(this.logData, logEntry.logData) && this.timestamp == logEntry.timestamp && Intrinsics.areEqual(this.versionMetadata, logEntry.versionMetadata) && Intrinsics.areEqual(this.instrumentationData, logEntry.instrumentationData);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.applicationName.hashCode() * 31) + this.subsystemName.hashCode()) * 31) + this.severity.hashCode()) * 31) + this.logData.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.versionMetadata.hashCode()) * 31;
        InstrumentationData instrumentationData = this.instrumentationData;
        return hashCode + (instrumentationData == null ? 0 : instrumentationData.hashCode());
    }

    public String toString() {
        return "LogEntry(applicationName=" + this.applicationName + ", subsystemName=" + this.subsystemName + ", severity=" + this.severity + ", logData=" + this.logData + ", timestamp=" + this.timestamp + ", versionMetadata=" + this.versionMetadata + ", instrumentationData=" + this.instrumentationData + ")";
    }

    public LogEntry(String applicationName, String subsystemName, Q5.b severity, LogData logData, long j10, VersionMetadata versionMetadata, InstrumentationData instrumentationData) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(subsystemName, "subsystemName");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(logData, "logData");
        Intrinsics.checkNotNullParameter(versionMetadata, "versionMetadata");
        this.applicationName = applicationName;
        this.subsystemName = subsystemName;
        this.severity = severity;
        this.logData = logData;
        this.timestamp = j10;
        this.versionMetadata = versionMetadata;
        this.instrumentationData = instrumentationData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LogEntry(Ch.c span, p sessionConfiguration, O5.a snapshotManager) {
        this(r2, "cx_rum", r4, r5, (r13 == null || (r13 = StringsKt.toLongOrNull(r13)) == null) ? 0L : r13.longValue(), new VersionMetadata(sessionConfiguration.c().c(), sessionConfiguration.c().v()), InstrumentationData.INSTANCE.a(span, sessionConfiguration.c()));
        Q5.b bVar;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(sessionConfiguration, "sessionConfiguration");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        String c10 = sessionConfiguration.c().c();
        oh.g attributes = span.getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
        Long b10 = R4.a.b(attributes, "severity");
        if (b10 != null) {
            bVar = Q5.b.INSTANCE.a((int) b10.longValue());
        }
        bVar = b.f.f9377b;
        Q5.b bVar2 = bVar;
        LogData logData = new LogData(CxRum.INSTANCE.a(span, sessionConfiguration, snapshotManager));
        oh.g attributes2 = span.getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes2, "getAttributes(...)");
        String c11 = R4.a.c(attributes2, EventKeys.TIMESTAMP);
    }
}
