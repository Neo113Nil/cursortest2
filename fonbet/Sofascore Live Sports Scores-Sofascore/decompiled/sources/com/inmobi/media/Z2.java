package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z2 {
    public final int a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public int f;
    public long g;
    public final long h;

    public /* synthetic */ Z2(String str, boolean z, boolean z2, int i, int i2) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public Z2(int i, String str, Map map, boolean z, boolean z2, int i2, long j, long j2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = map;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }
}
