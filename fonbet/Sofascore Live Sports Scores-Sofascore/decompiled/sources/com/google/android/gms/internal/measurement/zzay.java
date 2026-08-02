package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzay extends zzav {
    public zzay() {
        this.a.add(zzbk.APPLY);
        this.a.add(zzbk.BLOCK);
        this.a.add(zzbk.BREAK);
        this.a.add(zzbk.CASE);
        this.a.add(zzbk.DEFAULT);
        this.a.add(zzbk.CONTINUE);
        this.a.add(zzbk.DEFINE_FUNCTION);
        this.a.add(zzbk.FN);
        this.a.add(zzbk.IF);
        this.a.add(zzbk.QUOTE);
        this.a.add(zzbk.RETURN);
        this.a.add(zzbk.SWITCH);
        this.a.add(zzbk.TERNARY);
    }

    public static zzan c(zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        zzh.b(2, "FN", arrayList);
        zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
        if (!(b2 instanceof zzae)) {
            a70.p(dmi.q("FN requires an ArrayValue of parameter names found ", b2.getClass().getCanonicalName()));
            return null;
        }
        List d = ((zzae) b2).d();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new zzan(b.zzc(), (ArrayList) d, arrayList2, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.e(str).ordinal();
        if (ordinal == 2) {
            zzh.a(3, "APPLY", arrayList);
            zzao zzaoVar = (zzao) arrayList.get(0);
            zzaw zzawVar = zzgVar.b;
            zzaw zzawVar2 = zzgVar.b;
            zzao b = zzawVar.b(zzgVar, zzaoVar);
            String zzc = zzawVar2.b(zzgVar, (zzao) arrayList.get(1)).zzc();
            zzao b2 = zzawVar2.b(zzgVar, (zzao) arrayList.get(2));
            if (!(b2 instanceof zzae)) {
                a70.p(dmi.q("Function arguments for Apply are not a list found ", b2.getClass().getCanonicalName()));
                return null;
            }
            if (!zzc.isEmpty()) {
                return b.c(zzc, zzgVar, (ArrayList) ((zzae) b2).d());
            }
            a70.p("Function name for apply is undefined");
            return null;
        }
        if (ordinal == 15) {
            zzh.a(0, "BREAK", arrayList);
            return zzao.K7;
        }
        if (ordinal == 25) {
            return c(zzgVar, arrayList);
        }
        if (ordinal == 41) {
            zzh.b(2, "IF", arrayList);
            zzao zzaoVar2 = (zzao) arrayList.get(0);
            zzaw zzawVar3 = zzgVar.b;
            zzaw zzawVar4 = zzgVar.b;
            zzao b3 = zzawVar3.b(zzgVar, zzaoVar2);
            zzao b4 = zzawVar4.b(zzgVar, (zzao) arrayList.get(1));
            zzao b5 = arrayList.size() > 2 ? zzawVar4.b(zzgVar, (zzao) arrayList.get(2)) : null;
            zzao zzaoVar3 = zzao.I7;
            zzao b6 = b3.zze().booleanValue() ? zzgVar.b((zzae) b4) : b5 != null ? zzgVar.b((zzae) b5) : zzaoVar3;
            return true != (b6 instanceof zzag) ? zzaoVar3 : b6;
        }
        if (ordinal == 54) {
            return new zzae(arrayList);
        }
        if (ordinal == 57) {
            if (arrayList.isEmpty()) {
                return zzao.M7;
            }
            zzh.a(1, "RETURN", arrayList);
            return new zzag("return", zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                zzh.b(2, "DEFINE_FUNCTION", arrayList);
                zzan c = c(zzgVar, arrayList);
                String str2 = c.a;
                if (str2 == null) {
                    zzgVar.e("", c);
                    return c;
                }
                zzgVar.e(str2, c);
                return c;
            }
            if (ordinal == 60) {
                zzh.a(3, "SWITCH", arrayList);
                zzao zzaoVar4 = (zzao) arrayList.get(0);
                zzaw zzawVar5 = zzgVar.b;
                zzaw zzawVar6 = zzgVar.b;
                zzao b7 = zzawVar5.b(zzgVar, zzaoVar4);
                zzao b8 = zzawVar6.b(zzgVar, (zzao) arrayList.get(1));
                zzao b9 = zzawVar6.b(zzgVar, (zzao) arrayList.get(2));
                if (!(b8 instanceof zzae)) {
                    a70.p("Malformed SWITCH statement, cases are not a list");
                    return null;
                }
                if (!(b9 instanceof zzae)) {
                    a70.p("Malformed SWITCH statement, case statements are not a list");
                    return null;
                }
                zzae zzaeVar = (zzae) b8;
                zzae zzaeVar2 = (zzae) b9;
                boolean z = false;
                for (int i = 0; i < zzaeVar.m(); i++) {
                    if (z || b7.equals(zzawVar6.b(zzgVar, zzaeVar.n(i)))) {
                        zzao b10 = zzawVar6.b(zzgVar, zzaeVar2.n(i));
                        if (b10 instanceof zzag) {
                            return ((zzag) b10).b.equals("break") ? zzao.I7 : b10;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.m() + 1 == zzaeVar2.m()) {
                    zzao b11 = zzawVar6.b(zzgVar, zzaeVar2.n(zzaeVar.m()));
                    if (b11 instanceof zzag) {
                        String str3 = ((zzag) b11).b;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return b11;
                        }
                    }
                }
                return zzao.I7;
            }
            if (ordinal == 61) {
                zzh.a(3, "TERNARY", arrayList);
                zzao zzaoVar5 = (zzao) arrayList.get(0);
                zzaw zzawVar7 = zzgVar.b;
                zzaw zzawVar8 = zzgVar.b;
                return zzawVar7.b(zzgVar, zzaoVar5).zze().booleanValue() ? zzawVar8.b(zzgVar, (zzao) arrayList.get(1)) : zzawVar8.b(zzgVar, (zzao) arrayList.get(2));
            }
            switch (ordinal) {
                case 11:
                    return zzgVar.c().b(new zzae(arrayList));
                case 12:
                    zzh.a(0, "BREAK", arrayList);
                    return zzao.L7;
                case 13:
                    break;
                default:
                    b(str);
                    throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return zzao.I7;
        }
        zzao b12 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        return b12 instanceof zzae ? zzgVar.b((zzae) b12) : zzao.I7;
    }
}
