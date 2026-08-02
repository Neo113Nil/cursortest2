package com.google.firebase.installations;

import androidx.annotation.Keep;
import androidx.appcompat.app.b0;
import b9.d;
import b9.e;
import com.google.firebase.components.ComponentRegistrar;
import h8.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k2.x;
import n8.a;
import n8.b;
import o8.c;
import o8.h;
import o8.p;
import p8.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(c cVar) {
        return new d((g) cVar.a(g.class), cVar.e(y8.e.class), (ExecutorService) cVar.g(new p(a.class, ExecutorService.class)), new j((Executor) cVar.g(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o8.b> getComponents() {
        o8.a a7 = o8.b.a(e.class);
        a7.f21095a = LIBRARY_NAME;
        a7.a(h.a(g.class));
        a7.a(new h(0, 1, y8.e.class));
        a7.a(new h(new p(a.class, ExecutorService.class), 1, 0));
        a7.a(new h(new p(b.class, Executor.class), 1, 0));
        a7.f21100f = new b0(17);
        o8.b b10 = a7.b();
        y8.d dVar = new y8.d();
        o8.a a10 = o8.b.a(y8.d.class);
        a10.f21099e = 1;
        a10.f21100f = new io.sentry.android.core.internal.gestures.c(13, dVar);
        return Arrays.asList(b10, a10.b(), x.j(LIBRARY_NAME, "19.0.1"));
    }
}
