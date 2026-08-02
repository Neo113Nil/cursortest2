package defpackage;

import android.content.Context;
import com.sofascore.model.FirebaseBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ pv3 c;

    public /* synthetic */ yi(Context context, pv3 pv3Var, int i) {
        this.a = i;
        this.b = context;
        this.c = pv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        pv3 pv3Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = pv3Var.a;
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", i2);
                firebaseBundle.putString("location", "monetized_odds_tab");
                nv.N(context, firebaseBundle, "offer_impression");
                break;
            default:
                int i3 = pv3Var.a;
                context.getClass();
                FirebaseBundle firebaseBundle2 = new FirebaseBundle();
                firebaseBundle2.putInt("id", i3);
                firebaseBundle2.putString("location", "monetized_odds_tab");
                nv.N(context, firebaseBundle2, "offer_impression");
                break;
        }
        return Unit.a;
    }
}
