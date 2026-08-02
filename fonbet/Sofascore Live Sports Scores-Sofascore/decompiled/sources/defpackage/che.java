package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class che extends l32 {
    public final /* synthetic */ ehe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public che(ehe eheVar, ed edVar) {
        super(edVar);
        this.f = eheVar;
    }

    @Override // defpackage.l32
    public final boolean d(int i) {
        ArrayList arrayList;
        Object a0;
        Object a02;
        ehe eheVar = this.f;
        int i2 = eheVar.w;
        if ((i2 < 0 || i2 >= i) && (a0 = CollectionsKt.a0(i, (arrayList = eheVar.i))) != null) {
            if ((a0 instanceof m32) || (a02 = CollectionsKt.a0(i - 1, arrayList)) == null) {
                return true;
            }
            if (!(a0 instanceof lrj) || !(a02 instanceof m32)) {
                return (a02 instanceof lrj) || (a02 instanceof m32) || (a02 instanceof dhe);
            }
        }
        return false;
    }
}
