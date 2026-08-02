package defpackage;

import android.content.Context;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q5i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zmd c;

    public /* synthetic */ q5i(Context context, zmd zmdVar, int i) {
        this.a = i;
        this.b = context;
        this.c = zmdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        zmd zmdVar = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = StageConstructorActivity.R;
                dff.g(zmdVar.a, context);
                break;
            case 1:
                int i3 = StageDriverActivity.R;
                pff.g(zmdVar.a, context);
                break;
            default:
                int i4 = StageDriverActivity.R;
                pff.g(zmdVar.a, context);
                break;
        }
        return Unit.a;
    }
}
