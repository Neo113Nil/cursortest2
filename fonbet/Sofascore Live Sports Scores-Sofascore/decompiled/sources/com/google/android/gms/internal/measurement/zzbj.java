package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import com.ironsource.C4094gc;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.ljg;
import defpackage.sw9;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.a.add(zzbk.ASSIGN);
        this.a.add(zzbk.CONST);
        this.a.add(zzbk.CREATE_ARRAY);
        this.a.add(zzbk.CREATE_OBJECT);
        this.a.add(zzbk.EXPRESSION_LIST);
        this.a.add(zzbk.GET);
        this.a.add(zzbk.GET_INDEX);
        this.a.add(zzbk.GET_PROPERTY);
        this.a.add(zzbk.NULL);
        this.a.add(zzbk.SET_PROPERTY);
        this.a.add(zzbk.TYPEOF);
        this.a.add(zzbk.UNDEFINED);
        this.a.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            zzh.a(2, "ASSIGN", arrayList);
            zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            if (!(b instanceof zzas)) {
                a70.p(dmi.q("Expected string for assign var. got ", b.getClass().getCanonicalName()));
                return null;
            }
            String str3 = ((zzas) b).a;
            if (!zzgVar.d(str3)) {
                a70.p(dmi.q("Attempting to assign undefined value ", str3));
                return null;
            }
            zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
            zzgVar.e(str3, b2);
            return b2;
        }
        if (ordinal == 14) {
            zzh.b(2, "CONST", arrayList);
            if (arrayList.size() % 2 != 0) {
                a70.p(ljg.j(arrayList.size(), "CONST requires an even number of arguments, found "));
                return null;
            }
            while (i < arrayList.size() - 1) {
                zzao b3 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(i));
                if (!(b3 instanceof zzas)) {
                    a70.p(dmi.q("Expected string for const name. got ", b3.getClass().getCanonicalName()));
                    return null;
                }
                String str4 = ((zzas) b3).a;
                zzgVar.f(str4, zzgVar.b.b(zzgVar, (zzao) arrayList.get(i + 1)));
                zzgVar.d.put(str4, Boolean.TRUE);
                i += 2;
            }
            return zzao.I7;
        }
        if (ordinal == 24) {
            zzh.b(1, "EXPRESSION_LIST", arrayList);
            zzao zzaoVar = zzao.I7;
            while (i < arrayList.size()) {
                zzaoVar = zzgVar.b.b(zzgVar, (zzao) arrayList.get(i));
                if (zzaoVar instanceof zzag) {
                    a70.r("ControlValue cannot be in an expression list");
                    return null;
                }
                i++;
            }
            return zzaoVar;
        }
        if (ordinal == 33) {
            zzh.a(1, C4094gc.a, arrayList);
            zzao b4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            if (b4 instanceof zzas) {
                return zzgVar.g(((zzas) b4).a);
            }
            a70.p(dmi.q("Expected string for get var. got ", b4.getClass().getCanonicalName()));
            return null;
        }
        if (ordinal == 49) {
            zzh.a(0, "NULL", arrayList);
            return zzao.J7;
        }
        if (ordinal == 58) {
            zzh.a(3, "SET_PROPERTY", arrayList);
            zzao zzaoVar2 = (zzao) arrayList.get(0);
            zzaw zzawVar = zzgVar.b;
            zzaw zzawVar2 = zzgVar.b;
            zzao b5 = zzawVar.b(zzgVar, zzaoVar2);
            zzao b6 = zzawVar2.b(zzgVar, (zzao) arrayList.get(1));
            zzao b7 = zzawVar2.b(zzgVar, (zzao) arrayList.get(2));
            if (b5 == zzao.I7 || b5 == zzao.J7) {
                a70.r(fc6.n("Can't set property ", b6.zzc(), " of ", b5.zzc()));
                return null;
            }
            if ((b5 instanceof zzae) && (b6 instanceof zzah)) {
                ((zzae) b5).o(((zzah) b6).a.intValue(), b7);
                return b7;
            }
            if (!(b5 instanceof zzak)) {
                return b7;
            }
            ((zzak) b5).a(b6.zzc(), b7);
            return b7;
        }
        if (ordinal == 17) {
            if (arrayList.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzao b8 = zzgVar.b.b(zzgVar, (zzao) it.next());
                if (b8 instanceof zzag) {
                    a70.r("Failed to evaluate array element");
                    return null;
                }
                zzaeVar.o(i, b8);
                i++;
            }
            return zzaeVar;
        }
        if (ordinal == 18) {
            if (arrayList.isEmpty()) {
                return new zzal();
            }
            if (arrayList.size() % 2 != 0) {
                a70.p(ljg.j(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                return null;
            }
            zzal zzalVar = new zzal();
            while (i < arrayList.size() - 1) {
                zzao b9 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(i));
                zzao b10 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(i + 1));
                if ((b9 instanceof zzag) || (b10 instanceof zzag)) {
                    a70.r("Failed to evaluate map entry");
                    return null;
                }
                zzalVar.a(b9.zzc(), b10);
                i += 2;
            }
            return zzalVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            zzh.a(2, "GET_PROPERTY", arrayList);
            zzao b11 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            zzao b12 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
            if ((b11 instanceof zzae) && zzh.d(b12)) {
                return ((zzae) b11).n(b12.zzd().intValue());
            }
            if (b11 instanceof zzak) {
                return ((zzak) b11).zzk(b12.zzc());
            }
            if (b11 instanceof zzas) {
                if ("length".equals(b12.zzc())) {
                    return new zzah(Double.valueOf(((zzas) b11).a.length()));
                }
                if (zzh.d(b12)) {
                    double doubleValue = b12.zzd().doubleValue();
                    String str5 = ((zzas) b11).a;
                    if (doubleValue < str5.length()) {
                        return new zzas(String.valueOf(str5.charAt(b12.zzd().intValue())));
                    }
                }
            }
            return zzao.I7;
        }
        switch (ordinal) {
            case 62:
                zzh.a(1, "TYPEOF", arrayList);
                zzao b13 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
                if (b13 instanceof zzat) {
                    str2 = AdError.UNDEFINED_DOMAIN;
                } else if (b13 instanceof zzaf) {
                    str2 = "boolean";
                } else if (b13 instanceof zzah) {
                    str2 = "number";
                } else if (b13 instanceof zzas) {
                    str2 = "string";
                } else if (b13 instanceof zzan) {
                    str2 = "function";
                } else {
                    if ((b13 instanceof zzap) || (b13 instanceof zzag)) {
                        sw9.n("Unsupported value type %s in typeof", new Object[]{b13});
                        return null;
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case 63:
                zzh.a(0, "UNDEFINED", arrayList);
                return zzao.I7;
            case 64:
                zzh.b(1, "VAR", arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    zzao b14 = zzgVar.b.b(zzgVar, (zzao) it2.next());
                    if (!(b14 instanceof zzas)) {
                        a70.p(dmi.q("Expected string for var name. got ", b14.getClass().getCanonicalName()));
                        return null;
                    }
                    zzgVar.f(((zzas) b14).a, zzao.I7);
                }
                return zzao.I7;
            default:
                b(str);
                throw null;
        }
    }
}
