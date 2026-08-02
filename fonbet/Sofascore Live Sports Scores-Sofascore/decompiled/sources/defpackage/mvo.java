package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mvo {
    public final Context a;
    public final tmi b;

    public mvo(Context context, tmi tmiVar) {
        this.a = context;
        this.b = tmiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mvo)) {
            return false;
        }
        mvo mvoVar = (mvo) obj;
        if (!this.a.equals(mvoVar.a)) {
            return false;
        }
        tmi tmiVar = mvoVar.b;
        tmi tmiVar2 = this.b;
        return tmiVar2 == null ? tmiVar == null : tmiVar2.equals(tmiVar);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        tmi tmiVar = this.b;
        return (tmiVar == null ? 0 : tmiVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        bf3.v(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
