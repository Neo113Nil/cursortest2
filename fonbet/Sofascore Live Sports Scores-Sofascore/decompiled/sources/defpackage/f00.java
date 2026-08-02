package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f00 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(ArrayList arrayList, int i) {
        super(1);
        this.i = i;
        this.j = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        ArrayList arrayList = this.j;
        switch (i) {
            case 0:
                phe pheVar = (phe) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    phe.h(pheVar, (qhe) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                phe pheVar2 = (phe) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        phe.h(pheVar2, (qhe) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                phe pheVar3 = (phe) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    pheVar3.e((qhe) arrayList.get(i4), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            default:
                phe pheVar4 = (phe) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    phe.i(pheVar4, (qhe) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return Unit.a;
    }
}
