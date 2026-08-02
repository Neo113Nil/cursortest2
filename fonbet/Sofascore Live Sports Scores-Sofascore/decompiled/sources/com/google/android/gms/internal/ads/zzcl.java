package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import defpackage.fn0;
import defpackage.me4;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcl {
    public static final zzcl e = new zzcl(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zzcl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zzfm.d(i3) ? zzfm.f(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.a == zzclVar.a && this.b == zzclVar.b && this.c == zzclVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 38, length2, 11, String.valueOf(i3).length()) + 1);
        me4.r(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i2);
        return fn0.k(i3, ", encoding=", U3.j.e, sb);
    }
}
