package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import b9.e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.r;
import h8.g;
import i9.i;
import j8.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k2.x;
import l8.b;
import o8.c;
import o8.h;
import o8.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static i lambda$getComponents$0(p pVar, c cVar) {
        i8.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.g(pVar);
        g gVar = (g) cVar.a(g.class);
        e eVar = (e) cVar.a(e.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f18277a.containsKey("frc")) {
                    aVar.f18277a.put("frc", new i8.c(aVar.f18278b));
                }
                cVar2 = (i8.c) aVar.f18277a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new i(context, scheduledExecutorService, gVar, eVar, cVar2, cVar.e(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o8.b> getComponents() {
        p pVar = new p(n8.b.class, ScheduledExecutorService.class);
        o8.a aVar = new o8.a(i.class, new Class[]{l9.a.class});
        aVar.f21095a = LIBRARY_NAME;
        aVar.a(h.a(Context.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.a(h.a(g.class));
        aVar.a(h.a(e.class));
        aVar.a(h.a(a.class));
        aVar.a(new h(0, 1, b.class));
        aVar.f21100f = new r(pVar, 1);
        aVar.c(2);
        return Arrays.asList(aVar.b(), x.j(LIBRARY_NAME, "23.0.1"));
    }
}
