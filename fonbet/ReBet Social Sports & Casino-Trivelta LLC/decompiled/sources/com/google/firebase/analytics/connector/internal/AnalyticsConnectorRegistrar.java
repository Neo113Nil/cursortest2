package com.google.firebase.analytics.connector.internal;

import Eb.h;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import eb.C4196f;
import gb.C4372b;
import gb.InterfaceC4371a;
import java.util.Arrays;
import java.util.List;
import mb.C5576c;
import mb.InterfaceC5577d;
import mb.g;
import mb.q;
import tb.InterfaceC6459d;

@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4371a lambda$getComponents$0(InterfaceC5577d interfaceC5577d) {
        return C4372b.c((C4196f) interfaceC5577d.a(C4196f.class), (Context) interfaceC5577d.a(Context.class), (InterfaceC6459d) interfaceC5577d.a(InterfaceC6459d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C5576c> getComponents() {
        return Arrays.asList(C5576c.c(InterfaceC4371a.class).b(q.j(C4196f.class)).b(q.j(Context.class)).b(q.j(InterfaceC6459d.class)).f(new g() { // from class: hb.a
            @Override // mb.g
            public final /* synthetic */ Object a(InterfaceC5577d interfaceC5577d) {
                InterfaceC4371a lambda$getComponents$0;
                lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(interfaceC5577d);
                return lambda$getComponents$0;
            }
        }).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
