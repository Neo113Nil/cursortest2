package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class do6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ do6(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                break;
            case 1:
                arrayList.get(((Number) obj).intValue());
                break;
            default:
                arrayList.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
