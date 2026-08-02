package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tpg implements spg {
    public final Function1 a;
    public final x0d b;
    public x0d c;

    public tpg(Map map, Function1 function1) {
        x0d x0dVar;
        this.a = function1;
        if (map == null || map.isEmpty()) {
            x0dVar = null;
        } else {
            x0dVar = new x0d(map.size());
            for (Map.Entry entry : map.entrySet()) {
                x0dVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = x0dVar;
    }

    @Override // defpackage.spg
    public final rpg a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.b(str.charAt(i))) {
                x0d x0dVar = this.c;
                if (x0dVar == null) {
                    long[] jArr = qrg.a;
                    x0dVar = new x0d();
                    this.c = x0dVar;
                }
                Object g = x0dVar.g(str);
                if (g == null) {
                    g = new ArrayList();
                    x0dVar.m(str, g);
                }
                ((List) g).add(function0);
                return new x6k(18, x0dVar, str, function0);
            }
        }
        a70.p("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.spg
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // defpackage.spg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        x0d x0dVar;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        x0d x0dVar2 = this.b;
        if (x0dVar2 == null && this.c == null) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        int i3 = 0;
        int i4 = x0dVar2 != null ? x0dVar2.e : 0;
        x0d x0dVar3 = this.c;
        HashMap hashMap = new HashMap(i4 + (x0dVar3 != null ? x0dVar3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (x0dVar2 != null) {
            Object[] objArr = x0dVar2.b;
            Object[] objArr2 = x0dVar2.c;
            long[] jArr3 = x0dVar2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                x0dVar = this.c;
                if (x0dVar != null) {
                    Object[] objArr3 = x0dVar.b;
                    Object[] objArr4 = x0dVar.c;
                    long[] jArr4 = x0dVar.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!d(invoke)) {
                                                    hc5.f(o3a.s(invoke));
                                                    return null;
                                                }
                                                hashMap.put(str, b.e(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i3)).invoke();
                                                if (invoke2 != null && !d(invoke2)) {
                                                    hc5.f(o3a.s(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        x0dVar = this.c;
        if (x0dVar != null) {
        }
        return hashMap;
    }

    @Override // defpackage.spg
    public final Object f(String str) {
        x0d x0dVar = this.b;
        List list = x0dVar != null ? (List) x0dVar.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && x0dVar != null) {
            List subList = list.subList(1, list.size());
            int f = x0dVar.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = x0dVar.c;
            Object obj = objArr[f];
            x0dVar.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
