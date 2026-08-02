package defpackage;

import androidx.media3.common.DrmInitData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xc9 implements Comparable {
    public final String a;
    public final wc9 b;
    public final long c;
    public final int d;
    public final long e;
    public final DrmInitData f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public xc9(String str, wc9 wc9Var, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = wc9Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = drmInitData;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.e;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
