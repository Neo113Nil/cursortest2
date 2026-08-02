package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ald {
    public final int a;
    public final Integer b;
    public final int c;

    public ald(int i, int i2, Integer num) {
        this.a = i;
        this.b = num;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ald)) {
            return false;
        }
        ald aldVar = (ald) obj;
        return this.a == aldVar.a && Intrinsics.c(this.b, aldVar.b) && this.c == aldVar.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return mz1.o(fc6.r("OddsAdditionalRegulationConfig(textResId=", ", iconRes=", ", textAlign=", this.b, this.a), p7j.a(this.c), ")");
    }
}
