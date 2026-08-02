package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class txk implements lic {
    public final String a;
    public final String b;

    public txk(String str, String str2) {
        this.a = rz8.X(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && txk.class == obj.getClass()) {
            txk txkVar = (txk) obj;
            if (this.a.equals(txkVar.a) && this.b.equals(txkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + U3.j.b + this.b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.lic
    public final void u(o6c o6cVar) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer Q = jaa.Q(str2);
                if (Q != null) {
                    o6cVar.k = Q;
                    break;
                }
                break;
            case 1:
                Integer Q2 = jaa.Q(str2);
                if (Q2 != null) {
                    o6cVar.x = Q2;
                    break;
                }
                break;
            case 2:
                Integer Q3 = jaa.Q(str2);
                if (Q3 != null) {
                    o6cVar.j = Q3;
                    break;
                }
                break;
            case 3:
                o6cVar.c = str2;
                break;
            case 4:
                o6cVar.y = str2;
                break;
            case 5:
                o6cVar.a = str2;
                break;
            case 6:
                o6cVar.f = str2;
                break;
            case 7:
                Integer Q4 = jaa.Q(str2);
                if (Q4 != null) {
                    o6cVar.w = Q4;
                    break;
                }
                break;
            case '\b':
                o6cVar.d = str2;
                break;
            case '\t':
                o6cVar.b = str2;
                break;
        }
    }
}
