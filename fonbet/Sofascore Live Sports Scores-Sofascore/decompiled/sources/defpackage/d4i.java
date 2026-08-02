package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.odds.OddsCountryProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d4i extends sq3 {
    public Stage r;
    public OddsCountryProvider s;
    public /* synthetic */ Object t;
    public final /* synthetic */ g4i u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4i(g4i g4iVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = g4iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.l(null, null, this);
    }
}
