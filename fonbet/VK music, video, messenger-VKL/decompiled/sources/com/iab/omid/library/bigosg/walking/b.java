package com.iab.omid.library.bigosg.walking;

import com.iab.omid.library.bigosg.walking.async.b;
import com.iab.omid.library.bigosg.walking.async.d;
import com.iab.omid.library.bigosg.walking.async.e;
import com.iab.omid.library.bigosg.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class b implements b.InterfaceC0173b {
    private JSONObject a;
    private final com.iab.omid.library.bigosg.walking.async.c b;

    public b(com.iab.omid.library.bigosg.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.bigosg.walking.async.b.InterfaceC0173b
    public JSONObject a() {
        return this.a;
    }

    public void b() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.async.b.InterfaceC0173b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
