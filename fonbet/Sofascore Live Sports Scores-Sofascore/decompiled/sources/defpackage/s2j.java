package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s2j extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2j(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 17:
                Unit unit = Unit.a;
                ((eoh) ((lmk) obj).i).setValue(unit);
                break;
            case 19:
                ((Function0) ((fsf) obj).a).invoke();
                break;
        }
        return (ttk) ((j5l) obj).invoke();
    }
}
