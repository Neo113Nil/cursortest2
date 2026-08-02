package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ng5 extends View {
    public final /* synthetic */ dp1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng5(dp1 dp1Var, Context context) {
        super(context);
        this.a = dp1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.a.run();
    }
}
