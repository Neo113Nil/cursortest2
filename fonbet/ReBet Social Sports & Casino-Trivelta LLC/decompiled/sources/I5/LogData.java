package I5;

import I5.CxRum;
import J5.MobileVitalsContext;
import L5.ScreenshotContext;
import Q5.CustomMeasurementContext;
import Q5.EventContext;
import Q5.InteractionContext;
import Q5.LifecycleContext;
import Q5.LogContext;
import Q5.NetworkRequestContext;
import Q5.SnapshotContext;
import Q5.ViewContext;
import Zh.B;
import Zh.InterfaceC1901b;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013\u001fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"LI5/k;", "", "LI5/c;", EventKeys.DATA, "<init>", "(LI5/c;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILI5/c;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "c", "(LI5/k;Lci/d;Lbi/f;)V", "a", "(LI5/c;)LI5/k;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LI5/c;", com.google.crypto.tink.integration.android.b.f37029b, "()LI5/c;", "getData$annotations", "()V", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.k, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class LogData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final CxRum data;

    /* renamed from: I5.k$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5438a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5438a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.LogData", aVar, 1);
            j02.n("cx_rum", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LogData deserialize(ci.e decoder) {
            CxRum cxRum;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i10 = 1;
            U0 u02 = null;
            if (c10.q()) {
                cxRum = (CxRum) c10.i(fVar, 0, CxRum.a.f5390a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                cxRum = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new B(e10);
                        }
                        cxRum = (CxRum) c10.i(fVar, 0, CxRum.a.f5390a, cxRum);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            c10.b(fVar);
            return new LogData(i10, cxRum, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, LogData value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            LogData.c(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{CxRum.a.f5390a};
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

    /* renamed from: I5.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5438a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LogData(int i10, CxRum cxRum, U0 u02) {
        if ((i10 & 1) != 0) {
            this.data = cxRum;
            return;
        }
        this.data = new CxRum((String) null, (SessionContext) null, (DeviceContext) null, (DeviceState) null, (MobileSdkMetadata) null, (EventContext) null, (JsonElement) null, (String) null, (String) null, 0L, (String) null, (String) null, (ViewContext) null, false, (VersionMetadata) null, (LogContext) null, (NetworkRequestContext) null, (SnapshotContext) null, (MobileVitalsContext) null, (ErrorContext) null, (LifecycleContext) null, (CustomMeasurementContext) null, (InteractionContext) null, (ScreenshotContext) null, (j) null, 33554431, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void c(LogData self, ci.d output, bi.f serialDesc) {
        if (!output.m(serialDesc, 0)) {
            if (Intrinsics.areEqual(self.data, new CxRum((String) null, (SessionContext) null, (DeviceContext) null, (DeviceState) null, (MobileSdkMetadata) null, (EventContext) null, (JsonElement) null, (String) null, (String) null, 0L, (String) null, (String) null, (ViewContext) null, false, (VersionMetadata) null, (LogContext) null, (NetworkRequestContext) null, (SnapshotContext) null, (MobileVitalsContext) null, (ErrorContext) null, (LifecycleContext) null, (CustomMeasurementContext) null, (InteractionContext) null, (ScreenshotContext) null, (j) null, 33554431, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.B(serialDesc, 0, CxRum.a.f5390a, self.data);
    }

    public final LogData a(CxRum data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new LogData(data);
    }

    /* renamed from: b, reason: from getter */
    public final CxRum getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LogData) && Intrinsics.areEqual(this.data, ((LogData) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "LogData(data=" + this.data + ")";
    }

    public LogData(CxRum data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LogData(CxRum cxRum, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1);
        CxRum cxRum2;
        if ((i10 & 1) != 0) {
            cxRum2 = new CxRum((String) null, (SessionContext) null, (DeviceContext) null, (DeviceState) null, (MobileSdkMetadata) null, (EventContext) null, (JsonElement) null, (String) null, (String) null, 0L, (String) null, (String) null, (ViewContext) null, false, (VersionMetadata) null, (LogContext) null, (NetworkRequestContext) null, (SnapshotContext) null, (MobileVitalsContext) null, (ErrorContext) null, (LifecycleContext) null, (CustomMeasurementContext) null, (InteractionContext) null, (ScreenshotContext) null, (j) null, 33554431, (DefaultConstructorMarker) null);
        } else {
            cxRum2 = cxRum;
        }
    }
}
