package n1;

import android.media.metrics.LogSessionId;
import android.os.Build;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: d, reason: collision with root package name */
    public static final G1 f56753d = new G1("");

    /* renamed from: a, reason: collision with root package name */
    public final String f56754a;

    /* renamed from: b, reason: collision with root package name */
    public final a f56755b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f56756c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f56757a;

        public a() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.f56757a = logSessionId;
        }

        public void a(LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            boolean equals;
            LogSessionId logSessionId3 = this.f56757a;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId3.equals(logSessionId2);
            AbstractC4134a.g(equals);
            this.f56757a = logSessionId;
        }
    }

    public G1(String str) {
        this.f56754a = str;
        this.f56755b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f56756c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) AbstractC4134a.e(this.f56755b)).f56757a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) AbstractC4134a.e(this.f56755b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G1)) {
            return false;
        }
        G1 g12 = (G1) obj;
        return Objects.equals(this.f56754a, g12.f56754a) && Objects.equals(this.f56755b, g12.f56755b) && Objects.equals(this.f56756c, g12.f56756c);
    }

    public int hashCode() {
        return Objects.hash(this.f56754a, this.f56755b, this.f56756c);
    }
}
