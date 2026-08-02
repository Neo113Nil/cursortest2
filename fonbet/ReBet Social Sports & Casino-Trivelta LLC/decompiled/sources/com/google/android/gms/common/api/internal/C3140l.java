package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3140l {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f32529a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f32530b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a f32531c;

    /* renamed from: com.google.android.gms.common.api.internal.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f32532a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32533b;

        public a(Object obj, String str) {
            this.f32532a = obj;
            this.f32533b = str;
        }

        public String a() {
            return this.f32533b + "@" + System.identityHashCode(this.f32532a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32532a == aVar.f32532a && this.f32533b.equals(aVar.f32533b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f32532a) * 31) + this.f32533b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.l$b */
    public interface b {
        void notifyListener(Object obj);

        void onNotifyListenerFailed();
    }

    public C3140l(Looper looper, Object obj, String str) {
        this.f32529a = new L9.a(looper);
        this.f32530b = AbstractC3191o.n(obj, "Listener must not be null");
        this.f32531c = new a(obj, AbstractC3191o.g(str));
    }

    public void a() {
        this.f32530b = null;
        this.f32531c = null;
    }

    public a b() {
        return this.f32531c;
    }

    public void c(final b bVar) {
        AbstractC3191o.n(bVar, "Notifier must not be null");
        this.f32529a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.A0
            @Override // java.lang.Runnable
            public final void run() {
                C3140l.this.d(bVar);
            }
        });
    }

    public final void d(b bVar) {
        Object obj = this.f32530b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e10) {
            bVar.onNotifyListenerFailed();
            throw e10;
        }
    }

    public C3140l(Executor executor, Object obj, String str) {
        this.f32529a = (Executor) AbstractC3191o.n(executor, "Executor must not be null");
        this.f32530b = AbstractC3191o.n(obj, "Listener must not be null");
        this.f32531c = new a(obj, AbstractC3191o.g(str));
    }
}
