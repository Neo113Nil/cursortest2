package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.gzl;
import xsna.i8i;
import xsna.ms9;
import xsna.tkr;
import xsna.v2z;
import xsna.vhr;
import xsna.wfx;
import xsna.x8i;
import xsna.yfx;

@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ tkr lambda$getComponents$0(x8i x8iVar) {
        return new tkr((vhr) x8iVar.a(vhr.class), x8iVar.e(yfx.class), x8iVar.e(wfx.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(tkr.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(vhr.class));
        a.a(gzl.a(yfx.class));
        a.a(gzl.a(wfx.class));
        a.f = new ms9();
        return Arrays.asList(a.b(), v2z.a(LIBRARY_NAME, "20.1.0"));
    }
}
