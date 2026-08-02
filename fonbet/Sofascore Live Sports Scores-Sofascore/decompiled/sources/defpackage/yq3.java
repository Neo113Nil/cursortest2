package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yq3 {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public yq3(Integer num, String str, Integer num2, Integer num3) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq3)) {
            return false;
        }
        yq3 yq3Var = (yq3) obj;
        return Intrinsics.c(this.a, yq3Var.a) && Intrinsics.c(this.b, yq3Var.b) && Intrinsics.c(this.c, yq3Var.c) && Intrinsics.c(this.d, yq3Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return fc6.l(this.c, this.d, ", addedTime=", ")", wv8.m("CardedPlayerWrapper(playerId=", this.a, ", playerName=", this.b, ", time="));
    }
}
