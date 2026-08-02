package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rea implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ rea(Context context, Function0 function0, int i) {
        this.a = i;
        this.b = context;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.c;
        switch (i) {
            case 0:
                nv.k0(this.b, bv.WEEKLY_CHALLENGE_JOIN, av.CTA_CLICK, dv.OTHER, null, null, 48);
                function0.invoke();
                break;
            default:
                nv.z0(this.b, kv.CLICK, "mute_wc_notifications", "wc_popup");
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
