package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tmd extends sq3 {
    public OddsCountryProvider r;
    public hoi s;
    public Integer t;
    public boolean u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ umd x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmd(umd umdVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = umdVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.d(null, null, false, null, this);
    }
}
