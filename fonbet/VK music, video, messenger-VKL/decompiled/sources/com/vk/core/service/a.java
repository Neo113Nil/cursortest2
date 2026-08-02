package com.vk.core.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.vk.core.service.BoundService;
import com.vk.log.L;
import com.vk.music.playerservice.impl.PlayerService;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.f;
import io.reactivex.rxjava3.internal.operators.single.j;
import java.util.Objects;
import xsna.b0b0;
import xsna.b4z;
import xsna.c0b0;
import xsna.e2b0;
import xsna.e43;
import xsna.iwg0;
import xsna.kwg0;
import xsna.mau;
import xsna.p98;
import xsna.ut30;
import xsna.xl0;

/* compiled from: BoundServiceConnection.java */
/* loaded from: classes17.dex */
public abstract class a<T extends BoundService> {
    public final InterfaceC0774a a;
    public final boolean b;
    public a<T>.b c;
    public T d;
    public boolean g;
    public volatile boolean e = false;
    public volatile boolean f = false;
    public c h = new f(io.reactivex.rxjava3.internal.functions.a.b);

    /* compiled from: BoundServiceConnection.java */
    /* renamed from: com.vk.core.service.a$a, reason: collision with other inner class name */
    public interface InterfaceC0774a {
    }

    /* compiled from: BoundServiceConnection.java */
    public class b implements ServiceConnection, BoundService.b {
        public final String b = b.class.getSimpleName();

        public b() {
        }

        @Override // com.vk.core.service.BoundService.b
        public final void l() {
            e2b0 e2b0Var;
            c0b0.a aVar;
            a aVar2;
            Intent c;
            a aVar3 = a.this;
            a<T>.b bVar = aVar3.c;
            if (bVar != null && (c = (aVar2 = a.this).c()) != null) {
                b4z.E(c, aVar2.b);
            }
            aVar3.g();
            InterfaceC0774a interfaceC0774a = aVar3.a;
            if (interfaceC0774a != null) {
                b0b0 b0b0Var = (b0b0) interfaceC0774a;
                c0b0[] c0b0VarArr = b0b0Var.b;
                PlayerService e = c0b0VarArr[0].e();
                if (e == null || (e2b0Var = e.d) == null) {
                    e2b0Var = null;
                }
                if (e2b0Var != null && (aVar = b0b0Var.c) != null) {
                    ((ut30) ((mau) aVar).c).invoke(e2b0Var);
                }
                c0b0VarArr[0].d();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Objects.toString(componentName);
            try {
                a aVar = a.this;
                T t = (T) ((BoundService.a) iBinder).a;
                aVar.d = t;
                if (t.g()) {
                    l();
                } else {
                    t.b.add(this);
                }
            } catch (Throwable th) {
                L.G(this.b, "can't onServiceConnected " + componentName + " error=" + th);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            L.e(this.b, "onServiceDisconnected " + componentName);
        }
    }

    public a(b0b0 b0b0Var, boolean z) {
        this.a = b0b0Var;
        this.b = z;
    }

    public final void a() {
        if (this.c == null) {
            final a<T>.b bVar = new b();
            this.c = bVar;
            j jVar = new j(new io.reactivex.rxjava3.internal.operators.single.b(new xl0(this, 7)).o(Boolean.FALSE).q(io.reactivex.rxjava3.schedulers.a.a()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new p98(this, 0));
            io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.q98
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    com.vk.core.service.a aVar = com.vk.core.service.a.this;
                    ServiceConnection serviceConnection = bVar;
                    Boolean bool = (Boolean) obj;
                    c63 c63Var = c63.a;
                    if (!c63.f && !bool.booleanValue() && !aVar.b) {
                        c63.a(new r98(aVar, serviceConnection));
                    } else {
                        aVar.e = Thread.currentThread() == Looper.getMainLooper().getThread();
                        aVar.g = e43.a.bindService(aVar.b(), serviceConnection, 1);
                    }
                }
            };
            int i = kwg0.a;
            this.h = jVar.subscribe(fVar, new iwg0());
        }
    }

    public abstract Intent b();

    public abstract Intent c();

    public final void d() {
        if (this.c != null) {
            h();
            T t = this.d;
            if (t != null) {
                a<T>.b bVar = this.c;
                if (bVar != null && !t.g()) {
                    t.b.remove(bVar);
                }
                this.d = null;
            }
            a<T>.b bVar2 = this.c;
            if (this.g) {
                this.f = Thread.currentThread() == Looper.getMainLooper().getThread();
                try {
                    e43.a.unbindService(bVar2);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Exception occurred while unbinding service which was bound with application context wasBindOnMainThread=" + this.e + " wasUnbindOnMainThread=" + this.f, e));
                }
                this.g = false;
            }
            this.c = null;
            i();
        }
    }

    public final T e() {
        T t = this.d;
        if (t == null || !t.g()) {
            return null;
        }
        return this.d;
    }

    public abstract Class<T> f();

    public void finalize() throws Throwable {
        if (this.c != null) {
            Log.e("BoundServiceConnection", "Disconnect has not been called on " + toString());
        }
        super.finalize();
    }

    public abstract void g();

    public abstract void i();

    public void h() {
    }
}
