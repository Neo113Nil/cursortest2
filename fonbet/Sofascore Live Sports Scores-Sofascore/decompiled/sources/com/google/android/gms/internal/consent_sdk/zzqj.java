package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import defpackage.a70;
import defpackage.w4p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzqj<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzoz<MessageType, BuilderType> {
    public final zzqm a;
    public zzqm b;

    public zzqj(zzqm zzqmVar) {
        this.a = zzqmVar;
        if (zzqmVar.e()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = (zzqm) zzqmVar.f(4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* renamed from: b */
    public final zzqj clone() {
        zzqj zzqjVar = (zzqj) this.a.f(5);
        boolean e = this.b.e();
        zzqm zzqmVar = this.b;
        if (e) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqjVar.b = zzqmVar;
        return zzqjVar;
    }

    public final zzqm c() {
        boolean e = this.b.e();
        zzqm zzqmVar = this.b;
        if (e) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqmVar.getClass();
        if (zzqm.g(zzqmVar, true)) {
            return zzqmVar;
        }
        throw new zzso("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    public final Object clone() {
        zzqj zzqjVar = (zzqj) this.a.f(5);
        boolean e = this.b.e();
        zzqm zzqmVar = this.b;
        if (e) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqjVar.b = zzqmVar;
        return zzqjVar;
    }

    public final void e() {
        if (this.b.e()) {
            return;
        }
        zzqm zzqmVar = (zzqm) this.a.f(4);
        w4p.c.a(zzqmVar.getClass()).h(zzqmVar, this.b);
        this.b = zzqmVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzqm.g(this.b, false);
    }
}
