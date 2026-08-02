package defpackage;

import androidx.media3.common.b;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dwd dwdVar;
        dwd d;
        int i = this.a;
        u63 u63Var = w63.a;
        switch (i) {
            case 0:
                e6a e6aVar = (e6a) obj;
                e6a e6aVar2 = (e6a) obj2;
                if (!cw3.a.contains(b0.class)) {
                    try {
                        e6aVar2.getClass();
                        Long l = e6aVar.g;
                        if (l == null) {
                            return -1;
                        }
                        long longValue = l.longValue();
                        Long l2 = e6aVar2.g;
                        if (l2 != null) {
                            return Intrinsics.e(l2.longValue(), longValue);
                        }
                        return 1;
                    } catch (Throwable th) {
                        cw3.a(b0.class, th);
                    }
                }
                return 0;
            case 1:
                return Intrinsics.d(((n7f) obj2).a, ((n7f) obj).a);
            case 2:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 3:
                return ((sm8) obj2).h - ((sm8) obj).h;
            case 4:
                return ((b) obj2).j - ((b) obj).j;
            case 5:
                o71 o71Var = (o71) obj;
                o71 o71Var2 = (o71) obj2;
                int compare = Integer.compare(o71Var.c, o71Var2.c);
                return compare != 0 ? compare : o71Var.b.compareTo(o71Var2.b);
            case 6:
                return Integer.compare(((jm2) obj2).b, ((jm2) obj).b);
            case 7:
                return Integer.compare(((km2) obj2).b, ((km2) obj).b);
            case 8:
                return (((uv3) obj).c ? 0 : r7).compareTo(((uv3) obj2).c ? 0 : 1);
            case 9:
                e6a e6aVar3 = (e6a) obj2;
                e6aVar3.getClass();
                Long l3 = ((e6a) obj).g;
                if (l3 == null) {
                    return -1;
                }
                long longValue2 = l3.longValue();
                Long l4 = e6aVar3.g;
                if (l4 != null) {
                    return Intrinsics.e(l4.longValue(), longValue2);
                }
                return 1;
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 11:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 12:
                String name = ((File) obj).getName();
                int i2 = vx3.f;
                return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
            case 13:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 14:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case 15:
                return 0;
            case 16:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i3 = 23;
                int i4 = 25;
                return u63.f(fu4.c((fu4) Collections.max(list, new z(i3)), (fu4) Collections.max(list2, new z(i3)))).a(list.size(), list2.size()).b((fu4) Collections.max(list, new z(i4)), (fu4) Collections.max(list2, new z(i4)), new z(i4)).e();
            case 17:
                return Integer.compare(((qt4) ((List) obj).get(0)).f, ((qt4) ((List) obj2).get(0)).f);
            case 18:
                return ((ot4) Collections.max((List) obj)).compareTo((ot4) Collections.max((List) obj2));
            case 19:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                int i5 = 24;
                int i6 = 26;
                return u63.f(gu4.c((gu4) Collections.max(list3, new z(i5)), (gu4) Collections.max(list4, new z(i5)))).a(list3.size(), list4.size()).b((gu4) Collections.max(list3, new z(i6)), (gu4) Collections.max(list4, new z(i6)), new z(i6)).e();
            case 20:
                return ((zt4) ((List) obj).get(0)).compareTo((zt4) ((List) obj2).get(0));
            case 21:
                return ((pt4) Collections.max((List) obj)).compareTo((pt4) Collections.max((List) obj2));
            case 22:
                return ((au4) ((List) obj).get(0)).compareTo((au4) ((List) obj2).get(0));
            case 23:
                return fu4.c((fu4) obj, (fu4) obj2);
            case 24:
                return gu4.c((gu4) obj, (gu4) obj2);
            case 25:
                fu4 fu4Var = (fu4) obj;
                fu4 fu4Var2 = (fu4) obj2;
                boolean z = fu4Var.e;
                int i7 = fu4Var.i;
                if (z && fu4Var.h) {
                    d = hu4.j;
                    dwdVar = d;
                } else {
                    dwd dwdVar2 = hu4.j;
                    dwdVar = dwdVar2;
                    d = dwdVar2.d();
                }
                return u63Var.b(Integer.valueOf(i7), Integer.valueOf(fu4Var2.i), fu4Var.f.w ? dwdVar.d() : hu4.k).b(Integer.valueOf(fu4Var.j), Integer.valueOf(fu4Var2.j), d).b(Integer.valueOf(i7), Integer.valueOf(fu4Var2.i), d).e();
            case 26:
                gu4 gu4Var = (gu4) obj;
                gu4 gu4Var2 = (gu4) obj2;
                boolean z2 = gu4Var.e;
                int i8 = gu4Var.j;
                dwd d2 = (z2 && gu4Var.h) ? iu4.k : iu4.k.d();
                gu4Var.f.getClass();
                w63 b = u63Var.c(gu4Var.y, gu4Var2.y).b(Integer.valueOf(gu4Var.k), Integer.valueOf(gu4Var2.k), d2);
                if (gu4Var.u && gu4Var.w) {
                    b = b.a(gu4Var.x, gu4Var2.x);
                }
                return b.c(gu4Var.v, gu4Var2.v).b(Integer.valueOf(i8), Integer.valueOf(gu4Var2.j), d2).e();
            case 27:
                cq5 cq5Var = (cq5) obj;
                cq5 cq5Var2 = (cq5) obj2;
                cq5Var2.getClass();
                cq5Var.getClass();
                Long l5 = cq5Var.c;
                if (l5 == null) {
                    return -1;
                }
                long longValue3 = l5.longValue();
                Long l6 = cq5Var2.c;
                if (l6 != null) {
                    return Intrinsics.e(l6.longValue(), longValue3);
                }
                return 1;
            case 28:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    byte b2 = bArr[i9];
                    byte b3 = bArr2[i9];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            default:
                return Intrinsics.d(((qaa) obj).b, ((qaa) obj2).b);
        }
    }
}
