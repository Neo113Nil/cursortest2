package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fn1 {
    public final int a;
    public final String b;

    public fn1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn1)) {
            return false;
        }
        fn1 fn1Var = (fn1) obj;
        return this.a == fn1Var.a && this.b.equals(fn1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "BaseballWeatherConditionsStat(iconRes=", ", weatherText=", this.b, ")");
    }
}
