package defpackage;

import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import defpackage.w3m;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pom extends ot8 implements Function0 {
    public pom(w3m w3mVar) {
        super(0, 0, w3m.class, w3mVar, "onDoubleTapForward", "onDoubleTapForward()Z");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w3m w3mVar = (w3m) this.receiver;
        long E = w3mVar.E();
        mqi mqiVar = w3mVar.w0;
        boolean z = false;
        if (E / 1000.0d >= 20.0d) {
            ((vyd) mqiVar.getValue()).b(SeekType.DOUBLE_TAP, SeekDirection.FORWARD, w3mVar.q0, w3mVar.G());
            w3mVar.h0(new w3m.a.C1357a(false));
            w3mVar.A0.b(new cwl(((vyd) mqiVar.getValue()).c));
            w3mVar.A(w3mVar.q0);
            fam famVar = w3mVar.e;
            z = true;
            if (famVar != null && !famVar.isPlaying()) {
                w3mVar.B(true);
            }
        }
        return Boolean.valueOf(z);
    }
}
