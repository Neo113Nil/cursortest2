package defpackage;

import com.ironsource.C4427z5;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qd2 extends j12 {
    public qd2(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int S(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String T() {
        int S;
        if (q()) {
            return null;
        }
        char charAt = ((String) this.d).charAt(this.b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int intValue = F().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = F().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = F().intValue();
                    } else {
                        int S2 = S(intValue);
                        if (S2 != -1) {
                            for (int i = 1; i <= 5 && (S = S((intValue = F().intValue()))) != -1; i++) {
                                S2 = (S2 * 16) + S;
                            }
                            sb.append((char) S2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = F().intValue();
        }
        return sb.toString();
    }

    public final String U() {
        int i;
        String str = (String) this.d;
        boolean q = q();
        int i2 = this.b;
        if (q) {
            i = i2;
        } else {
            int charAt = str.charAt(i2);
            if (charAt == 45) {
                charAt = h();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int h = h();
                while (true) {
                    if ((h < 65 || h > 90) && ((h < 97 || h > 122) && !((h >= 48 && h <= 57) || h == 45 || h == 95))) {
                        break;
                    }
                    h = h();
                }
                i = this.b;
            }
            this.b = i2;
        }
        if (i == i2) {
            return null;
        }
        String substring = str.substring(i2, i);
        this.b = i;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0476, code lost:
    
        r0 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0478, code lost:
    
        if (r0 == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x047e, code lost:
    
        if (r0.isEmpty() == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0481, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0484, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v24, types: [yd2] */
    /* JADX WARN: Type inference failed for: r10v25, types: [yd2] */
    /* JADX WARN: Type inference failed for: r10v38, types: [xd2] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v48, types: [xd2] */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r11v10, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v13, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v14, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v15, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v16, types: [be2] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [be2] */
    /* JADX WARN: Type inference failed for: r17v0, types: [td2] */
    /* JADX WARN: Type inference failed for: r17v1, types: [td2] */
    /* JADX WARN: Type inference failed for: r18v1, types: [td2] */
    /* JADX WARN: Type inference failed for: r19v1, types: [td2] */
    /* JADX WARN: Type inference failed for: r20v1, types: [td2] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, wd2] */
    /* JADX WARN: Type inference failed for: r8v13, types: [uif] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList V() {
        int i;
        ?? r11;
        String str;
        boolean z;
        ae2 ae2Var;
        int i2;
        int i3;
        r5a r5aVar;
        r5a r5aVar2;
        int i4;
        ?? r8;
        uif uifVar;
        uif uifVar2;
        ud2 ud2Var;
        ud2 ud2Var2;
        ud2 ud2Var3;
        ArrayList V;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ud2 ud2Var4;
        String str2 = null;
        if (q()) {
            return null;
        }
        ?? r3 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        ae2 ae2Var2 = new ae2();
        while (true) {
            if (!q() && !q()) {
                int i5 = this.b;
                ArrayList arrayList5 = ae2Var2.a;
                int i6 = 2;
                boolean z2 = false;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    if (m('>')) {
                        Q();
                        i = 2;
                    } else if (m('+')) {
                        Q();
                        i = 3;
                    }
                    if (m('*')) {
                        String U = U();
                        if (U != null) {
                            be2 be2Var = new be2(i, U);
                            ae2Var2.b += r3;
                            r11 = be2Var;
                        } else {
                            r11 = str2;
                        }
                    } else {
                        r11 = new be2(i, str2);
                    }
                    while (!q()) {
                        if (m('.')) {
                            if (r11 == 0) {
                                r11 = new be2(i, str2);
                            }
                            String U2 = U();
                            if (U2 == null) {
                                throw new od2("Invalid \".class\" simpleSelectors");
                            }
                            r11.a(i6, "class", U2);
                            ae2Var2.a();
                        } else if (m('#')) {
                            if (r11 == 0) {
                                r11 = new be2(i, str2);
                            }
                            String U3 = U();
                            if (U3 == null) {
                                throw new od2("Invalid \"#id\" simpleSelectors");
                            }
                            r11.a(i6, "id", U3);
                            ae2Var2.b += 1000000;
                        } else if (m('[')) {
                            if (r11 == 0) {
                                r11 = new be2(i, str2);
                            }
                            Q();
                            String U4 = U();
                            if (U4 == null) {
                                throw new od2("Invalid attribute simpleSelectors");
                            }
                            Q();
                            int i7 = m(C4427z5.U) ? i6 : o("~=") ? 3 : o("|=") ? 4 : z2 ? 1 : 0;
                            if (i7 != 0) {
                                Q();
                                if (q()) {
                                    str = str2;
                                } else {
                                    str = I();
                                    if (str == null) {
                                        str = U();
                                    }
                                }
                                if (str == null) {
                                    throw new od2("Invalid attribute simpleSelectors");
                                }
                                Q();
                            } else {
                                str = str2;
                            }
                            if (!m(']')) {
                                throw new od2("Invalid attribute simpleSelectors");
                            }
                            if (i7 == 0) {
                                i7 = r3 == true ? 1 : 0;
                            }
                            r11.a(i7, U4, str);
                            ae2Var2.a();
                        } else {
                            r11 = r11;
                            if (m(':')) {
                                if (r11 == 0) {
                                    r11 = new be2(i, str2);
                                }
                                String U5 = U();
                                if (U5 == null) {
                                    throw new od2("Invalid pseudo class");
                                }
                                vd2 vd2Var = (vd2) vd2.e.get(U5);
                                if (vd2Var == null) {
                                    vd2Var = vd2.d;
                                }
                                switch (vd2Var.ordinal()) {
                                    case 0:
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        i2 = 2;
                                        ud2 ud2Var5 = new ud2(2);
                                        ae2Var.a();
                                        ud2Var = ud2Var5;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            r11.d = arrayList3;
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 1:
                                        ae2Var = ae2Var2;
                                        z = true;
                                        ud2 ud2Var6 = new ud2(1);
                                        ae2Var.a();
                                        ud2Var2 = ud2Var6;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        boolean z3 = (vd2Var == vd2.a || vd2Var == vd2.b) ? r3 == true ? 1 : 0 : z2 ? 1 : 0;
                                        boolean z4 = (vd2Var == vd2.b || vd2Var == vd2.c) ? r3 == true ? 1 : 0 : z2 ? 1 : 0;
                                        int i8 = this.c;
                                        String str3 = (String) this.d;
                                        if (!q()) {
                                            int i9 = this.b;
                                            if (m('(')) {
                                                Q();
                                                if (o("odd")) {
                                                    uifVar2 = new uif(2, r3 == true ? 1 : 0, r3 == true ? 1 : 0);
                                                } else if (o("even")) {
                                                    uifVar2 = new uif(2, z2 ? 1 : 0, r3 == true ? 1 : 0);
                                                } else {
                                                    int i10 = (!m('+') && m('-')) ? -1 : r3 == true ? 1 : 0;
                                                    r5a c = r5a.c(this.b, i8, str3);
                                                    if (c != null) {
                                                        this.b = c.a;
                                                    }
                                                    if (m('n') || m('N')) {
                                                        if (c != null) {
                                                            ae2Var = ae2Var2;
                                                        } else {
                                                            ae2Var = ae2Var2;
                                                            c = new r5a(1L, this.b);
                                                        }
                                                        Q();
                                                        boolean m = m('+');
                                                        i3 = (m || !(m = m('-'))) ? 1 : -1;
                                                        if (m) {
                                                            Q();
                                                            r5aVar = r5a.c(this.b, i8, str3);
                                                            if (r5aVar != null) {
                                                                this.b = r5aVar.a;
                                                            } else {
                                                                this.b = i9;
                                                                r8 = 0;
                                                                if (r8 != 0) {
                                                                    throw new od2("Invalid or missing parameter section for pseudo class: ".concat(U5));
                                                                }
                                                                ?? td2Var = new td2(r11.b, r8.b, r8.c, z3, z4);
                                                                ae2Var.a();
                                                                ud2Var = td2Var;
                                                                i2 = 2;
                                                                z = true;
                                                                arrayList3 = r11.d;
                                                                if (arrayList3 == null) {
                                                                }
                                                                arrayList3.add(ud2Var);
                                                                i6 = i2;
                                                                r3 = z;
                                                                ae2Var2 = ae2Var;
                                                                str2 = null;
                                                                z2 = false;
                                                                break;
                                                            }
                                                        } else {
                                                            r5aVar = null;
                                                        }
                                                    } else {
                                                        ae2Var = ae2Var2;
                                                        r5aVar = c;
                                                        i3 = i10;
                                                        c = null;
                                                        i10 = r3 == true ? 1 : 0;
                                                    }
                                                    if (c == null) {
                                                        r5aVar2 = r5aVar;
                                                        i4 = 0;
                                                    } else {
                                                        r5aVar2 = r5aVar;
                                                        i4 = i10 * ((int) c.b);
                                                    }
                                                    uifVar = new uif(i4, r5aVar2 == null ? 0 : i3 * ((int) r5aVar2.b), 1);
                                                    Q();
                                                    r8 = uifVar;
                                                    if (!m(')')) {
                                                        this.b = i9;
                                                        r8 = 0;
                                                    }
                                                    if (r8 != 0) {
                                                    }
                                                }
                                                ae2Var = ae2Var2;
                                                uifVar = uifVar2;
                                                Q();
                                                r8 = uifVar;
                                                if (!m(')')) {
                                                }
                                                if (r8 != 0) {
                                                }
                                            }
                                        }
                                        r8 = str2;
                                        ae2Var = ae2Var2;
                                        if (r8 != 0) {
                                        }
                                        break;
                                    case 6:
                                        ?? td2Var2 = new td2(null, 0, 1, true, false);
                                        ae2Var2.a();
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = td2Var2;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 7:
                                        ?? td2Var3 = new td2(null, 0, 1, false, false);
                                        ae2Var2.a();
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = td2Var3;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 8:
                                        ?? td2Var4 = new td2(r11.b, 0, 1, true, true);
                                        ae2Var2.a();
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = td2Var4;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 9:
                                        ?? td2Var5 = new td2(r11.b, 0, 1, false, true);
                                        ae2Var2.a();
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = td2Var5;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 10:
                                        ?? yd2Var = new yd2(z2, str2);
                                        ae2Var2.a();
                                        ud2Var3 = yd2Var;
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = ud2Var3;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 11:
                                        ?? yd2Var2 = new yd2(r3, r11.b);
                                        ae2Var2.a();
                                        ud2Var3 = yd2Var2;
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = ud2Var3;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 12:
                                        ud2 ud2Var7 = new ud2(z2 ? 1 : 0);
                                        ae2Var2.a();
                                        ud2Var3 = ud2Var7;
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        ud2Var2 = ud2Var3;
                                        i2 = 2;
                                        ud2Var = ud2Var2;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 13:
                                        if (!q()) {
                                            int i11 = this.b;
                                            if (m('(')) {
                                                Q();
                                                V = V();
                                                if (V == null) {
                                                    this.b = i11;
                                                } else if (m(')')) {
                                                    Iterator it = V.iterator();
                                                    while (it.hasNext() && (arrayList = ((ae2) it.next()).a) != null) {
                                                        Iterator it2 = arrayList.iterator();
                                                        while (it2.hasNext() && (arrayList2 = ((be2) it2.next()).d) != null) {
                                                            Iterator it3 = arrayList2.iterator();
                                                            while (it3.hasNext()) {
                                                                if (((sd2) it3.next()) instanceof wd2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (V != null) {
                                                        throw new od2("Invalid or missing parameter section for pseudo class: ".concat(U5));
                                                    }
                                                    ?? wd2Var = new wd2();
                                                    wd2Var.a = V;
                                                    Iterator it4 = V.iterator();
                                                    int i12 = Integer.MIN_VALUE;
                                                    while (it4.hasNext()) {
                                                        int i13 = ((ae2) it4.next()).b;
                                                        if (i13 > i12) {
                                                            i12 = i13;
                                                        }
                                                    }
                                                    ae2Var2.b = i12;
                                                    z = r3 == true ? 1 : 0;
                                                    ae2Var = ae2Var2;
                                                    ud2Var2 = wd2Var;
                                                    i2 = 2;
                                                    ud2Var = ud2Var2;
                                                    arrayList3 = r11.d;
                                                    if (arrayList3 == null) {
                                                    }
                                                    arrayList3.add(ud2Var);
                                                    i6 = i2;
                                                    r3 = z;
                                                    ae2Var2 = ae2Var;
                                                    str2 = null;
                                                    z2 = false;
                                                    break;
                                                } else {
                                                    this.b = i11;
                                                }
                                            }
                                        }
                                        V = str2;
                                        if (V != null) {
                                        }
                                        break;
                                    case 14:
                                        if (!q()) {
                                            int i14 = this.b;
                                            if (m('(')) {
                                                Q();
                                                ?? r10 = str2;
                                                while (true) {
                                                    String U6 = U();
                                                    r10 = r10;
                                                    if (U6 == null) {
                                                        this.b = i14;
                                                    } else {
                                                        if (r10 == 0) {
                                                            r10 = new ArrayList();
                                                        }
                                                        r10.add(U6);
                                                        Q();
                                                        if (!P()) {
                                                            if (!m(')')) {
                                                                this.b = i14;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ?? xd2Var = new xd2(U5);
                                        ae2Var2.a();
                                        ud2Var4 = xd2Var;
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        i2 = i6;
                                        ud2Var = ud2Var4;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                        ?? xd2Var2 = new xd2(U5);
                                        ae2Var2.a();
                                        ud2Var4 = xd2Var2;
                                        z = r3 == true ? 1 : 0;
                                        ae2Var = ae2Var2;
                                        i2 = i6;
                                        ud2Var = ud2Var4;
                                        arrayList3 = r11.d;
                                        if (arrayList3 == null) {
                                        }
                                        arrayList3.add(ud2Var);
                                        i6 = i2;
                                        r3 = z;
                                        ae2Var2 = ae2Var;
                                        str2 = null;
                                        z2 = false;
                                        break;
                                    default:
                                        throw new od2("Unsupported pseudo class: ".concat(U5));
                                }
                            } else {
                                boolean z5 = r3 == true ? 1 : 0;
                                ae2 ae2Var3 = ae2Var2;
                                if (r11 != 0) {
                                    ae2Var2 = ae2Var3;
                                    ArrayList arrayList6 = ae2Var2.a;
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                        ae2Var2.a = arrayList6;
                                    }
                                    arrayList6.add(r11);
                                    if (P()) {
                                        arrayList4.add(ae2Var2);
                                        ae2Var2 = new ae2();
                                    }
                                    r3 = z5;
                                    str2 = null;
                                } else {
                                    ae2Var2 = ae2Var3;
                                    this.b = i5;
                                }
                            }
                        }
                    }
                    boolean z52 = r3 == true ? 1 : 0;
                    ae2 ae2Var32 = ae2Var2;
                    if (r11 != 0) {
                    }
                }
                i = 0;
                if (m('*')) {
                }
                while (!q()) {
                }
                boolean z522 = r3 == true ? 1 : 0;
                ae2 ae2Var322 = ae2Var2;
                if (r11 != 0) {
                }
            }
        }
    }
}
