package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f32700a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32702c;

    public d0(AbstractC3179c abstractC3179c, Object obj) {
        Objects.requireNonNull(abstractC3179c);
        this.f32702c = abstractC3179c;
        this.f32700a = obj;
        this.f32701b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f32700a;
                if (this.f32701b) {
                    String obj2 = toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f32701b = true;
        }
        c();
    }

    public final void c() {
        d();
        AbstractC3179c abstractC3179c = this.f32702c;
        synchronized (abstractC3179c.zzj()) {
            abstractC3179c.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f32700a = null;
        }
    }
}
