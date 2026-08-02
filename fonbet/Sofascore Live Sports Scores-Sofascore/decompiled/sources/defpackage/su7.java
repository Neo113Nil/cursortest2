package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class su7 extends sq3 {
    public OddsCountryProvider r;
    public boolean s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ tu7 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su7(tu7 tu7Var, sq3 sq3Var) {
        super(sq3Var);
        this.w = tu7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.m(null, false, this);
    }
}
