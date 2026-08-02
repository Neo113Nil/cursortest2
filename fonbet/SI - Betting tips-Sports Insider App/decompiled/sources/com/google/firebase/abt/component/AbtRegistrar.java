package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j8.a;
import java.util.Arrays;
import java.util.List;
import k2.x;
import l8.b;
import o8.c;
import o8.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.e(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o8.b> getComponents() {
        o8.a a7 = o8.b.a(a.class);
        a7.f21095a = LIBRARY_NAME;
        a7.a(h.a(Context.class));
        a7.a(new h(0, 1, b.class));
        a7.f21100f = new io.sentry.clientreport.a(8);
        return Arrays.asList(a7.b(), x.j(LIBRARY_NAME, "21.1.1"));
    }
}
