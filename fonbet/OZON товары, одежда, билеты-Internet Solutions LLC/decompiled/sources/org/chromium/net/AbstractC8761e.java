package org.chromium.net;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.chromium.net.g;
import org.chromium.net.impl.I;
import org.chromium.net.impl.J;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: org.chromium.net.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8761e {

    /* renamed from: org.chromium.net.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected JSONObject f78693a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f78694b;

        /* renamed from: c, reason: collision with root package name */
        protected final m f78695c;

        public a(m mVar) {
            this.f78694b = new ArrayList();
            this.f78695c = mVar;
        }

        private static Method c(m mVar, String str) {
            try {
                return mVar.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }

        public i a() {
            m mVar = this.f78695c;
            try {
                Method c11 = c(mVar, "getApiLevel");
                JSONObject jSONObject = null;
                int intValue = c11 == null ? -1 : ((Integer) c11.invoke(null, new Object[0])).intValue();
                if (intValue != -1 && intValue < 36) {
                    Log.w("CronetEngine.Builder", "The implementation version is lower than the API version. Calls to methods added in API " + (intValue + 1) + " and newer will likely have no effect.");
                }
                JSONObject jSONObject2 = this.f78693a;
                ArrayList arrayList = this.f78694b;
                if (jSONObject2 != null || !arrayList.isEmpty()) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject = jSONObject2;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            ((j) it.next()).a();
                        } catch (JSONException e11) {
                            throw new IllegalStateException("Unable to apply JSON patch!", e11);
                        }
                    }
                }
                if (jSONObject != null) {
                    mVar.h(jSONObject.toString());
                }
                return mVar.b();
            } catch (ReflectiveOperationException e12) {
                throw new RuntimeException("Failed to retrieve Cronet impl API level", e12);
            }
        }

        public final void b(boolean z11) {
            this.f78695c.c(z11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            this(r0);
            vf.c.c("CronetEngine#createBuilderDelegate");
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = new ArrayList(g.getAllProviderInfos(context));
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((g.a) it.next()).f78696a.isEnabled()) {
                        it.remove();
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList, new C8760d());
                    g.a aVar = (g.a) arrayList.get(0);
                    I a11 = J.a(context, aVar.f78697b);
                    I.b bVar = new I.b();
                    try {
                        bVar.f78830e = Boolean.FALSE;
                        bVar.f78827b = I.b.a.API;
                        bVar.f78829d = aVar.f78697b;
                        bVar.f78833h = Process.myUid();
                        bVar.f78831f = new I.f("138.0.7204.157");
                        if (Log.isLoggable("CronetEngine.Builder", 3)) {
                            Log.d("CronetEngine.Builder", String.format("Using '%s' provider for creating CronetEngine.Builder.", aVar.f78696a));
                        }
                        m mVar = aVar.f78696a.createBuilder().f78695c;
                        try {
                            Method c11 = c(mVar, "getCronetVersion");
                            String str = null;
                            if (c11 != null) {
                                str = (String) c11.invoke(null, new Object[0]);
                            }
                            if (str != null) {
                                bVar.f78832g = new I.f(str);
                            }
                            bVar.f78826a = mVar.g();
                            bVar.f78830e = Boolean.TRUE;
                            bVar.f78828c = (int) (SystemClock.uptimeMillis() - uptimeMillis);
                            a11.b(bVar);
                            return;
                        } catch (ReflectiveOperationException e11) {
                            throw new RuntimeException("Failed to retrieve Cronet impl version", e11);
                        }
                    } catch (Throwable th2) {
                        bVar.f78828c = (int) (SystemClock.uptimeMillis() - uptimeMillis);
                        a11.b(bVar);
                        throw th2;
                    }
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
    }
}
