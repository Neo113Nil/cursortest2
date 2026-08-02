package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.a;
import java.util.List;
import java.util.Map;
import xsna.a1u;
import xsna.anp0;
import xsna.c1u;
import xsna.cl3;
import xsna.d8g0;
import xsna.klp;
import xsna.oec;
import xsna.vjt;
import xsna.x7g0;

/* compiled from: GlideContext.java */
/* loaded from: classes12.dex */
public final class c extends ContextWrapper {
    public static final vjt j = new vjt();
    public final cl3 a;
    public final c1u b;
    public final a.InterfaceC0097a c;
    public final List<x7g0<Object>> d;
    public final Map<Class<?>, anp0<?, ?>> e;
    public final klp f;
    public final a1u g;
    public final int h;

    @Nullable
    public d8g0 i;

    public c(@NonNull Context context, @NonNull cl3 cl3Var, @NonNull oec oecVar, @NonNull a.InterfaceC0097a interfaceC0097a, @NonNull Map map, @NonNull List list, @NonNull klp klpVar, @NonNull a1u a1uVar, int i) {
        super(context.getApplicationContext());
        this.a = cl3Var;
        this.c = interfaceC0097a;
        this.d = list;
        this.e = map;
        this.f = klpVar;
        this.g = a1uVar;
        this.h = i;
        this.b = new c1u(oecVar);
    }

    @NonNull
    public final Registry a() {
        return (Registry) this.b.get();
    }
}
