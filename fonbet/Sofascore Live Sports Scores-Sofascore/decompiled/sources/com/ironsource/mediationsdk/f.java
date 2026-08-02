package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4137j2;
import com.ironsource.C4263q2;
import com.ironsource.S1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements g {

    @NotNull
    private final C4263q2 a;

    @NotNull
    private final String b;

    public f(@NotNull C4263q2 c4263q2, @NotNull String str) {
        c4263q2.getClass();
        str.getClass();
        this.a = c4263q2;
        this.b = str;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull h hVar, @NotNull S1 s1) throws JSONException {
        context.getClass();
        hVar.getClass();
        s1.getClass();
        JSONObject a = a(context, hVar);
        String a2 = this.a.a(hVar.t());
        return hVar.t() ? new C4137j2(s1, new URL(a2), a, hVar.u(), this.a) : new e.a(s1, new URL(a2), a, hVar.u(), this.a);
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
        JSONObject a = d.b().a(hVar);
        a.getClass();
        return a;
    }
}
