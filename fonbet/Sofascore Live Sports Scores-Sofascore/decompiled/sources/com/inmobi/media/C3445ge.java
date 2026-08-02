package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import defpackage.a70;
import defpackage.aeh;
import defpackage.b1d;
import defpackage.beh;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.s9a;
import defpackage.smi;
import defpackage.sq3;
import defpackage.tz9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3445ge implements InterfaceC3727rc {
    public final ku3 a;
    public final C3687pn b;
    public final C3906y9 c;
    public final ArrayList d;
    public final ku3 e;
    public final AtomicBoolean f;
    public Jg g;
    public final b1d h;
    public final RelativeLayout i;
    public final MediaPlayer j;
    public final C3652oe k;
    public final En l;
    public final On m;
    public final C3419fe n;
    public final b1d o;

    public C3445ge(Context context, ku3 ku3Var, C3687pn c3687pn, C3906y9 c3906y9) {
        context.getClass();
        ku3Var.getClass();
        c3687pn.getClass();
        this.a = ku3Var;
        this.b = c3687pn;
        this.c = c3906y9;
        this.d = new ArrayList();
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.e = s9a.c(kotlin.coroutines.e.d(o, hq4.c));
        this.f = new AtomicBoolean(false);
        this.g = Jg.STATE_INITIALIZED;
        aeh b = beh.b(0, 0, null, 7);
        this.h = b;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.i = relativeLayout;
        Context context2 = relativeLayout.getContext();
        context2.getClass();
        MediaPlayer a = AbstractC3713qn.a(context2);
        this.j = a;
        this.k = new C3652oe(relativeLayout, ku3Var, a, c3687pn, b);
        this.l = new En(a, ku3Var, c3687pn.c.f, b);
        this.m = new On(ku3Var, a, relativeLayout, c3687pn, c3906y9);
        this.n = new C3419fe(this);
        this.o = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, sq3 sq3Var) {
        C3393ee c3393ee;
        int i;
        AbstractC3325bn abstractC3325bn;
        C3906y9 c3906y9;
        if (sq3Var instanceof C3393ee) {
            c3393ee = (C3393ee) sq3Var;
            int i2 = c3393ee.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3393ee.c = i2 - Integer.MIN_VALUE;
                Object obj = c3393ee.a;
                lu3 lu3Var = lu3.a;
                i = c3393ee.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.g != Jg.STATE_INITIALIZED) {
                        throw new C3702qc();
                    }
                    this.g = Jg.STATE_PREPARING;
                    X4.a(this.h, this.a, C3299an.a);
                    C3906y9 c3906y92 = this.c;
                    if (c3906y92 != null) {
                        c3906y92.a("NativeMediaPlayer", "Media Player Load started");
                    }
                    MediaPlayer mediaPlayer = this.j;
                    C3906y9 c3906y93 = this.c;
                    c3393ee.c = 1;
                    obj = AbstractC3583ln.a(mediaPlayer, arrayList, c3906y93, c3393ee);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                abstractC3325bn = (AbstractC3325bn) obj;
                c3906y9 = this.c;
                if (c3906y9 != null) {
                    c3906y9.a("NativeMediaPlayer", "Media Player Load Status " + abstractC3325bn);
                }
                if (abstractC3325bn instanceof C3351cn) {
                    if (!(abstractC3325bn instanceof Ym)) {
                        zzl.b();
                        return null;
                    }
                    this.g = Jg.STATE_ERROR;
                    X4.a(this.h, this.a, new C3686pm());
                    throw new C3702qc();
                }
                X4.a(this.h, this.a, new C3377dn(((C3351cn) abstractC3325bn).a));
                this.g = Jg.STATE_PREPARED;
                MediaPlayer mediaPlayer2 = this.j;
                mediaPlayer2.getClass();
                try {
                    mediaPlayer2.seekTo(0);
                } catch (IllegalStateException unused) {
                }
                On on = this.m;
                C3419fe c3419fe = this.n;
                on.getClass();
                c3419fe.getClass();
                X4.a(on.a, new Kn(on, c3419fe, null));
                C3652oe c3652oe = this.k;
                X4.a(c3652oe.b, new C3548ke(c3652oe, null));
                return this.i;
            }
        }
        c3393ee = new C3393ee(this, sq3Var);
        Object obj2 = c3393ee.a;
        lu3 lu3Var2 = lu3.a;
        i = c3393ee.c;
        if (i != 0) {
        }
        abstractC3325bn = (AbstractC3325bn) obj2;
        c3906y9 = this.c;
        if (c3906y9 != null) {
        }
        if (abstractC3325bn instanceof C3351cn) {
        }
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.a("NativeMediaPlayer", "destroy called");
            }
            this.g = Jg.STATE_DESTROYED;
            X4.a(this.d);
            this.m.b();
            C3652oe c3652oe = this.k;
            c3652oe.g.removeAllViews();
            c3652oe.f.d();
            this.l.c();
            this.i.removeAllViews();
            xw3.L(this.e, null, null, new C3342ce(this, null), 3);
        }
    }
}
