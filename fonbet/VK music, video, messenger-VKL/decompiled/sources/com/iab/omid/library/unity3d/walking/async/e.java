package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class e extends a {
    public e(b.InterfaceC0192b interfaceC0192b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0192b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.unity3d.internal.c c = com.iab.omid.library.unity3d.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : c.b()) {
                if (this.c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.d.toString();
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
