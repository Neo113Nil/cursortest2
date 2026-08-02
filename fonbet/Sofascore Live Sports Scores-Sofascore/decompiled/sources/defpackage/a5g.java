package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a5g extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ b5g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5g(b5g b5gVar, int i) {
        super(1);
        this.i = i;
        this.j = b5gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        b5g b5gVar = this.j;
        switch (i) {
            case 0:
                return Double.valueOf(b5gVar.n.h(llf.a(((Number) obj).doubleValue(), b5gVar.e, b5gVar.f)));
            default:
                return Double.valueOf(llf.a(b5gVar.k.h(((Number) obj).doubleValue()), b5gVar.e, b5gVar.f));
        }
    }
}
