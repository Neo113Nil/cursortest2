package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class m56 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdi b;

    public /* synthetic */ m56(cdi cdiVar, int i) {
        this.a = i;
        this.b = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        js8 js8Var;
        int i = this.a;
        boolean z = true;
        cdi cdiVar = this.b;
        switch (i) {
            case 0:
                if (cdiVar != null && (js8Var = (js8) cdiVar.getValue()) != null) {
                    z = js8Var.a;
                }
                return Boolean.valueOf(z);
            case 1:
                List list = (List) cdiVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.c(((d6d) obj).b.a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 2:
                dnd dndVar = (dnd) cdiVar.getValue();
                long j = dndVar.a;
                return dndVar;
            case 3:
                g80 g80Var = g3h.a;
                dnd dndVar2 = (dnd) cdiVar.getValue();
                long j2 = dndVar2.a;
                return dndVar2;
            case 4:
                return Boolean.valueOf(((Number) cdiVar.getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 5:
                return Boolean.valueOf(((Number) cdiVar.getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            default:
                w3f w3fVar = (w3f) cdiVar.getValue();
                return Boolean.valueOf((w3fVar != null ? w3fVar.g : null) == null);
        }
    }
}
