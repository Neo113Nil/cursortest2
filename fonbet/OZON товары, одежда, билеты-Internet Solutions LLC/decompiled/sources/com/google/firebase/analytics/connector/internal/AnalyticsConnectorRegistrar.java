package com.google.firebase.analytics.connector.internal;

import H8.g;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k8.e;
import l8.InterfaceC7893a;
import n8.C8451a;
import n8.n;
import v8.d;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C8451a<?>> getComponents() {
        C8451a.C1292a a11 = C8451a.a(InterfaceC7893a.class);
        a11.b(n.i(e.class));
        a11.b(n.i(Context.class));
        a11.b(n.i(d.class));
        a11.f(a.f59491a);
        a11.e();
        return Arrays.asList(a11.d(), g.a("fire-analytics", "21.0.0"));
    }
}
