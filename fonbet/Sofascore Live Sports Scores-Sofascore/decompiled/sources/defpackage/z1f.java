package defpackage;

import android.view.ViewStructure;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z1f extends xka implements et8 {
    public final /* synthetic */ ViewStructure i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1f(ViewStructure viewStructure) {
        super(4);
        this.i = viewStructure;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.i.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return Unit.a;
    }
}
