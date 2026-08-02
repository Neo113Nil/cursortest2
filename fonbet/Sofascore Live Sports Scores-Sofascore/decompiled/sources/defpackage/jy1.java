package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jy1 extends xka implements Function0 {
    public final /* synthetic */ ky1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(ky1 ky1Var, int i, int i2) {
        super(0);
        this.i = ky1Var;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = iie.e.get();
        obj.getClass();
        ncd ncdVar = new ncd((Context) obj, this.i);
        ncdVar.e = this.j;
        ncdVar.g = this.k;
        return ncdVar;
    }
}
