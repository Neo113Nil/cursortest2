package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzya;
import com.google.android.gms.internal.cast.zzyd;
import defpackage.a70;
import defpackage.ufp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzya<MessageType extends zzyd<MessageType, BuilderType>, BuilderType extends zzya<MessageType, BuilderType>> extends zzwy<MessageType, BuilderType> {
    public final zzyd a;
    public zzyd b;

    public zzya(zzyd zzydVar) {
        this.a = zzydVar;
        if (zzydVar.k()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = (zzyd) zzydVar.i(4, null);
    }

    @Override // com.google.android.gms.internal.cast.zzwy
    /* renamed from: a */
    public final zzya clone() {
        zzya zzyaVar = (zzya) this.a.i(5, null);
        boolean k = this.b.k();
        zzyd zzydVar = this.b;
        if (k) {
            zzydVar.c();
            zzydVar = this.b;
        }
        zzyaVar.b = zzydVar;
        return zzyaVar;
    }

    public final void b() {
        if (this.b.k()) {
            return;
        }
        zzyd zzydVar = (zzyd) this.a.i(4, null);
        ufp.c.a(zzydVar.getClass()).a(zzydVar, this.b);
        this.b = zzydVar;
    }

    public final zzyd c() {
        boolean k = this.b.k();
        zzyd zzydVar = this.b;
        if (k) {
            zzydVar.c();
            zzydVar = this.b;
        }
        zzydVar.getClass();
        if (zzyd.j(zzydVar, true)) {
            return zzydVar;
        }
        throw new zzaac("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    @Override // com.google.android.gms.internal.cast.zzwy
    public final Object clone() {
        zzya zzyaVar = (zzya) this.a.i(5, null);
        boolean k = this.b.k();
        zzyd zzydVar = this.b;
        if (k) {
            zzydVar.c();
            zzydVar = this.b;
        }
        zzyaVar.b = zzydVar;
        return zzyaVar;
    }

    @Override // com.google.android.gms.internal.cast.zzzj
    public final boolean zzr() {
        return zzyd.j(this.b, false);
    }
}
