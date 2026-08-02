package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dm {
    public final Integer a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final int e;
    public final int f;

    public dm(Integer num, String str, String str2, Boolean bool, int i, int i2) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return Intrinsics.c(this.a, dmVar.a) && Intrinsics.c(this.b, dmVar.b) && Intrinsics.c(this.c, dmVar.c) && Intrinsics.c(this.d, dmVar.d) && this.e == dmVar.e && this.f == dmVar.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return Integer.hashCode(this.f) + wv8.a(this.e, (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = wv8.m("AiInsightsHalftimePredictionsWrapper(playerId=", this.a, ", playerName=", this.b, ", teamName=");
        m.append(this.c);
        m.append(", secondHalfOverOneAndAHalfGoals=");
        m.append(this.d);
        m.append(", homeNormaltimeScore=");
        return me4.i(m, this.e, ", awayNormaltimeScore=", this.f, ")");
    }
}
