package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.a4q;
import xsna.efz;
import xsna.gzl;
import xsna.i8i;
import xsna.l1z;
import xsna.qop0;
import xsna.toe0;
import xsna.top0;
import xsna.v2z;
import xsna.vu8;
import xsna.x8i;
import xsna.yop0;
import xsna.zop0;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ top0 lambda$getComponents$0(x8i x8iVar) {
        zop0.b((Context) x8iVar.a(Context.class));
        return zop0.a().c(vu8.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ top0 lambda$getComponents$1(x8i x8iVar) {
        zop0.b((Context) x8iVar.a(Context.class));
        return zop0.a().c(vu8.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ top0 lambda$getComponents$2(x8i x8iVar) {
        zop0.b((Context) x8iVar.a(Context.class));
        return zop0.a().c(vu8.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(top0.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(Context.class));
        a.f = new yop0();
        i8i b = a.b();
        i8i.a b2 = i8i.b(new toe0(l1z.class, top0.class));
        b2.a(gzl.b(Context.class));
        b2.f = new efz();
        i8i b3 = b2.b();
        i8i.a b4 = i8i.b(new toe0(qop0.class, top0.class));
        b4.a(gzl.b(Context.class));
        b4.f = new a4q(1);
        return Arrays.asList(b, b3, b4.b(), v2z.a(LIBRARY_NAME, "19.0.0"));
    }
}
