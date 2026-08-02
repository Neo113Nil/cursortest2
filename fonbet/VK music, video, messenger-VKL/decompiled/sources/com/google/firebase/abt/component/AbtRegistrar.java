package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.ex1;
import xsna.gzl;
import xsna.hi;
import xsna.i8i;
import xsna.ji;
import xsna.v2z;
import xsna.x8i;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hi lambda$getComponents$0(x8i x8iVar) {
        return new hi((Context) x8iVar.a(Context.class), x8iVar.e(ex1.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(hi.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(Context.class));
        a.a(gzl.a(ex1.class));
        a.f = new ji();
        return Arrays.asList(a.b(), v2z.a(LIBRARY_NAME, "21.1.0"));
    }
}
