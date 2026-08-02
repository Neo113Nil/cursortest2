package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xsna.fo8;
import xsna.g1v;
import xsna.gzl;
import xsna.h1v;
import xsna.i8i;
import xsna.pf7;
import xsna.sgn0;
import xsna.sli0;
import xsna.toe0;
import xsna.uir;
import xsna.v2z;
import xsna.vhr;
import xsna.wv5;
import xsna.x8i;
import xsna.y33;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static uir lambda$getComponents$0(x8i x8iVar) {
        return new a((vhr) x8iVar.a(vhr.class), x8iVar.e(h1v.class), (ExecutorService) x8iVar.c(new toe0(wv5.class, ExecutorService.class)), new sli0((Executor) x8iVar.c(new toe0(pf7.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(uir.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(vhr.class));
        a.a(gzl.a(h1v.class));
        a.a(new gzl((toe0<?>) new toe0(wv5.class, ExecutorService.class), 1, 0));
        a.a(new gzl((toe0<?>) new toe0(pf7.class, Executor.class), 1, 0));
        a.f = new fo8();
        i8i b = a.b();
        sgn0 sgn0Var = new sgn0();
        i8i.a a2 = i8i.a(g1v.class);
        a2.e = 1;
        a2.f = new y33(sgn0Var);
        return Arrays.asList(b, a2.b(), v2z.a(LIBRARY_NAME, "18.0.0"));
    }
}
