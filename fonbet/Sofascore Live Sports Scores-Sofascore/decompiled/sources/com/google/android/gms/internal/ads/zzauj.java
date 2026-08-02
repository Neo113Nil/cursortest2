package com.google.android.gms.internal.ads;

import defpackage.v4n;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzauj {
    public static final v4n d = new v4n(13);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;

    public final synchronized byte[] a(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.c -= length;
                arrayList.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
            i2++;
        }
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.a.add(bArr);
                ArrayList arrayList = this.b;
                int binarySearch = Collections.binarySearch(arrayList, bArr, d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                arrayList.add(binarySearch, bArr);
                this.c += length;
                synchronized (this) {
                    while (this.c > 4096) {
                        byte[] bArr2 = (byte[]) this.a.remove(0);
                        this.b.remove(bArr2);
                        this.c -= bArr2.length;
                    }
                }
            }
        }
    }
}
