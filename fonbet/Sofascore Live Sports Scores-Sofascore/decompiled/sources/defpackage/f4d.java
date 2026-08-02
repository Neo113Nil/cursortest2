package defpackage;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f4d implements Function1 {
    public final /* synthetic */ lj2 a;

    public f4d(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.i((NativeAd) obj, zh2.g);
        return Unit.a;
    }
}
