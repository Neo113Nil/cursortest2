package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.j1;
import com.google.firebase.components.ComponentRegistrar;
import g6.p;
import g6.v;
import h8.g;
import java.util.Arrays;
import java.util.List;
import k2.x;
import l8.b;
import o8.a;
import o8.c;
import o8.h;
import o8.j;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        x8.c cVar2 = (x8.c) cVar.a(x8.c.class);
        v.h(gVar);
        v.h(context);
        v.h(cVar2);
        v.h(context.getApplicationContext());
        if (l8.c.f19408b == null) {
            synchronized (l8.c.class) {
                try {
                    if (l8.c.f19408b == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f10402b)) {
                            ((j) cVar2).a(p.f9861d, d.f25729b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        l8.c.f19408b = new l8.c(j1.e(context, bundle).f5092b);
                    }
                } finally {
                }
            }
        }
        return l8.c.f19408b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<o8.b> getComponents() {
        a a7 = o8.b.a(b.class);
        a7.a(h.a(g.class));
        a7.a(h.a(Context.class));
        a7.a(h.a(x8.c.class));
        a7.f21100f = m8.a.f20473b;
        a7.c(2);
        return Arrays.asList(a7.b(), x.j("fire-analytics", "23.0.0"));
    }
}
