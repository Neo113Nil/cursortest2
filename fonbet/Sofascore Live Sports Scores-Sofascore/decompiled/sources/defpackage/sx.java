package defpackage;

import android.view.autofill.AutofillManager;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sx extends xka implements et8 {
    public final /* synthetic */ tx i;
    public final /* synthetic */ wma j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(tx txVar, wma wmaVar) {
        super(4);
        this.i = txVar;
        this.j = wmaVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        tx txVar = this.i;
        txVar.f.set(intValue, intValue2, intValue3, intValue4);
        cqa cqaVar = txVar.a;
        ((AutofillManager) cqaVar.a).requestAutofill(txVar.c, this.j.b, txVar.f);
        return Unit.a;
    }
}
