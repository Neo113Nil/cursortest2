package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.dff;
import defpackage.g35;
import defpackage.haf;
import defpackage.hki;
import defpackage.iu;
import defpackage.jb3;
import defpackage.ju;
import defpackage.kb3;
import defpackage.qx4;
import defpackage.r38;
import defpackage.rv5;
import defpackage.wba;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static iu lambda$getComponents$0(ac3 ac3Var) {
        r38 r38Var = (r38) ac3Var.e(r38.class);
        Context context = (Context) ac3Var.e(Context.class);
        hki hkiVar = (hki) ac3Var.e(hki.class);
        Preconditions.i(r38Var);
        Preconditions.i(context);
        Preconditions.i(hkiVar);
        Preconditions.i(context.getApplicationContext());
        if (ju.c == null) {
            synchronized (ju.class) {
                try {
                    if (ju.c == null) {
                        Bundle bundle = new Bundle(1);
                        r38Var.a();
                        if ("[DEFAULT]".equals(r38Var.b)) {
                            ((rv5) hkiVar).a(g35.e, haf.b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", r38Var.g());
                        }
                        ju.c = new ju(zzez.f(context, bundle).c);
                    }
                } finally {
                }
            }
        }
        return ju.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @KeepForSdk
    public List<kb3> getComponents() {
        jb3 b = kb3.b(iu.class);
        b.a(qx4.c(r38.class));
        b.a(qx4.c(Context.class));
        b.a(qx4.c(hki.class));
        b.f = dff.c;
        b.c(2);
        return Arrays.asList(b.b(), wba.q("fire-analytics", "23.2.0"));
    }
}
