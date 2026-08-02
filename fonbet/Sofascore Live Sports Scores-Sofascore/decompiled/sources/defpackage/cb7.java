package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cb7 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ cb7(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        xtc r;
        int i = this.a;
        Object obj5 = nf3.a;
        k60 k60Var = (k60) obj;
        switch (i) {
            case 0:
                d6d d6dVar = (d6d) obj2;
                ((Integer) obj4).getClass();
                k60Var.getClass();
                d6dVar.getClass();
                av8 av8Var = (av8) ((of3) obj3);
                Context context = (Context) av8Var.k(nz.b);
                Object obj6 = (Activity) av8Var.k(ngb.a);
                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(wa7.class);
                orCreateKotlinClass.getClass();
                Bundle a = d6dVar.h.a();
                if (a == null) {
                    lm5.a.getClass();
                    a = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                Map m = d6dVar.b.m();
                LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(m.size()));
                for (Map.Entry entry : m.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((a6d) entry.getValue()).a);
                }
                int i2 = ((wa7) sha.R(orCreateKotlinClass).deserialize(new x7g(a, linkedHashMap))).a;
                r = m6k.r(utc.a, "NotificationsTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                xtc r0 = ml4.r0(n9e.q(r, lz.D(R.color.surface_1, av8Var), oyn.e));
                String v = oea.v(R.string.fantasy_notifications_title, av8Var);
                String v2 = oea.v(R.string.fantasy_notifications_body, av8Var);
                tc3 tc3Var = z8e.b;
                boolean i3 = av8Var.i(context) | av8Var.i(obj6) | av8Var.e(i2);
                Object O = av8Var.O();
                Function1 function1 = this.b;
                if (i3 || O == obj5) {
                    Object im1Var = new im1(context, obj6, function1, i2, 2);
                    av8Var.n0(im1Var);
                    O = im1Var;
                }
                Function0 function0 = (Function0) O;
                boolean i4 = av8Var.i(context) | av8Var.e(i2);
                Object O2 = av8Var.O();
                if (i4 || O2 == obj5) {
                    O2 = new hp5(context, i2, 3, function1);
                    av8Var.n0(O2);
                }
                n4o.l(v, v2, tc3Var, function0, (Function0) O2, r0, av8Var, 384);
                break;
            default:
                iwi iwiVar = (iwi) obj2;
                int intValue = ((Integer) obj4).intValue();
                k60Var.getClass();
                iwiVar.getClass();
                gv9 gv9Var = iwiVar.c;
                av8 av8Var2 = (av8) ((of3) obj3);
                Function1 function12 = this.b;
                boolean g = av8Var2.g(function12) | ((((intValue & 112) ^ 48) > 32 && av8Var2.g(iwiVar)) || (intValue & 48) == 32);
                Object O3 = av8Var2.O();
                if (g || O3 == obj5) {
                    O3 = new dvi(1, function12, iwiVar);
                    av8Var2.n0(O3);
                }
                wba.c(384, av8Var2, gv9Var, l98.b0(bkh.d(utc.a, 1.0f), 8.0f), (Function1) O3);
                break;
        }
        return Unit.a;
    }
}
