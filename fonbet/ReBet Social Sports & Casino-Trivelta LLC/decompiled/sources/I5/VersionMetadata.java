package I5;

import Zh.B;
import Zh.InterfaceC1901b;
import com.twilio.voice.PublisherMetadata;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"LI5/s;", "", "", "appName", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LI5/s;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppName", "getAppName$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getAppVersion", "getAppVersion$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.s, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class VersionMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appVersion;

    /* renamed from: I5.s$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5480a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5480a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.VersionMetadata", aVar, 2);
            j02.n(PublisherMetadata.APP_NAME, true);
            j02.n(PublisherMetadata.APP_VERSION, true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VersionMetadata deserialize(ci.e decoder) {
            String str;
            String str2;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            U0 u02 = null;
            if (c10.q()) {
                str = c10.s(fVar, 0);
                str2 = c10.s(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                String str3 = null;
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
                        str3 = c10.s(fVar, 1);
                        i11 |= 2;
                    }
                }
                str2 = str3;
                i10 = i11;
            }
            c10.b(fVar);
            return new VersionMetadata(i10, str, str2, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, VersionMetadata value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            VersionMetadata.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02};
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

    /* renamed from: I5.s$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5480a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VersionMetadata(int i10, String str, String str2, U0 u02) {
        if ((i10 & 1) == 0) {
            this.appName = "";
        } else {
            this.appName = str;
        }
        if ((i10 & 2) == 0) {
            this.appVersion = "";
        } else {
            this.appVersion = str2;
        }
    }

    public static final /* synthetic */ void a(VersionMetadata self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.appName, "")) {
            output.G(serialDesc, 0, self.appName);
        }
        if (!output.m(serialDesc, 1) && Intrinsics.areEqual(self.appVersion, "")) {
            return;
        }
        output.G(serialDesc, 1, self.appVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionMetadata)) {
            return false;
        }
        VersionMetadata versionMetadata = (VersionMetadata) other;
        return Intrinsics.areEqual(this.appName, versionMetadata.appName) && Intrinsics.areEqual(this.appVersion, versionMetadata.appVersion);
    }

    public int hashCode() {
        return (this.appName.hashCode() * 31) + this.appVersion.hashCode();
    }

    public String toString() {
        return "VersionMetadata(appName=" + this.appName + ", appVersion=" + this.appVersion + ")";
    }

    public VersionMetadata(String appName, String appVersion) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.appName = appName;
        this.appVersion = appVersion;
    }

    public /* synthetic */ VersionMetadata(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
