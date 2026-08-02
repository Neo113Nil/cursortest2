package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* loaded from: classes6.dex */
public class f0 extends m6 {
    private final String f;

    public f0(String str, BrazeProperties brazeProperties, x1 x1Var) {
        super(brazeProperties, x1Var);
        this.f = str;
    }

    @Override // bo.app.t2
    public String d() {
        return "custom_event";
    }

    public String f() {
        return this.f;
    }
}
