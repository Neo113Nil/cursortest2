package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f12923a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f12924b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f12925c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f12926d;

    /* renamed from: e, reason: collision with root package name */
    public final Z9 f12927e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0031al f12928f;

    public Tf(File file, Function function, Consumer consumer, Consumer consumer2, Z9 z92, InterfaceC0031al interfaceC0031al) {
        this.f12923a = file;
        this.f12924b = function;
        this.f12925c = consumer;
        this.f12926d = consumer2;
        this.f12927e = z92;
        this.f12928f = interfaceC0031al;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12923a.exists()) {
            C0601x9 b10 = this.f12927e.b(this.f12923a.getName());
            Consumer consumer = this.f12925c;
            try {
                b10.f14914a.lock();
                b10.f14915b.a();
            } catch (Throwable unused) {
            }
            if (!this.f12923a.exists()) {
                consumer.consume(this.f12923a);
                b10.c();
                Z9 z92 = this.f12927e;
                String name = this.f12923a.getName();
                synchronized (z92) {
                    z92.f13283b.remove(name);
                }
                return;
            }
            Object apply = this.f12924b.apply(this.f12923a);
            if (apply != null) {
                if (this.f12928f.a(apply)) {
                    this.f12926d.consume(apply);
                } else {
                    consumer = new ep();
                }
            }
            consumer.consume(this.f12923a);
            b10.c();
            this.f12927e.a(this.f12923a.getName());
        }
    }

    public static final void a(File file) {
    }
}
