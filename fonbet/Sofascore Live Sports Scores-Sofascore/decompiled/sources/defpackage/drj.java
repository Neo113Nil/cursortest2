package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class drj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ irj b;
    public final /* synthetic */ UniqueTournament c;

    public /* synthetic */ drj(irj irjVar, UniqueTournament uniqueTournament, int i) {
        this.a = i;
        this.b = irjVar;
        this.c = uniqueTournament;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        UniqueTournament uniqueTournament = this.c;
        irj irjVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return Long.valueOf(irjVar.f.L(glgVar, uniqueTournament));
            default:
                glgVar.getClass();
                return Integer.valueOf(irjVar.e.e0(glgVar, uniqueTournament));
        }
    }
}
