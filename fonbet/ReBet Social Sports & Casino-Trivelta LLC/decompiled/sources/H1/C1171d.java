package H1;

import b1.C2338G;
import e1.AbstractC4144k;
import f1.AbstractC4230h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: H1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171d {

    /* renamed from: a, reason: collision with root package name */
    public final List f4399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4402d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4403e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4404f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4406h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4407i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4408j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4409k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4410l;

    public C1171d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f4399a = list;
        this.f4400b = i10;
        this.f4401c = i11;
        this.f4402d = i12;
        this.f4403e = i13;
        this.f4404f = i14;
        this.f4405g = i15;
        this.f4406h = i16;
        this.f4407i = i17;
        this.f4408j = i18;
        this.f4409k = f10;
        this.f4410l = str;
    }

    public static byte[] a(e1.J j10) {
        int U10 = j10.U();
        int g10 = j10.g();
        j10.c0(U10);
        return AbstractC4144k.l(j10.f(), g10, U10);
    }

    public static C1171d b(e1.J j10) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            j10.c0(4);
            int M10 = (j10.M() & 3) + 1;
            if (M10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int M11 = j10.M() & 31;
            for (int i18 = 0; i18 < M11; i18++) {
                arrayList.add(a(j10));
            }
            int M12 = j10.M();
            for (int i19 = 0; i19 < M12; i19++) {
                arrayList.add(a(j10));
            }
            if (M11 > 0) {
                AbstractC4230h.m C10 = AbstractC4230h.C((byte[]) arrayList.get(0), AbstractC4230h.NAL_START_CODE.length, ((byte[]) arrayList.get(0)).length);
                int i20 = C10.f46245f;
                int i21 = C10.f46246g;
                int i22 = C10.f46248i + 8;
                int i23 = C10.f46249j + 8;
                int i24 = C10.f46256q;
                int i25 = C10.f46257r;
                int i26 = C10.f46258s;
                int i27 = C10.f46259t;
                float f11 = C10.f46247h;
                str = AbstractC4144k.f(C10.f46240a, C10.f46241b, C10.f46242c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C1171d(arrayList, M10, i10, i11, i12, i13, i16, i17, i14, i15, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C2338G.a("Error parsing AVC config", e10);
        }
    }
}
