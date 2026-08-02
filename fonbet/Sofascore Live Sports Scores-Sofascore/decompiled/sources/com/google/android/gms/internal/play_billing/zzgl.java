package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgp;
import defpackage.a70;
import defpackage.zno;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzgl<MessageType extends zzgp<MessageType, BuilderType>, BuilderType extends zzgl<MessageType, BuilderType>> extends zzez<MessageType, BuilderType> {
    public final zzgp a;
    public zzgp b;

    public zzgl(zzgp zzgpVar) {
        this.a = zzgpVar;
        if (zzgpVar.g()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = (zzgp) zzgpVar.i(4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzez
    /* renamed from: b */
    public final zzgl clone() {
        zzgl zzglVar = (zzgl) this.a.i(5);
        boolean g = this.b.g();
        zzgp zzgpVar = this.b;
        if (g) {
            zzgpVar.o();
            zzgpVar = this.b;
        }
        zzglVar.b = zzgpVar;
        return zzglVar;
    }

    public final zzgp c() {
        boolean g = this.b.g();
        zzgp zzgpVar = this.b;
        if (g) {
            zzgpVar.o();
            zzgpVar = this.b;
        }
        zzgpVar.getClass();
        if (zzgp.h(zzgpVar, true)) {
            return zzgpVar;
        }
        throw new zzip();
    }

    @Override // com.google.android.gms.internal.play_billing.zzez
    public final Object clone() {
        zzgl zzglVar = (zzgl) this.a.i(5);
        boolean g = this.b.g();
        zzgp zzgpVar = this.b;
        if (g) {
            zzgpVar.o();
            zzgpVar = this.b;
        }
        zzglVar.b = zzgpVar;
        return zzglVar;
    }

    public final void e() {
        if (this.b.g()) {
            return;
        }
        f();
    }

    public final void f() {
        zzgp zzgpVar = (zzgp) this.a.i(4);
        zno.b.a(zzgpVar.getClass()).b(zzgpVar, this.b);
        this.b = zzgpVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final boolean zzo() {
        return zzgp.h(this.b, false);
    }
}
