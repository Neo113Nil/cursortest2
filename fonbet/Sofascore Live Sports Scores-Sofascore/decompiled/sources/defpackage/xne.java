package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xne implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aoe b;
    public final /* synthetic */ Player c;

    public /* synthetic */ xne(aoe aoeVar, Player player, int i) {
        this.a = i;
        this.b = aoeVar;
        this.c = player;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Player player = this.c;
        aoe aoeVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return Long.valueOf(aoeVar.e.L(glgVar, player));
            default:
                glgVar.getClass();
                return Integer.valueOf(aoeVar.c.e0(glgVar, player));
        }
    }
}
