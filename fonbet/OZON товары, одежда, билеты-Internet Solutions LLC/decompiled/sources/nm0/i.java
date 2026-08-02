package nm0;

import Ve.Ip;
import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import nm0.C8613c;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C8609D f77400a;

    public i(Context applicationContext) {
        C8613c c8613c;
        Intrinsics.checkNotNullParameter(applicationContext, "context");
        this.f77400a = new C8609D(applicationContext);
        new C8613c.a();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (C8613c.a.class) {
            c8613c = C8613c.f77387g;
            if (c8613c == null) {
                c8613c = new C8613c(applicationContext);
                C8613c.f77387g = c8613c;
            }
        }
        p pVar = (p) c8613c.f77389b.getValue();
        q event = new q((Map) pVar.f77417c.getValue());
        u uVar = pVar.f77415a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        s source = new s(uVar, event);
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC7971a a11 = lm0.h.a(new lm0.i(source), new Ip(uVar, 1));
        int i11 = jm0.e.f70218e;
        lm0.q.a(lm0.p.a(lm0.t.a(a11, jm0.e.c()), t.f77422b), jm0.j.a(), h.f77399b);
    }
}
