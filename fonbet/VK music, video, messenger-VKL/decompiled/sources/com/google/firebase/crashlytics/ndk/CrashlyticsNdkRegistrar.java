package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.f5k;
import xsna.gzl;
import xsna.i8i;
import xsna.v2z;

/* loaded from: classes13.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(f5k.class);
        a.a = "fire-cls-ndk";
        a.a(gzl.b(Context.class));
        a.f = new a();
        a.c(2);
        return Arrays.asList(a.b(), v2z.a("fire-cls-ndk", "19.4.4"));
    }
}
