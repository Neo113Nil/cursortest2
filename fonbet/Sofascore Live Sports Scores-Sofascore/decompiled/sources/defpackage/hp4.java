package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hp4 implements ql6 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final fp4 f = new fp4(new ym4(29));
    public static final fp4 g = new fp4(new cp4(1));
    public vvf a;
    public zic b = new zic(21);
    public int c;
    public int d;

    public final void a(ArrayList arrayList, int i) {
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new e9());
                break;
            case 1:
                arrayList.add(new i9());
                break;
            case 2:
                arrayList.add(new il(0));
                break;
            case 3:
                arrayList.add(new bu());
                break;
            case 4:
                ll6 D = f.D(0);
                if (D == null) {
                    arrayList.add(new a78());
                    break;
                } else {
                    arrayList.add(D);
                    break;
                }
            case 5:
                arrayList.add(new jd8());
                break;
            case 6:
                arrayList.add(new d0c(this.b, 0));
                break;
            case 7:
                arrayList.add(new wwc(0));
                break;
            case 8:
                zic zicVar = this.b;
                int f2 = er8.f(3);
                av9 av9Var = hv9.b;
                arrayList.add(new er8(zicVar, f2, null, vvf.e, null));
                arrayList.add(new gxc(this.b, 160));
                break;
            case 9:
                arrayList.add(new tnd());
                break;
            case 10:
                arrayList.add(new rgf());
                break;
            case 11:
                if (this.a == null) {
                    av9 av9Var2 = hv9.b;
                    this.a = vvf.e;
                }
                arrayList.add(new z1k(1, 0, this.b, new djj(0L), new mu4(i2, this.a)));
                break;
            case 12:
                arrayList.add(new yzk());
                break;
            case 14:
                arrayList.add(new xy1(this.c));
                break;
            case 15:
                ll6 D2 = g.D(new Object[0]);
                if (D2 != null) {
                    arrayList.add(D2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new dw0(0, this.b));
                break;
            case 17:
                arrayList.add(new xy1((byte) 0, 1));
                break;
            case 18:
                arrayList.add(new iw0(1));
                break;
            case 19:
                arrayList.add(new xy1((byte) 0, 0));
                break;
            case 20:
                arrayList.add(new m99(this.d));
                break;
            case 21:
                arrayList.add(new iw0(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // defpackage.ql6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ll6[] c(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int F;
        int G;
        int i;
        try {
            int[] iArr = e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                F = o1j.F(str);
                if (F != -1) {
                    a(arrayList, F);
                }
                G = o1j.G(uri);
                if (G != -1 && G != F) {
                    a(arrayList, G);
                }
                for (i = 0; i < 21; i++) {
                    int i2 = iArr[i];
                    if (i2 != F && i2 != G) {
                        a(arrayList, i2);
                    }
                }
            }
            str = null;
            F = o1j.F(str);
            if (F != -1) {
            }
            G = o1j.G(uri);
            if (G != -1) {
                a(arrayList, G);
            }
            while (i < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ll6[]) arrayList.toArray(new ll6[0]);
    }

    @Override // defpackage.ql6
    public final synchronized ll6[] createExtractors() {
        return c(Uri.EMPTY, new HashMap());
    }
}
