package defpackage;

import com.google.android.gms.internal.ads.zzebp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s2o extends zzebp {
    public final long a;
    public final int b;

    public /* synthetic */ s2o(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzebp)) {
            return false;
        }
        zzebp zzebpVar = (zzebp) obj;
        return this.a == zzebpVar.a() && this.b == zzebpVar.b();
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        fn0.t(j, "OnDeviceStorageKey{id=", ", eventType=", sb);
        return fc6.h(i, "}", sb);
    }
}
