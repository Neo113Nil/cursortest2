package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class plb {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public zwh h;
    public nkb i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final tde a = new tde();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        ajb.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float c = vik.c();
        if (c != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap hashMap = this.d;
                String str = (String) entry.getKey();
                lmb lmbVar = (lmb) entry.getValue();
                float f = this.e / c;
                int i = (int) (lmbVar.a * f);
                int i2 = (int) (lmbVar.b * f);
                lmb lmbVar2 = new lmb(i, i2, lmbVar.c, lmbVar.d, lmbVar.e);
                Bitmap bitmap = lmbVar.f;
                if (bitmap != null) {
                    lmbVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                hashMap.put(str, lmbVar2);
            }
        }
        this.e = c;
        return this.d;
    }

    public final yub d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            yub yubVar = (yub) this.g.get(i);
            String str2 = yubVar.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return yubVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((mla) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
