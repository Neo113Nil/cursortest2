package I5;

import Q5.UserContext;
import Zh.B;
import Zh.InterfaceC1901b;
import di.C4084d0;
import di.C4093i;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0081\b\u0018\u0000 D2\u00020\u0001:\u0002*!BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011Bi\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 Jb\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010$R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00100\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010$R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00100\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010$R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00100\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010$R,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010/\u001a\u0004\b<\u0010=R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"LI5/q;", "", "", "sessionCreationDate", "", "sessionId", "userId", "username", "userEmail", "", "userMetadata", "", "hasRecording", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "LQ5/w;", "userContext", "(JLjava/lang/String;LQ5/w;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.bumptech.glide.gifdecoder.e.f29601m, "(LI5/q;Lci/d;Lbi/f;)V", W9.d.f13160a, "()LQ5/w;", com.google.crypto.tink.integration.android.b.f37029b, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)LI5/q;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getSessionCreationDate", "()J", "getSessionCreationDate$annotations", "()V", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "c", "getUserId", "getUserId$annotations", "getUsername", "getUsername$annotations", "getUserEmail", "getUserEmail$annotations", "f", "Ljava/util/Map;", "getUserMetadata", "()Ljava/util/Map;", "getUserMetadata$annotations", "g", "Z", "getHasRecording", "()Z", "getHasRecording$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.q, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SessionContext {

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final long sessionCreationDate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String sessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String userId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String username;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final String userEmail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map userMetadata;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean hasRecording;

    /* renamed from: I5.q$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5475a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5475a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.SessionContext", aVar, 7);
            j02.n("session_creation_date", true);
            j02.n("session_id", true);
            j02.n("user_id", true);
            j02.n("user_name", true);
            j02.n("user_email", true);
            j02.n("user_metadata", true);
            j02.n("hasRecording", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionContext deserialize(ci.e decoder) {
            boolean z10;
            Map map;
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            long j10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = SessionContext.$childSerializers;
            int i11 = 6;
            if (c10.q()) {
                long g10 = c10.g(fVar, 0);
                String s10 = c10.s(fVar, 1);
                String s11 = c10.s(fVar, 2);
                String s12 = c10.s(fVar, 3);
                String s13 = c10.s(fVar, 4);
                map = (Map) c10.i(fVar, 5, interfaceC1901bArr[5], null);
                str = s10;
                z10 = c10.t(fVar, 6);
                str3 = s12;
                str4 = s13;
                str2 = s11;
                i10 = 127;
                j10 = g10;
            } else {
                boolean z11 = true;
                boolean z12 = false;
                String str5 = null;
                String str6 = null;
                long j11 = 0;
                int i12 = 0;
                Map map2 = null;
                String str7 = null;
                String str8 = null;
                while (z11) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z11 = false;
                            i11 = 6;
                        case 0:
                            j11 = c10.g(fVar, 0);
                            i12 |= 1;
                            i11 = 6;
                        case 1:
                            str7 = c10.s(fVar, 1);
                            i12 |= 2;
                        case 2:
                            str8 = c10.s(fVar, 2);
                            i12 |= 4;
                        case 3:
                            str5 = c10.s(fVar, 3);
                            i12 |= 8;
                        case 4:
                            str6 = c10.s(fVar, 4);
                            i12 |= 16;
                        case 5:
                            map2 = (Map) c10.i(fVar, 5, interfaceC1901bArr[5], map2);
                            i12 |= 32;
                        case 6:
                            z12 = c10.t(fVar, i11);
                            i12 |= 64;
                        default:
                            throw new B(e10);
                    }
                }
                z10 = z12;
                map = map2;
                i10 = i12;
                str = str7;
                str2 = str8;
                str3 = str5;
                str4 = str6;
                j10 = j11;
            }
            c10.b(fVar);
            return new SessionContext(i10, j10, str, str2, str3, str4, map, z10, (U0) null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, SessionContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            SessionContext.e(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b interfaceC1901b = SessionContext.$childSerializers[5];
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{C4096j0.f45375a, z02, z02, z02, z02, interfaceC1901b, C4093i.f45370a};
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

    /* renamed from: I5.q$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5475a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Z0 z02 = Z0.f45341a;
        $childSerializers = new InterfaceC1901b[]{null, null, null, null, null, new C4084d0(z02, z02), null};
    }

    public /* synthetic */ SessionContext(int i10, long j10, String str, String str2, String str3, String str4, Map map, boolean z10, U0 u02) {
        this.sessionCreationDate = (i10 & 1) == 0 ? 0L : j10;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.userId = "";
        } else {
            this.userId = str2;
        }
        if ((i10 & 8) == 0) {
            this.username = "";
        } else {
            this.username = str3;
        }
        if ((i10 & 16) == 0) {
            this.userEmail = "";
        } else {
            this.userEmail = str4;
        }
        if ((i10 & 32) == 0) {
            this.userMetadata = MapsKt.emptyMap();
        } else {
            this.userMetadata = map;
        }
        if ((i10 & 64) == 0) {
            this.hasRecording = U5.f.f12066a.w();
        } else {
            this.hasRecording = z10;
        }
    }

    public static /* synthetic */ SessionContext c(SessionContext sessionContext, long j10, String str, String str2, String str3, String str4, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sessionContext.sessionCreationDate;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = sessionContext.sessionId;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = sessionContext.userId;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = sessionContext.username;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = sessionContext.userEmail;
        }
        return sessionContext.b(j11, str5, str6, str7, str4, (i10 & 32) != 0 ? sessionContext.userMetadata : map, (i10 & 64) != 0 ? sessionContext.hasRecording : z10);
    }

    public static final /* synthetic */ void e(SessionContext self, ci.d output, bi.f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (output.m(serialDesc, 0) || self.sessionCreationDate != 0) {
            output.e(serialDesc, 0, self.sessionCreationDate);
        }
        if (output.m(serialDesc, 1) || !Intrinsics.areEqual(self.sessionId, "")) {
            output.G(serialDesc, 1, self.sessionId);
        }
        if (output.m(serialDesc, 2) || !Intrinsics.areEqual(self.userId, "")) {
            output.G(serialDesc, 2, self.userId);
        }
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.username, "")) {
            output.G(serialDesc, 3, self.username);
        }
        if (output.m(serialDesc, 4) || !Intrinsics.areEqual(self.userEmail, "")) {
            output.G(serialDesc, 4, self.userEmail);
        }
        if (output.m(serialDesc, 5) || !Intrinsics.areEqual(self.userMetadata, MapsKt.emptyMap())) {
            output.B(serialDesc, 5, interfaceC1901bArr[5], self.userMetadata);
        }
        if (!output.m(serialDesc, 6) && self.hasRecording == U5.f.f12066a.w()) {
            return;
        }
        output.F(serialDesc, 6, self.hasRecording);
    }

    public final SessionContext b(long sessionCreationDate, String sessionId, String userId, String username, String userEmail, Map userMetadata, boolean hasRecording) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        return new SessionContext(sessionCreationDate, sessionId, userId, username, userEmail, userMetadata, hasRecording);
    }

    public final UserContext d() {
        return new UserContext(this.userId, this.username, this.userEmail, this.userMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionContext)) {
            return false;
        }
        SessionContext sessionContext = (SessionContext) other;
        return this.sessionCreationDate == sessionContext.sessionCreationDate && Intrinsics.areEqual(this.sessionId, sessionContext.sessionId) && Intrinsics.areEqual(this.userId, sessionContext.userId) && Intrinsics.areEqual(this.username, sessionContext.username) && Intrinsics.areEqual(this.userEmail, sessionContext.userEmail) && Intrinsics.areEqual(this.userMetadata, sessionContext.userMetadata) && this.hasRecording == sessionContext.hasRecording;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.sessionCreationDate) * 31) + this.sessionId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.username.hashCode()) * 31) + this.userEmail.hashCode()) * 31) + this.userMetadata.hashCode()) * 31) + Boolean.hashCode(this.hasRecording);
    }

    public String toString() {
        return "SessionContext(sessionCreationDate=" + this.sessionCreationDate + ", sessionId=" + this.sessionId + ", userId=" + this.userId + ", username=" + this.username + ", userEmail=" + this.userEmail + ", userMetadata=" + this.userMetadata + ", hasRecording=" + this.hasRecording + ")";
    }

    public SessionContext(long j10, String sessionId, String userId, String username, String userEmail, Map userMetadata, boolean z10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.sessionCreationDate = j10;
        this.sessionId = sessionId;
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.userMetadata = userMetadata;
        this.hasRecording = z10;
    }

    public /* synthetic */ SessionContext(long j10, String str, String str2, String str3, String str4, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) == 0 ? str4 : "", (i10 & 32) != 0 ? MapsKt.emptyMap() : map, (i10 & 64) != 0 ? U5.f.f12066a.w() : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionContext(long j10, String sessionId, UserContext userContext) {
        this(j10, sessionId, userContext.getUserId(), userContext.getUsername(), userContext.getEmail(), userContext.getMetadata(), false, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userContext, "userContext");
    }
}
