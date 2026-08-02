package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(o8.p pVar, o8.c cVar) {
        h8.g gVar = (h8.g) cVar.a(h8.g.class);
        if (cVar.a(z8.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.e(h9.b.class), cVar.e(y8.f.class), (b9.e) cVar.a(b9.e.class), cVar.c(pVar), (x8.c) cVar.a(x8.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<o8.b> getComponents() {
        o8.p pVar = new o8.p(r8.b.class, b5.f.class);
        o8.a a7 = o8.b.a(FirebaseMessaging.class);
        a7.f21095a = LIBRARY_NAME;
        a7.a(o8.h.a(h8.g.class));
        a7.a(new o8.h(0, 0, z8.a.class));
        a7.a(new o8.h(0, 1, h9.b.class));
        a7.a(new o8.h(0, 1, y8.f.class));
        a7.a(o8.h.a(b9.e.class));
        a7.a(new o8.h(pVar, 0, 1));
        a7.a(o8.h.a(x8.c.class));
        a7.f21100f = new r(pVar, 0);
        a7.c(1);
        return Arrays.asList(a7.b(), k2.x.j(LIBRARY_NAME, "25.0.1"));
    }
}
