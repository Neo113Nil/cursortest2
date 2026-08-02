package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.dash.e.c;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.at;
import xsna.chp;
import xsna.cj0;
import xsna.d7q;
import xsna.e7g0;
import xsna.efz;
import xsna.fo8;
import xsna.fxc0;
import xsna.fz5;
import xsna.grz;
import xsna.icc;
import xsna.io20;
import xsna.ipx;
import xsna.jx90;
import xsna.k0q;
import xsna.lhg;
import xsna.m0h0;
import xsna.mjp0;
import xsna.o3i0;
import xsna.pfp0;
import xsna.pui;
import xsna.qfp0;
import xsna.qhz;
import xsna.r0q;
import xsna.rg6;
import xsna.rsk;
import xsna.wp6;
import xsna.x1b0;
import xsna.xu1;
import xsna.y2m;
import xsna.y2r0;

/* compiled from: DashMediaPeriod.java */
/* loaded from: classes12.dex */
public final class c implements h, q.a<icc<b>>, icc.b<b> {
    public static final Pattern B = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public long A;
    public final int b;
    public final b.a c;

    @Nullable
    public final mjp0 d;
    public final androidx.media3.exoplayer.drm.b e;
    public final androidx.media3.exoplayer.upstream.b f;
    public final wp6 g;
    public final long h;
    public final grz i;
    public final xu1 j;
    public final qfp0 k;
    public final a[] l;
    public final fz5 m;
    public final e n;
    public final j.a p;
    public final a.C0054a q;
    public final x1b0 r;

    @Nullable
    public h.a s;
    public pui v;
    public rsk w;
    public int x;
    public List<r0q> y;
    public boolean z = true;
    public icc<b>[] t = new icc[0];
    public k0q[] u = new k0q[0];
    public final IdentityHashMap<icc<b>, e.c> o = new IdentityHashMap<>();

    /* compiled from: DashMediaPeriod.java */
    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final ImmutableList<androidx.media3.common.a> h;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, ImmutableList<androidx.media3.common.a> immutableList) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
            this.h = immutableList;
        }
    }

    public c(int i, rsk rskVar, wp6 wp6Var, int i2, b.a aVar, @Nullable mjp0 mjp0Var, androidx.media3.exoplayer.drm.b bVar, a.C0054a c0054a, androidx.media3.exoplayer.upstream.b bVar2, j.a aVar2, long j, grz grzVar, xu1 xu1Var, fz5 fz5Var, DashMediaSource.c cVar, x1b0 x1b0Var) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        androidx.media3.common.a[][] aVarArr;
        androidx.media3.common.a[] aVarArr2;
        y2m g;
        Integer num;
        this.b = i;
        this.w = rskVar;
        this.g = wp6Var;
        this.x = i2;
        this.c = aVar;
        this.d = mjp0Var;
        this.e = bVar;
        this.q = c0054a;
        this.f = bVar2;
        this.p = aVar2;
        this.h = j;
        this.i = grzVar;
        this.j = xu1Var;
        this.m = fz5Var;
        this.r = x1b0Var;
        boolean z = true;
        this.n = new e(rskVar, cVar, xu1Var);
        int i5 = 0;
        fz5Var.getClass();
        ImmutableList.b bVar3 = ImmutableList.c;
        g gVar = g.f;
        this.v = new pui(gVar, gVar);
        jx90 b = rskVar.b(i2);
        List<r0q> list = b.d;
        this.y = list;
        List<cj0> list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(com.google.common.collect.e.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            hashMap.put(Long.valueOf(list2.get(i6).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            cj0 cj0Var = list2.get(i7);
            List<y2m> list3 = cj0Var.e;
            List<y2m> list4 = cj0Var.f;
            boolean z2 = z;
            y2m g2 = g("http://dashif.org/guidelines/trickmode", list3);
            g2 = g2 == null ? g("http://dashif.org/guidelines/trickmode", list4) : g2;
            int intValue = (g2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(g2.b)))) == null || !f(cj0Var, list2.get(num.intValue()))) ? i7 : num.intValue();
            if (intValue == i7 && (g = g("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = g.b;
                String str2 = y2r0.a;
                String[] split = str.split(StringUtils.COMMA, -1);
                int length = split.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i8])));
                    if (num2 != null && f(cj0Var, list2.get(num2.intValue()))) {
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
            int[] x = ipx.x((Collection) arrayList.get(i9));
            iArr2[i9] = x;
            Arrays.sort(x);
        }
        boolean[] zArr2 = new boolean[size2];
        androidx.media3.common.a[][] aVarArr3 = new androidx.media3.common.a[size2][];
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
                List<e7g0> list7 = list2.get(iArr3[i12]).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!list7.get(i13).e.isEmpty()) {
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
                    aVarArr = aVarArr3;
                    aVarArr2 = new androidx.media3.common.a[0];
                    break;
                }
                int i15 = iArr4[i14];
                cj0 cj0Var2 = list2.get(i15);
                List<y2m> list8 = list2.get(i15).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    y2m y2mVar = list8.get(i16);
                    zArr = zArr2;
                    aVarArr = aVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(y2mVar.a)) {
                        a.C0043a c0043a = new a.C0043a();
                        c0043a.m = io20.q(MimeTypes.APPLICATION_CEA608);
                        c0043a.a = efz.b(cj0Var2.a, ":cea608", new StringBuilder());
                        aVarArr2 = j(y2mVar, B, new androidx.media3.common.a(c0043a));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(y2mVar.a)) {
                        a.C0043a c0043a2 = new a.C0043a();
                        c0043a2.m = io20.q(MimeTypes.APPLICATION_CEA708);
                        c0043a2.a = efz.b(cj0Var2.a, ":cea708", new StringBuilder());
                        aVarArr2 = j(y2mVar, C, new androidx.media3.common.a(c0043a2));
                        break;
                    }
                    i16++;
                    aVarArr3 = aVarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            aVarArr[i10] = aVarArr2;
            if (aVarArr2.length != 0) {
                i11++;
            }
            i10++;
            aVarArr3 = aVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        androidx.media3.common.a[][] aVarArr4 = aVarArr3;
        int size3 = list.size() + i11 + size2;
        pfp0[] pfp0VarArr = new pfp0[size3];
        a[] aVarArr5 = new a[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(list2.get(i19).c);
            }
            int size4 = arrayList3.size();
            androidx.media3.common.a[] aVarArr6 = new androidx.media3.common.a[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                androidx.media3.common.a aVar3 = ((e7g0) arrayList3.get(i20)).b;
                int i22 = i18;
                a.C0043a a2 = aVar3.a();
                a2.N = bVar.a(aVar3);
                aVarArr6[i20] = new androidx.media3.common.a(a2);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            cj0 cj0Var3 = list2.get(iArr7[0]);
            long j2 = cj0Var3.a;
            String l = j2 != -1 ? Long.toString(j2) : lhg.a(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (aVarArr4[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List<cj0> list9 = list2;
            int i26 = 0;
            while (i26 < size4) {
                int i27 = i26;
                aVarArr6[i27] = aVar.d(aVarArr6[i27]);
                i26 = i27 + 1;
            }
            pfp0VarArr[i24] = new pfp0(l, aVarArr6);
            int i28 = cj0Var3.b;
            ImmutableList.b bVar4 = ImmutableList.c;
            g gVar2 = g.f;
            a aVar4 = new a(i28, 0, iArr7, i24, i25, i3, -1, gVar2);
            int i29 = i24;
            aVarArr5[i29] = aVar4;
            int i30 = -1;
            if (i25 != -1) {
                String a3 = fo8.a(l, ":emsg");
                a.C0043a c0043a3 = new a.C0043a();
                c0043a3.a = a3;
                c0043a3.m = io20.q(MimeTypes.APPLICATION_EMSG);
                pfp0VarArr[i25] = new pfp0(a3, new androidx.media3.common.a(c0043a3));
                a aVar5 = new a(5, 1, iArr7, i29, -1, -1, -1, gVar2);
                i29 = i29;
                aVarArr5[i25] = aVar5;
                i30 = -1;
            }
            if (i3 != i30) {
                String a4 = fo8.a(l, ":cc");
                aVarArr5[i3] = new a(3, 1, iArr7, i29, -1, -1, -1, ImmutableList.n(aVarArr4[i17]));
                androidx.media3.common.a[] aVarArr7 = aVarArr4[i17];
                for (int i31 = 0; i31 < aVarArr7.length; i31++) {
                    aVarArr7[i31] = aVar.d(aVarArr7[i31]);
                }
                pfp0VarArr[i3] = new pfp0(a4, aVarArr4[i17]);
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            r0q r0qVar = list.get(i32);
            a.C0043a c0043a4 = new a.C0043a();
            c0043a4.a = r0qVar.a();
            c0043a4.m = io20.q(MimeTypes.APPLICATION_EMSG);
            pfp0VarArr[i18] = new pfp0(r0qVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i32, new androidx.media3.common.a(c0043a4));
            ImmutableList.b bVar5 = ImmutableList.c;
            aVarArr5[i18] = new a(5, 2, new int[0], -1, -1, -1, i32, g.f);
            i32++;
            i18++;
        }
        Pair create = Pair.create(new qfp0(pfp0VarArr), aVarArr5);
        this.k = (qfp0) create.first;
        this.l = (a[]) create.second;
    }

    public static boolean f(cj0 cj0Var, cj0 cj0Var2) {
        int i = cj0Var.b;
        List<e7g0> list = cj0Var.c;
        int i2 = cj0Var2.b;
        List<e7g0> list2 = cj0Var2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            androidx.media3.common.a aVar = list.get(0).b;
            androidx.media3.common.a aVar2 = list2.get(0).b;
            int i3 = aVar.f & (-16385);
            int i4 = aVar2.f & (-16385);
            if (Objects.equals(aVar.d, aVar2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static y2m g(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            y2m y2mVar = (y2m) list.get(i);
            if (str.equals(y2mVar.a)) {
                return y2mVar;
            }
        }
        return null;
    }

    public static androidx.media3.common.a[] j(y2m y2mVar, Pattern pattern, androidx.media3.common.a aVar) {
        String str = y2mVar.b;
        if (str == null) {
            return new androidx.media3.common.a[]{aVar};
        }
        String str2 = y2r0.a;
        String[] split = str.split(";", -1);
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new androidx.media3.common.a[]{aVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            a.C0043a a2 = aVar.a();
            a2.a = aVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + parseInt;
            a2.J = parseInt;
            a2.d = matcher.group(2);
            aVarArr[i] = new androidx.media3.common.a(a2);
        }
        return aVarArr;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        for (icc<b> iccVar : this.t) {
            if (iccVar.b == 2) {
                return iccVar.f.a(j, o3i0Var);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final List c(ArrayList arrayList) {
        List<cj0> list = this.w.b(this.x).c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d7q d7qVar = (d7q) it.next();
            a aVar = this.l[this.k.b(d7qVar.getTrackGroup())];
            if (aVar.c == 0) {
                int[] iArr = aVar.a;
                int length = d7qVar.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < d7qVar.length(); i++) {
                    iArr2[i] = d7qVar.getIndexInTrackGroup(i);
                }
                Arrays.sort(iArr2);
                int size = list.get(iArr[0]).c.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list.get(iArr[i2]).c.size();
                            i3 = i6;
                        }
                    }
                    arrayList2.add(new StreamKey(this.x, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList2;
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(icc<b> iccVar) {
        this.s.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        long j2;
        for (icc<b> iccVar : this.t) {
            if (!iccVar.n()) {
                p pVar = iccVar.n;
                int i = pVar.q;
                pVar.j(j, z, true);
                p pVar2 = iccVar.n;
                int i2 = pVar2.q;
                if (i2 > i) {
                    synchronized (pVar2) {
                        j2 = pVar2.p == 0 ? Long.MIN_VALUE : pVar2.n[pVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        p[] pVarArr = iccVar.o;
                        if (i3 >= pVarArr.length) {
                            break;
                        }
                        pVarArr[i3].j(j2, z, iccVar.e[i3]);
                        i3++;
                    }
                }
                int min = Math.min(iccVar.p(i2, 0), iccVar.v);
                if (min > 0) {
                    y2r0.a0(iccVar.l, 0, min);
                    iccVar.v -= min;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.s = aVar;
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        return this.v.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        return this.v.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [androidx.media3.exoplayer.dash.e$c] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v22, types: [androidx.media3.exoplayer.dash.b$a] */
    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        int i;
        pfp0 pfp0Var;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        pfp0 pfp0Var2;
        ImmutableList immutableList;
        int i5;
        ?? r28;
        boolean z2;
        d7q[] d7qVarArr2 = d7qVarArr;
        int[] iArr3 = new int[d7qVarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= d7qVarArr2.length) {
                break;
            }
            d7q d7qVar = d7qVarArr2[i7];
            if (d7qVar != null) {
                iArr3[i7] = this.k.b(d7qVar.getTrackGroup());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            pfp0Var = null;
            if (i8 >= d7qVarArr2.length) {
                break;
            }
            if (d7qVarArr2[i8] == null || !zArr[i8]) {
                m0h0 m0h0Var = m0h0VarArr[i8];
                if (m0h0Var instanceof icc) {
                    ((icc) m0h0Var).q(this);
                } else if (m0h0Var instanceof icc.a) {
                    icc.a aVar = (icc.a) m0h0Var;
                    icc iccVar = icc.this;
                    boolean[] zArr3 = iccVar.e;
                    int i9 = aVar.d;
                    fxc0.z(zArr3[i9]);
                    iccVar.e[i9] = false;
                }
                m0h0VarArr[i8] = null;
            }
            i8++;
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= d7qVarArr2.length) {
                break;
            }
            m0h0 m0h0Var2 = m0h0VarArr[i10];
            if ((m0h0Var2 instanceof chp) || (m0h0Var2 instanceof icc.a)) {
                int i11 = i(i10, iArr3);
                if (i11 == -1) {
                    z2 = m0h0VarArr[i10] instanceof chp;
                } else {
                    m0h0 m0h0Var3 = m0h0VarArr[i10];
                    z2 = (m0h0Var3 instanceof icc.a) && ((icc.a) m0h0Var3).b == m0h0VarArr[i11];
                }
                if (!z2) {
                    m0h0 m0h0Var4 = m0h0VarArr[i10];
                    if (m0h0Var4 instanceof icc.a) {
                        icc.a aVar2 = (icc.a) m0h0Var4;
                        icc iccVar2 = icc.this;
                        boolean[] zArr4 = iccVar2.e;
                        int i12 = aVar2.d;
                        fxc0.z(zArr4[i12]);
                        iccVar2.e[i12] = false;
                    }
                    m0h0VarArr[i10] = null;
                }
            }
            i10++;
        }
        int i13 = 0;
        while (i13 < d7qVarArr2.length) {
            d7q d7qVar2 = d7qVarArr2[i13];
            if (d7qVar2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i13;
            } else {
                m0h0 m0h0Var5 = m0h0VarArr[i13];
                if (m0h0Var5 == null) {
                    zArr2[i13] = z;
                    a aVar3 = this.l[iArr3[i13]];
                    int i14 = aVar3.c;
                    if (i14 == 0) {
                        int i15 = aVar3.f;
                        ?? r26 = i15 != i ? z ? 1 : 0 : i6;
                        if (r26 != 0) {
                            pfp0Var2 = this.k.a(i15);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            pfp0Var2 = pfp0Var;
                        }
                        int i16 = aVar3.g;
                        if (i16 != i) {
                            immutableList = this.l[i16].h;
                        } else {
                            ImmutableList.b bVar = ImmutableList.c;
                            immutableList = g.f;
                        }
                        int size = immutableList.size() + i4;
                        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[size];
                        int[] iArr4 = new int[size];
                        if (r26 != 0) {
                            aVarArr[i6] = pfp0Var2.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i17 = i6; i17 < immutableList.size(); i17++) {
                            androidx.media3.common.a aVar4 = (androidx.media3.common.a) immutableList.get(i17);
                            aVarArr[i5] = aVar4;
                            iArr4[i5] = 3;
                            arrayList.add(aVar4);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.w.d || r26 == 0) {
                            r28 = pfp0Var;
                        } else {
                            e eVar = this.n;
                            r28 = eVar.new c(eVar.b);
                        }
                        e.c cVar = r28;
                        i3 = i13;
                        iArr2 = iArr3;
                        pfp0Var = null;
                        icc<b> iccVar3 = new icc<>(aVar3.b, iArr4, aVarArr, this.c.e(this.i, this.w, this.g, this.x, aVar3.a, d7qVar2, aVar3.b, this.h, r26, arrayList, r28, this.d, this.r), this, this.j, j, this.e, this.q, this.f, this.p, this.z, null);
                        synchronized (this) {
                            this.o.put(iccVar3, cVar);
                        }
                        m0h0VarArr[i3] = iccVar3;
                    } else {
                        iArr2 = iArr3;
                        i3 = i13;
                        if (i14 == 2) {
                            i2 = 0;
                            m0h0VarArr[i3] = new k0q(this.y.get(aVar3.d), d7qVar2.getTrackGroup().d[0], this.w.d);
                        }
                    }
                    i2 = 0;
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i13;
                    if (m0h0Var5 instanceof icc) {
                        ((b) ((icc) m0h0Var5).f).d(d7qVar2);
                    }
                }
            }
            i13 = i3 + 1;
            d7qVarArr2 = d7qVarArr;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        ?? r6 = i6;
        int i18 = r6 == true ? 1 : 0;
        while (i18 < d7qVarArr.length) {
            if (m0h0VarArr[i18] != null || d7qVarArr[i18] == null) {
                iArr = iArr5;
            } else {
                iArr = iArr5;
                a aVar5 = this.l[iArr[i18]];
                if (aVar5.c == 1) {
                    int i19 = i(i18, iArr);
                    if (i19 != -1) {
                        icc iccVar4 = (icc) m0h0VarArr[i19];
                        int i20 = aVar5.b;
                        boolean[] zArr5 = iccVar4.e;
                        p[] pVarArr = iccVar4.o;
                        for (int i21 = r6 == true ? 1 : 0; i21 < pVarArr.length; i21++) {
                            if (iccVar4.c[i21] == i20) {
                                fxc0.z(!zArr5[i21]);
                                zArr5[i21] = true;
                                pVarArr[i21].F(j, true);
                                m0h0VarArr[i18] = new icc.a(iccVar4, pVarArr[i21], i21);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    m0h0VarArr[i18] = new chp();
                    i18++;
                    iArr5 = iArr;
                }
            }
            i18++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = m0h0VarArr.length;
        for (int i22 = r6 == true ? 1 : 0; i22 < length; i22++) {
            m0h0 m0h0Var6 = m0h0VarArr[i22];
            if (m0h0Var6 instanceof icc) {
                arrayList2.add((icc) m0h0Var6);
            } else if (m0h0Var6 instanceof k0q) {
                arrayList3.add((k0q) m0h0Var6);
            }
        }
        icc<b>[] iccVarArr = new icc[arrayList2.size()];
        this.t = iccVarArr;
        arrayList2.toArray(iccVarArr);
        k0q[] k0qVarArr = new k0q[arrayList3.size()];
        this.u = k0qVarArr;
        arrayList3.toArray(k0qVarArr);
        fz5 fz5Var = this.m;
        AbstractList e = qhz.e(arrayList2, new at(11));
        fz5Var.getClass();
        this.v = new pui(arrayList2, e);
        if (this.z) {
            this.z = r6;
            this.A = j;
        }
        return j;
    }

    public final int i(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            a[] aVarArr = this.l;
            int i3 = aVarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && aVarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.v.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(f fVar) {
        return this.v.k(fVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        this.i.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        icc<b>[] iccVarArr = this.t;
        int length = iccVarArr.length;
        for (int i = 0; i < length; i++) {
            icc<b> iccVar = iccVarArr[i];
            iccVar.getClass();
            try {
                if (iccVar.y) {
                    return this.A;
                }
            } finally {
                iccVar.y = false;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        int i;
        icc<b>[] iccVarArr = this.t;
        int length = iccVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            icc<b> iccVar = iccVarArr[i2];
            if (!iccVar.j.c()) {
                long d = this.w.d(this.x);
                p pVar = iccVar.n;
                fxc0.z(!iccVar.j.c());
                if (!iccVar.n() && d != C.TIME_UNSET && !iccVar.l.isEmpty()) {
                    rg6 l = iccVar.l();
                    long j2 = l.l;
                    if (j2 == C.TIME_UNSET) {
                        j2 = l.h;
                    }
                    if (j2 > d) {
                        long q = pVar.q();
                        if (q > d) {
                            pVar.l(Math.max(d, pVar.r() + 1));
                            p[] pVarArr = iccVar.o;
                            int length2 = pVarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                p pVar2 = pVarArr[i3];
                                pVar2.l(Math.max(d, pVar2.r() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            iccVar.h.k(iccVar.b, d, q);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.v.reevaluateBuffer(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        int i;
        rg6 rg6Var;
        boolean F;
        boolean z;
        icc<b>[] iccVarArr = this.t;
        int length = iccVarArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            icc<b> iccVar = iccVarArr[i2];
            p[] pVarArr = iccVar.o;
            p pVar = iccVar.n;
            Loader loader = iccVar.j;
            ArrayList<rg6> arrayList = iccVar.l;
            iccVar.u = j;
            iccVar.x = z2;
            if (iccVar.n()) {
                iccVar.t = j;
                z = z2;
                i = i2;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= arrayList.size()) {
                        i = i2;
                        break;
                    }
                    rg6Var = arrayList.get(r15);
                    long j2 = rg6Var.g;
                    i = i2;
                    if (j2 == j && rg6Var.k == C.TIME_UNSET) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i2 = i;
                }
                rg6Var = null;
                if (rg6Var != null) {
                    F = pVar.E(rg6Var.d(0));
                } else {
                    long nextLoadPositionUs = iccVar.getNextLoadPositionUs();
                    F = pVar.F(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                if (F) {
                    iccVar.v = iccVar.p(pVar.t(), 0);
                    for (p pVar2 : pVarArr) {
                        pVar2.F(j, true);
                    }
                } else {
                    iccVar.t = j;
                    iccVar.z = false;
                    arrayList.clear();
                    iccVar.v = 0;
                    if (loader.c()) {
                        pVar.k();
                        for (p pVar3 : pVarArr) {
                            pVar3.k();
                        }
                        loader.a();
                    } else {
                        loader.c = null;
                        z = false;
                        pVar.D(false);
                        for (p pVar4 : iccVar.o) {
                            pVar4.D(false);
                        }
                    }
                }
                z = false;
            }
            i2 = i + 1;
            z2 = z;
        }
        k0q[] k0qVarArr = this.u;
        int length2 = k0qVarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            k0q k0qVar = k0qVarArr[r5];
            int b = y2r0.b(k0qVar.d, j, true);
            k0qVar.h = b;
            k0qVar.i = (k0qVar.e && b == k0qVar.d.length) ? j : -9223372036854775807L;
        }
        return j;
    }
}
