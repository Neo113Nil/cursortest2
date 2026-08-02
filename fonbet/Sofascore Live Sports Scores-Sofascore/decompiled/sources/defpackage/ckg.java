package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ckg {
    public String a;
    public String b;
    public bkg c;
    public int d;
    public String e;
    public List f;
    public URL g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckg)) {
            return false;
        }
        ckg ckgVar = (ckg) obj;
        if (this.d != ckgVar.d) {
            return false;
        }
        String str = this.a;
        String str2 = ckgVar.a;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        String str3 = this.b;
        String str4 = ckgVar.b;
        if (str3 != null) {
            if (!str3.equals(str4)) {
                return false;
            }
        } else if (str4 != null) {
            return false;
        }
        if (this.c != ckgVar.c || !this.e.equals(ckgVar.e)) {
            return false;
        }
        List list = this.f;
        List list2 = ckgVar.f;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, "displaysdk", this.c, Integer.valueOf(this.d), this.e, this.f});
    }
}
