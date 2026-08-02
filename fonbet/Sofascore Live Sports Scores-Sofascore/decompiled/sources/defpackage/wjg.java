package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wjg {
    public final String a;
    public final bkg b;
    public final LinkedHashMap c;

    public wjg(String str, bkg bkgVar, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = bkgVar;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjg)) {
            return false;
        }
        wjg wjgVar = (wjg) obj;
        return Intrinsics.c(this.a, wjgVar.a) && this.b == wjgVar.b && this.c.equals(wjgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "LoggerConfig(endPointUrl=" + this.a + ", minLogLevel=" + this.b + ", samplingRates=" + this.c + ")";
    }
}
