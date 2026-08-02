package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.customui.UiConfigImpl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tkn {
    public final UiConfigImpl a;
    public final qrn b;
    public final String c;

    public tkn(UiConfigImpl uiConfigImpl, qrn qrnVar, String str) {
        this.a = uiConfigImpl;
        this.b = qrnVar;
        if (str != null) {
            this.c = str;
        } else {
            yhk.s("Null sessionId");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkn) {
            tkn tknVar = (tkn) obj;
            if (this.a.equals(tknVar.a) && this.b.equals(tknVar.b) && this.c.equals(tknVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        int length2 = length + 38 + obj2.length() + 12;
        String str = this.c;
        StringBuilder sb = new StringBuilder(mz1.d(length2, 1, str));
        bf3.v(sb, "CustomUiImpl{uiConfig=", obj, ", messageSender=", obj2);
        return wt3.m(", sessionId=", str, sb, "}");
    }
}
