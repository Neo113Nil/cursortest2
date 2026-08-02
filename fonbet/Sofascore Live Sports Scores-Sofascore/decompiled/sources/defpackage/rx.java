package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rx extends xka implements et8 {
    public final /* synthetic */ tx i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(tx txVar, int i) {
        super(4);
        this.i = txVar;
        this.j = i;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        tx txVar = this.i;
        cqa cqaVar = txVar.a;
        ((AutofillManager) cqaVar.a).notifyViewEntered(txVar.c, this.j, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.a;
    }
}
