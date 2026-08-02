package u3;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public static final P f99799d = new P("");

    /* renamed from: a, reason: collision with root package name */
    public final String f99800a;

    /* renamed from: b, reason: collision with root package name */
    private final a f99801b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f99802c;

    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f99803a;

        public a() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.f99803a = logSessionId;
        }

        public final void a(LogSessionId logSessionId) {
            boolean equals;
            LogSessionId unused;
            LogSessionId logSessionId2 = this.f99803a;
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE);
            G10.a.h(equals);
            this.f99803a = logSessionId;
        }
    }

    public P(String str) {
        this.f99800a = str;
        this.f99801b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f99802c = new Object();
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.f99801b;
        aVar.getClass();
        return aVar.f99803a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        a aVar = this.f99801b;
        aVar.getClass();
        aVar.a(logSessionId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p11 = (P) obj;
        return Objects.equals(this.f99800a, p11.f99800a) && Objects.equals(this.f99801b, p11.f99801b) && Objects.equals(this.f99802c, p11.f99802c);
    }

    public final int hashCode() {
        return Objects.hash(this.f99800a, this.f99801b, this.f99802c);
    }
}
