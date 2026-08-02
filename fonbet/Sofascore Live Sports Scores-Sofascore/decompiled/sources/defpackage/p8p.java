package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p8p extends h8p {
    public final Callable c;
    public final /* synthetic */ q8p d;

    public p8p(q8p q8pVar, Callable callable) {
        this.d = q8pVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.h8p
    public final Object d() {
        return this.c.call();
    }

    @Override // defpackage.h8p
    public final String g() {
        return this.c.toString();
    }

    @Override // defpackage.h8p
    public final boolean h() {
        return this.d.isDone();
    }

    @Override // defpackage.h8p
    public final void i(Object obj) {
        this.d.d(obj);
    }

    @Override // defpackage.h8p
    public final void j(Throwable th) {
        this.d.e(th);
    }
}
