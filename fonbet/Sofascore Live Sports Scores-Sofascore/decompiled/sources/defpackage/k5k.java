package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KTypeParameter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class k5k {
    public k5k(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static String a(KTypeParameter kTypeParameter) {
        StringBuilder sb = new StringBuilder();
        int i = j5k.a[kTypeParameter.getVariance().ordinal()];
        if (i == 1) {
            Unit unit = Unit.a;
        } else if (i == 2) {
            sb.append("in ");
        } else {
            if (i != 3) {
                zzl.b();
                return null;
            }
            sb.append("out ");
        }
        sb.append(kTypeParameter.getName());
        return sb.toString();
    }
}
