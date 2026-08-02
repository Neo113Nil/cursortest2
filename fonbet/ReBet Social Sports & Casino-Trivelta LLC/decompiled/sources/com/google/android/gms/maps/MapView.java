package com.google.android.gms.maps;

import N9.a;
import W9.e;
import W9.l;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class MapView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final l f33185a;

    public MapView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33185a = new l(this, context, GoogleMapOptions.k(context, attributeSet));
        setClickable(true);
    }

    public void a(e eVar) {
        AbstractC3191o.f("getMapAsync() must be called on the main thread");
        AbstractC3191o.n(eVar, "callback must not be null.");
        this.f33185a.o(eVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            l lVar = this.f33185a;
            lVar.c(bundle);
            if (lVar.b() == null) {
                a.h(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f33185a.d();
    }

    public void d() {
        this.f33185a.e();
    }

    public void e() {
        this.f33185a.f();
    }

    public void f() {
        this.f33185a.g();
    }
}
