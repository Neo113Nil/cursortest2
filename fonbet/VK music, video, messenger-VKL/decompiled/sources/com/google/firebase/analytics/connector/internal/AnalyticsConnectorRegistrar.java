package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import xsna.bxm0;
import xsna.ex1;
import xsna.exc0;
import xsna.fx1;
import xsna.gzl;
import xsna.i8i;
import xsna.mtz0;
import xsna.v2z;
import xsna.vhr;
import xsna.x8i;
import xsna.y101;
import xsna.ytk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static ex1 lambda$getComponents$0(x8i x8iVar) {
        vhr vhrVar = (vhr) x8iVar.a(vhr.class);
        Context context = (Context) x8iVar.a(Context.class);
        bxm0 bxm0Var = (bxm0) x8iVar.a(bxm0.class);
        exc0.i(vhrVar);
        exc0.i(context);
        exc0.i(bxm0Var);
        exc0.i(context.getApplicationContext());
        if (fx1.c == null) {
            synchronized (fx1.class) {
                try {
                    if (fx1.c == null) {
                        Bundle bundle = new Bundle(1);
                        vhrVar.a();
                        if ("[DEFAULT]".equals(vhrVar.b)) {
                            bxm0Var.b(mtz0.b, y101.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", vhrVar.i());
                        }
                        fx1.c = new fx1(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return fx1.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(ex1.class);
        a.a(gzl.b(vhr.class));
        a.a(gzl.b(Context.class));
        a.a(gzl.b(bxm0.class));
        a.f = ytk.b;
        a.c(2);
        return Arrays.asList(a.b(), v2z.a("fire-analytics", "21.2.0"));
    }
}
