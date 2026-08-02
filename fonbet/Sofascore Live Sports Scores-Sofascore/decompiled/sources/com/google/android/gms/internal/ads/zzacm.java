package com.google.android.gms.internal.ads;

import defpackage.o8n;
import defpackage.v4n;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzacm {
    public int d;
    public int e;
    public int f;
    public final o8n[] b = new o8n[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f, int i) {
        o8n o8nVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, v4n.j);
            this.c = 1;
        }
        int i3 = this.f;
        o8n[] o8nVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            o8nVar = o8nVarArr[i4];
        } else {
            o8nVar = new o8n();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        o8nVar.a = i5;
        o8nVar.b = i;
        o8nVar.c = f;
        arrayList.add(o8nVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            o8n o8nVar2 = (o8n) arrayList.get(0);
            int i8 = o8nVar2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    o8nVarArr[i9] = o8nVar2;
                }
            } else {
                o8nVar2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, v4n.i);
            this.c = 0;
        }
        float f = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float f2 = 0.5f * f;
            o8n o8nVar = (o8n) arrayList.get(i3);
            i2 += o8nVar.b;
            if (i2 >= f2) {
                return o8nVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((o8n) arrayList.get(arrayList.size() - 1)).c;
    }
}
