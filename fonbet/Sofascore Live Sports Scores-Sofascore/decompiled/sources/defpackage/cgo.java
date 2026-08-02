package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgst;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cgo extends zzgst {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public /* synthetic */ cgo(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final IBinder a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final float d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgst)) {
            return false;
        }
        zzgst zzgstVar = (zzgst) obj;
        if (!this.a.equals(zzgstVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzgstVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzgstVar.b())) {
            return false;
        }
        if (this.c != zzgstVar.c() || Float.floatToIntBits(this.d) != Float.floatToIntBits(zzgstVar.d()) || this.e != zzgstVar.e()) {
            return false;
        }
        String str2 = this.f;
        return str2 == null ? zzgstVar.f() == null : str2.equals(zzgstVar.f());
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        String str2 = this.f;
        return (((this.e ^ (hashCode2 * (-429739981))) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        float f = this.d;
        int length4 = String.valueOf(f).length();
        int i2 = this.e;
        int length5 = String.valueOf(i2).length();
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        bf3.v(sb, "OverlayDisplayShowRequest{windowToken=", obj, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f);
        fn0.s(i2, ", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=", ", deeplinkUrl=null, adFieldEnifd=", str2, sb);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
