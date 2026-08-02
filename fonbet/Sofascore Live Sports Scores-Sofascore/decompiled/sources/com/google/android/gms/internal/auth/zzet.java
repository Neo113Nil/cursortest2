package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import defpackage.a70;
import defpackage.nco;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    public final zzev a;
    public zzev b;

    public zzet(zzhs zzhsVar) {
        this.a = zzhsVar;
        if (zzhsVar.f()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = (zzev) zzhsVar.g(4);
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* renamed from: a */
    public final zzet clone() {
        zzet zzetVar = (zzet) this.a.g(5);
        boolean f = this.b.f();
        zzev zzevVar = this.b;
        if (f) {
            zzevVar.getClass();
            nco.c.a(zzevVar.getClass()).a(zzevVar);
            zzevVar.c();
            zzevVar = this.b;
        }
        zzetVar.b = zzevVar;
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    public final Object clone() {
        zzet zzetVar = (zzet) this.a.g(5);
        boolean f = this.b.f();
        zzev zzevVar = this.b;
        if (f) {
            zzevVar.getClass();
            nco.c.a(zzevVar.getClass()).a(zzevVar);
            zzevVar.c();
            zzevVar = this.b;
        }
        zzetVar.b = zzevVar;
        return zzetVar;
    }
}
