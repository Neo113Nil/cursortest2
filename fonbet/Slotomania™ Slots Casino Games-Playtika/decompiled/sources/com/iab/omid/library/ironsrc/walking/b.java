package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class b implements b.InterfaceC0163b {
    private JSONObject a;
    private final com.iab.omid.library.ironsrc.walking.async.c b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0163b
    public JSONObject a() {
        return this.a;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0163b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
