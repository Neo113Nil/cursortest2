package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzart {
    public final int a;
    public final List b;
    public final byte[] c;

    public zzart(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.a = i2;
        this.b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.c = bArr;
    }

    public final int a() {
        int i = this.a;
        return i != 2 ? i != 3 ? 0 : 512 : com.ironsource.mediationsdk.metadata.a.o;
    }
}
