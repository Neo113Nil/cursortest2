package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f¨\u0006\u0011"}, d2 = {"Lbo/app/y0;", "Lbo/app/q2;", "Lbo/app/m5;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "", Constants.BRAZE_PUSH_CONTENT_KEY, "", JsonStorageKeyNames.SESSION_ID_KEY, "Lbo/app/h2;", "eventPublisher", "", "throwable", "()Lbo/app/m5;", "storedOpenSession", "sessionStorageManager", "<init>", "(Lbo/app/q2;Lbo/app/h2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class y0 implements q2 {
    private final q2 a;
    private final h2 b;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error occured while publishing exception.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get the active session from the storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to upsert active session in the storage.";
        }
    }

    public y0(q2 sessionStorageManager, h2 eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.a = sessionStorageManager;
        this.b = eventPublisher;
    }

    @Override // bo.app.q2
    public m5 a() {
        try {
            return this.a.a();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            a(this.b, e);
            return null;
        }
    }

    @Override // bo.app.q2
    public void a(m5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.a.a(session);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
            a(this.b, e);
        }
    }

    @Override // bo.app.q2
    public void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.a.a(sessionId);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, a.b);
            a(this.b, e);
        }
    }

    public final void a(h2 eventPublisher, Throwable throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            eventPublisher.a((h2) new v5("A storage exception has occurred. Please view the stack trace for more details.", throwable), (Class<h2>) v5.class);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
    }
}
