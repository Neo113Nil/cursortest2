package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import com.plaid.internal.H5;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39187a;

    public C5(C3727q5 c3727q5, Gg.b bVar) {
        this.f39187a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application context = (Application) this.f39187a.get();
        Intrinsics.checkNotNullParameter(context, "application");
        H5.a aVar = H5.f39272b;
        Intrinsics.checkNotNullParameter(context, "context");
        H5 h52 = H5.f39273c;
        if (h52 == null) {
            synchronized (aVar) {
                h52 = H5.f39273c;
                if (h52 == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    h52 = new H5(applicationContext);
                    H5.f39273c = h52;
                }
            }
        }
        return (H5) Gg.d.d(h52);
    }
}
