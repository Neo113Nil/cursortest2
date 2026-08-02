package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import defpackage.a70;
import defpackage.jqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzifg<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidq<MessageType, BuilderType> {
    public final zzifm a;
    public zzifm b;

    public zzifg(zzifm zzifmVar) {
        this.a = zzifmVar;
        if (zzifmVar.n()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = zzifmVar.t();
    }

    @Override // com.google.android.gms.internal.ads.zzigv
    public final zzifm T() {
        boolean n = this.b.n();
        zzifm zzifmVar = this.b;
        if (!n) {
            return zzifmVar;
        }
        zzifmVar.u();
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean a() {
        return zzifm.A(this.b, false);
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public final Object clone() {
        zzifg zzifgVar = (zzifg) this.a.z(zzifl.e, null);
        boolean n = this.b.n();
        zzifm zzifmVar = this.b;
        if (n) {
            zzifmVar.u();
            zzifmVar = this.b;
        }
        zzifgVar.b = zzifmVar;
        return zzifgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* renamed from: k */
    public final zzifg clone() {
        zzifg zzifgVar = (zzifg) this.a.z(zzifl.e, null);
        boolean n = this.b.n();
        zzifm zzifmVar = this.b;
        if (n) {
            zzifmVar.u();
            zzifmVar = this.b;
        }
        zzifgVar.b = zzifmVar;
        return zzifgVar;
    }

    public final void n() {
        if (this.b.n()) {
            return;
        }
        zzifm t = this.a.t();
        jqo.c.a(t.getClass()).a(t, this.b);
        this.b = t;
    }

    public final zzifm o() {
        boolean n = this.b.n();
        zzifm zzifmVar = this.b;
        if (n) {
            zzifmVar.u();
            zzifmVar = this.b;
        }
        zzifmVar.getClass();
        if (zzifm.A(zzifmVar, true)) {
            return zzifmVar;
        }
        throw new zzihz();
    }

    public final zzifg p(zzifm zzifmVar) {
        if (this.a.equals(zzifmVar)) {
            return this;
        }
        n();
        zzifm zzifmVar2 = this.b;
        jqo.c.a(zzifmVar2.getClass()).a(zzifmVar2, zzifmVar);
        return this;
    }
}
