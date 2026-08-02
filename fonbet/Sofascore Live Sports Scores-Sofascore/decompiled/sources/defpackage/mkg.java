package defpackage;

import android.webkit.URLUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mkg implements fkg {
    public final String a;
    public final String b;

    public mkg(String str, String str2) {
        hig higVar;
        hig[] values = hig.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                higVar = null;
                break;
            }
            higVar = values[i];
            higVar.getClass();
            if ("verificationNotExecuted".equalsIgnoreCase(str)) {
                break;
            } else {
                i++;
            }
        }
        if (!hig.a.contains(higVar)) {
            a70.p(lnb.o("The ", str, " AdVerificationEvent is not supported."));
            throw null;
        }
        if (str2.length() == 0 || !URLUtil.isValidUrl(str2)) {
            a70.p("The given URL is malformed or empty.");
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fkg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.fkg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fkg
    public final boolean d() {
        hig higVar;
        List list = hig.c;
        hig[] values = hig.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                higVar = null;
                break;
            }
            higVar = values[i];
            higVar.getClass();
            if ("verificationNotExecuted".equalsIgnoreCase(this.a)) {
                break;
            }
            i++;
        }
        return list.contains(higVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkg)) {
            return false;
        }
        mkg mkgVar = (mkg) obj;
        return this.a.equals(mkgVar.a) && this.b.equals(mkgVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
