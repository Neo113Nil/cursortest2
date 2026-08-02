package I5;

import G5.CoralogixAndroidStackFrame;
import G5.CoralogixDartObfuscatedStackFrame;
import G5.CoralogixJsStackFrame;
import G5.CoralogixStackTrace;
import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.twilio.voice.EventKeys;
import di.C4087f;
import di.C4093i;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import i3.C4527h;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0001\u0018\u0000 82\u00020\u0001:\u0002(#BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010$\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010$\u0012\u0004\b6\u0010'\u001a\u0004\b(\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b7\u0010'\u001a\u0004\b+\u0010\u001d¨\u00069"}, d2 = {"LI5/f;", "", "", "message", "type", "", "isCrash", "", "LG5/d;", "stacktrace", "stackTraceType", "arch", "buildId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.android.material.shape.i.f35755A, "(LI5/f;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", W9.d.f13160a, "getMessage$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "g", "getType$annotations", "c", "Z", C4527h.f48087o, "()Z", "isCrash$annotations", "Ljava/util/List;", "f", "()Ljava/util/List;", "getStacktrace$annotations", com.bumptech.glide.gifdecoder.e.f29601m, "getStackTraceType$annotations", "getArch$annotations", "getBuildId$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.f, reason: from toString */
/* loaded from: classes2.dex */
public final class ErrorContext {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isCrash;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final List stacktrace;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final String stackTraceType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String arch;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String buildId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, null, new C4087f(new Zh.l("com.coralogix.android.sdk.internal.infrastructure.threaddump.CoralogixStackFrame", Reflection.getOrCreateKotlinClass(G5.d.class), new KClass[]{Reflection.getOrCreateKotlinClass(CoralogixAndroidStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixDartObfuscatedStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixJsStackFrame.class)}, new InterfaceC1901b[]{CoralogixAndroidStackFrame.C0083a.f3886a, CoralogixDartObfuscatedStackFrame.a.f3888a, CoralogixJsStackFrame.a.f3893a}, new Annotation[0])), null, null, null};

    /* renamed from: I5.f$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5408a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5408a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.ErrorContext", aVar, 7);
            j02.n(EventKeys.ERROR_MESSAGE_KEY, true);
            j02.n("error_type", true);
            j02.n("is_crash", true);
            j02.n("original_stacktrace", true);
            j02.n("stack_trace_type", true);
            j02.n("arch", true);
            j02.n("build_id", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ErrorContext deserialize(ci.e decoder) {
            boolean z10;
            String str;
            String str2;
            int i10;
            String str3;
            String str4;
            List list;
            String str5;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = ErrorContext.$childSerializers;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                String s11 = c10.s(fVar, 1);
                boolean t10 = c10.t(fVar, 2);
                List list2 = (List) c10.i(fVar, 3, interfaceC1901bArr[3], null);
                Z0 z02 = Z0.f45341a;
                String str6 = (String) c10.C(fVar, 4, z02, null);
                String str7 = (String) c10.C(fVar, 5, z02, null);
                list = list2;
                str3 = s10;
                str = (String) c10.C(fVar, 6, z02, null);
                str2 = str7;
                str5 = str6;
                z10 = t10;
                i10 = 127;
                str4 = s11;
            } else {
                boolean z11 = true;
                boolean z12 = false;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                List list3 = null;
                String str11 = null;
                int i11 = 0;
                String str12 = null;
                while (z11) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i11 |= 1;
                            str9 = c10.s(fVar, 0);
                            continue;
                        case 1:
                            i11 |= 2;
                            str10 = c10.s(fVar, 1);
                            continue;
                        case 2:
                            z12 = c10.t(fVar, 2);
                            i11 |= 4;
                            continue;
                        case 3:
                            list3 = (List) c10.i(fVar, 3, interfaceC1901bArr[3], list3);
                            i11 |= 8;
                            break;
                        case 4:
                            str11 = (String) c10.C(fVar, 4, Z0.f45341a, str11);
                            i11 |= 16;
                            break;
                        case 5:
                            str12 = (String) c10.C(fVar, 5, Z0.f45341a, str12);
                            i11 |= 32;
                            break;
                        case 6:
                            str8 = (String) c10.C(fVar, 6, Z0.f45341a, str8);
                            i11 |= 64;
                            break;
                        default:
                            throw new B(e10);
                    }
                }
                z10 = z12;
                str = str8;
                str2 = str12;
                i10 = i11;
                str3 = str9;
                str4 = str10;
                list = list3;
                str5 = str11;
            }
            c10.b(fVar);
            return new ErrorContext(i10, str3, str4, z10, list, str5, str2, str, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, ErrorContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            ErrorContext.i(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b[] interfaceC1901bArr = ErrorContext.$childSerializers;
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, C4093i.f45370a, interfaceC1901bArr[3], AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02)};
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

    /* renamed from: I5.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorContext a(Q5.i editableErrorContext, ErrorContext errorContext) {
            Collection emptyList;
            Collection emptyList2;
            List stacktrace;
            G5.d coralogixJsStackFrame;
            Intrinsics.checkNotNullParameter(editableErrorContext, "editableErrorContext");
            String a10 = editableErrorContext.a();
            String str = a10 == null ? "" : a10;
            String c10 = editableErrorContext.c();
            String str2 = c10 == null ? "" : c10;
            Boolean d10 = editableErrorContext.d();
            boolean booleanValue = d10 != null ? d10.booleanValue() : false;
            List b10 = editableErrorContext.b();
            if (b10 != null) {
                List<Q5.g> list = b10;
                emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Q5.g gVar : list) {
                    if (gVar instanceof Q5.e) {
                        coralogixJsStackFrame = new CoralogixAndroidStackFrame((Q5.e) gVar);
                    } else {
                        if (!(gVar instanceof Q5.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        coralogixJsStackFrame = new CoralogixJsStackFrame((Q5.f) gVar);
                    }
                    emptyList.add(coralogixJsStackFrame);
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            Collection collection = emptyList;
            if (errorContext == null || (stacktrace = errorContext.getStacktrace()) == null) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = new ArrayList();
                for (Object obj : stacktrace) {
                    if (obj instanceof CoralogixDartObfuscatedStackFrame) {
                        emptyList2.add(obj);
                    }
                }
            }
            return new ErrorContext(str, str2, booleanValue, CollectionsKt.plus(collection, (Iterable) emptyList2), errorContext != null ? errorContext.getStackTraceType() : null, errorContext != null ? errorContext.getArch() : null, errorContext != null ? errorContext.getBuildId() : null);
        }

        public final ErrorContext b(oh.g attributes) {
            List emptyList;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (!R4.a.f(attributes)) {
                return null;
            }
            String c10 = R4.a.c(attributes, "error.stack");
            CoralogixStackTrace coralogixStackTrace = c10 != null ? (CoralogixStackTrace) F5.b.b().d(CoralogixStackTrace.INSTANCE.serializer(), c10) : null;
            String c11 = R4.a.c(attributes, "error.message");
            if (c11 == null) {
                c11 = "";
            }
            String c12 = R4.a.c(attributes, "error.type");
            if (c12 == null) {
                c12 = "";
            }
            Boolean a10 = R4.a.a(attributes, "error.is_crash");
            boolean booleanValue = a10 != null ? a10.booleanValue() : false;
            if (coralogixStackTrace == null || (emptyList = coralogixStackTrace.getFrames()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            return new ErrorContext(c11, c12, booleanValue, emptyList, R4.a.c(attributes, "error.stack_trace_type"), R4.a.c(attributes, "error.arch"), R4.a.c(attributes, "error.build_id"));
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5408a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ErrorContext(int i10, String str, String str2, boolean z10, List list, String str3, String str4, String str5, U0 u02) {
        if ((i10 & 1) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i10 & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i10 & 4) == 0) {
            this.isCrash = false;
        } else {
            this.isCrash = z10;
        }
        if ((i10 & 8) == 0) {
            this.stacktrace = CollectionsKt.emptyList();
        } else {
            this.stacktrace = list;
        }
        if ((i10 & 16) == 0) {
            this.stackTraceType = null;
        } else {
            this.stackTraceType = str3;
        }
        if ((i10 & 32) == 0) {
            this.arch = null;
        } else {
            this.arch = str4;
        }
        if ((i10 & 64) == 0) {
            this.buildId = null;
        } else {
            this.buildId = str5;
        }
    }

    public static final /* synthetic */ void i(ErrorContext self, ci.d output, bi.f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.message, "")) {
            output.G(serialDesc, 0, self.message);
        }
        if (output.m(serialDesc, 1) || !Intrinsics.areEqual(self.type, "")) {
            output.G(serialDesc, 1, self.type);
        }
        if (output.m(serialDesc, 2) || self.isCrash) {
            output.F(serialDesc, 2, self.isCrash);
        }
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.stacktrace, CollectionsKt.emptyList())) {
            output.B(serialDesc, 3, interfaceC1901bArr[3], self.stacktrace);
        }
        if (output.m(serialDesc, 4) || self.stackTraceType != null) {
            output.C(serialDesc, 4, Z0.f45341a, self.stackTraceType);
        }
        if (output.m(serialDesc, 5) || self.arch != null) {
            output.C(serialDesc, 5, Z0.f45341a, self.arch);
        }
        if (!output.m(serialDesc, 6) && self.buildId == null) {
            return;
        }
        output.C(serialDesc, 6, Z0.f45341a, self.buildId);
    }

    /* renamed from: b, reason: from getter */
    public final String getArch() {
        return this.arch;
    }

    /* renamed from: c, reason: from getter */
    public final String getBuildId() {
        return this.buildId;
    }

    /* renamed from: d, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: e, reason: from getter */
    public final String getStackTraceType() {
        return this.stackTraceType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ErrorContext.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.coralogix.android.sdk.internal.model.ErrorContext");
        ErrorContext errorContext = (ErrorContext) other;
        return Intrinsics.areEqual(this.message, errorContext.message) && Intrinsics.areEqual(this.type, errorContext.type) && this.isCrash == errorContext.isCrash && Intrinsics.areEqual(this.stacktrace, errorContext.stacktrace) && Intrinsics.areEqual(this.stackTraceType, errorContext.stackTraceType) && Intrinsics.areEqual(this.arch, errorContext.arch) && Intrinsics.areEqual(this.buildId, errorContext.buildId);
    }

    /* renamed from: f, reason: from getter */
    public final List getStacktrace() {
        return this.stacktrace;
    }

    /* renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsCrash() {
        return this.isCrash;
    }

    public int hashCode() {
        int hashCode = ((((((this.message.hashCode() * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isCrash)) * 31) + this.stacktrace.hashCode()) * 31;
        String str = this.stackTraceType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.arch;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buildId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ErrorContext(message='" + this.message + "', type='" + this.type + "', isCrash=" + this.isCrash + ", stacktrace=" + this.stacktrace + ", stackTraceType=" + this.stackTraceType + ", arch=" + this.arch + ", buildId=" + this.buildId + ")";
    }

    public ErrorContext(String message, String type, boolean z10, List stacktrace, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        this.message = message;
        this.type = type;
        this.isCrash = z10;
        this.stacktrace = stacktrace;
        this.stackTraceType = str;
        this.arch = str2;
        this.buildId = str3;
    }
}
