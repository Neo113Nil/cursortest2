package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.ewo0;
import xsna.fz5;
import xsna.g740;
import xsna.h740;
import xsna.k15;
import xsna.kr10;
import xsna.mjp0;
import xsna.vr10;
import xsna.w5i;
import xsna.xu1;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class MergingMediaSource extends c<Integer> {
    public static final kr10 s;
    public final i[] k;
    public final ArrayList l;
    public final ewo0[] m;
    public final ArrayList<i> n;
    public final fz5 o;
    public int p;
    public long[][] q;

    @Nullable
    public IllegalMergeException r;

    public static final class IllegalMergeException extends IOException {
        public final int reason = 0;
    }

    public static final class a {
        public final i.b a;
        public final h b;

        public a(i.b bVar, h hVar) {
            this.a = bVar;
            this.b = hVar;
        }
    }

    static {
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        s = new kr10("MergingMediaSource", new kr10.c(aVar), null, new kr10.e(aVar2), vr10.B, kr10.g.a);
    }

    public MergingMediaSource(i... iVarArr) {
        fz5 fz5Var = new fz5();
        this.k = iVarArr;
        this.o = fz5Var;
        this.n = new ArrayList<>(Arrays.asList(iVarArr));
        this.p = -1;
        this.l = new ArrayList(iVarArr.length);
        for (int i = 0; i < iVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new ewo0[iVarArr.length];
        this.q = new long[0][];
        new HashMap();
        k15.h(8, "expectedKeys");
        k15.h(2, "expectedValuesPerKey");
        new h740(w5i.e(8)).g = new g740();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final kr10 f() {
        i[] iVarArr = this.k;
        return iVarArr.length > 0 ? iVarArr[0].f() : s;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        k kVar = (k) hVar;
        int i = 0;
        while (true) {
            i[] iVarArr = this.k;
            if (i >= iVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            h[] hVarArr = kVar.b;
            boolean[] zArr = kVar.c;
            h hVar2 = zArr[i] ? ((s) hVarArr[i]).b : hVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((a) list.get(i2)).b.equals(hVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            i iVar = iVarArr[i];
            h[] hVarArr2 = kVar.b;
            iVar.h(zArr[i] ? ((s) hVarArr2[i]).b : hVarArr2[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void l(kr10 kr10Var) {
        this.k[0].l(kr10Var);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final h m(i.b bVar, xu1 xu1Var, long j) {
        i[] iVarArr = this.k;
        int length = iVarArr.length;
        h[] hVarArr = new h[length];
        ewo0[] ewo0VarArr = this.m;
        int b = ewo0VarArr[0].b(bVar.a);
        for (int i = 0; i < length; i++) {
            i.b a2 = bVar.a(ewo0VarArr[i].l(b));
            hVarArr[i] = iVarArr[i].m(a2, xu1Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new a(a2, hVarArr[i]));
        }
        return new k(this.o, this.q[b], hVarArr);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.r;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(@Nullable mjp0 mjp0Var) {
        this.j = mjp0Var;
        this.i = y2r0.o(null);
        int i = 0;
        while (true) {
            i[] iVarArr = this.k;
            if (i >= iVarArr.length) {
                return;
            }
            y(Integer.valueOf(i), iVarArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        super.t();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList<i> arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // androidx.media3.exoplayer.source.c
    @Nullable
    public final i.b u(Integer num, i.b bVar) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((a) list.get(i)).a.equals(bVar)) {
                return ((a) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void x(Object obj, androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = ewo0Var.h();
        } else if (ewo0Var.h() != this.p) {
            this.r = new IllegalMergeException();
            return;
        }
        int length = this.q.length;
        ewo0[] ewo0VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, ewo0VarArr.length);
        }
        ArrayList<i> arrayList = this.n;
        arrayList.remove(aVar);
        ewo0VarArr[num.intValue()] = ewo0Var;
        if (arrayList.isEmpty()) {
            s(ewo0VarArr[0]);
        }
    }
}
