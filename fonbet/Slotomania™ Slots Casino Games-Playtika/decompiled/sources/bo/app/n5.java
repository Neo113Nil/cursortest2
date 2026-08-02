package bo.app;

import com.braze.Constants;
import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lbo/app/n5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/m5;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lbo/app/m5;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/m5;", "<init>", "(Lbo/app/m5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class n5 {
    private final m5 a;

    public n5(m5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = session;
        if (session.getE()) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
        }
    }

    /* renamed from: a, reason: from getter */
    public final m5 getA() {
        return this.a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof n5) && Intrinsics.areEqual(this.a, ((n5) other).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SessionCreatedEvent(session=" + this.a + ')';
    }
}
