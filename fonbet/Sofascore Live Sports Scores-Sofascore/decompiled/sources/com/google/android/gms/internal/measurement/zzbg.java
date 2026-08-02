package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.wln;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.a.add(zzbk.FOR_IN);
        this.a.add(zzbk.FOR_IN_CONST);
        this.a.add(zzbk.FOR_IN_LET);
        this.a.add(zzbk.FOR_LET);
        this.a.add(zzbk.FOR_OF);
        this.a.add(zzbk.FOR_OF_CONST);
        this.a.add(zzbk.FOR_OF_LET);
        this.a.add(zzbk.WHILE);
    }

    public static zzao c(wln wlnVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return d(wlnVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        a70.p("Non-iterable type in for...of loop.");
        return null;
    }

    public static zzao d(wln wlnVar, Iterator it, zzao zzaoVar) {
        zzg c;
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVar2 = (zzao) it.next();
                switch (wlnVar.a) {
                    case 0:
                        c = wlnVar.b.c();
                        String str = wlnVar.c;
                        c.f(str, zzaoVar2);
                        c.d.put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c = wlnVar.b.c();
                        c.f(wlnVar.c, zzaoVar2);
                        break;
                    default:
                        c = wlnVar.b;
                        c.f(wlnVar.c, zzaoVar2);
                        break;
                }
                zzao b = c.b((zzae) zzaoVar);
                if (b instanceof zzag) {
                    zzag zzagVar = (zzag) b;
                    String str2 = zzagVar.b;
                    if ("break".equals(str2)) {
                        return zzao.I7;
                    }
                    if ("return".equals(str2)) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.I7;
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.e(str).ordinal();
        if (ordinal == 65) {
            zzh.a(4, "WHILE", arrayList);
            zzao zzaoVar = (zzao) arrayList.get(0);
            zzao zzaoVar2 = (zzao) arrayList.get(1);
            zzao zzaoVar3 = (zzao) arrayList.get(2);
            zzao zzaoVar4 = (zzao) arrayList.get(3);
            zzaw zzawVar = zzgVar.b;
            zzaw zzawVar2 = zzgVar.b;
            zzao b = zzawVar.b(zzgVar, zzaoVar4);
            if (zzawVar2.b(zzgVar, zzaoVar3).zze().booleanValue()) {
                zzao b2 = zzgVar.b((zzae) b);
                if (b2 instanceof zzag) {
                    zzag zzagVar = (zzag) b2;
                    String str2 = zzagVar.b;
                    if ("break".equals(str2)) {
                        return zzao.I7;
                    }
                    if ("return".equals(str2)) {
                        return zzagVar;
                    }
                }
            }
            while (zzawVar2.b(zzgVar, zzaoVar).zze().booleanValue()) {
                zzao b3 = zzgVar.b((zzae) b);
                if (b3 instanceof zzag) {
                    zzag zzagVar2 = (zzag) b3;
                    String str3 = zzagVar2.b;
                    if ("break".equals(str3)) {
                        return zzao.I7;
                    }
                    if ("return".equals(str3)) {
                        return zzagVar2;
                    }
                }
                zzgVar.a(zzaoVar2);
            }
            return zzao.I7;
        }
        switch (ordinal) {
            case 26:
                zzh.a(3, "FOR_IN", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_IN must be a string");
                    return null;
                }
                String zzc = ((zzao) arrayList.get(0)).zzc();
                zzao b4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                zzao b5 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(2));
                Iterator zzf = b4.zzf();
                if (zzf != null) {
                    while (zzf.hasNext()) {
                        zzgVar.f(zzc, (zzao) zzf.next());
                        zzao b6 = zzgVar.b((zzae) b5);
                        if (b6 instanceof zzag) {
                            zzag zzagVar3 = (zzag) b6;
                            String str4 = zzagVar3.b;
                            if ("break".equals(str4)) {
                                return zzao.I7;
                            }
                            if ("return".equals(str4)) {
                                return zzagVar3;
                            }
                        }
                    }
                }
                return zzao.I7;
            case 27:
                zzh.a(3, "FOR_IN_CONST", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_IN_CONST must be a string");
                    return null;
                }
                return d(new wln(zzgVar, ((zzao) arrayList.get(0)).zzc(), 0), zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzf(), zzgVar.b.b(zzgVar, (zzao) arrayList.get(2)));
            case 28:
                zzh.a(3, "FOR_IN_LET", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_IN_LET must be a string");
                    return null;
                }
                String zzc2 = ((zzao) arrayList.get(0)).zzc();
                zzao b7 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                zzao b8 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(2));
                Iterator zzf2 = b7.zzf();
                if (zzf2 != null) {
                    while (zzf2.hasNext()) {
                        zzao zzaoVar5 = (zzao) zzf2.next();
                        zzg c = zzgVar.c();
                        c.f(zzc2, zzaoVar5);
                        zzao b9 = c.b((zzae) b8);
                        if (b9 instanceof zzag) {
                            zzag zzagVar4 = (zzag) b9;
                            String str5 = zzagVar4.b;
                            if ("break".equals(str5)) {
                                return zzao.I7;
                            }
                            if ("return".equals(str5)) {
                                return zzagVar4;
                            }
                        }
                    }
                }
                return zzao.I7;
            case 29:
                zzh.a(4, "FOR_LET", arrayList);
                zzao zzaoVar6 = (zzao) arrayList.get(0);
                zzaw zzawVar3 = zzgVar.b;
                zzaw zzawVar4 = zzgVar.b;
                zzao b10 = zzawVar3.b(zzgVar, zzaoVar6);
                if (!(b10 instanceof zzae)) {
                    a70.p("Initializer variables in FOR_LET must be an ArrayList");
                    return null;
                }
                zzae zzaeVar = (zzae) b10;
                zzao zzaoVar7 = (zzao) arrayList.get(1);
                zzao zzaoVar8 = (zzao) arrayList.get(2);
                zzao b11 = zzawVar4.b(zzgVar, (zzao) arrayList.get(3));
                zzg c2 = zzgVar.c();
                for (int i = 0; i < zzaeVar.m(); i++) {
                    String zzc3 = zzaeVar.n(i).zzc();
                    c2.e(zzc3, zzgVar.g(zzc3));
                }
                while (zzawVar4.b(zzgVar, zzaoVar7).zze().booleanValue()) {
                    zzao b12 = zzgVar.b((zzae) b11);
                    if (b12 instanceof zzag) {
                        zzag zzagVar5 = (zzag) b12;
                        String str6 = zzagVar5.b;
                        if ("break".equals(str6)) {
                            return zzao.I7;
                        }
                        if ("return".equals(str6)) {
                            return zzagVar5;
                        }
                    }
                    zzg c3 = zzgVar.c();
                    for (int i2 = 0; i2 < zzaeVar.m(); i2++) {
                        String zzc4 = zzaeVar.n(i2).zzc();
                        c3.e(zzc4, c2.g(zzc4));
                    }
                    c3.a(zzaoVar8);
                    c2 = c3;
                }
                return zzao.I7;
            case 30:
                zzh.a(3, "FOR_OF", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_OF must be a string");
                    return null;
                }
                return c(new wln(zzgVar, ((zzao) arrayList.get(0)).zzc(), 2), zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.b.b(zzgVar, (zzao) arrayList.get(2)));
            case 31:
                zzh.a(3, "FOR_OF_CONST", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_OF_CONST must be a string");
                    return null;
                }
                return c(new wln(zzgVar, ((zzao) arrayList.get(0)).zzc(), 0), zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.b.b(zzgVar, (zzao) arrayList.get(2)));
            case 32:
                zzh.a(3, "FOR_OF_LET", arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    a70.p("Variable name in FOR_OF_LET must be a string");
                    return null;
                }
                return c(new wln(zzgVar, ((zzao) arrayList.get(0)).zzc(), 1), zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.b.b(zzgVar, (zzao) arrayList.get(2)));
            default:
                b(str);
                throw null;
        }
    }
}
