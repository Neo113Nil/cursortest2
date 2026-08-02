package defpackage;

import android.content.Context;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hua implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ hua(Context context, int i, int i2, int i3) {
        this.a = i3;
        this.b = context;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.d;
        switch (i) {
            case 0:
                vw0 vw0Var = (vw0) obj;
                vw0Var.getClass();
                boolean z = vw0Var instanceof uw0;
                Context context = this.b;
                if (z) {
                    int i3 = PlayerActivity.Z;
                    jle.q(context, ((uw0) vw0Var).a, this.c, Integer.valueOf(i2), null, false, null, null, 496);
                } else if (vw0Var instanceof tw0) {
                    int i4 = ManagerActivity.R;
                    bea.M(((tw0) vw0Var).a, context);
                }
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                int i5 = PlayerActivity.Z;
                jle.q(this.b, intValue, this.c, Integer.valueOf(i2), null, false, null, null, 496);
                break;
        }
        return Unit.a;
    }
}
