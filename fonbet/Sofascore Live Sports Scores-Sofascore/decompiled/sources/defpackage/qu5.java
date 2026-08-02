package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qu5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mzg b;

    public /* synthetic */ qu5(mzg mzgVar, int i) {
        this.a = i;
        this.b = mzgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mzg mzgVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((eoh) mzgVar.b).setValue(bool);
                break;
            default:
                mzgVar.a.i(((Float) obj).floatValue());
                break;
        }
        return Unit.a;
    }
}
