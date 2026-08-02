package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B5\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0017"}, d2 = {"Lbo/app/p0;", "", "", "toString", "Lbo/app/p0$b;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/x1;", "b", "Lbo/app/o5;", "c", "Lbo/app/a2;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "", "hashCode", "other", "", "equals", "commandType", "brazeEvent", JsonStorageKeyNames.SESSION_ID_KEY, "brazeRequest", "<init>", "(Lbo/app/p0$b;Lbo/app/x1;Lbo/app/o5;Lbo/app/a2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class p0 {
    public static final a e = new a(null);
    public final b a;
    public final x1 b;
    public final o5 c;
    public final a2 d;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lbo/app/p0$b;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_PENDING_BRAZE_EVENT", "ADD_BRAZE_EVENT", "FLUSH_PENDING_BRAZE_EVENTS", "ADD_REQUEST", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public enum b {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENT,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    private p0(b bVar, x1 x1Var, o5 o5Var, a2 a2Var) {
        this.a = bVar;
        this.b = x1Var;
        this.c = o5Var;
        this.d = a2Var;
    }

    /* renamed from: a, reason: from getter */
    public final b getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final x1 getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final o5 getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final a2 getD() {
        return this.d;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) other;
        return this.a == p0Var.a && Intrinsics.areEqual(this.b, p0Var.b) && Intrinsics.areEqual(this.c, p0Var.c) && Intrinsics.areEqual(this.d, p0Var.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x1 x1Var = this.b;
        int hashCode2 = (hashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        o5 o5Var = this.c;
        int hashCode3 = (hashCode2 + (o5Var == null ? 0 : o5Var.hashCode())) * 31;
        a2 a2Var = this.d;
        return hashCode3 + (a2Var != null ? a2Var.hashCode() : 0);
    }

    public String toString() {
        return StringsKt.trimIndent("\n            commandType = " + this.a + "\n            brazeEvent = " + this.b + "\n            sessionId = " + this.c + "\n            brazeRequest = " + this.d + "\n        ");
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lbo/app/p0$a;", "", "Lbo/app/x1;", "event", "Lbo/app/p0;", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, "Lbo/app/a2;", "request", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.p0$a$a, reason: collision with other inner class name */
        static final class C0086a extends Lambda implements Function0<String> {
            public static final C0086a b = new C0086a();

            C0086a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "There should be a session ID here";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final p0 a(x1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new p0(b.ADD_BRAZE_EVENT, event, null, null, 12, null);
        }

        @JvmStatic
        public final p0 b(x1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new p0(b.ADD_PENDING_BRAZE_EVENT, event, null, null, 12, null);
        }

        @JvmStatic
        public final p0 a(o5 sessionId) {
            if (sessionId == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, C0086a.b, 3, (Object) null);
            }
            return new p0(b.FLUSH_PENDING_BRAZE_EVENTS, null, sessionId, null, 10, null);
        }

        @JvmStatic
        public final p0 a(a2 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new p0(b.ADD_REQUEST, null, null, request, 6, null);
        }
    }

    /* synthetic */ p0(b bVar, x1 x1Var, o5 o5Var, a2 a2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : x1Var, (i & 4) != 0 ? null : o5Var, (i & 8) != 0 ? null : a2Var);
    }
}
