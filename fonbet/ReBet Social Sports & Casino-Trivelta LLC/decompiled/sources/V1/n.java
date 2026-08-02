package V1;

import b1.C2333B;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12363c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3445z f12364d;

    public n(String str, String str2, List list) {
        super(str);
        AbstractC4134a.a(!list.isEmpty());
        this.f12362b = str2;
        AbstractC3445z o10 = AbstractC3445z.o(list);
        this.f12364d = o10;
        this.f12363c = (String) o10.get(0);
    }

    public static List d(String str) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        String str = this.f12353a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.P((CharSequence) this.f12364d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U((CharSequence) this.f12364d.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) this.f12364d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q((CharSequence) this.f12364d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O((CharSequence) this.f12364d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V((CharSequence) this.f12364d.get(0));
                    break;
                case 6:
                case 21:
                    String[] A12 = Z.A1((String) this.f12364d.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(A12[0]))).r0(A12.length > 1 ? Integer.valueOf(Integer.parseInt(A12[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0((CharSequence) this.f12364d.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.t0((CharSequence) this.f12364d.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt((String) this.f12364d.get(0))));
                    break;
                case '\f':
                    Integer p10 = com.google.common.primitives.f.p((String) this.f12364d.get(0));
                    if (p10 != null) {
                        String a10 = j.a(p10.intValue());
                        if (a10 != null) {
                            bVar.c0(a10);
                            break;
                        }
                    } else {
                        bVar.c0((CharSequence) this.f12364d.get(0));
                        break;
                    }
                    break;
                case 14:
                    List d10 = d((String) this.f12364d.get(0));
                    int size = d10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0((Integer) d10.get(2));
                            }
                        }
                        bVar.h0((Integer) d10.get(1));
                    }
                    bVar.i0((Integer) d10.get(0));
                    break;
                case 15:
                    List d11 = d((String) this.f12364d.get(0));
                    int size2 = d11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0((Integer) d11.get(2));
                            }
                        }
                        bVar.k0((Integer) d11.get(1));
                    }
                    bVar.l0((Integer) d11.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f12353a, nVar.f12353a) && Objects.equals(this.f12362b, nVar.f12362b) && this.f12364d.equals(nVar.f12364d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.f12353a.hashCode()) * 31;
        String str = this.f12362b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f12364d.hashCode();
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": description=" + this.f12362b + ": values=" + this.f12364d;
    }
}
