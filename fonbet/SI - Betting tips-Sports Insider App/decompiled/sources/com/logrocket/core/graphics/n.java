package com.logrocket.core.graphics;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.c1;
import com.google.firebase.messaging.x;
import com.logrocket.core.LogRocketCore;
import com.logrocket.protobuf.p;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f6567a;

    /* renamed from: b, reason: collision with root package name */
    public p f6568b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f6569c;

    /* renamed from: d, reason: collision with root package name */
    public p f6570d;

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f6571e;

    /* renamed from: f, reason: collision with root package name */
    public p f6572f;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6574h;

    /* renamed from: p, reason: collision with root package name */
    public x f6581p;

    /* renamed from: g, reason: collision with root package name */
    public int f6573g = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6575i = false;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6576k = false;

    /* renamed from: l, reason: collision with root package name */
    public final ba.d f6577l = new ba.d("view-binary-encoder");

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f6578m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f6579n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f6580o = new HashSet();

    public n(int i5, boolean z5) {
        this.f6574h = z5;
        ByteBuffer allocate = ByteBuffer.allocate(Math.min(39, 39));
        this.f6567a = allocate;
        this.f6568b = p.u(allocate);
        ByteBuffer allocate2 = ByteBuffer.allocate(Math.min(i5, 512000));
        this.f6569c = allocate2;
        this.f6570d = p.u(allocate2);
        ByteBuffer allocate3 = ByteBuffer.allocate(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        this.f6571e = allocate3;
        this.f6572f = p.u(allocate3);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f6571e;
        if (this.f6575i) {
            return;
        }
        try {
            try {
                try {
                    this.f6572f.r();
                    this.f6570d.K(1, 2);
                    this.f6570d.M(this.f6572f.s());
                    for (int i5 = 0; i5 < byteBuffer.position(); i5++) {
                        this.f6570d.v(byteBuffer.get(i5));
                    }
                    this.f6570d.r();
                } catch (com.logrocket.protobuf.m e7) {
                    this.j = true;
                    if (!this.f6576k) {
                        this.f6576k = true;
                        com.logrocket.core.p.a("Out of memory while encoding canvas operations");
                    }
                    d("Out of memory while encoding canvas operations", e7, true);
                }
            } catch (IOException e9) {
                this.f6575i = true;
                d("Error while writing operation to stream", e9, false);
                ByteBuffer byteBuffer2 = this.f6569c;
                byteBuffer2.clear();
                this.f6570d = p.u(byteBuffer2);
            }
            byteBuffer.clear();
            this.f6572f = p.u(byteBuffer);
        } catch (Throwable th2) {
            byteBuffer.clear();
            this.f6572f = p.u(byteBuffer);
            throw th2;
        }
    }

    public final void b(int i5, o oVar, int i10, int i11, int i12, int i13) {
        c1.s(33, this, c.type);
        e(c.viewId, Integer.valueOf(i5));
        if (oVar != null) {
            e(c.text, oVar.b());
        }
        e(c.compositeWidth, Integer.valueOf(i12));
        e(c.compositeHeight, Integer.valueOf(i13));
        e(c.left, Integer.valueOf(i10));
        e(c.top, Integer.valueOf(i11));
        a();
    }

    public final void c(String str, int i5, int i10, View view, Paint paint, int i11) {
        Set set;
        if (this.f6575i || this.j) {
            return;
        }
        Throwable th2 = t9.b.f23756a;
        if (view.getClass().equals(t9.b.f23757b)) {
            this.f6580o.add(str);
        } else {
            this.f6579n.put(Integer.valueOf(System.identityHashCode(view)), str);
        }
        if (i11 == 48) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        e(c.type, Integer.valueOf(r4.k.h(i11)));
        e(c.text, str);
        e(c.x0, Integer.valueOf(i5));
        e(c.y0, Integer.valueOf(i10));
        k2.x.l(this, view, paint);
        x xVar = this.f6581p;
        Map map = (Map) xVar.f6182a;
        if ((view instanceof TextView) && map != null) {
            Typeface typeface = paint.getTypeface();
            ba.d dVar = (ba.d) xVar.f6185d;
            HashMap hashMap = (HashMap) xVar.f6184c;
            ArrayList arrayList = new ArrayList();
            int hashCode = typeface.hashCode();
            Set set2 = (Set) map.get(Integer.valueOf(hashCode));
            if (set2 != null) {
                arrayList.addAll(set2);
            }
            String str2 = (String) hashMap.get(Integer.valueOf(hashCode));
            if (str2 != null) {
                arrayList.add(str2);
            } else {
                kh.g gVar = (kh.g) xVar.f6183b;
                Map map2 = (Map) gVar.f19116c;
                String str3 = null;
                if (map2 != null && ((Field) gVar.f19117d) != null) {
                    try {
                        Iterator it = map2.entrySet().iterator();
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            String str4 = (String) entry.getKey();
                            SparseArray sparseArray = (SparseArray) ((Field) gVar.f19117d).get(entry.getValue());
                            if (sparseArray != null) {
                                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                                    Typeface typeface2 = (Typeface) sparseArray.get(i12);
                                    if (typeface2 != null && typeface2.hashCode() == hashCode) {
                                        str3 = str4;
                                        break loop0;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        ((ba.d) gVar.f19115b).e("Failed to detect React Native asset fonts", th3);
                        gVar.f19116c = null;
                        gVar.f19117d = null;
                    }
                }
                if (str3 != null) {
                    dVar.h("Found font ".concat(str3));
                    if (com.logrocket.core.e.f6419e == null) {
                        com.logrocket.core.e.f6419e = new com.logrocket.core.e();
                    }
                    Map map3 = (Map) com.logrocket.core.e.f6419e.f6423d;
                    if (map3 != null && map3.containsKey(str3) && (set = (Set) map3.get(str3)) != null && !set.isEmpty()) {
                        str3 = (String) set.iterator().next();
                        dVar.h("Remapping font name to " + str3);
                    }
                    hashMap.put(Integer.valueOf(hashCode), str3);
                    arrayList.add(str3);
                }
            }
            if (!arrayList.isEmpty()) {
                e(c.fontFamilies, arrayList);
            }
        }
        a();
    }

    public final void d(String str, IOException iOException, boolean z5) {
        if (z5) {
            LogRocketCore.l(str, iOException);
        }
        this.f6577l.e(str, iOException);
    }

    public final void e(c cVar, Object obj) {
        ByteBuffer byteBuffer = this.f6571e;
        if (this.f6575i) {
            return;
        }
        try {
            int i5 = cVar.f6520a;
            switch (m.f6566a[v.f.d(cVar.f6521b)]) {
                case 1:
                    if (((Boolean) obj).booleanValue()) {
                        this.f6572f.w(i5, ((Boolean) obj).booleanValue());
                        break;
                    }
                    break;
                case 2:
                    this.f6572f.E(i5, ((Integer) obj).intValue());
                    break;
                case 3:
                    p pVar = this.f6572f;
                    float floatValue = ((Float) obj).floatValue();
                    pVar.getClass();
                    pVar.A(i5, Float.floatToRawIntBits(floatValue));
                    break;
                case 4:
                    p pVar2 = this.f6572f;
                    int intValue = ((Integer) obj).intValue();
                    pVar2.L(i5, (intValue >> 31) ^ (intValue << 1));
                    break;
                case 5:
                    this.f6572f.I(i5, (String) obj);
                    break;
                case 6:
                    this.f6572f.L(i5, ((Integer) obj).intValue());
                    break;
                case 7:
                    this.f6572f.K(i5, 2);
                    this.f6572f.M(((float[]) obj).length * 4);
                    for (float f6 : (float[]) obj) {
                        p pVar3 = this.f6572f;
                        pVar3.getClass();
                        pVar3.B(Float.floatToRawIntBits(f6));
                    }
                    break;
                case 8:
                    int i10 = 0;
                    for (int i11 : (int[]) obj) {
                        i10 += p.m(i11);
                    }
                    this.f6572f.K(i5, 2);
                    this.f6572f.M(i10);
                    for (int i12 : (int[]) obj) {
                        this.f6572f.M((i12 >> 31) ^ (i12 << 1));
                    }
                    break;
                case 9:
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        this.f6572f.I(i5, (String) it.next());
                    }
                    break;
            }
        } catch (com.logrocket.protobuf.m e7) {
            this.f6575i = true;
            d("Out of memory while encoding operation field", e7, true);
            byteBuffer.clear();
            this.f6572f = p.u(byteBuffer);
        } catch (IOException e9) {
            this.f6575i = true;
            d("Error while encoding operation field", e9, false);
            byteBuffer.clear();
            this.f6572f = p.u(byteBuffer);
        }
    }

    public final void f(int i5) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(4, this, c.type);
        e(c.viewId, Integer.valueOf(i5));
        a();
    }

    public final void g(int i5, int i10, int i11, int i12) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(1, this, c.type);
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        a();
    }

    public final void h(int i5, int i10, int i11, int i12) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(3, this, c.type);
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        a();
    }

    public final void i(int i5, int i10, int i11, int i12, int i13, View view, Paint paint) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(8, this, c.type);
        e(c.bitmapId, Integer.valueOf(i13));
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        k2.x.l(this, view, paint);
        a();
    }

    public final void j(int i5) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(11, this, c.type);
        e(c.color, Integer.valueOf(i5));
        a();
    }

    public final void k(View view, int i5, int i10) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(11, this, c.type);
        e(c.color, Integer.valueOf(i5));
        e(c.compositeType, Integer.valueOf(i10));
        if (view != null) {
            e(c.right, Integer.valueOf(view.getWidth()));
            e(c.bottom, Integer.valueOf(view.getHeight()));
        }
        a();
    }

    public final void l(int i5, int i10, int i11, int i12, int i13, View view, Paint paint) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(17, this, c.type);
        e(c.bitmapId, Integer.valueOf(i13));
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        k2.x.l(this, view, paint);
        a();
    }

    public final void m(int i5, int i10, int i11, int i12, int i13, View view, Paint paint, int i14, int i15, int i16, int i17) {
        e(c.x0, Integer.valueOf(i14));
        e(c.x1, Integer.valueOf(i15));
        e(c.y0, Integer.valueOf(i16));
        e(c.y1, Integer.valueOf(i17));
        l(i5, i10, i11, i12, i13, view, paint);
    }

    public final void n(int i5, int i10, int i11, int i12, View view, Paint paint) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(24, this, c.type);
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        k2.x.l(this, view, paint);
        a();
    }

    public final void o(int i5, int i10, int i11, int i12, int i13, int i14, View view, Paint paint) {
        if (this.f6575i || this.j) {
            return;
        }
        c1.s(26, this, c.type);
        e(c.left, Integer.valueOf(i5));
        e(c.top, Integer.valueOf(i10));
        e(c.right, Integer.valueOf(i11));
        e(c.bottom, Integer.valueOf(i12));
        e(c.x0, Integer.valueOf(i13));
        e(c.y0, Integer.valueOf(i14));
        k2.x.l(this, view, paint);
        a();
    }

    public final com.logrocket.protobuf.j p(int i5, int i10, double d10) {
        int i11;
        int i12;
        ByteBuffer byteBuffer = this.f6567a;
        com.logrocket.protobuf.j jVar = com.logrocket.protobuf.j.f6736b;
        if (!this.f6575i) {
            int i13 = 0;
            try {
                this.f6568b.L(2, i5);
                this.f6568b.L(3, i10);
                p pVar = this.f6568b;
                pVar.getClass();
                pVar.C(4, Double.doubleToRawLongBits(d10));
                this.f6568b.w(5, this.j);
                this.f6568b.r();
            } catch (com.logrocket.protobuf.m e7) {
                this.f6575i = true;
                d("Out of memory while encoding flat view capture numeric fields", e7, true);
                byteBuffer.clear();
                this.f6568b = p.u(byteBuffer);
            } catch (IOException e9) {
                this.f6575i = true;
                d("Error while encoding flat view capture numeric fields", e9, false);
                byteBuffer.clear();
                this.f6568b = p.u(byteBuffer);
            }
            if (!this.f6575i) {
                byteBuffer.flip();
                ByteBuffer byteBuffer2 = this.f6569c;
                byteBuffer2.flip();
                int remaining = byteBuffer2.remaining();
                com.logrocket.protobuf.j.d(0, remaining, byteBuffer2.remaining());
                byte[] bArr = new byte[remaining];
                byteBuffer2.get(bArr);
                com.logrocket.protobuf.i iVar = new com.logrocket.protobuf.i(bArr);
                int i14 = this.f6573g;
                boolean z5 = this.f6574h;
                if (z5) {
                    i11 = (((iVar.hashCode() * 31) + i5) * 31) + i10;
                    this.f6573g = i11;
                } else {
                    i11 = -1;
                }
                if (!z5 || i11 != i14) {
                    int remaining2 = byteBuffer.remaining();
                    com.logrocket.protobuf.j.d(0, remaining2, byteBuffer.remaining());
                    byte[] bArr2 = new byte[remaining2];
                    byteBuffer.get(bArr2);
                    List asList = Arrays.asList(new com.logrocket.protobuf.i(bArr2), iVar);
                    if (asList != null) {
                        i12 = asList.size();
                    } else {
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            it.next();
                            i13++;
                        }
                        i12 = i13;
                    }
                    jVar = i12 == 0 ? com.logrocket.protobuf.j.f6736b : com.logrocket.protobuf.j.a(asList.iterator(), i12);
                }
                byteBuffer2.clear();
                this.f6570d = p.u(byteBuffer2);
                byteBuffer.clear();
                this.f6568b = p.u(byteBuffer);
                return jVar;
            }
        }
        return jVar;
    }
}
