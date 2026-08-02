package com.google.android.gms.internal.ads;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgvk extends zzhaa {
    public Object a;
    public int b = 2;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzguk.f(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            this.a = a();
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        this.b = 2;
        Object obj = this.a;
        this.a = null;
        return obj;
    }
}
