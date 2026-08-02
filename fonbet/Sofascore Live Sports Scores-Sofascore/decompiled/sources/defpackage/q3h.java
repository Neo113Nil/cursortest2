package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q3h extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3h(String str, int i) {
        super(1);
        this.i = i;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        String str = this.j;
        switch (i) {
            case 0:
                y3h.e((b4h) obj, str);
                break;
            default:
                String str2 = ((k38) obj).a;
                str2.getClass();
                cjb.a("Error firing " + str + " event tracker [" + str2 + ']');
                break;
        }
        return Unit.a;
    }
}
