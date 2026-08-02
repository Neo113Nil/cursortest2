package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b5.f;
import c5.a;
import com.google.firebase.components.ComponentRegistrar;
import e5.r;
import java.util.Arrays;
import java.util.List;
import k2.x;
import o8.b;
import o8.c;
import o8.h;
import o8.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f3638f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f3638f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f3637e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<b> getComponents() {
        o8.a a7 = b.a(f.class);
        a7.f21095a = LIBRARY_NAME;
        a7.a(h.a(Context.class));
        a7.f21100f = new p8.h(19);
        b b10 = a7.b();
        o8.a b11 = b.b(new p(r8.a.class, f.class));
        b11.a(h.a(Context.class));
        b11.f21100f = new p8.h(20);
        b b12 = b11.b();
        o8.a b13 = b.b(new p(r8.b.class, f.class));
        b13.a(h.a(Context.class));
        b13.f21100f = new p8.h(21);
        return Arrays.asList(b10, b12, b13.b(), x.j(LIBRARY_NAME, "18.2.0"));
    }
}
