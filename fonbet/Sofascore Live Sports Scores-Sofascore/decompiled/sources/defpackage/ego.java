package defpackage;

import com.google.android.gms.internal.ads.zzgsv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ego extends zzgsv {
    public final int a;
    public final String b;
    public final int c;
    public final Boolean d;

    public /* synthetic */ ego(int i, String str, int i2, Boolean bool) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsv)) {
            return false;
        }
        zzgsv zzgsvVar = (zzgsv) obj;
        if (this.a != zzgsvVar.a()) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzgsvVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzgsvVar.b())) {
            return false;
        }
        if (this.c != zzgsvVar.c()) {
            return false;
        }
        Boolean bool = this.d;
        return bool == null ? zzgsvVar.d() == null : bool.equals(zzgsvVar.d());
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.d;
        return ((this.c ^ ((hashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i2 = this.c;
        int length3 = String.valueOf(i2).length();
        Boolean bool = this.d;
        StringBuilder sb = new StringBuilder(fn0.b(length, 46, length2, 9, length3, 17, String.valueOf(bool).length()) + 1);
        fn0.s(i, "OverlayDisplayState{statusCode=", ", sessionToken=", str, sb);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
