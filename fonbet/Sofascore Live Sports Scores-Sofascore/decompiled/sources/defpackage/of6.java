package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class of6 {
    public static final of6 b = new of6(new bxj((zm6) null, (alh) null, (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
    public static final of6 c = new of6(new bxj((zm6) null, (alh) null, (in2) null, (krg) null, (LinkedHashMap) null, 95));
    public final bxj a;

    public of6(bxj bxjVar) {
        this.a = bxjVar;
    }

    public final of6 a(of6 of6Var) {
        bxj bxjVar = of6Var.a;
        zm6 zm6Var = bxjVar.a;
        bxj bxjVar2 = this.a;
        if (zm6Var == null) {
            zm6Var = bxjVar2.a;
        }
        alh alhVar = bxjVar.b;
        if (alhVar == null) {
            alhVar = bxjVar2.b;
        }
        in2 in2Var = bxjVar.c;
        if (in2Var == null) {
            in2Var = bxjVar2.c;
        }
        krg krgVar = bxjVar.d;
        if (krgVar == null) {
            krgVar = bxjVar2.d;
        }
        return new of6(new bxj(zm6Var, alhVar, in2Var, krgVar, bxjVar.e || bxjVar2.e, tub.k(bxjVar2.f, bxjVar.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof of6) && ((of6) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        bxj bxjVar = this.a;
        zm6 zm6Var = bxjVar.a;
        sb.append(zm6Var != null ? zm6Var.toString() : null);
        sb.append(",\nSlide - ");
        alh alhVar = bxjVar.b;
        sb.append(alhVar != null ? alhVar.toString() : null);
        sb.append(",\nShrink - ");
        in2 in2Var = bxjVar.c;
        sb.append(in2Var != null ? in2Var.toString() : null);
        sb.append(",\nScale - ");
        krg krgVar = bxjVar.d;
        sb.append(krgVar != null ? krgVar.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(bxjVar.e);
        return sb.toString();
    }
}
