package defpackage;

import com.sofascore.results.event.media.VideoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zok implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoActivity b;

    public /* synthetic */ zok(VideoActivity videoActivity, int i) {
        this.a = i;
        this.b = videoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        VideoActivity videoActivity = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = VideoActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(979538825, av8Var, new zok(videoActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = VideoActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    String str = (String) videoActivity.J.getValue();
                    String str2 = (String) videoActivity.K.getValue();
                    boolean booleanValue = ((Boolean) ((eoh) videoActivity.L).getValue()).booleanValue();
                    boolean i5 = av8Var2.i(videoActivity);
                    Object O = av8Var2.O();
                    if (i5 || O == nf3.a) {
                        O = new qdj(videoActivity, 15);
                        av8Var2.n0(O);
                    }
                    pd0.h(str, str2, booleanValue, (Function1) O, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
