package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4414l2;
import com.ironsource.C4539s2;
import com.ironsource.U1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class f implements g {
    private final C4539s2 a;
    private final String b;

    public f(C4539s2 c4539s2, String str) {
        this.a = c4539s2;
        this.b = str;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, h hVar, U1 u1) throws JSONException {
        JSONObject a = a(context, hVar);
        String a2 = this.a.a(hVar.t());
        return hVar.t() ? new C4414l2(u1, new URL(a2), a, hVar.u(), this.a) : new e.a(u1, new URL(a2), a, hVar.u(), this.a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.a.n();
    }

    private final JSONObject a(Context context, h hVar) throws JSONException {
        return d.b().a(hVar);
    }
}
