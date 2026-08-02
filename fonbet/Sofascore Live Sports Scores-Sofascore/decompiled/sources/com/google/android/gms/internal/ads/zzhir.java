package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bf3;
import defpackage.bgf;
import defpackage.bno;
import defpackage.dpo;
import defpackage.hno;
import defpackage.igf;
import defpackage.jno;
import defpackage.kif;
import defpackage.pff;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhir {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new jno(zzhim.class, kif.n);
        b = new hno(a2, pff.l);
        c = new bno(zzhii.class, bgf.k);
        d = new ano(a2, igf.k);
    }

    public static zzhuo a(zzhim zzhimVar) {
        byte[] d2 = ((zzhot) zzhnw.b.h(zzhimVar.d)).b.d();
        try {
            zziew zziewVar = zziew.b;
            int i = dpo.a;
            zzhtw F = zzhtw.F(d2, zziew.c);
            zzhun G = zzhuo.G();
            String str = zzhimVar.b;
            G.n();
            ((zzhuo) G.b).I(str);
            G.n();
            ((zzhuo) G.b).J(F);
            return (zzhuo) G.o();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static zzhim b(zzhuo zzhuoVar, zzhfm zzhfmVar) {
        zzhik zzhikVar;
        zzhil zzhilVar;
        zzhtv G = zzhtw.G();
        String D = zzhuoVar.E().D();
        G.n();
        ((zzhtw) G.b).J(D);
        zziei E = zzhuoVar.E().E();
        G.n();
        ((zzhtw) G.b).K(E);
        G.n();
        ((zzhtw) G.b).M(5);
        zzhfj a2 = zzhft.a(((zzhtw) G.o()).d());
        boolean z = a2 instanceof zzhhd;
        zzhik zzhikVar2 = zzhik.g;
        zzhik zzhikVar3 = zzhik.f;
        zzhik zzhikVar4 = zzhik.e;
        zzhik zzhikVar5 = zzhik.c;
        zzhik zzhikVar6 = zzhik.d;
        zzhik zzhikVar7 = zzhik.b;
        if (z) {
            zzhikVar = zzhikVar7;
        } else if (a2 instanceof zzhhs) {
            zzhikVar = zzhikVar6;
        } else if (a2 instanceof zzhjo) {
            zzhikVar = zzhikVar5;
        } else if (a2 instanceof zzhgm) {
            zzhikVar = zzhikVar4;
        } else if (a2 instanceof zzhgu) {
            zzhikVar = zzhikVar3;
        } else {
            if (!(a2 instanceof zzhhm)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(a2.toString()));
            }
            zzhikVar = zzhikVar2;
        }
        zzhij zzhijVar = new zzhij();
        zzhfm zzhfmVar2 = zzhfm.c;
        zzhil zzhilVar2 = zzhil.c;
        if (zzhfmVar == zzhfmVar2) {
            zzhilVar = zzhil.b;
        } else {
            if (zzhfmVar != zzhfm.e) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
            }
            zzhilVar = zzhilVar2;
        }
        zzhijVar.a = zzhilVar;
        String D2 = zzhuoVar.D();
        zzhijVar.b = D2;
        zzhga zzhgaVar = (zzhga) a2;
        zzhijVar.d = zzhgaVar;
        zzhijVar.c = zzhikVar;
        if (zzhijVar.a == null) {
            zzhijVar.a = zzhilVar2;
        }
        if (D2 == null) {
            defpackage.zzl.x("kekUri must be set");
            return null;
        }
        if (zzhgaVar == null) {
            defpackage.zzl.x("dekParametersForNewKeys must be set");
            return null;
        }
        if (zzhgaVar.a()) {
            defpackage.zzl.x("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((zzhikVar == zzhikVar7 && (zzhgaVar instanceof zzhhd)) || ((zzhikVar == zzhikVar6 && (zzhgaVar instanceof zzhhs)) || ((zzhikVar == zzhikVar5 && (zzhgaVar instanceof zzhjo)) || ((zzhikVar == zzhikVar4 && (zzhgaVar instanceof zzhgm)) || ((zzhikVar == zzhikVar3 && (zzhgaVar instanceof zzhgu)) || (zzhikVar == zzhikVar2 && (zzhgaVar instanceof zzhhm))))))) {
            return new zzhim(zzhijVar.a, zzhijVar.b, zzhijVar.c, zzhijVar.d);
        }
        String str = zzhijVar.c.a;
        String valueOf = String.valueOf(zzhijVar.d);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 67 + 1);
        bf3.v(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", valueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
