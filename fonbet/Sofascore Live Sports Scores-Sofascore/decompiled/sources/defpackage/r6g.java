package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r6g implements hni, gni {
    public static final TreeMap i = new TreeMap();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    public r6g(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    public static final r6g e(int i2, String str) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                r6g r6gVar = (r6g) ceilingEntry.getValue();
                r6gVar.b = str;
                r6gVar.h = i2;
                return r6gVar;
            }
            Unit unit = Unit.a;
            r6g r6gVar2 = new r6g(i2);
            r6gVar2.b = str;
            r6gVar2.h = i2;
            return r6gVar2;
        }
    }

    @Override // defpackage.gni
    public final void J0(double d, int i2) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // defpackage.hni
    public final String h() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        a70.r("Required value was null.");
        return null;
    }

    @Override // defpackage.hni
    public final void i(gni gniVar) {
        int i2 = this.h;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.g[i3];
            if (i4 == 1) {
                gniVar.s(i3);
            } else if (i4 == 2) {
                gniVar.q(i3, this.c[i3]);
            } else if (i4 == 3) {
                gniVar.J0(this.d[i3], i3);
            } else if (i4 == 4) {
                String str = this.e[i3];
                if (str == null) {
                    a70.p("Required value was null.");
                    return;
                }
                gniVar.m0(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.f[i3];
                if (bArr == null) {
                    a70.p("Required value was null.");
                    return;
                }
                gniVar.r(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // defpackage.gni
    public final void m0(int i2, String str) {
        str.getClass();
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    @Override // defpackage.gni
    public final void q(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    @Override // defpackage.gni
    public final void r(int i2, byte[] bArr) {
        bArr.getClass();
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.gni
    public final void s(int i2) {
        this.g[i2] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
