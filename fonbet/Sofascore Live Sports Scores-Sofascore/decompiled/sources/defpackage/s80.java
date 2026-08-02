package defpackage;

import android.content.SharedPreferences;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.mvvm.model.Description;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s80 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ s80(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                phe pheVar = (phe) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    phe.h(pheVar, (qhe) arrayList.get(i2), 0, 0);
                }
                return Unit.a;
            case 1:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putString("PRIVATE_LEAGUES_ORDER_PREF", CollectionsKt.f0(this.b, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                return Unit.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                arrayList.add(str);
                return Unit.a;
            case 3:
                phe pheVar2 = (phe) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    n1c n1cVar = (n1c) arrayList.get(i3);
                    List list = n1cVar.b;
                    boolean z = n1cVar.h;
                    if (n1cVar.l == Integer.MIN_VALUE) {
                        u3a.a("position() should be called first");
                    }
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        qhe qheVar = (qhe) list.get(i4);
                        int[] iArr = n1cVar.j;
                        int i5 = i4 * 2;
                        long d = r6a.d((iArr[i5] << 32) | (iArr[i5 + 1] & 4294967295L), n1cVar.c);
                        if (z) {
                            phe.o(pheVar2, qheVar, d);
                        } else {
                            phe.k(pheVar2, qheVar, d);
                        }
                    }
                }
                return Unit.a;
            case 4:
                phe pheVar3 = (phe) obj;
                int size4 = arrayList.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    pheVar3.e((qhe) arrayList.get(i6), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return Unit.a;
            case 5:
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Description) it.next()).getId()));
                }
                return ktm.D(CollectionsKt.W0(arrayList2));
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                arrayList.add(str2);
                return Unit.a;
            default:
                cuj cujVar = (cuj) obj;
                cujVar.getClass();
                return cuj.a(cujVar, null, null, false, false, l6g.W(arrayList), null, false, 65023);
        }
    }
}
