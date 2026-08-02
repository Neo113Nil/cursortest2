package defpackage;

import android.os.IBinder;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vxn {
    public final String a;
    public final String b;
    public final Map c;
    public final IBinder d;

    public vxn(String str, String str2, Map map, IBinder iBinder) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxn) {
            vxn vxnVar = (vxn) obj;
            if (this.a.equals(vxnVar.a) && this.b.equals(vxnVar.b) && this.c.equals(vxnVar.c)) {
                IBinder iBinder = vxnVar.d;
                IBinder iBinder2 = this.d;
                if (iBinder2 != null ? iBinder2.equals(iBinder) : iBinder == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        IBinder iBinder = this.d;
        return (iBinder == null ? 0 : iBinder.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.c.toString();
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.a);
        sb.append(", referrer=");
        bf3.v(sb, this.b, ", extraQueryParams=", obj, ", windowToken=");
        return mz1.o(sb, valueOf, "}");
    }
}
