package bo.app;

import com.braze.models.outgoing.BrazeProperties;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public class c4 extends m6 {
    private final String f;

    public c4(String str, BrazeProperties brazeProperties, x1 x1Var) {
        super(brazeProperties, x1Var);
        this.f = str;
    }

    @Override // bo.app.t2
    public String d() {
        return FirebaseAnalytics.Event.PURCHASE;
    }

    public String f() {
        return this.f;
    }
}
