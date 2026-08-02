package defpackage;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rd9 implements lic {
    public final String a;
    public final String b;
    public final List c;

    public rd9(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rd9.class == obj.getClass()) {
            rd9 rd9Var = (rd9) obj;
            if (TextUtils.equals(this.a, rd9Var.a) && TextUtils.equals(this.b, rd9Var.b) && this.c.equals(rd9Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? mz1.o(wt3.q(" [", str, ", "), this.b, U3.j.e) : "");
    }
}
