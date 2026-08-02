package y8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f25722b;

    public /* synthetic */ b(c cVar, int i5) {
        this.f25721a = i5;
        this.f25722b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f25722b;
        synchronized (cVar) {
            try {
                g gVar = (g) cVar.f25723a.get();
                ArrayList c2 = gVar.c();
                gVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i5 = 0; i5 < c2.size(); i5++) {
                    a aVar = (a) c2.get(i5);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f25719a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f25720b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f25721a) {
            case 0:
                return a();
            default:
                c cVar = this.f25722b;
                synchronized (cVar) {
                    ((g) cVar.f25723a.get()).k(System.currentTimeMillis(), ((h9.b) cVar.f25725c.get()).a());
                }
                return null;
        }
    }
}
