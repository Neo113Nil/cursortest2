package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.b;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dd4 implements w6c, y4h {
    public static final Pattern B = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public boolean A;
    public final int a;
    public final z41 b;
    public final tn4 c;
    public final kc5 d;
    public final it7 e;
    public final ujg f;
    public final long g;
    public final dgb h;
    public final l2a i;
    public final qsj j;
    public final cd4[] k;
    public final tnf l;
    public final voe m;
    public final b10 o;
    public final cc5 p;
    public u6c q;
    public kg3 t;
    public zc4 u;
    public int v;
    public List w;
    public long y;
    public final long z;
    public boolean x = true;
    public su2[] r = new su2[0];
    public n66[] s = new n66[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public dd4(int i, zc4 zc4Var, ujg ujgVar, int i2, z41 z41Var, tn4 tn4Var, kc5 kc5Var, cc5 cc5Var, it7 it7Var, b10 b10Var, long j, dgb dgbVar, l2a l2aVar, tnf tnfVar, t9d t9dVar, cse cseVar) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        b[][] bVarArr;
        b[] bVarArr2;
        cy4 h;
        Integer num;
        this.a = i;
        this.u = zc4Var;
        this.f = ujgVar;
        this.v = i2;
        this.b = z41Var;
        this.c = tn4Var;
        this.d = kc5Var;
        this.p = cc5Var;
        this.e = it7Var;
        this.o = b10Var;
        this.g = j;
        this.h = dgbVar;
        this.i = l2aVar;
        this.l = tnfVar;
        boolean z = true;
        this.m = new voe(zc4Var, t9dVar, l2aVar);
        int i5 = 0;
        tnfVar.getClass();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.t = new kg3(vvfVar, vvfVar);
        ude a = zc4Var.a(i2);
        List list = a.d;
        this.w = list;
        List list2 = a.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(aik.y(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            hashMap.put(Long.valueOf(((ch) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            ch chVar = (ch) list2.get(i7);
            List list3 = chVar.e;
            List list4 = chVar.f;
            boolean z2 = z;
            cy4 h2 = h("http://dashif.org/guidelines/trickmode", list3);
            h2 = h2 == null ? h("http://dashif.org/guidelines/trickmode", list4) : h2;
            int intValue = (h2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(h2.b)))) == null || !e(chVar, (ch) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (intValue == i7 && (h = h("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = h.b;
                String str2 = nik.a;
                String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                int length = split.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i8])));
                    if (num2 != null && e(chVar, (ch) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] O = jaa.O((Collection) arrayList.get(i9));
            iArr2[i9] = O;
            Arrays.sort(O);
        }
        boolean[] zArr2 = new boolean[size2];
        b[][] bVarArr3 = new b[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((ch) list2.get(iArr3[i12])).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!((ozf) list7.get(i13)).d.isEmpty()) {
                        zArr2[i10] = z3;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    bVarArr = bVarArr3;
                    bVarArr2 = new b[0];
                    break;
                }
                int i15 = iArr4[i14];
                ch chVar2 = (ch) list2.get(i15);
                List list8 = ((ch) list2.get(i15)).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    cy4 cy4Var = (cy4) list8.get(i16);
                    zArr = zArr2;
                    bVarArr = bVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(cy4Var.a)) {
                        qm8 qm8Var = new qm8();
                        qm8Var.n = sjc.p(MimeTypes.APPLICATION_CEA608);
                        qm8Var.a = lnb.l(chVar2.a, ":cea608", new StringBuilder());
                        bVarArr2 = k(cy4Var, B, new b(qm8Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(cy4Var.a)) {
                        qm8 qm8Var2 = new qm8();
                        qm8Var2.n = sjc.p(MimeTypes.APPLICATION_CEA708);
                        qm8Var2.a = lnb.l(chVar2.a, ":cea708", new StringBuilder());
                        bVarArr2 = k(cy4Var, C, new b(qm8Var2));
                        break;
                    }
                    i16++;
                    bVarArr3 = bVarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            bVarArr[i10] = bVarArr2;
            if (bVarArr2.length != 0) {
                i11++;
            }
            i10++;
            bVarArr3 = bVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        b[][] bVarArr4 = bVarArr3;
        int size3 = list.size() + i11 + size2;
        osj[] osjVarArr = new osj[size3];
        cd4[] cd4VarArr = new cd4[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(((ch) list2.get(i19)).c);
            }
            int size4 = arrayList3.size();
            b[] bVarArr5 = new b[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                b bVar = ((ozf) arrayList3.get(i20)).a;
                int i22 = i18;
                qm8 a2 = bVar.a();
                a2.O = kc5Var.e(bVar);
                bVarArr5[i20] = new b(a2);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            ch chVar3 = (ch) list2.get(iArr7[0]);
            long j2 = chVar3.a;
            String l = j2 != -1 ? Long.toString(j2) : ljg.j(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (bVarArr4[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            j(z41Var, bVarArr5);
            List list9 = list2;
            osjVarArr[i24] = new osj(l, bVarArr5);
            int i26 = chVar3.b;
            av9 av9Var2 = hv9.b;
            vvf vvfVar2 = vvf.e;
            cd4 cd4Var = new cd4(i26, 0, iArr7, i24, i25, i3, -1, vvfVar2);
            int i27 = i24;
            cd4VarArr[i27] = cd4Var;
            int i28 = -1;
            if (i25 != -1) {
                String y = dmi.y(l, ":emsg");
                qm8 qm8Var3 = new qm8();
                qm8Var3.a = y;
                qm8Var3.n = sjc.p(MimeTypes.APPLICATION_EMSG);
                qm8Var3.l = l;
                osjVarArr[i25] = new osj(y, new b(qm8Var3));
                cd4 cd4Var2 = new cd4(5, 1, iArr7, i27, -1, -1, -1, vvfVar2);
                i27 = i27;
                cd4VarArr[i25] = cd4Var2;
                i28 = -1;
            }
            if (i3 != i28) {
                String y2 = dmi.y(l, ":cc");
                cd4VarArr[i3] = new cd4(3, 1, iArr7, i27, -1, -1, -1, hv9.w(bVarArr4[i17]));
                j(z41Var, bVarArr4[i17]);
                int i29 = 0;
                while (true) {
                    b[] bVarArr6 = bVarArr4[i17];
                    if (i29 >= bVarArr6.length) {
                        break;
                    }
                    qm8 a3 = bVarArr6[i29].a();
                    a3.l = l;
                    bVarArr6[i29] = new b(a3);
                    i29++;
                }
                osjVarArr[i3] = new osj(y2, bVarArr4[i17]);
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            dc6 dc6Var = (dc6) list.get(i30);
            qm8 qm8Var4 = new qm8();
            qm8Var4.a = dc6Var.a();
            qm8Var4.n = sjc.p(MimeTypes.APPLICATION_EMSG);
            osjVarArr[i18] = new osj(me4.g(i30, ":", new StringBuilder(dc6Var.a())), new b(qm8Var4));
            av9 av9Var3 = hv9.b;
            cd4VarArr[i18] = new cd4(5, 2, new int[0], -1, -1, -1, i30, vvf.e);
            i30++;
            i18++;
        }
        Pair create = Pair.create(new qsj(osjVarArr), cd4VarArr);
        this.j = (qsj) create.first;
        this.k = (cd4[]) create.second;
        this.z = Long.MIN_VALUE;
    }

    public static boolean e(ch chVar, ch chVar2) {
        int i = chVar.b;
        List list = chVar.c;
        int i2 = chVar2.b;
        List list2 = chVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            b bVar = ((ozf) list.get(0)).a;
            b bVar2 = ((ozf) list2.get(0)).a;
            int i3 = bVar.f & (-16385);
            int i4 = bVar2.f & (-16385);
            if (Objects.equals(bVar.d, bVar2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static cy4 h(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            cy4 cy4Var = (cy4) list.get(i);
            if (str.equals(cy4Var.a)) {
                return cy4Var;
            }
        }
        return null;
    }

    public static void j(z41 z41Var, b[] bVarArr) {
        for (int i = 0; i < bVarArr.length; i++) {
            b bVar = bVarArr[i];
            fjg fjgVar = (fjg) z41Var.c;
            if (fjgVar.a && ((zic) fjgVar.b).i(bVar)) {
                qm8 a = bVar.a();
                String str = bVar.k;
                a.n = sjc.p("application/x-media3-cues");
                a.L = ((zic) fjgVar.b).f(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.o);
                sb.append(str != null ? " ".concat(str) : "");
                a.j = sb.toString();
                a.s = Long.MAX_VALUE;
                bVar = new b(a);
            }
            bVarArr[i] = bVar;
        }
    }

    public static b[] k(cy4 cy4Var, Pattern pattern, b bVar) {
        String str = cy4Var.b;
        if (str == null) {
            return new b[]{bVar};
        }
        String str2 = nik.a;
        String[] split = str.split(";", -1);
        b[] bVarArr = new b[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new b[]{bVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            qm8 a = bVar.a();
            a.a = bf3.h(parseInt, bVar.a, ":", new StringBuilder());
            a.K = parseInt;
            a.d = matcher.group(2);
            bVarArr[i] = new b(a);
        }
        return bVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14, types: [hv9] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        osj osjVar;
        vvf vvfVar;
        int i5;
        uoe uoeVar;
        b[] bVarArr;
        long timeUs;
        int i6;
        boolean z2;
        boolean z3;
        nh6[] nh6VarArr2 = nh6VarArr;
        int[] iArr3 = new int[nh6VarArr2.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = -1;
            if (i8 >= nh6VarArr2.length) {
                break;
            }
            nh6 nh6Var = nh6VarArr2[i8];
            if (nh6Var != null) {
                iArr3[i8] = this.j.b(nh6Var.getTrackGroup());
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        for (int i9 = 0; i9 < nh6VarArr2.length; i9++) {
            if (nh6VarArr2[i9] == null || !zArr[i9]) {
                ?? r4 = jpgVarArr[i9];
                if (r4 instanceof su2) {
                    ((su2) r4).p(this);
                } else if (r4 instanceof ru2) {
                    ru2 ru2Var = (ru2) r4;
                    boolean[] zArr3 = ru2Var.e.d;
                    int i10 = ru2Var.c;
                    z1a.E(zArr3[i10]);
                    zArr3[i10] = false;
                }
                jpgVarArr[i9] = null;
            }
        }
        int i11 = 0;
        while (true) {
            z = true;
            if (i11 >= nh6VarArr2.length) {
                break;
            }
            ?? r42 = jpgVarArr[i11];
            if ((r42 instanceof om5) || (r42 instanceof ru2)) {
                int i12 = i(i11, iArr3);
                if (i12 == -1) {
                    z3 = jpgVarArr[i11] instanceof om5;
                } else {
                    ?? r10 = jpgVarArr[i11];
                    z3 = (r10 instanceof ru2) && ((ru2) r10).a == jpgVarArr[i12];
                }
                if (!z3) {
                    ?? r43 = jpgVarArr[i11];
                    if (r43 instanceof ru2) {
                        ru2 ru2Var2 = (ru2) r43;
                        boolean[] zArr4 = ru2Var2.e.d;
                        int i13 = ru2Var2.c;
                        z1a.E(zArr4[i13]);
                        zArr4[i13] = false;
                    }
                    jpgVarArr[i11] = null;
                }
            }
            i11++;
        }
        int i14 = 0;
        while (i14 < nh6VarArr2.length) {
            nh6 nh6Var2 = nh6VarArr2[i14];
            if (nh6Var2 == null) {
                iArr2 = iArr3;
                i2 = i7;
                i3 = i14;
            } else {
                ?? r11 = jpgVarArr[i14];
                if (r11 == null) {
                    zArr2[i14] = z;
                    cd4 cd4Var = this.k[iArr3[i14]];
                    int i15 = cd4Var.c;
                    if (i15 == 0) {
                        int i16 = cd4Var.f;
                        ?? r29 = i16 != i ? z ? 1 : 0 : i7;
                        if (r29 != 0) {
                            osjVar = this.j.a(i16);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i7;
                            osjVar = null;
                        }
                        int i17 = cd4Var.g;
                        if (i17 != i) {
                            vvfVar = this.k[i17].h;
                        } else {
                            av9 av9Var = hv9.b;
                            vvfVar = vvf.e;
                        }
                        int size = vvfVar.size() + i4;
                        int i18 = i14;
                        b[] bVarArr2 = new b[size];
                        int[] iArr4 = new int[size];
                        if (r29 != 0) {
                            bVarArr2[i7] = osjVar.d[i7];
                            iArr4[i7] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i7;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z4 = z ? 1 : 0;
                        for (int i19 = i7; i19 < vvfVar.size(); i19++) {
                            b bVar = (b) vvfVar.get(i19);
                            bVarArr2[i5] = bVar;
                            iArr4[i5] = 3;
                            arrayList.add(bVar);
                            i5++;
                        }
                        if (!this.u.d || r29 == 0) {
                            uoeVar = null;
                        } else {
                            voe voeVar = this.m;
                            uoeVar = new uoe(voeVar, voeVar.a);
                        }
                        zc4 zc4Var = this.u;
                        int i20 = this.v;
                        jd4 b = ((ozf) ((ch) zc4Var.a(i20).c.get(cd4Var.a[i7])).c.get(i7)).b();
                        if (b == null) {
                            timeUs = C.TIME_UNSET;
                            bVarArr = bVarArr2;
                        } else {
                            bVarArr = bVarArr2;
                            timeUs = b.getTimeUs(b.j(j, zc4Var.c(i20)));
                        }
                        if (this.x) {
                            zc4 zc4Var2 = this.u;
                            int i21 = this.v;
                            int[] iArr5 = cd4Var.a;
                            List list = zc4Var2.a(i21).c;
                            zu9 s = hv9.s();
                            int length = iArr5.length;
                            int i22 = 0;
                            while (i22 < length) {
                                int i23 = i22;
                                s.e(((ch) list.get(iArr5[i23])).c);
                                i22 = i23 + 1;
                            }
                            vvf g = s.g();
                            for (int i24 = 0; i24 < nh6Var2.length(); i24++) {
                                b bVar2 = ((ozf) g.get(nh6Var2.getIndexInTrackGroup(i24))).a;
                                if (!sjc.a(bVar2.o, bVar2.k)) {
                                    i6 = i18;
                                    z2 = z4;
                                    break;
                                }
                            }
                        }
                        i6 = i18;
                        z2 = false;
                        z41 z41Var = this.b;
                        dgb dgbVar = this.h;
                        zc4 zc4Var3 = this.u;
                        ujg ujgVar = this.f;
                        int[] iArr6 = iArr3;
                        int i25 = this.v;
                        int[] iArr7 = cd4Var.a;
                        int i26 = cd4Var.b;
                        i3 = i6;
                        long j2 = this.g;
                        tn4 tn4Var = this.c;
                        re4 createDataSource = ((oe4) z41Var.b).createDataSource();
                        if (tn4Var != null) {
                            createDataSource.f(tn4Var);
                        }
                        uoe uoeVar2 = uoeVar;
                        iArr2 = iArr6;
                        su2 su2Var = new su2(cd4Var.b, iArr4, bVarArr, new do4((fjg) z41Var.c, dgbVar, zc4Var3, ujgVar, i25, iArr7, nh6Var2, i26, createDataSource, j2, r29, arrayList, uoeVar), this, this.i, j, this.d, this.p, this.e, this.o, z2, timeUs, null);
                        long j3 = this.z;
                        su2Var.m.I(j3);
                        for (hpg hpgVar : su2Var.n) {
                            hpgVar.I(j3);
                        }
                        synchronized (this) {
                            this.n.put(su2Var, uoeVar2);
                        }
                        jpgVarArr[i3] = su2Var;
                    } else {
                        iArr2 = iArr3;
                        i3 = i14;
                        if (i15 == 2) {
                            i2 = 0;
                            jpgVarArr[i3] = new n66((dc6) this.w.get(cd4Var.d), nh6Var2.getTrackGroup().d[0], this.u.d);
                        }
                    }
                    i2 = 0;
                } else {
                    iArr2 = iArr3;
                    i2 = i7;
                    i3 = i14;
                    if (r11 instanceof su2) {
                        ((su2) r11).e.i = nh6Var2;
                    }
                }
            }
            i14 = i3 + 1;
            nh6VarArr2 = nh6VarArr;
            i7 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr8 = iArr3;
        ?? r14 = i7;
        while (i7 < nh6VarArr.length) {
            if (jpgVarArr[i7] != null || nh6VarArr[i7] == null) {
                iArr = iArr8;
            } else {
                iArr = iArr8;
                cd4 cd4Var2 = this.k[iArr[i7]];
                if (cd4Var2.c != 1) {
                    continue;
                } else {
                    int i27 = i(i7, iArr);
                    if (i27 != -1) {
                        su2 su2Var2 = (su2) jpgVarArr[i27];
                        int i28 = cd4Var2.b;
                        boolean[] zArr5 = su2Var2.d;
                        hpg[] hpgVarArr = su2Var2.n;
                        for (int i29 = r14 == true ? 1 : 0; i29 < hpgVarArr.length; i29++) {
                            if (su2Var2.b[i29] == i28) {
                                z1a.E(!zArr5[i29]);
                                zArr5[i29] = true;
                                hpgVarArr[i29].H(j, true);
                                jpgVarArr[i7] = new ru2(su2Var2, su2Var2, hpgVarArr[i29], i29);
                            }
                        }
                        zzl.s();
                        return 0L;
                    }
                    jpgVarArr[i7] = new om5();
                }
            }
            i7++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = jpgVarArr.length;
        for (int i30 = r14 == true ? 1 : 0; i30 < length2; i30++) {
            ?? r6 = jpgVarArr[i30];
            if (r6 instanceof su2) {
                arrayList2.add((su2) r6);
            } else if (r6 instanceof n66) {
                arrayList3.add((n66) r6);
            }
        }
        su2[] su2VarArr = new su2[arrayList2.size()];
        this.r = su2VarArr;
        arrayList2.toArray(su2VarArr);
        n66[] n66VarArr = new n66[arrayList3.size()];
        this.s = n66VarArr;
        arrayList3.toArray(n66VarArr);
        tnf tnfVar = this.l;
        AbstractList S = w3a.S(arrayList2, new m72(5));
        tnfVar.getClass();
        this.t = new kg3(arrayList2, S);
        if (this.x) {
            this.x = r14;
            this.y = j;
            su2[] su2VarArr2 = this.r;
            int length3 = su2VarArr2.length;
            int i31 = r14 == true ? 1 : 0;
            while (true) {
                if (i31 >= length3) {
                    break;
                }
                if (su2VarArr2[i31].m()) {
                    this.A = true;
                    su2[] su2VarArr3 = this.r;
                    int length4 = su2VarArr3.length;
                    for (int i32 = r14 == true ? 1 : 0; i32 < length4; i32++) {
                        su2VarArr3[i32].y = true;
                    }
                } else {
                    i31++;
                }
            }
        }
        return j;
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        this.q.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r3 < (((r9.p() + r7) + r10) - 1)) goto L19;
     */
    @Override // defpackage.w6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, d0h d0hVar) {
        long j2;
        long j3 = j;
        su2[] su2VarArr = this.r;
        int length = su2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            su2 su2Var = su2VarArr[i2];
            if (su2Var.a == 2) {
                bo4[] bo4VarArr = su2Var.e.h;
                int length2 = bo4VarArr.length;
                while (i < length2) {
                    bo4 bo4Var = bo4VarArr[i];
                    jd4 jd4Var = (jd4) bo4Var.f;
                    long j4 = bo4Var.b;
                    jd4 jd4Var2 = (jd4) bo4Var.f;
                    if (jd4Var != null) {
                        long c = bo4Var.c();
                        if (c != 0) {
                            jd4Var2.getClass();
                            long j5 = jd4Var2.j(j3, bo4Var.a) + j4;
                            long e = bo4Var.e(j5);
                            if (e < j3) {
                                if (c != -1) {
                                    jd4Var2.getClass();
                                }
                                j2 = bo4Var.e(j5 + 1);
                                return d0hVar.a(j3, e, j2);
                            }
                            j2 = e;
                            return d0hVar.a(j3, e, j2);
                        }
                    }
                    i++;
                    j3 = j;
                }
            } else {
                i2++;
                j3 = j;
            }
        }
        return j;
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        long j2;
        for (su2 su2Var : this.r) {
            if (!su2Var.k()) {
                hpg hpgVar = su2Var.m;
                int i = hpgVar.q;
                hpgVar.j(j, z, true);
                hpg hpgVar2 = su2Var.m;
                int i2 = hpgVar2.q;
                if (i2 > i) {
                    synchronized (hpgVar2) {
                        j2 = hpgVar2.p == 0 ? Long.MIN_VALUE : hpgVar2.n[hpgVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        hpg[] hpgVarArr = su2Var.n;
                        if (i3 >= hpgVarArr.length) {
                            break;
                        }
                        hpgVarArr[i3].j(j2, z, su2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(su2Var.o(i2, 0), su2Var.u);
                if (min > 0) {
                    nik.Y(su2Var.k, 0, min);
                    su2Var.u -= min;
                }
            }
        }
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.q = u6cVar;
        u6cVar.d(this);
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        return this.t.g(mgbVar);
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        return this.t.getBufferedPositionUs();
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return this.t.getNextLoadPositionUs();
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        return this.j;
    }

    public final int i(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            cd4[] cd4VarArr = this.k;
            int i3 = cd4VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && cd4VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.t.isLoading();
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        this.h.maybeThrowError();
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        if (!this.A) {
            return C.TIME_UNSET;
        }
        boolean z = false;
        for (su2 su2Var : this.r) {
            su2Var.getClass();
            try {
                boolean z2 = su2Var.x;
                su2Var.x = false;
                z |= z2;
            } catch (Throwable th) {
                su2Var.x = false;
                throw th;
            }
        }
        su2[] su2VarArr = this.r;
        int length = su2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.A = false;
                for (su2 su2Var2 : this.r) {
                    su2Var2.y = false;
                }
            } else {
                if (su2VarArr[i].m()) {
                    break;
                }
                i++;
            }
        }
        return z ? this.y : C.TIME_UNSET;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        int i;
        su2[] su2VarArr = this.r;
        int length = su2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            su2 su2Var = su2VarArr[i2];
            if (!su2Var.i.l()) {
                long c = this.u.c(this.v);
                hpg hpgVar = su2Var.m;
                z1a.E(!su2Var.i.l());
                if (!su2Var.k() && c != C.TIME_UNSET && !su2Var.k.isEmpty()) {
                    x41 i3 = su2Var.i();
                    long j2 = i3.l;
                    if (j2 == C.TIME_UNSET) {
                        j2 = i3.h;
                    }
                    if (j2 > c) {
                        long r = hpgVar.r();
                        if (r > c) {
                            hpgVar.l(Math.max(c, hpgVar.s() + 1));
                            hpg[] hpgVarArr = su2Var.n;
                            int length2 = hpgVarArr.length;
                            int i4 = 0;
                            while (i4 < length2) {
                                hpg hpgVar2 = hpgVarArr[i4];
                                hpgVar2.l(Math.max(c, hpgVar2.s() + 1));
                                i4++;
                                i2 = i2;
                            }
                            i = i2;
                            su2Var.g.F(su2Var.a, c, r);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.t.reevaluateBuffer(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        int i;
        x41 x41Var;
        boolean H;
        int i2;
        boolean z;
        x41 x41Var2;
        su2[] su2VarArr = this.r;
        int length = su2VarArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            su2 su2Var = su2VarArr[i3];
            hpg[] hpgVarArr = su2Var.n;
            hpg hpgVar = su2Var.m;
            x6k x6kVar = su2Var.i;
            ?? r14 = su2Var.k;
            su2Var.t = j;
            su2Var.w = z2;
            su2Var.x = z2;
            if (su2Var.k()) {
                su2Var.s = j;
                z = z2;
                i = i3;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i3;
                        break;
                    }
                    x41Var = (x41) r14.get(r15);
                    long j2 = x41Var.g;
                    i = i3;
                    if (j2 == j && x41Var.k == C.TIME_UNSET) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i3 = i;
                }
                x41Var = null;
                if (x41Var != null) {
                    H = hpgVar.G(x41Var.c(0));
                } else {
                    long nextLoadPositionUs = su2Var.getNextLoadPositionUs();
                    H = hpgVar.H(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                if (!H || (x41Var2 = su2Var.v) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if (x41Var2.c(0) <= hpgVar.u()) {
                        H = false;
                    }
                }
                if (H) {
                    su2Var.u = su2Var.o(hpgVar.u(), i2);
                    for (hpg hpgVar2 : hpgVarArr) {
                        hpgVar2.H(j, true);
                    }
                } else {
                    su2Var.s = j;
                    su2Var.z = false;
                    r14.clear();
                    su2Var.u = 0;
                    if (x6kVar.l()) {
                        hpgVar.k();
                        for (hpg hpgVar3 : hpgVarArr) {
                            hpgVar3.k();
                        }
                        x6kVar.a();
                    } else {
                        x6kVar.d = null;
                        z = false;
                        hpgVar.F(false);
                        for (hpg hpgVar4 : su2Var.n) {
                            hpgVar4.F(false);
                        }
                    }
                }
                z = false;
            }
            i3 = i + 1;
            z2 = z;
        }
        n66[] n66VarArr = this.s;
        int length2 = n66VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            n66 n66Var = n66VarArr[r5];
            int b = nik.b(n66Var.c, j, true);
            n66Var.g = b;
            n66Var.h = (n66Var.d && b == n66Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }
}
