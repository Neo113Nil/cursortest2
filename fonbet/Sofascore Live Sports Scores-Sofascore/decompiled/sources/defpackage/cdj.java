package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cdj extends yq9 {
    public final String b;
    public final hv9 c;

    public cdj(String str, String str2, vvf vvfVar) {
        super(str);
        z1a.s(!vvfVar.isEmpty());
        this.b = str2;
        hv9 v = hv9.v(vvfVar);
        this.c = v;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cdj.class != obj.getClass()) {
            return false;
        }
        cdj cdjVar = (cdj) obj;
        return this.a.equals(cdjVar.a) && Objects.equals(this.b, cdjVar.b) && this.c.equals(cdjVar.c);
    }

    public final int hashCode() {
        int c = dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lic
    public final void u(o6c o6cVar) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        hv9 hv9Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    o6cVar.c = (CharSequence) hv9Var.get(0);
                    break;
                case 1:
                case 11:
                    o6cVar.u = (CharSequence) hv9Var.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) hv9Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    o6cVar.o = Integer.valueOf(parseInt);
                    o6cVar.p = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    o6cVar.b = (CharSequence) hv9Var.get(0);
                    break;
                case 4:
                case 19:
                    o6cVar.d = (CharSequence) hv9Var.get(0);
                    break;
                case 5:
                case 20:
                    o6cVar.v = (CharSequence) hv9Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) hv9Var.get(0);
                    String str4 = nik.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    o6cVar.j = Integer.valueOf(parseInt3);
                    o6cVar.k = valueOf;
                    break;
                case 7:
                case 17:
                    o6cVar.a = (CharSequence) hv9Var.get(0);
                    break;
                case '\b':
                case 16:
                    o6cVar.t = (CharSequence) hv9Var.get(0);
                    break;
                case '\t':
                case 22:
                    o6cVar.n = Integer.valueOf(Integer.parseInt((String) hv9Var.get(0)));
                    break;
                case '\f':
                    Integer Q = jaa.Q((String) hv9Var.get(0));
                    if (Q != null) {
                        String a = zq9.a(Q.intValue());
                        if (a != null) {
                            o6cVar.y = a;
                            break;
                        }
                    } else {
                        o6cVar.y = (CharSequence) hv9Var.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList a2 = a((String) hv9Var.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                o6cVar.p = (Integer) a2.get(2);
                            }
                        }
                        o6cVar.o = (Integer) a2.get(1);
                    }
                    o6cVar.n = (Integer) a2.get(0);
                    break;
                case 15:
                    ArrayList a3 = a((String) hv9Var.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                o6cVar.s = (Integer) a3.get(2);
                            }
                        }
                        o6cVar.r = (Integer) a3.get(1);
                    }
                    o6cVar.q = (Integer) a3.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
