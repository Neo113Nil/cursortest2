package com.iab.omid.library.inmobi.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;
    protected final InterfaceC0156b b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.inmobi.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0156b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0156b interfaceC0156b) {
        this.b = interfaceC0156b;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
