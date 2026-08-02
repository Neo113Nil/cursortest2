package com.google.mlkit.common.internal;

import Bl0.C2644e;
import Bl0.C2645f;
import Bl0.C2646g;
import S0.C;
import S8.a;
import S8.d;
import U8.c;
import V8.b;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.C5945a;
import com.google.mlkit.common.sdkinternal.C5946b;
import com.google.mlkit.common.sdkinternal.C5948d;
import com.google.mlkit.common.sdkinternal.h;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.m;
import java.util.List;
import n8.C8451a;
import n8.n;

@KeepForSdk
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        C8451a<?> c8451a = m.f60047b;
        C8451a.C1292a a11 = C8451a.a(b.class);
        a11.b(n.i(h.class));
        a11.f(new C());
        C8451a d11 = a11.d();
        C8451a.C1292a a12 = C8451a.a(i.class);
        a12.f(new a());
        C8451a d12 = a12.d();
        C8451a.C1292a a13 = C8451a.a(c.class);
        a13.b(n.l(c.a.class));
        a13.f(new S8.b());
        C8451a d13 = a13.d();
        C8451a.C1292a a14 = C8451a.a(C5948d.class);
        a14.b(n.k(i.class));
        a14.f(new C2644e());
        C8451a d14 = a14.d();
        C8451a.C1292a a15 = C8451a.a(C5945a.class);
        a15.f(new C2645f());
        C8451a d15 = a15.d();
        C8451a.C1292a a16 = C8451a.a(C5946b.class);
        a16.b(n.i(C5945a.class));
        a16.f(new C2646g());
        C8451a d16 = a16.d();
        C8451a.C1292a a17 = C8451a.a(T8.a.class);
        a17.b(n.i(h.class));
        a17.f(new S8.c());
        C8451a d17 = a17.d();
        C8451a.C1292a j11 = C8451a.j(c.a.class);
        j11.b(n.k(T8.a.class));
        j11.f(new d(0));
        return zzaf.zzi(c8451a, d11, d12, d13, d14, d15, d16, d17, j11.d());
    }
}
