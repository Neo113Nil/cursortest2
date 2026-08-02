package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* loaded from: classes6.dex */
public abstract class m6 extends k6 implements v2 {
    private BrazeProperties e;

    protected m6(BrazeProperties brazeProperties, x1 x1Var) {
        super(x1Var);
        this.e = brazeProperties;
    }

    @Override // bo.app.v2
    public BrazeProperties c() {
        return this.e;
    }
}
