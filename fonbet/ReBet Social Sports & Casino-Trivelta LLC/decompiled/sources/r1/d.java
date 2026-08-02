package r1;

import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import a2.C1914f;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.C2334C;
import b2.C2378h;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Q;
import e2.C4166h;
import e2.s;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import n1.G1;
import o2.C5782b;
import o2.C5785e;
import o2.C5788h;
import o2.C5790j;
import o2.K;

/* loaded from: classes.dex */
public final class d implements h {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public final int f63746a;

    /* renamed from: b, reason: collision with root package name */
    public s.a f63747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63748c;

    /* renamed from: d, reason: collision with root package name */
    public int f63749d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63750e;

    public d() {
        this(0, true);
    }

    public static void f(int i10, List list) {
        if (com.google.common.primitives.f.k(DEFAULT_EXTRACTOR_ORDER, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    public static C2378h i(s.a aVar, boolean z10, Q q10, androidx.media3.common.a aVar2, List list, int i10) {
        int i11 = m(aVar2) ? 4 : 0;
        if (!z10) {
            aVar = s.a.f45617a;
            i11 |= 32;
        }
        s.a aVar3 = aVar;
        int i12 = i11 | C2378h.i(i10);
        if (list == null) {
            list = AbstractC3445z.t();
        }
        return new C2378h(aVar3, i12, q10, null, list, null);
    }

    public static K j(int i10, boolean z10, androidx.media3.common.a aVar, List list, Q q10, s.a aVar2, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new a.b().y0("application/cea-608").P()) : Collections.EMPTY_LIST;
        }
        String str = aVar.f20539k;
        if (!TextUtils.isEmpty(str)) {
            if (!AbstractC2335D.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!AbstractC2335D.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            aVar2 = s.a.f45617a;
            i11 = 1;
        }
        return new K(2, i11, aVar2, q10, new C5790j(i12, list), 112800);
    }

    public static boolean m(androidx.media3.common.a aVar) {
        C2334C c2334c = aVar.f20540l;
        if (c2334c == null) {
            return false;
        }
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            if (c2334c.d(i10) instanceof t) {
                return !((t) r2).f63908c.isEmpty();
            }
        }
        return false;
    }

    public static boolean o(InterfaceC1183p interfaceC1183p, InterfaceC1184q interfaceC1184q) {
        try {
            boolean j10 = interfaceC1183p.j(interfaceC1184q);
            interfaceC1184q.g();
            return j10;
        } catch (EOFException unused) {
            interfaceC1184q.g();
            return false;
        } catch (Throwable th2) {
            interfaceC1184q.g();
            throw th2;
        }
    }

    @Override // r1.h
    public androidx.media3.common.a d(androidx.media3.common.a aVar) {
        String str;
        if (!this.f63748c || !this.f63747b.a(aVar)) {
            return aVar;
        }
        a.b Y10 = aVar.b().y0("application/x-media3-cues").Y(this.f63747b.b(aVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.f20543o);
        if (aVar.f20539k != null) {
            str = " " + aVar.f20539k;
        } else {
            str = "";
        }
        sb2.append(str);
        return Y10.U(sb2.toString()).C0(LongCompanionObject.MAX_VALUE).P();
    }

    @Override // r1.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6197b e(Uri uri, androidx.media3.common.a aVar, List list, Q q10, Map map, InterfaceC1184q interfaceC1184q, G1 g12) {
        int a10 = b1.r.a(aVar.f20543o);
        int b10 = b1.r.b(map);
        int c10 = b1.r.c(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(a10, arrayList);
        f(b10, arrayList);
        f(c10, arrayList);
        for (int i10 : iArr) {
            f(i10, arrayList);
        }
        interfaceC1184q.g();
        InterfaceC1183p interfaceC1183p = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            InterfaceC1183p interfaceC1183p2 = (InterfaceC1183p) AbstractC4134a.e(h(intValue, aVar, list, q10));
            if (o(interfaceC1183p2, interfaceC1184q)) {
                return new C6197b(interfaceC1183p2, aVar, q10, this.f63747b, this.f63748c);
            }
            if (interfaceC1183p == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                interfaceC1183p = interfaceC1183p2;
            }
        }
        return new C6197b((InterfaceC1183p) AbstractC4134a.e(interfaceC1183p), aVar, q10, this.f63747b, this.f63748c);
    }

    public final InterfaceC1183p h(int i10, androidx.media3.common.a aVar, List list, Q q10) {
        if (i10 == 0) {
            return new C5782b();
        }
        if (i10 == 1) {
            return new C5785e();
        }
        if (i10 == 2) {
            return new C5788h();
        }
        if (i10 == 7) {
            return new C1914f(0, 0L);
        }
        if (i10 == 8) {
            return i(this.f63747b, this.f63748c, q10, aVar, list, this.f63749d);
        }
        if (i10 == 11) {
            return j(this.f63746a, this.f63750e, aVar, list, q10, this.f63747b, this.f63748c);
        }
        if (i10 != 13) {
            return null;
        }
        return new w(aVar.f20532d, q10, this.f63747b, this.f63748c);
    }

    @Override // r1.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d b(boolean z10) {
        this.f63748c = z10;
        return this;
    }

    @Override // r1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d c(int i10) {
        this.f63749d = i10;
        return this;
    }

    @Override // r1.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public d a(s.a aVar) {
        this.f63747b = aVar;
        return this;
    }

    public d(int i10, boolean z10) {
        this.f63746a = i10;
        this.f63750e = z10;
        this.f63747b = new C4166h();
    }
}
