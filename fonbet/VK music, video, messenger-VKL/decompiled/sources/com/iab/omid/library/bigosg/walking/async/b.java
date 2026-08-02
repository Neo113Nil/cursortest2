package com.iab.omid.library.bigosg.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;
    protected final InterfaceC0173b b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.bigosg.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0173b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0173b interfaceC0173b) {
        this.b = interfaceC0173b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
