package defpackage;

import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cvi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvi b;
    public final /* synthetic */ Team c;

    public /* synthetic */ cvi(fvi fviVar, Team team, int i) {
        this.a = i;
        this.b = fviVar;
        this.c = team;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Team team = this.c;
        fvi fviVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return Long.valueOf(fviVar.e.L(glgVar, team));
            default:
                glgVar.getClass();
                return Integer.valueOf(fviVar.c.e0(glgVar, team));
        }
    }
}
