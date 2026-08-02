package com.google.firebase.datatransport;

import H8.g;
import Hj.C3143a;
import Q6.i;
import S6.u;
import Sh.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.C7137e;
import java.util.Arrays;
import java.util.List;
import n8.C8451a;
import n8.InterfaceC8452b;
import n8.n;
import n8.w;
import p8.InterfaceC8869a;
import p8.InterfaceC8870b;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(InterfaceC8452b interfaceC8452b) {
        u.c((Context) interfaceC8452b.a(Context.class));
        return u.a().d(a.f57780f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(InterfaceC8452b interfaceC8452b) {
        u.c((Context) interfaceC8452b.a(Context.class));
        return u.a().d(a.f57780f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(InterfaceC8452b interfaceC8452b) {
        u.c((Context) interfaceC8452b.a(Context.class));
        return u.a().d(a.f57779e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C8451a<?>> getComponents() {
        C8451a.C1292a a11 = C8451a.a(i.class);
        a11.g(LIBRARY_NAME);
        a11.b(n.i(Context.class));
        a11.f(new C7137e());
        C8451a d11 = a11.d();
        C8451a.C1292a c11 = C8451a.c(new w(InterfaceC8869a.class, i.class));
        c11.b(n.i(Context.class));
        c11.f(new b());
        C8451a d12 = c11.d();
        C8451a.C1292a c12 = C8451a.c(new w(InterfaceC8870b.class, i.class));
        c12.b(n.i(Context.class));
        c12.f(new C3143a());
        return Arrays.asList(d11, d12, c12.d(), g.a(LIBRARY_NAME, "18.2.0"));
    }
}
