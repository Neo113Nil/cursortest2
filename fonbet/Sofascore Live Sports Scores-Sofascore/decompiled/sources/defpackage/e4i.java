package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.odds.OddsCountryProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e4i extends sq3 {
    public Stage r;
    public OddsCountryProvider s;
    public Stage t;
    public /* synthetic */ Object u;
    public final /* synthetic */ g4i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4i(g4i g4iVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = g4iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.m(null, null, null, this);
    }
}
