package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f6h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ f6h(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return ((KType) arrayList.get(0)).getClassifier();
            default:
                if (arrayList.isEmpty()) {
                    return km5.a;
                }
                if (((CharSequence) CollectionsKt.Y(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) CollectionsKt.h0(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
