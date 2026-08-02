package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lbo/app/t0;", "Lbo/app/n2;", "Lbo/app/m2;", "request", "", "c", "b", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/h2;", "internalEventPublisher", "", "shouldStoreMockedHistory", "<init>", "(Lbo/app/h2;Z)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class t0 implements n2 {
    private final h2 a;
    private boolean b;
    private final List<a2> c;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Short circuiting execution of network request and immediately marking it as succeeded.";
        }
    }

    public t0(h2 internalEventPublisher, boolean z) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.a = internalEventPublisher;
        this.b = z;
        this.c = new ArrayList();
    }

    private final void c(m2 request) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
        h2 h2Var = this.a;
        request.a(h2Var, h2Var, (d) null);
        request.b(this.a);
        if (request instanceof a2) {
            this.a.a((h2) new s0((a2) request), (Class<h2>) s0.class);
        }
    }

    @Override // bo.app.n2
    public void a(m2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c(request);
    }

    @Override // bo.app.n2
    public void b(m2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c(request);
    }
}
