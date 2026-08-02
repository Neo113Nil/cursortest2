package Q5;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import ei.AbstractC4212b;
import ei.D;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002!\u0013B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LQ5/p;", "", "", "message", "Lkotlinx/serialization/json/JsonObject;", EventKeys.DATA, "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LQ5/p;Lci/d;Lbi/f;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "Lkotlinx/serialization/json/JsonObject;", "getData", "()Lkotlinx/serialization/json/JsonObject;", "getData$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Q5.p, reason: from toString */
/* loaded from: classes2.dex */
public final class LogContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final JsonObject data;

    /* renamed from: Q5.p$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9461a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9461a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.LogContext", aVar, 2);
            j02.n("message", true);
            j02.n(EventKeys.DATA, true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LogContext deserialize(ci.e decoder) {
            String str;
            JsonObject jsonObject;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            U0 u02 = null;
            if (c10.q()) {
                str = c10.s(fVar, 0);
                jsonObject = (JsonObject) c10.C(fVar, 1, D.f46068a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                JsonObject jsonObject2 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        str = c10.s(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (e10 != 1) {
                            throw new B(e10);
                        }
                        jsonObject2 = (JsonObject) c10.C(fVar, 1, D.f46068a, jsonObject2);
                        i11 |= 2;
                    }
                }
                jsonObject = jsonObject2;
                i10 = i11;
            }
            c10.b(fVar);
            return new LogContext(i10, str, jsonObject, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, LogContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            LogContext.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{Z0.f45341a, AbstractC2028a.t(D.f46068a)};
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

    /* renamed from: Q5.p$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogContext a(oh.g attributes) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            String c10 = R4.a.c(attributes, "cx_log");
            JsonObject jsonObject = null;
            if (c10 == null) {
                return null;
            }
            String c11 = R4.a.c(attributes, "cx_log_data");
            if (c11 != null) {
                Companion companion = LogContext.INSTANCE;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(AbstractC4212b.f46079d.h(c11));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                JsonElement jsonElement = (JsonElement) m147constructorimpl;
                if (jsonElement != null) {
                    if (!(jsonElement instanceof JsonObject)) {
                        jsonElement = null;
                    }
                    if (jsonElement != null) {
                        jsonObject = ei.j.l(jsonElement);
                    }
                }
            }
            return new LogContext(c10, jsonObject);
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9461a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LogContext(int i10, String str, JsonObject jsonObject, U0 u02) {
        this.message = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static final /* synthetic */ void a(LogContext self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.message, "")) {
            output.G(serialDesc, 0, self.message);
        }
        if (!output.m(serialDesc, 1) && self.data == null) {
            return;
        }
        output.C(serialDesc, 1, D.f46068a, self.data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(LogContext.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.coralogix.android.sdk.model.LogContext");
        return Intrinsics.areEqual(this.message, ((LogContext) other).message);
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "LogContext(message='" + this.message + "')";
    }

    public LogContext(String message, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.data = jsonObject;
    }
}
