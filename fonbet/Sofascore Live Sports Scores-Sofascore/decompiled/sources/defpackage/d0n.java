package defpackage;

import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class d0n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0n b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ d0n(e0n e0nVar, long j, long j2, int i) {
        this.a = i;
        this.b = e0nVar;
        this.c = j;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uxm uxmVar = (uxm) obj;
        switch (this.a) {
            case 0:
                boolean z = e0n.n;
                uxmVar.getClass();
                e0n e0nVar = this.b;
                uxm uxmVar2 = e0nVar.b;
                BlazeDefaultTimeBar blazeDefaultTimeBar = uxmVar2.z;
                long j = this.c;
                blazeDefaultTimeBar.setDuration(j);
                BlazeDefaultTimeBar blazeDefaultTimeBar2 = uxmVar2.z;
                BlazeTextView blazeTextView = uxmVar2.v;
                long j2 = this.d;
                blazeDefaultTimeBar2.setPosition(j2);
                if (j > 0) {
                    e0nVar.g(new d0n(e0nVar, j2, j, 1), new a0n(6));
                    blazeTextView.getClass();
                    blazeTextView.setVisibility(0);
                } else {
                    blazeTextView.getClass();
                    blazeTextView.setVisibility(4);
                }
                break;
            default:
                boolean z2 = e0n.n;
                uxmVar.getClass();
                uxm uxmVar3 = this.b.b;
                long j3 = (long) (this.c / 1000.0d);
                uxmVar3.v.setText("\u200e" + ufa.i(j3) + " / " + ufa.i((long) (this.d / 1000.0d)));
                uxmVar3.C.setText(ufa.i(j3));
                break;
        }
        return Unit.a;
    }
}
