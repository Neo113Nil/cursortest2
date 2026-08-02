package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.bsk;
import xsna.gzl;
import xsna.i8i;
import xsna.kjr;
import xsna.mjr;
import xsna.q9k;
import xsna.top0;
import xsna.uir;
import xsna.v2z;
import xsna.vhr;
import xsna.x8i;
import xsna.yuf0;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static kjr providesFirebasePerformance(x8i x8iVar) {
        bsk.a a = bsk.a();
        a.b(new mjr((vhr) x8iVar.a(vhr.class), (uir) x8iVar.a(uir.class), x8iVar.e(yuf0.class), x8iVar.e(top0.class)));
        return a.a().b();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(kjr.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(vhr.class));
        a.a(new gzl(1, 1, yuf0.class));
        a.a(gzl.b(uir.class));
        a.a(new gzl(1, 1, top0.class));
        a.f = new q9k();
        return Arrays.asList(a.b(), v2z.a(LIBRARY_NAME, "20.3.0"));
    }
}
