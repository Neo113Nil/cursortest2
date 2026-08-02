package I5;

import V4.InternalEventInitData;
import Zh.B;
import Zh.InterfaceC1900a;
import Zh.InterfaceC1901b;
import com.twilio.voice.EventKeys;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import ei.AbstractC4212b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

@Zh.n(with = c.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LI5/j;", "", "Companion", com.google.crypto.tink.integration.android.b.f37029b, "a", "c", "LI5/j$b;", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5432a;

    /* renamed from: I5.j$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f5432a = new Companion();

        /* renamed from: I5.j$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0117a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[V4.b.values().length];
                try {
                    iArr[V4.b.f12504c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final j a(oh.g attributes) {
            String c10;
            String c11;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            String str = null;
            Object[] objArr = 0;
            if (!R4.a.h(attributes) || (c10 = R4.a.c(attributes, "internal_event_type")) == null) {
                return null;
            }
            V4.b a10 = V4.b.f12503b.a(c10);
            int i10 = 1;
            if ((a10 == null ? -1 : C0117a.$EnumSwitchMapping$0[a10.ordinal()]) != 1 || (c11 = R4.a.c(attributes, "internal_event_data")) == null) {
                return null;
            }
            AbstractC4212b b10 = F5.b.b();
            b10.a();
            return new InitInternalContext(str, (InternalEventInitData) b10.d(InternalEventInitData.INSTANCE.serializer(), c11), i10, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return c.f5436c;
        }
    }

    public static final class c extends ei.g {

        /* renamed from: c, reason: collision with root package name */
        public static final c f5436c = new c();

        public c() {
            super(Reflection.getOrCreateKotlinClass(j.class));
        }

        @Override // ei.g
        public InterfaceC1900a b(JsonElement element) {
            JsonPrimitive m10;
            String a10;
            Intrinsics.checkNotNullParameter(element, "element");
            JsonElement jsonElement = (JsonElement) ei.j.l(element).get("event");
            if (jsonElement == null || (m10 = ei.j.m(jsonElement)) == null || (a10 = m10.a()) == null) {
                throw new IllegalStateException("Missing 'event' field");
            }
            if (Intrinsics.areEqual(a10, "init")) {
                return InitInternalContext.INSTANCE.serializer();
            }
            throw new IllegalStateException(("Unknown event '" + a10 + "'").toString());
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u001e\u0013B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LI5/j$b;", "LI5/j;", "", "event", "LV4/a;", EventKeys.DATA, "<init>", "(Ljava/lang/String;LV4/a;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;LV4/a;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.crypto.tink.integration.android.b.f37029b, "(LI5/j$b;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEvent$annotations", "()V", "LV4/a;", "getData", "()LV4/a;", "getData$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Zh.n
    /* renamed from: I5.j$b, reason: from toString */
    public static final /* data */ class InitInternalContext implements j {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String event;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final InternalEventInitData data;

        /* renamed from: I5.j$b$a */
        public /* synthetic */ class a implements N {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5435a;

            @NotNull
            private static final bi.f descriptor;

            static {
                a aVar = new a();
                f5435a = aVar;
                J0 j02 = new J0("com.coralogix.android.sdk.internal.model.InternalContext.InitInternalContext", aVar, 2);
                j02.n("event", true);
                j02.n(EventKeys.DATA, false);
                descriptor = j02;
            }

            @Override // Zh.InterfaceC1900a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InitInternalContext deserialize(ci.e decoder) {
                String str;
                InternalEventInitData internalEventInitData;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bi.f fVar = descriptor;
                ci.c c10 = decoder.c(fVar);
                U0 u02 = null;
                if (c10.q()) {
                    str = c10.s(fVar, 0);
                    internalEventInitData = (InternalEventInitData) c10.i(fVar, 1, InternalEventInitData.C0260a.f12502a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    str = null;
                    InternalEventInitData internalEventInitData2 = null;
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
                            internalEventInitData2 = (InternalEventInitData) c10.i(fVar, 1, InternalEventInitData.C0260a.f12502a, internalEventInitData2);
                            i11 |= 2;
                        }
                    }
                    internalEventInitData = internalEventInitData2;
                    i10 = i11;
                }
                c10.b(fVar);
                return new InitInternalContext(i10, str, internalEventInitData, u02);
            }

            @Override // Zh.p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final void serialize(ci.f encoder, InitInternalContext value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bi.f fVar = descriptor;
                ci.d c10 = encoder.c(fVar);
                InitInternalContext.b(value, c10, fVar);
                c10.b(fVar);
            }

            @Override // di.N
            public final InterfaceC1901b[] childSerializers() {
                return new InterfaceC1901b[]{Z0.f45341a, InternalEventInitData.C0260a.f12502a};
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

        /* renamed from: I5.j$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final InterfaceC1901b serializer() {
                return a.f5435a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ InitInternalContext(int i10, String str, InternalEventInitData internalEventInitData, U0 u02) {
            if (2 != (i10 & 2)) {
                F0.a(i10, 2, a.f5435a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.event = V4.b.f12504c.c();
            } else {
                this.event = str;
            }
            this.data = internalEventInitData;
        }

        public static final /* synthetic */ void b(InitInternalContext self, ci.d output, bi.f serialDesc) {
            if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.getEvent(), V4.b.f12504c.c())) {
                output.G(serialDesc, 0, self.getEvent());
            }
            output.B(serialDesc, 1, InternalEventInitData.C0260a.f12502a, self.data);
        }

        /* renamed from: a, reason: from getter */
        public String getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitInternalContext)) {
                return false;
            }
            InitInternalContext initInternalContext = (InitInternalContext) other;
            return Intrinsics.areEqual(this.event, initInternalContext.event) && Intrinsics.areEqual(this.data, initInternalContext.data);
        }

        public int hashCode() {
            return (this.event.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "InitInternalContext(event=" + this.event + ", data=" + this.data + ")";
        }

        public InitInternalContext(String event, InternalEventInitData data) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(data, "data");
            this.event = event;
            this.data = data;
        }

        public /* synthetic */ InitInternalContext(String str, InternalEventInitData internalEventInitData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? V4.b.f12504c.c() : str, internalEventInitData);
        }
    }
}
