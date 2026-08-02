package defpackage;

import android.util.Base64OutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class np4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ op4 b;

    public /* synthetic */ np4(op4 op4Var, int i) {
        this.a = i;
        this.b = op4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                op4 op4Var = this.b;
                synchronized (op4Var) {
                    try {
                        d99 d99Var = (d99) op4Var.a.get();
                        ArrayList a = d99Var.a();
                        synchronized (d99Var) {
                            d99Var.a.a(new c69(d99Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < a.size(); i++) {
                            iu0 iu0Var = (iu0) a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", iu0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) iu0Var.b));
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
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(C.UTF8_NAME);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                op4 op4Var2 = this.b;
                synchronized (op4Var2) {
                    d99 d99Var2 = (d99) op4Var2.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = ((nu4) op4Var2.c.get()).a();
                    synchronized (d99Var2) {
                        d99Var2.a.a(new dr6(d99Var2, d99.b(currentTimeMillis), a2, new e5f(a2)));
                    }
                }
                return null;
        }
    }
}
