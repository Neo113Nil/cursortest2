package com.inmobi.media;

import android.content.Context;
import defpackage.de6;
import defpackage.wv8;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3906y9 implements InterfaceC3880x9 {
    public Xh a;
    public final C3580lk b;

    public C3906y9(Context context, double d, Nb nb, boolean z, int i, long j) {
        context.getClass();
        nb.getClass();
        this.b = new C3580lk();
        if (z) {
            return;
        }
        Xh xh = new Xh(context, d, nb, j, i);
        this.a = xh;
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Yb.b(xh);
    }

    public final void a(String str, String str2, Exception exc) {
        str.getClass();
        str2.getClass();
        exc.getClass();
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.ERROR, str, wv8.i(str2, "\nError: ", de6.b(exc)));
        }
        if (this.b != null) {
            str.getClass();
            str2.getClass();
            exc.getClass();
        }
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.ERROR, str, str2);
        }
        if (this.b != null) {
            str.getClass();
            str2.getClass();
        }
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.INFO, str, str2);
        }
        if (this.b != null) {
            str.getClass();
            str2.getClass();
        }
    }

    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.STATE, str, str2);
        }
        if (this.b != null) {
            str.getClass();
        }
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.DEBUG, str, str2);
        }
        if (this.b != null) {
            str.getClass();
            str2.getClass();
        }
    }

    public final void a(boolean z) {
        Xh xh = this.a;
        if (xh != null) {
            xh.b(z);
        }
        if (z) {
            return;
        }
        Xh xh2 = this.a;
        if (xh2 == null || !xh2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
            Yb.a(this.a);
            this.a = null;
        }
    }

    public final void a() {
        Xh xh = this.a;
        if (xh != null) {
            xh.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Yb.a(this.a);
    }
}
