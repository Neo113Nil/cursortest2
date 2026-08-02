package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gfl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ gfl(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 1:
                e1dVar.setValue(Boolean.TRUE);
                break;
            default:
                e1dVar.setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
