package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.e340;
import xsna.ex1;
import xsna.gzl;
import xsna.hi;
import xsna.i8i;
import xsna.pf7;
import xsna.shr;
import xsna.toe0;
import xsna.uir;
import xsna.v2z;
import xsna.vhr;
import xsna.x8i;
import xsna.yuf0;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static yuf0 lambda$getComponents$0(toe0 toe0Var, x8i x8iVar) {
        shr shrVar;
        Context context = (Context) x8iVar.a(Context.class);
        Executor executor = (Executor) x8iVar.c(toe0Var);
        vhr vhrVar = (vhr) x8iVar.a(vhr.class);
        uir uirVar = (uir) x8iVar.a(uir.class);
        hi hiVar = (hi) x8iVar.a(hi.class);
        synchronized (hiVar) {
            try {
                if (!hiVar.a.containsKey("frc")) {
                    hiVar.a.put("frc", new shr(hiVar.b));
                }
                shrVar = (shr) hiVar.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new yuf0(context, executor, vhrVar, uirVar, shrVar, x8iVar.e(ex1.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        toe0 toe0Var = new toe0(pf7.class, Executor.class);
        i8i.a a = i8i.a(yuf0.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(Context.class));
        a.a(new gzl((toe0<?>) toe0Var, 1, 0));
        a.a(gzl.b(vhr.class));
        a.a(gzl.b(uir.class));
        a.a(gzl.b(hi.class));
        a.a(gzl.a(ex1.class));
        a.f = new e340(toe0Var);
        a.c(2);
        return Arrays.asList(a.b(), v2z.a(LIBRARY_NAME, "21.2.1"));
    }
}
